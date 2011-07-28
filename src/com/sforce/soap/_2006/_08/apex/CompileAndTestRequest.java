/**
 * CompileAndTestRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._08.apex;

public class CompileAndTestRequest  implements java.io.Serializable {
    private boolean checkOnly;

    private java.lang.String[] classes;

    private java.lang.String[] deleteClasses;

    private java.lang.String[] deleteTriggers;

    private com.sforce.soap._2006._08.apex.RunTestsRequest runTestsRequest;

    private java.lang.String[] triggers;

    public CompileAndTestRequest() {
    }

    public CompileAndTestRequest(
           boolean checkOnly,
           java.lang.String[] classes,
           java.lang.String[] deleteClasses,
           java.lang.String[] deleteTriggers,
           com.sforce.soap._2006._08.apex.RunTestsRequest runTestsRequest,
           java.lang.String[] triggers) {
           this.checkOnly = checkOnly;
           this.classes = classes;
           this.deleteClasses = deleteClasses;
           this.deleteTriggers = deleteTriggers;
           this.runTestsRequest = runTestsRequest;
           this.triggers = triggers;
    }


    /**
     * Gets the checkOnly value for this CompileAndTestRequest.
     * 
     * @return checkOnly
     */
    public boolean isCheckOnly() {
        return checkOnly;
    }


    /**
     * Sets the checkOnly value for this CompileAndTestRequest.
     * 
     * @param checkOnly
     */
    public void setCheckOnly(boolean checkOnly) {
        this.checkOnly = checkOnly;
    }


    /**
     * Gets the classes value for this CompileAndTestRequest.
     * 
     * @return classes
     */
    public java.lang.String[] getClasses() {
        return classes;
    }


    /**
     * Sets the classes value for this CompileAndTestRequest.
     * 
     * @param classes
     */
    public void setClasses(java.lang.String[] classes) {
        this.classes = classes;
    }

    public java.lang.String getClasses(int i) {
        return this.classes[i];
    }

    public void setClasses(int i, java.lang.String _value) {
        this.classes[i] = _value;
    }


    /**
     * Gets the deleteClasses value for this CompileAndTestRequest.
     * 
     * @return deleteClasses
     */
    public java.lang.String[] getDeleteClasses() {
        return deleteClasses;
    }


    /**
     * Sets the deleteClasses value for this CompileAndTestRequest.
     * 
     * @param deleteClasses
     */
    public void setDeleteClasses(java.lang.String[] deleteClasses) {
        this.deleteClasses = deleteClasses;
    }

    public java.lang.String getDeleteClasses(int i) {
        return this.deleteClasses[i];
    }

    public void setDeleteClasses(int i, java.lang.String _value) {
        this.deleteClasses[i] = _value;
    }


    /**
     * Gets the deleteTriggers value for this CompileAndTestRequest.
     * 
     * @return deleteTriggers
     */
    public java.lang.String[] getDeleteTriggers() {
        return deleteTriggers;
    }


    /**
     * Sets the deleteTriggers value for this CompileAndTestRequest.
     * 
     * @param deleteTriggers
     */
    public void setDeleteTriggers(java.lang.String[] deleteTriggers) {
        this.deleteTriggers = deleteTriggers;
    }

    public java.lang.String getDeleteTriggers(int i) {
        return this.deleteTriggers[i];
    }

    public void setDeleteTriggers(int i, java.lang.String _value) {
        this.deleteTriggers[i] = _value;
    }


    /**
     * Gets the runTestsRequest value for this CompileAndTestRequest.
     * 
     * @return runTestsRequest
     */
    public com.sforce.soap._2006._08.apex.RunTestsRequest getRunTestsRequest() {
        return runTestsRequest;
    }


    /**
     * Sets the runTestsRequest value for this CompileAndTestRequest.
     * 
     * @param runTestsRequest
     */
    public void setRunTestsRequest(com.sforce.soap._2006._08.apex.RunTestsRequest runTestsRequest) {
        this.runTestsRequest = runTestsRequest;
    }


    /**
     * Gets the triggers value for this CompileAndTestRequest.
     * 
     * @return triggers
     */
    public java.lang.String[] getTriggers() {
        return triggers;
    }


    /**
     * Sets the triggers value for this CompileAndTestRequest.
     * 
     * @param triggers
     */
    public void setTriggers(java.lang.String[] triggers) {
        this.triggers = triggers;
    }

    public java.lang.String getTriggers(int i) {
        return this.triggers[i];
    }

    public void setTriggers(int i, java.lang.String _value) {
        this.triggers[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompileAndTestRequest)) return false;
        CompileAndTestRequest other = (CompileAndTestRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.checkOnly == other.isCheckOnly() &&
            ((this.classes==null && other.getClasses()==null) || 
             (this.classes!=null &&
              java.util.Arrays.equals(this.classes, other.getClasses()))) &&
            ((this.deleteClasses==null && other.getDeleteClasses()==null) || 
             (this.deleteClasses!=null &&
              java.util.Arrays.equals(this.deleteClasses, other.getDeleteClasses()))) &&
            ((this.deleteTriggers==null && other.getDeleteTriggers()==null) || 
             (this.deleteTriggers!=null &&
              java.util.Arrays.equals(this.deleteTriggers, other.getDeleteTriggers()))) &&
            ((this.runTestsRequest==null && other.getRunTestsRequest()==null) || 
             (this.runTestsRequest!=null &&
              this.runTestsRequest.equals(other.getRunTestsRequest()))) &&
            ((this.triggers==null && other.getTriggers()==null) || 
             (this.triggers!=null &&
              java.util.Arrays.equals(this.triggers, other.getTriggers())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isCheckOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getClasses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClasses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClasses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeleteClasses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeleteClasses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeleteClasses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeleteTriggers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeleteTriggers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeleteTriggers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRunTestsRequest() != null) {
            _hashCode += getRunTestsRequest().hashCode();
        }
        if (getTriggers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTriggers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTriggers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompileAndTestRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CompileAndTestRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "checkOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "classes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteClasses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "deleteClasses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteTriggers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "deleteTriggers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runTestsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "runTestsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "RunTestsRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "triggers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
