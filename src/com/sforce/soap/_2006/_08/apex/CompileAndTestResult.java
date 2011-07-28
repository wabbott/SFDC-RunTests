/**
 * CompileAndTestResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._08.apex;

public class CompileAndTestResult  implements java.io.Serializable {
    private com.sforce.soap._2006._08.apex.CompileClassResult[] classes;

    private com.sforce.soap._2006._08.apex.DeleteApexResult[] deleteClasses;

    private com.sforce.soap._2006._08.apex.DeleteApexResult[] deleteTriggers;

    private com.sforce.soap._2006._08.apex.RunTestsResult runTestsResult;

    private boolean success;

    private com.sforce.soap._2006._08.apex.CompileTriggerResult[] triggers;

    public CompileAndTestResult() {
    }

    public CompileAndTestResult(
           com.sforce.soap._2006._08.apex.CompileClassResult[] classes,
           com.sforce.soap._2006._08.apex.DeleteApexResult[] deleteClasses,
           com.sforce.soap._2006._08.apex.DeleteApexResult[] deleteTriggers,
           com.sforce.soap._2006._08.apex.RunTestsResult runTestsResult,
           boolean success,
           com.sforce.soap._2006._08.apex.CompileTriggerResult[] triggers) {
           this.classes = classes;
           this.deleteClasses = deleteClasses;
           this.deleteTriggers = deleteTriggers;
           this.runTestsResult = runTestsResult;
           this.success = success;
           this.triggers = triggers;
    }


    /**
     * Gets the classes value for this CompileAndTestResult.
     * 
     * @return classes
     */
    public com.sforce.soap._2006._08.apex.CompileClassResult[] getClasses() {
        return classes;
    }


    /**
     * Sets the classes value for this CompileAndTestResult.
     * 
     * @param classes
     */
    public void setClasses(com.sforce.soap._2006._08.apex.CompileClassResult[] classes) {
        this.classes = classes;
    }

    public com.sforce.soap._2006._08.apex.CompileClassResult getClasses(int i) {
        return this.classes[i];
    }

    public void setClasses(int i, com.sforce.soap._2006._08.apex.CompileClassResult _value) {
        this.classes[i] = _value;
    }


    /**
     * Gets the deleteClasses value for this CompileAndTestResult.
     * 
     * @return deleteClasses
     */
    public com.sforce.soap._2006._08.apex.DeleteApexResult[] getDeleteClasses() {
        return deleteClasses;
    }


    /**
     * Sets the deleteClasses value for this CompileAndTestResult.
     * 
     * @param deleteClasses
     */
    public void setDeleteClasses(com.sforce.soap._2006._08.apex.DeleteApexResult[] deleteClasses) {
        this.deleteClasses = deleteClasses;
    }

    public com.sforce.soap._2006._08.apex.DeleteApexResult getDeleteClasses(int i) {
        return this.deleteClasses[i];
    }

    public void setDeleteClasses(int i, com.sforce.soap._2006._08.apex.DeleteApexResult _value) {
        this.deleteClasses[i] = _value;
    }


    /**
     * Gets the deleteTriggers value for this CompileAndTestResult.
     * 
     * @return deleteTriggers
     */
    public com.sforce.soap._2006._08.apex.DeleteApexResult[] getDeleteTriggers() {
        return deleteTriggers;
    }


    /**
     * Sets the deleteTriggers value for this CompileAndTestResult.
     * 
     * @param deleteTriggers
     */
    public void setDeleteTriggers(com.sforce.soap._2006._08.apex.DeleteApexResult[] deleteTriggers) {
        this.deleteTriggers = deleteTriggers;
    }

    public com.sforce.soap._2006._08.apex.DeleteApexResult getDeleteTriggers(int i) {
        return this.deleteTriggers[i];
    }

    public void setDeleteTriggers(int i, com.sforce.soap._2006._08.apex.DeleteApexResult _value) {
        this.deleteTriggers[i] = _value;
    }


    /**
     * Gets the runTestsResult value for this CompileAndTestResult.
     * 
     * @return runTestsResult
     */
    public com.sforce.soap._2006._08.apex.RunTestsResult getRunTestsResult() {
        return runTestsResult;
    }


    /**
     * Sets the runTestsResult value for this CompileAndTestResult.
     * 
     * @param runTestsResult
     */
    public void setRunTestsResult(com.sforce.soap._2006._08.apex.RunTestsResult runTestsResult) {
        this.runTestsResult = runTestsResult;
    }


    /**
     * Gets the success value for this CompileAndTestResult.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this CompileAndTestResult.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }


    /**
     * Gets the triggers value for this CompileAndTestResult.
     * 
     * @return triggers
     */
    public com.sforce.soap._2006._08.apex.CompileTriggerResult[] getTriggers() {
        return triggers;
    }


    /**
     * Sets the triggers value for this CompileAndTestResult.
     * 
     * @param triggers
     */
    public void setTriggers(com.sforce.soap._2006._08.apex.CompileTriggerResult[] triggers) {
        this.triggers = triggers;
    }

    public com.sforce.soap._2006._08.apex.CompileTriggerResult getTriggers(int i) {
        return this.triggers[i];
    }

    public void setTriggers(int i, com.sforce.soap._2006._08.apex.CompileTriggerResult _value) {
        this.triggers[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompileAndTestResult)) return false;
        CompileAndTestResult other = (CompileAndTestResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.classes==null && other.getClasses()==null) || 
             (this.classes!=null &&
              java.util.Arrays.equals(this.classes, other.getClasses()))) &&
            ((this.deleteClasses==null && other.getDeleteClasses()==null) || 
             (this.deleteClasses!=null &&
              java.util.Arrays.equals(this.deleteClasses, other.getDeleteClasses()))) &&
            ((this.deleteTriggers==null && other.getDeleteTriggers()==null) || 
             (this.deleteTriggers!=null &&
              java.util.Arrays.equals(this.deleteTriggers, other.getDeleteTriggers()))) &&
            ((this.runTestsResult==null && other.getRunTestsResult()==null) || 
             (this.runTestsResult!=null &&
              this.runTestsResult.equals(other.getRunTestsResult()))) &&
            this.success == other.isSuccess() &&
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
        if (getRunTestsResult() != null) {
            _hashCode += getRunTestsResult().hashCode();
        }
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        new org.apache.axis.description.TypeDesc(CompileAndTestResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CompileAndTestResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "classes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CompileClassResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteClasses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "deleteClasses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "DeleteApexResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteTriggers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "deleteTriggers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "DeleteApexResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runTestsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "runTestsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "RunTestsResult"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "triggers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CompileTriggerResult"));
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
