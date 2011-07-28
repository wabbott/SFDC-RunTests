/**
 * RunTestsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._08.apex;

public class RunTestsRequest  implements java.io.Serializable {
    private boolean allTests;

    private java.lang.String[] classes;

    private java.lang.String namespace;

    private java.lang.String[] packages;

    public RunTestsRequest() {
    }

    public RunTestsRequest(
           boolean allTests,
           java.lang.String[] classes,
           java.lang.String namespace,
           java.lang.String[] packages) {
           this.allTests = allTests;
           this.classes = classes;
           this.namespace = namespace;
           this.packages = packages;
    }


    /**
     * Gets the allTests value for this RunTestsRequest.
     * 
     * @return allTests
     */
    public boolean isAllTests() {
        return allTests;
    }


    /**
     * Sets the allTests value for this RunTestsRequest.
     * 
     * @param allTests
     */
    public void setAllTests(boolean allTests) {
        this.allTests = allTests;
    }


    /**
     * Gets the classes value for this RunTestsRequest.
     * 
     * @return classes
     */
    public java.lang.String[] getClasses() {
        return classes;
    }


    /**
     * Sets the classes value for this RunTestsRequest.
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
     * Gets the namespace value for this RunTestsRequest.
     * 
     * @return namespace
     */
    public java.lang.String getNamespace() {
        return namespace;
    }


    /**
     * Sets the namespace value for this RunTestsRequest.
     * 
     * @param namespace
     */
    public void setNamespace(java.lang.String namespace) {
        this.namespace = namespace;
    }


    /**
     * Gets the packages value for this RunTestsRequest.
     * 
     * @return packages
     */
    public java.lang.String[] getPackages() {
        return packages;
    }


    /**
     * Sets the packages value for this RunTestsRequest.
     * 
     * @param packages
     */
    public void setPackages(java.lang.String[] packages) {
        this.packages = packages;
    }

    public java.lang.String getPackages(int i) {
        return this.packages[i];
    }

    public void setPackages(int i, java.lang.String _value) {
        this.packages[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RunTestsRequest)) return false;
        RunTestsRequest other = (RunTestsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.allTests == other.isAllTests() &&
            ((this.classes==null && other.getClasses()==null) || 
             (this.classes!=null &&
              java.util.Arrays.equals(this.classes, other.getClasses()))) &&
            ((this.namespace==null && other.getNamespace()==null) || 
             (this.namespace!=null &&
              this.namespace.equals(other.getNamespace()))) &&
            ((this.packages==null && other.getPackages()==null) || 
             (this.packages!=null &&
              java.util.Arrays.equals(this.packages, other.getPackages())));
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
        _hashCode += (isAllTests() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        if (getNamespace() != null) {
            _hashCode += getNamespace().hashCode();
        }
        if (getPackages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackages(), i);
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
        new org.apache.axis.description.TypeDesc(RunTestsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "RunTestsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allTests");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "allTests"));
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
        elemField.setFieldName("namespace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "namespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "packages"));
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
