/**
 * CompileClassResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._08.apex;

public class CompileClassResult  implements java.io.Serializable {
    private java.lang.Integer bodyCrc;

    private int column;

    private java.lang.String id;

    private int line;

    private java.lang.String name;

    private java.lang.String problem;

    private boolean success;

    private java.lang.String[] warnings;

    public CompileClassResult() {
    }

    public CompileClassResult(
           java.lang.Integer bodyCrc,
           int column,
           java.lang.String id,
           int line,
           java.lang.String name,
           java.lang.String problem,
           boolean success,
           java.lang.String[] warnings) {
           this.bodyCrc = bodyCrc;
           this.column = column;
           this.id = id;
           this.line = line;
           this.name = name;
           this.problem = problem;
           this.success = success;
           this.warnings = warnings;
    }


    /**
     * Gets the bodyCrc value for this CompileClassResult.
     * 
     * @return bodyCrc
     */
    public java.lang.Integer getBodyCrc() {
        return bodyCrc;
    }


    /**
     * Sets the bodyCrc value for this CompileClassResult.
     * 
     * @param bodyCrc
     */
    public void setBodyCrc(java.lang.Integer bodyCrc) {
        this.bodyCrc = bodyCrc;
    }


    /**
     * Gets the column value for this CompileClassResult.
     * 
     * @return column
     */
    public int getColumn() {
        return column;
    }


    /**
     * Sets the column value for this CompileClassResult.
     * 
     * @param column
     */
    public void setColumn(int column) {
        this.column = column;
    }


    /**
     * Gets the id value for this CompileClassResult.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CompileClassResult.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the line value for this CompileClassResult.
     * 
     * @return line
     */
    public int getLine() {
        return line;
    }


    /**
     * Sets the line value for this CompileClassResult.
     * 
     * @param line
     */
    public void setLine(int line) {
        this.line = line;
    }


    /**
     * Gets the name value for this CompileClassResult.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CompileClassResult.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the problem value for this CompileClassResult.
     * 
     * @return problem
     */
    public java.lang.String getProblem() {
        return problem;
    }


    /**
     * Sets the problem value for this CompileClassResult.
     * 
     * @param problem
     */
    public void setProblem(java.lang.String problem) {
        this.problem = problem;
    }


    /**
     * Gets the success value for this CompileClassResult.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this CompileClassResult.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }


    /**
     * Gets the warnings value for this CompileClassResult.
     * 
     * @return warnings
     */
    public java.lang.String[] getWarnings() {
        return warnings;
    }


    /**
     * Sets the warnings value for this CompileClassResult.
     * 
     * @param warnings
     */
    public void setWarnings(java.lang.String[] warnings) {
        this.warnings = warnings;
    }

    public java.lang.String getWarnings(int i) {
        return this.warnings[i];
    }

    public void setWarnings(int i, java.lang.String _value) {
        this.warnings[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompileClassResult)) return false;
        CompileClassResult other = (CompileClassResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bodyCrc==null && other.getBodyCrc()==null) || 
             (this.bodyCrc!=null &&
              this.bodyCrc.equals(other.getBodyCrc()))) &&
            this.column == other.getColumn() &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.line == other.getLine() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.problem==null && other.getProblem()==null) || 
             (this.problem!=null &&
              this.problem.equals(other.getProblem()))) &&
            this.success == other.isSuccess() &&
            ((this.warnings==null && other.getWarnings()==null) || 
             (this.warnings!=null &&
              java.util.Arrays.equals(this.warnings, other.getWarnings())));
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
        if (getBodyCrc() != null) {
            _hashCode += getBodyCrc().hashCode();
        }
        _hashCode += getColumn();
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += getLine();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProblem() != null) {
            _hashCode += getProblem().hashCode();
        }
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getWarnings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWarnings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWarnings(), i);
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
        new org.apache.axis.description.TypeDesc(CompileClassResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "CompileClassResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyCrc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "bodyCrc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("column");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "column"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "problem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warnings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "warnings"));
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
