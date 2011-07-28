/**
 * ApexBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._08.apex;

public class ApexBindingStub extends org.apache.axis.client.Stub implements com.sforce.soap._2006._08.apex.ApexPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("compileAndTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CompileAndTestRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CompileAndTestRequest"), com.sforce.soap._2006._08.apex.CompileAndTestRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CompileAndTestResult"));
        oper.setReturnClass(com.sforce.soap._2006._08.apex.CompileAndTestResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("compileClasses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "scripts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CompileClassResult"));
        oper.setReturnClass(com.sforce.soap._2006._08.apex.CompileClassResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("compileTriggers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "scripts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CompileTriggerResult"));
        oper.setReturnClass(com.sforce.soap._2006._08.apex.CompileTriggerResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executeAnonymous");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "String"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "ExecuteAnonymousResult"));
        oper.setReturnClass(com.sforce.soap._2006._08.apex.ExecuteAnonymousResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("runTests");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "RunTestsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "RunTestsRequest"), com.sforce.soap._2006._08.apex.RunTestsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "RunTestsResult"));
        oper.setReturnClass(com.sforce.soap._2006._08.apex.RunTestsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wsdlToApex");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "WsdlToApexInfo"), com.sforce.soap._2006._08.apex.WsdlToApexInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "WsdlToApexResult"));
        oper.setReturnClass(com.sforce.soap._2006._08.apex.WsdlToApexResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

    }

    public ApexBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ApexBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ApexBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", ">AllOrNoneHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.AllOrNoneHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", ">AllowFieldTruncationHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.AllowFieldTruncationHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", ">CallOptions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.CallOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", ">DebuggingHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.DebuggingHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", ">DebuggingInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.DebuggingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", ">DisableFeedTrackingHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.DisableFeedTrackingHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", ">PackageVersionHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.PackageVersion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "PackageVersion");
            qName2 = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "packageVersions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", ">SessionHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.SessionHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CodeCoverageResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.CodeCoverageResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CodeCoverageWarning");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.CodeCoverageWarning.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CodeLocation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.CodeLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CompileAndTestRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.CompileAndTestRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CompileAndTestResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.CompileAndTestResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CompileClassResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.CompileClassResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CompileTriggerResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.CompileTriggerResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "DeleteApexResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.DeleteApexResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "ExecuteAnonymousResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.ExecuteAnonymousResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "ID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "LogCategory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.LogCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "LogCategoryLevel");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.LogCategoryLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "LogInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.LogInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "LogType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.LogType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "NamespacePackagePair");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.NamespacePackagePair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "PackageVersion");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.PackageVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "RunTestFailure");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.RunTestFailure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "RunTestsRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.RunTestsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "RunTestsResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.RunTestsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "RunTestSuccess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.RunTestSuccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "WsdlToApexInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.WsdlToApexInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "WsdlToApexResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap._2006._08.apex.WsdlToApexResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.sforce.soap._2006._08.apex.CompileAndTestResult compileAndTest(com.sforce.soap._2006._08.apex.CompileAndTestRequest compileAndTestRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "compileAndTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {compileAndTestRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap._2006._08.apex.CompileAndTestResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap._2006._08.apex.CompileAndTestResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap._2006._08.apex.CompileAndTestResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap._2006._08.apex.CompileClassResult[] compileClasses(java.lang.String[] scripts) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "compileClasses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {scripts});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap._2006._08.apex.CompileClassResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap._2006._08.apex.CompileClassResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap._2006._08.apex.CompileClassResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap._2006._08.apex.CompileTriggerResult[] compileTriggers(java.lang.String[] scripts) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "compileTriggers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {scripts});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap._2006._08.apex.CompileTriggerResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap._2006._08.apex.CompileTriggerResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap._2006._08.apex.CompileTriggerResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap._2006._08.apex.ExecuteAnonymousResult executeAnonymous(java.lang.String string) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "executeAnonymous"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {string});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap._2006._08.apex.ExecuteAnonymousResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap._2006._08.apex.ExecuteAnonymousResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap._2006._08.apex.ExecuteAnonymousResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap._2006._08.apex.RunTestsResult runTests(com.sforce.soap._2006._08.apex.RunTestsRequest runTestsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "runTests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {runTestsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap._2006._08.apex.RunTestsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap._2006._08.apex.RunTestsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap._2006._08.apex.RunTestsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap._2006._08.apex.WsdlToApexResult wsdlToApex(com.sforce.soap._2006._08.apex.WsdlToApexInfo info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "wsdlToApex"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap._2006._08.apex.WsdlToApexResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap._2006._08.apex.WsdlToApexResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap._2006._08.apex.WsdlToApexResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
