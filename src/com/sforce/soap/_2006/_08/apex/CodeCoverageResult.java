/**
 * CodeCoverageResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._08.apex;

public class CodeCoverageResult  implements java.io.Serializable {
    private java.lang.String id;

    private com.sforce.soap._2006._08.apex.CodeLocation[] locationsNotCovered;

    private java.lang.String name;

    private java.lang.String namespace;

    private int numLocations;

    private int numLocationsNotCovered;

    private java.lang.String type;

    public CodeCoverageResult() {
    }

    public CodeCoverageResult(
           java.lang.String id,
           com.sforce.soap._2006._08.apex.CodeLocation[] locationsNotCovered,
           java.lang.String name,
           java.lang.String namespace,
           int numLocations,
           int numLocationsNotCovered,
           java.lang.String type) {
           this.id = id;
           this.locationsNotCovered = locationsNotCovered;
           this.name = name;
           this.namespace = namespace;
           this.numLocations = numLocations;
           this.numLocationsNotCovered = numLocationsNotCovered;
           this.type = type;
    }


    /**
     * Gets the id value for this CodeCoverageResult.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CodeCoverageResult.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the locationsNotCovered value for this CodeCoverageResult.
     * 
     * @return locationsNotCovered
     */
    public com.sforce.soap._2006._08.apex.CodeLocation[] getLocationsNotCovered() {
        return locationsNotCovered;
    }


    /**
     * Sets the locationsNotCovered value for this CodeCoverageResult.
     * 
     * @param locationsNotCovered
     */
    public void setLocationsNotCovered(com.sforce.soap._2006._08.apex.CodeLocation[] locationsNotCovered) {
        this.locationsNotCovered = locationsNotCovered;
    }

    public com.sforce.soap._2006._08.apex.CodeLocation getLocationsNotCovered(int i) {
        return this.locationsNotCovered[i];
    }

    public void setLocationsNotCovered(int i, com.sforce.soap._2006._08.apex.CodeLocation _value) {
        this.locationsNotCovered[i] = _value;
    }


    /**
     * Gets the name value for this CodeCoverageResult.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CodeCoverageResult.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the namespace value for this CodeCoverageResult.
     * 
     * @return namespace
     */
    public java.lang.String getNamespace() {
        return namespace;
    }


    /**
     * Sets the namespace value for this CodeCoverageResult.
     * 
     * @param namespace
     */
    public void setNamespace(java.lang.String namespace) {
        this.namespace = namespace;
    }


    /**
     * Gets the numLocations value for this CodeCoverageResult.
     * 
     * @return numLocations
     */
    public int getNumLocations() {
        return numLocations;
    }


    /**
     * Sets the numLocations value for this CodeCoverageResult.
     * 
     * @param numLocations
     */
    public void setNumLocations(int numLocations) {
        this.numLocations = numLocations;
    }


    /**
     * Gets the numLocationsNotCovered value for this CodeCoverageResult.
     * 
     * @return numLocationsNotCovered
     */
    public int getNumLocationsNotCovered() {
        return numLocationsNotCovered;
    }


    /**
     * Sets the numLocationsNotCovered value for this CodeCoverageResult.
     * 
     * @param numLocationsNotCovered
     */
    public void setNumLocationsNotCovered(int numLocationsNotCovered) {
        this.numLocationsNotCovered = numLocationsNotCovered;
    }


    /**
     * Gets the type value for this CodeCoverageResult.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this CodeCoverageResult.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodeCoverageResult)) return false;
        CodeCoverageResult other = (CodeCoverageResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.locationsNotCovered==null && other.getLocationsNotCovered()==null) || 
             (this.locationsNotCovered!=null &&
              java.util.Arrays.equals(this.locationsNotCovered, other.getLocationsNotCovered()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.namespace==null && other.getNamespace()==null) || 
             (this.namespace!=null &&
              this.namespace.equals(other.getNamespace()))) &&
            this.numLocations == other.getNumLocations() &&
            this.numLocationsNotCovered == other.getNumLocationsNotCovered() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLocationsNotCovered() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationsNotCovered());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationsNotCovered(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNamespace() != null) {
            _hashCode += getNamespace().hashCode();
        }
        _hashCode += getNumLocations();
        _hashCode += getNumLocationsNotCovered();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodeCoverageResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CodeCoverageResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationsNotCovered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "locationsNotCovered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CodeLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namespace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "namespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "numLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numLocationsNotCovered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "numLocationsNotCovered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "type"));
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
