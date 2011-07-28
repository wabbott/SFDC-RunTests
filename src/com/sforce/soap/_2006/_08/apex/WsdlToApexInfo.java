/**
 * WsdlToApexInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._08.apex;

public class WsdlToApexInfo  implements java.io.Serializable {
    private com.sforce.soap._2006._08.apex.NamespacePackagePair[] mapping;

    private java.lang.String wsdl;

    public WsdlToApexInfo() {
    }

    public WsdlToApexInfo(
           com.sforce.soap._2006._08.apex.NamespacePackagePair[] mapping,
           java.lang.String wsdl) {
           this.mapping = mapping;
           this.wsdl = wsdl;
    }


    /**
     * Gets the mapping value for this WsdlToApexInfo.
     * 
     * @return mapping
     */
    public com.sforce.soap._2006._08.apex.NamespacePackagePair[] getMapping() {
        return mapping;
    }


    /**
     * Sets the mapping value for this WsdlToApexInfo.
     * 
     * @param mapping
     */
    public void setMapping(com.sforce.soap._2006._08.apex.NamespacePackagePair[] mapping) {
        this.mapping = mapping;
    }

    public com.sforce.soap._2006._08.apex.NamespacePackagePair getMapping(int i) {
        return this.mapping[i];
    }

    public void setMapping(int i, com.sforce.soap._2006._08.apex.NamespacePackagePair _value) {
        this.mapping[i] = _value;
    }


    /**
     * Gets the wsdl value for this WsdlToApexInfo.
     * 
     * @return wsdl
     */
    public java.lang.String getWsdl() {
        return wsdl;
    }


    /**
     * Sets the wsdl value for this WsdlToApexInfo.
     * 
     * @param wsdl
     */
    public void setWsdl(java.lang.String wsdl) {
        this.wsdl = wsdl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsdlToApexInfo)) return false;
        WsdlToApexInfo other = (WsdlToApexInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mapping==null && other.getMapping()==null) || 
             (this.mapping!=null &&
              java.util.Arrays.equals(this.mapping, other.getMapping()))) &&
            ((this.wsdl==null && other.getWsdl()==null) || 
             (this.wsdl!=null &&
              this.wsdl.equals(other.getWsdl())));
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
        if (getMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMapping(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWsdl() != null) {
            _hashCode += getWsdl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsdlToApexInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "WsdlToApexInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "mapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "NamespacePackagePair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsdl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "wsdl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
