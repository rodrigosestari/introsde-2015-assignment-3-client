/**
 * MeasureBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package introsde.assignment.soap.ws;

public class MeasureBean  implements java.io.Serializable {
    private java.lang.Long mid;

    private java.util.Calendar dateRegistered;

    private java.lang.String measureType;

    private java.lang.String measureValue;

    private java.lang.String measureValueType;

    public MeasureBean() {
    }

    public MeasureBean(
           java.lang.Long mid,
           java.util.Calendar dateRegistered,
           java.lang.String measureType,
           java.lang.String measureValue,
           java.lang.String measureValueType) {
           this.mid = mid;
           this.dateRegistered = dateRegistered;
           this.measureType = measureType;
           this.measureValue = measureValue;
           this.measureValueType = measureValueType;
    }


    /**
     * Gets the mid value for this MeasureBean.
     * 
     * @return mid
     */
    public java.lang.Long getMid() {
        return mid;
    }


    /**
     * Sets the mid value for this MeasureBean.
     * 
     * @param mid
     */
    public void setMid(java.lang.Long mid) {
        this.mid = mid;
    }


    /**
     * Gets the dateRegistered value for this MeasureBean.
     * 
     * @return dateRegistered
     */
    public java.util.Calendar getDateRegistered() {
        return dateRegistered;
    }


    /**
     * Sets the dateRegistered value for this MeasureBean.
     * 
     * @param dateRegistered
     */
    public void setDateRegistered(java.util.Calendar dateRegistered) {
        this.dateRegistered = dateRegistered;
    }


    /**
     * Gets the measureType value for this MeasureBean.
     * 
     * @return measureType
     */
    public java.lang.String getMeasureType() {
        return measureType;
    }


    /**
     * Sets the measureType value for this MeasureBean.
     * 
     * @param measureType
     */
    public void setMeasureType(java.lang.String measureType) {
        this.measureType = measureType;
    }


    /**
     * Gets the measureValue value for this MeasureBean.
     * 
     * @return measureValue
     */
    public java.lang.String getMeasureValue() {
        return measureValue;
    }


    /**
     * Sets the measureValue value for this MeasureBean.
     * 
     * @param measureValue
     */
    public void setMeasureValue(java.lang.String measureValue) {
        this.measureValue = measureValue;
    }


    /**
     * Gets the measureValueType value for this MeasureBean.
     * 
     * @return measureValueType
     */
    public java.lang.String getMeasureValueType() {
        return measureValueType;
    }


    /**
     * Sets the measureValueType value for this MeasureBean.
     * 
     * @param measureValueType
     */
    public void setMeasureValueType(java.lang.String measureValueType) {
        this.measureValueType = measureValueType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MeasureBean)) return false;
        MeasureBean other = (MeasureBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mid==null && other.getMid()==null) || 
             (this.mid!=null &&
              this.mid.equals(other.getMid()))) &&
            ((this.dateRegistered==null && other.getDateRegistered()==null) || 
             (this.dateRegistered!=null &&
              this.dateRegistered.equals(other.getDateRegistered()))) &&
            ((this.measureType==null && other.getMeasureType()==null) || 
             (this.measureType!=null &&
              this.measureType.equals(other.getMeasureType()))) &&
            ((this.measureValue==null && other.getMeasureValue()==null) || 
             (this.measureValue!=null &&
              this.measureValue.equals(other.getMeasureValue()))) &&
            ((this.measureValueType==null && other.getMeasureValueType()==null) || 
             (this.measureValueType!=null &&
              this.measureValueType.equals(other.getMeasureValueType())));
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
        if (getMid() != null) {
            _hashCode += getMid().hashCode();
        }
        if (getDateRegistered() != null) {
            _hashCode += getDateRegistered().hashCode();
        }
        if (getMeasureType() != null) {
            _hashCode += getMeasureType().hashCode();
        }
        if (getMeasureValue() != null) {
            _hashCode += getMeasureValue().hashCode();
        }
        if (getMeasureValueType() != null) {
            _hashCode += getMeasureValueType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MeasureBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.soap.assignment.introsde/", "measureBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRegistered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateRegistered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureValueType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureValueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
