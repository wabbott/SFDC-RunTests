/**
 * ApexService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._08.apex;

public interface ApexService extends javax.xml.rpc.Service {

/**
 * Manage your Salesforce.com Apex classes and triggers
 */
    public java.lang.String getApexAddress();

    public com.sforce.soap._2006._08.apex.ApexPortType getApex() throws javax.xml.rpc.ServiceException;

    public com.sforce.soap._2006._08.apex.ApexPortType getApex(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
