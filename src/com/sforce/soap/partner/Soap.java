/**
 * Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public interface Soap extends java.rmi.Remote {

    /**
     * Login to the Salesforce.com SOAP Api
     */
    public com.sforce.soap.partner.LoginResult login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidIdFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.LoginFault;

    /**
     * Describe an sObject
     */
    public com.sforce.soap.partner.DescribeSObjectResult describeSObject(java.lang.String sObjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe a number sObjects
     */
    public com.sforce.soap.partner.DescribeSObjectResult[] describeSObjects(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe the Global state
     */
    public com.sforce.soap.partner.DescribeGlobalResult describeGlobal() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe all the data category groups available for a given
     * set of types
     */
    public com.sforce.soap.partner.DescribeDataCategoryGroupResult[] describeDataCategoryGroups(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe the data category group structures for a given set
     * of pair of types and data category group name
     */
    public com.sforce.soap.partner.DescribeDataCategoryGroupStructureResult[] describeDataCategoryGroupStructures(com.sforce.soap.partner.DataCategoryGroupSobjectTypePair[] pairs, boolean topCategoriesOnly) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe the layout of an sObject
     */
    public com.sforce.soap.partner.DescribeLayoutResult describeLayout(java.lang.String sObjectType, java.lang.String[] recordTypeIds) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidIdFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe the layout of the SoftPhone
     */
    public com.sforce.soap.partner.DescribeSoftphoneLayoutResult describeSoftphoneLayout() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Describe the tabs that appear on a users page
     */
    public com.sforce.soap.partner.DescribeTabSetResult[] describeTabs() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Create a set of new sObjects
     */
    public com.sforce.soap.partner.SaveResult[] create(com.sforce.soap.partner.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidIdFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Update a set of sObjects
     */
    public com.sforce.soap.partner.SaveResult[] update(com.sforce.soap.partner.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidIdFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Update or insert a set of sObjects based on object id
     */
    public com.sforce.soap.partner.UpsertResult[] upsert(java.lang.String externalIDFieldName, com.sforce.soap.partner.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidIdFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Merge and update a set of sObjects based on object id
     */
    public com.sforce.soap.partner.MergeResult[] merge(com.sforce.soap.partner.MergeRequest[] request) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.InvalidIdFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Delete a set of sObjects
     */
    public com.sforce.soap.partner.DeleteResult[] delete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Undelete a set of sObjects
     */
    public com.sforce.soap.partner.UndeleteResult[] undelete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Empty a set of sObjects from the recycle bin
     */
    public com.sforce.soap.partner.EmptyRecycleBinResult[] emptyRecycleBin(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Get a set of sObjects
     */
    public com.sforce.soap.partner.sobject.SObject[] retrieve(java.lang.String fieldList, java.lang.String sObjectType, java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.MalformedQueryFault, com.sforce.soap.partner.fault.InvalidIdFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Submit an entity to a workflow process or process a workitem
     */
    public com.sforce.soap.partner.ProcessResult[] process(com.sforce.soap.partner.ProcessRequest[] actions) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidIdFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * convert a set of leads
     */
    public com.sforce.soap.partner.LeadConvertResult[] convertLead(com.sforce.soap.partner.LeadConvert[] leadConverts) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Logout the current user, invalidating the current session.
     */
    public void logout() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Logs out and invalidates session ids
     */
    public com.sforce.soap.partner.InvalidateSessionsResult[] invalidateSessions(java.lang.String[] sessionIds) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Get the IDs for deleted sObjects
     */
    public com.sforce.soap.partner.GetDeletedResult getDeleted(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Get the IDs for updated sObjects
     */
    public com.sforce.soap.partner.GetUpdatedResult getUpdated(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Create a Query Cursor
     */
    public com.sforce.soap.partner.QueryResult query(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.MalformedQueryFault, com.sforce.soap.partner.fault.InvalidIdFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidQueryLocatorFault;

    /**
     * Create a Query Cursor, including deleted sObjects
     */
    public com.sforce.soap.partner.QueryResult queryAll(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.MalformedQueryFault, com.sforce.soap.partner.fault.InvalidIdFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidQueryLocatorFault;

    /**
     * Gets the next batch of sObjects from a query
     */
    public com.sforce.soap.partner.QueryResult queryMore(java.lang.String queryLocator) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidQueryLocatorFault;

    /**
     * Search for sObjects
     */
    public com.sforce.soap.partner.SearchResult search(java.lang.String searchString) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidSObjectFault, com.sforce.soap.partner.fault.MalformedSearchFault, com.sforce.soap.partner.fault.InvalidFieldFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Gets server timestamp
     */
    public com.sforce.soap.partner.GetServerTimestampResult getServerTimestamp() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Set a user's password
     */
    public com.sforce.soap.partner.SetPasswordResult setPassword(java.lang.String userId, java.lang.String password) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidIdFault, com.sforce.soap.partner.fault.UnexpectedErrorFault, com.sforce.soap.partner.fault.InvalidNewPasswordFault;

    /**
     * Reset a user's password
     */
    public com.sforce.soap.partner.ResetPasswordResult resetPassword(java.lang.String userId) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.InvalidIdFault, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Returns standard information relevant to the current user
     */
    public com.sforce.soap.partner.GetUserInfoResult getUserInfo() throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;

    /**
     * Send outbound email
     */
    public com.sforce.soap.partner.SendEmailResult[] sendEmail(com.sforce.soap.partner.Email[] messages) throws java.rmi.RemoteException, com.sforce.soap.partner.fault.UnexpectedErrorFault;
}
