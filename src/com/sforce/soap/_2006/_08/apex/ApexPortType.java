/**
 * ApexPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._08.apex;

public interface ApexPortType extends java.rmi.Remote {

    /**
     * Compile one or more Apex Classes, Triggers, and run tests.
     */
    public com.sforce.soap._2006._08.apex.CompileAndTestResult compileAndTest(com.sforce.soap._2006._08.apex.CompileAndTestRequest compileAndTestRequest) throws java.rmi.RemoteException;

    /**
     * Compile one or more Apex Classes.
     */
    public com.sforce.soap._2006._08.apex.CompileClassResult[] compileClasses(java.lang.String[] scripts) throws java.rmi.RemoteException;

    /**
     * Compile Apex Trigger code blocks.
     */
    public com.sforce.soap._2006._08.apex.CompileTriggerResult[] compileTriggers(java.lang.String[] scripts) throws java.rmi.RemoteException;

    /**
     * Execute an anonymous Apex code block
     */
    public com.sforce.soap._2006._08.apex.ExecuteAnonymousResult executeAnonymous(java.lang.String string) throws java.rmi.RemoteException;

    /**
     * Execute test methods
     */
    public com.sforce.soap._2006._08.apex.RunTestsResult runTests(com.sforce.soap._2006._08.apex.RunTestsRequest runTestsRequest) throws java.rmi.RemoteException;

    /**
     * Generate Apex packages from WSDL for web service callouts
     */
    public com.sforce.soap._2006._08.apex.WsdlToApexResult wsdlToApex(com.sforce.soap._2006._08.apex.WsdlToApexInfo info) throws java.rmi.RemoteException;
}
