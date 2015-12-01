/**
 * PersonBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package introsde.assignment.soap.bean;

import java.util.Arrays;

public class PersonBean  implements java.io.Serializable {
    private java.lang.Long id;

    private java.lang.String firstname;

    private java.lang.String lastname;

    private introsde.assignment.soap.bean.MeasureBean[] currentHealth;

    public PersonBean() {
    }

    public PersonBean(
           java.lang.Long id,
           java.lang.String firstname,
           java.lang.String lastname,
           introsde.assignment.soap.bean.MeasureBean[] currentHealth) {
           this.id = id;
           this.firstname = firstname;
           this.lastname = lastname;
           this.currentHealth = currentHealth;
    }


    /**
     * Gets the id value for this PersonBean.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this PersonBean.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the firstname value for this PersonBean.
     * 
     * @return firstname
     */
    public java.lang.String getFirstname() {
        return firstname;
    }


    /**
     * Sets the firstname value for this PersonBean.
     * 
     * @param firstname
     */
    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
    }


    /**
     * Gets the lastname value for this PersonBean.
     * 
     * @return lastname
     */
    public java.lang.String getLastname() {
        return lastname;
    }


    /**
     * Sets the lastname value for this PersonBean.
     * 
     * @param lastname
     */
    public void setLastname(java.lang.String lastname) {
        this.lastname = lastname;
    }


    /**
     * Gets the currentHealth value for this PersonBean.
     * 
     * @return currentHealth
     */
    public introsde.assignment.soap.bean.MeasureBean[] getCurrentHealth() {
        return currentHealth;
    }


    /**
     * Sets the currentHealth value for this PersonBean.
     * 
     * @param currentHealth
     */
    public void setCurrentHealth(introsde.assignment.soap.bean.MeasureBean[] currentHealth) {
        this.currentHealth = currentHealth;
    }

    public introsde.assignment.soap.bean.MeasureBean getCurrentHealth(int i) {
        return this.currentHealth[i];
    }

    public void setCurrentHealth(int i, introsde.assignment.soap.bean.MeasureBean _value) {
        this.currentHealth[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonBean)) return false;
        PersonBean other = (PersonBean) obj;
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
            ((this.firstname==null && other.getFirstname()==null) || 
             (this.firstname!=null &&
              this.firstname.equals(other.getFirstname()))) &&
            ((this.lastname==null && other.getLastname()==null) || 
             (this.lastname!=null &&
              this.lastname.equals(other.getLastname()))) &&
            ((this.currentHealth==null && other.getCurrentHealth()==null) || 
             (this.currentHealth!=null &&
              java.util.Arrays.equals(this.currentHealth, other.getCurrentHealth())));
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
        if (getFirstname() != null) {
            _hashCode += getFirstname().hashCode();
        }
        if (getLastname() != null) {
            _hashCode += getLastname().hashCode();
        }
        if (getCurrentHealth() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrentHealth());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrentHealth(), i);
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
        new org.apache.axis.description.TypeDesc(PersonBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.soap.assignment.introsde/", "personBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentHealth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentHealth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.soap.assignment.introsde/", "measureBean"));
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

	@Override
	public String toString() {
		return "PersonBean [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", currentHealth="
				+ Arrays.toString(currentHealth) + "]";
	}

    
}
