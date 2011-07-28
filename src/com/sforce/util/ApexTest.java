package com.sforce.util;
//log4j imports
import java.util.logging.Level;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.apache.axis.message.MessageElement;
import javax.xml.namespace.QName;

import java.util.Properties;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

import java.net.URL;
import java.net.MalformedURLException;
import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.SimpleTimeZone;
import java.util.Calendar;
import java.text.SimpleDateFormat;

//salesforce.com imports
import com.sforce.soap.partner.LoginResult;
import com.sforce.soap.partner.SaveResult;
import com.sforce.soap.partner.SessionHeader;
import com.sforce.soap.partner.SforceServiceLocator;
import com.sforce.soap.partner.SoapBindingStub;
import com.sforce.soap.partner.fault.ApiFault;
import com.sforce.soap.partner.fault.LoginFault;
import com.sforce.soap.partner.QueryResult;
import com.sforce.soap.partner.sobject.SObject;
import com.sforce.soap.partner.AllowFieldTruncationHeader;
import com.sforce.soap._2006._08.apex.ApexServiceLocator;
import com.sforce.soap._2006._08.apex.DebuggingHeader;
import com.sforce.soap._2006._08.apex.RunTestsRequest;
import com.sforce.soap._2006._08.apex.RunTestsResult;
import com.sforce.soap._2006._08.apex.RunTestFailure;
import com.sforce.soap._2006._08.apex.LogType;
import com.sforce.soap._2006._08.apex.ApexBindingStub;
import com.sforce.soap._2006._08.apex.CodeCoverageResult;
import com.sforce.soap._2006._08.apex.CodeLocation;



class ApexTest {
    static Logger logger = Logger.getLogger("com.sforce.util");
    private SoapBindingStub     _binding = null;
    private ApexBindingStub     _apexBinding = null;
    private LoginResult         _loginResult	= null;
    private DebuggingHeader     _dh = null;
    private String              _serverTimeStamp = null;


    //properties to be loaded from Lead2Prospect.properties file
    private Properties          _properties = new Properties();
    private String              _proxyHost = "";
    private String              _proxyPort = "";
    private String              _sfdcEndpoint = "";
    private String              _feedUserName = "";
  

    public ApexTest() {
	}

    public static void main(String args[]) {
	PropertyConfigurator.configure("log4j.properties");
        ApexTest at = new ApexTest();
        try {
            at.run();
        }
        catch(RemoteException re) {
            logger.fatal("Remote exception: " + re.getMessage());
        }
    }

    public void run() throws RemoteException {
        loadProperties();
        boolean loggedIn = sfdcLogin();
        
        if(loggedIn) {
            _serverTimeStamp = getServerTimestamp();
            String testStatus = runAllTests();
            if(!testStatus.equals("REMOTE_EXCEPTION")) {
                createUserFeedItem(_feedUserName,testStatus);
            }
        }
        else {
            logger.fatal("Login failed");
            System.exit(-1);
        }
        System.exit(0);
    }
    
private String runAllTests() {
   logger.info("Starting Run All Tests...");
   String testStatus = "Run All Tests " + _serverTimeStamp;
   
   long start = System.currentTimeMillis();
   
   RunTestsRequest rtr = new RunTestsRequest();
   rtr.setAllTests(true);
   rtr.setNamespace("");
   RunTestsResult res = new RunTestsResult();
   try {
      res = _apexBinding.runTests(rtr);
   } catch (RemoteException e) {
      logger.fatal("An unexpected error occurred: " + e.getMessage());
      return "REMOTE_EXCEPTION";
   }

   testStatus += "\nNumber of tests: " + res.getNumTestsRun();
   logger.info("Number of tests: " + res.getNumTestsRun());
   testStatus += "\nNumber of failures: " + res.getNumFailures();
   logger.info("Number of failures: " + res.getNumFailures());
   
   String testOutput = new String(testStatus);
   
   if (res.getNumFailures() > 0) {
      for (RunTestFailure rtf : res.getFailures()) {
         testOutput += "\nFailure: " 
                 + (rtf.getNamespace() == null ? "" : rtf.getNamespace() + ".") 
                 + rtf.getName() + "." + rtf.getMethodName() 
                 + ": " 
                 + rtf.getMessage() 
                 + "\n";
         logger.debug(testOutput);
      }
   }
   if (res.getCodeCoverage() != null) {
      for (CodeCoverageResult ccr : res.getCodeCoverage()) {
         testOutput += "\nCode coverage for " 
                 + ccr.getType() 
                 + (ccr.getNamespace() == null ? "" : ccr.getNamespace() + ".") 
                 + ccr.getName() + ": "
                 + ccr.getNumLocationsNotCovered()
                 + " locations not covered out of "
                 + ccr.getNumLocations();
         logger.debug(testOutput);
   
      if (ccr.getNumLocationsNotCovered() > 0) {
         for (CodeLocation cl : ccr.getLocationsNotCovered())
            testOutput += "\tLine " + cl.getLine();
            logger.info(testOutput);
         }
      }
   }
   
   printTestOutput(testOutput);
   
   logger.debug("Finished in " + (System.currentTimeMillis() - start) + "ms");
   return testStatus;
}

private void printTestOutput(String testOutput) {
    try{
        File f = new File(_serverTimeStamp.replaceAll("\\W", "") + ".txt");
        FileWriter fw = new FileWriter(f,true);
        BufferedWriter out = new BufferedWriter(fw);
        out.write(testOutput);
        out.close();
    }
    catch (Exception e){
        logger.error("Error: Could not write TestOutput " + e.getMessage());
    }
}
private void createUserFeedItem(String userName, String body) throws RemoteException {
    String soql = "Select Id from User where Username = '" + userName + "'";
    String userId = "";
    
    QueryResult qResult = _binding.query(soql);
    
    if(qResult.getSize() > 0) {
        SObject user = qResult.getRecords()[0];
        userId = user.getId();
    }
    else {
        System.out.println("Feed Post: No such username found");
        return;
    }
    
    MessageElement[] post= new MessageElement[2];
    post[0] = new MessageElement(new QName("Body"), body);
    post[1] = new MessageElement(new QName("ParentId"), userId);
    SObject[] sos = new SObject[1];
    SObject so = new SObject();
    so.setType("FeedItem");
    so.set_any(post);
    sos[0] = so;
    
    SaveResult[] sr = null;
    try {
        sr = _binding.create(sos);
    } catch (RemoteException ex) {
        logger.fatal(ex.toString());
        return;
    }
    for (int j = 0; j < sr.length; j++) {
        if (sr[j].isSuccess()) {
            logger.info("Post created: " + sr[j].getId());
        }
        else {
            for (int i = 0; i < sr[j].getErrors().length; i++) {
                // get the next error
                com.sforce.soap.partner.Error err = sr[j].getErrors()[i];
                logger.info("Errors were found on item " + j);
                logger.info("Error code: " + err.getStatusCode().toString());
                logger.info("Error message: " + err.getMessage());
            }
        }
    }
}

    private void loadProperties() {
    //get properties from file
        _properties = new Properties();

        try {
            FileInputStream in = new FileInputStream("sfdcUtil.properties");
            _properties.load(in);
            in.close();

            _proxyHost = _properties.getProperty("proxyHost").trim();
            _proxyPort = _properties.getProperty("proxyPort").trim();
            _sfdcEndpoint = _properties.getProperty("sfdc.endPoint").trim();
            _feedUserName = _properties.getProperty("sfdc.feedUsername").trim();
        }
        catch (IOException e) {
            logger.error("Could not load properties file:" + e.getMessage());
            System.exit(-1);
        }
}
    private boolean sfdcLogin() {
        String un = _properties.getProperty("sfdc.username").trim();
        String pw = _properties.getProperty("sfdc.password").trim();

        logger.info("Creating the binding to the SFDC web service...");
        logger.debug("SFDC end point in properties file: " + _sfdcEndpoint);
        /*
         * There are 2 ways to get the binding, one by passing a url to the
         * getSoap() method of the SforceServiceLocator, the other by not passing a
         * url. In the second case the binding will use the url contained in the
         * wsdl file when the proxy was generated.
         */
        try {
            URL u = new URL(_sfdcEndpoint);
            _binding = (SoapBindingStub) new SforceServiceLocator().getSoap(u);
        }catch (MalformedURLException ex) {
            logger.error(ex);
        }
        catch (ServiceException ex) {
                logger.error("Error creating binding to sfdc soap service, error was: " + ex.getMessage());
                return false;
        }

        // Time out after a minute
        _binding.setTimeout(6000000);

        // Attempt the login giving the user feedback
        logger.info("Logging in to SFDC...");
        try {
            _loginResult = _binding.login(un, pw);
        }
        catch (LoginFault lf) {
            logger.error("Login Fault: " + lf.getExceptionMessage());
            // lf.printStackTrace();
            return false;
        }
        catch (ApiFault af) {
            logger.error("API Fault: " + af.getExceptionMessage());
            return false;
        }
        catch (RemoteException re) {
            logger.error("Remote Exception: " + re.getMessage());
            return false;
        }

        logger.info("The server url is: " + _loginResult.getServerUrl());

        _binding._setProperty(SoapBindingStub.ENDPOINT_ADDRESS_PROPERTY, _loginResult.getServerUrl());

        // Create a new session header object and set the session id to that
        // returned by the login
        SessionHeader sh = new SessionHeader();
        sh.setSessionId(_loginResult.getSessionId());
        _binding.setHeader(new SforceServiceLocator().getServiceName().getNamespaceURI(), "SessionHeader", sh);
        
        //allow field truncation to prevent Chatter posts that are too long from breaking the program
        AllowFieldTruncationHeader afth = new AllowFieldTruncationHeader();
        afth.setAllowFieldTruncation(true);
    
        _binding.setHeader(new SforceServiceLocator().getServiceName().getNamespaceURI(),"AllowFieldTruncationHeader", afth);

        //now do Apex binding
        try {
            _apexBinding = (ApexBindingStub) new ApexServiceLocator().getApex();
        } catch (ServiceException ex) {
            java.util.logging.Logger.getLogger(ApexTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        _apexBinding._setProperty(SoapBindingStub.ENDPOINT_ADDRESS_PROPERTY, _loginResult.getServerUrl().replaceAll("/u/", "/s/"));
        com.sforce.soap._2006._08.apex.SessionHeader sh2 = new com.sforce.soap._2006._08.apex.SessionHeader();
        sh2.setSessionId(_loginResult.getSessionId());
        _apexBinding.setHeader(new ApexServiceLocator().getServiceName().getNamespaceURI(), "SessionHeader", sh2);
        
        // Set the debugging header
        _dh = new DebuggingHeader();
        _dh.setDebugLevel(LogType.Profiling);
        _apexBinding.setHeader(new ApexServiceLocator().getServiceName().getNamespaceURI(),"DebuggingHeader", _dh);
        _apexBinding.setTimeout(6000000);
        return true;
    }

    private String getServerTimestamp() {
    String serverTimeString = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    sdf.setTimeZone(new SimpleTimeZone(0, "GMT"));

    try {
        Calendar serverTime = _binding.getServerTimestamp().getTimestamp();
        serverTimeString = sdf.format(serverTime.getTime()) + "Z";
    }
    catch (Exception ex) {
        logger.error("An unexpected error ocurred while retrieving the Server Timestamp." + ex.getMessage());
    }

    return serverTimeString;
}

}