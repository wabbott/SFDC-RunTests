/**
 * ApexServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._08.apex;

public class ApexServiceLocator extends org.apache.axis.client.Service implements com.sforce.soap._2006._08.apex.ApexService {

/**
 * Manage your Salesforce.com Apex classes and triggers
 */

    public ApexServiceLocator() {
    }


    public ApexServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ApexServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Apex
    private java.lang.String Apex_address = "https://na8-api.salesforce.com/services/Soap/s/22.0";

    public java.lang.String getApexAddress() {
        return Apex_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ApexWSDDServiceName = "Apex";

    public java.lang.String getApexWSDDServiceName() {
        return ApexWSDDServiceName;
    }

    public void setApexWSDDServiceName(java.lang.String name) {
        ApexWSDDServiceName = name;
    }

    public com.sforce.soap._2006._08.apex.ApexPortType getApex() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Apex_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getApex(endpoint);
    }

    public com.sforce.soap._2006._08.apex.ApexPortType getApex(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sforce.soap._2006._08.apex.ApexBindingStub _stub = new com.sforce.soap._2006._08.apex.ApexBindingStub(portAddress, this);
            _stub.setPortName(getApexWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setApexEndpointAddress(java.lang.String address) {
        Apex_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sforce.soap._2006._08.apex.ApexPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sforce.soap._2006._08.apex.ApexBindingStub _stub = new com.sforce.soap._2006._08.apex.ApexBindingStub(new java.net.URL(Apex_address), this);
                _stub.setPortName(getApexWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Apex".equals(inputPortName)) {
            return getApex();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "ApexService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "Apex"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Apex".equals(portName)) {
            setApexEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
