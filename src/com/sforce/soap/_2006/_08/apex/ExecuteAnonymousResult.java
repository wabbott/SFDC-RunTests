/**
 * ExecuteAnonymousResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._08.apex;

public class ExecuteAnonymousResult  implements java.io.Serializable {
    private int column;

    private java.lang.String compileProblem;

    private boolean compiled;

    private java.lang.String exceptionMessage;

    private java.lang.String exceptionStackTrace;

    private int line;

    private boolean success;

    public ExecuteAnonymousResult() {
    }

    public ExecuteAnonymousResult(
           int column,
           java.lang.String compileProblem,
           boolean compiled,
           java.lang.String exceptionMessage,
           java.lang.String exceptionStackTrace,
           int line,
           boolean success) {
           this.column = column;
           this.compileProblem = compileProblem;
           this.compiled = compiled;
           this.exceptionMessage = exceptionMessage;
           this.exceptionStackTrace = exceptionStackTrace;
           this.line = line;
           this.success = success;
    }


    /**
     * Gets the column value for this ExecuteAnonymousResult.
     * 
     * @return column
     */
    public int getColumn() {
        return column;
    }


    /**
     * Sets the column value for this ExecuteAnonymousResult.
     * 
     * @param column
     */
    public void setColumn(int column) {
        this.column = column;
    }


    /**
     * Gets the compileProblem value for this ExecuteAnonymousResult.
     * 
     * @return compileProblem
     */
    public java.lang.String getCompileProblem() {
        return compileProblem;
    }


    /**
     * Sets the compileProblem value for this ExecuteAnonymousResult.
     * 
     * @param compileProblem
     */
    public void setCompileProblem(java.lang.String compileProblem) {
        this.compileProblem = compileProblem;
    }


    /**
     * Gets the compiled value for this ExecuteAnonymousResult.
     * 
     * @return compiled
     */
    public boolean isCompiled() {
        return compiled;
    }


    /**
     * Sets the compiled value for this ExecuteAnonymousResult.
     * 
     * @param compiled
     */
    public void setCompiled(boolean compiled) {
        this.compiled = compiled;
    }


    /**
     * Gets the exceptionMessage value for this ExecuteAnonymousResult.
     * 
     * @return exceptionMessage
     */
    public java.lang.String getExceptionMessage() {
        return exceptionMessage;
    }


    /**
     * Sets the exceptionMessage value for this ExecuteAnonymousResult.
     * 
     * @param exceptionMessage
     */
    public void setExceptionMessage(java.lang.String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }


    /**
     * Gets the exceptionStackTrace value for this ExecuteAnonymousResult.
     * 
     * @return exceptionStackTrace
     */
    public java.lang.String getExceptionStackTrace() {
        return exceptionStackTrace;
    }


    /**
     * Sets the exceptionStackTrace value for this ExecuteAnonymousResult.
     * 
     * @param exceptionStackTrace
     */
    public void setExceptionStackTrace(java.lang.String exceptionStackTrace) {
        this.exceptionStackTrace = exceptionStackTrace;
    }


    /**
     * Gets the line value for this ExecuteAnonymousResult.
     * 
     * @return line
     */
    public int getLine() {
        return line;
    }


    /**
     * Sets the line value for this ExecuteAnonymousResult.
     * 
     * @param line
     */
    public void setLine(int line) {
        this.line = line;
    }


    /**
     * Gets the success value for this ExecuteAnonymousResult.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this ExecuteAnonymousResult.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecuteAnonymousResult)) return false;
        ExecuteAnonymousResult other = (ExecuteAnonymousResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.column == other.getColumn() &&
            ((this.compileProblem==null && other.getCompileProblem()==null) || 
             (this.compileProblem!=null &&
              this.compileProblem.equals(other.getCompileProblem()))) &&
            this.compiled == other.isCompiled() &&
            ((this.exceptionMessage==null && other.getExceptionMessage()==null) || 
             (this.exceptionMessage!=null &&
              this.exceptionMessage.equals(other.getExceptionMessage()))) &&
            ((this.exceptionStackTrace==null && other.getExceptionStackTrace()==null) || 
             (this.exceptionStackTrace!=null &&
              this.exceptionStackTrace.equals(other.getExceptionStackTrace()))) &&
            this.line == other.getLine() &&
            this.success == other.isSuccess();
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
        _hashCode += getColumn();
        if (getCompileProblem() != null) {
            _hashCode += getCompileProblem().hashCode();
        }
        _hashCode += (isCompiled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExceptionMessage() != null) {
            _hashCode += getExceptionMessage().hashCode();
        }
        if (getExceptionStackTrace() != null) {
            _hashCode += getExceptionStackTrace().hashCode();
        }
        _hashCode += getLine();
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecuteAnonymousResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "ExecuteAnonymousResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("column");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "column"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compileProblem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "compileProblem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compiled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "compiled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "exceptionMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionStackTrace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "exceptionStackTrace"));
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
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/08/apex", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
