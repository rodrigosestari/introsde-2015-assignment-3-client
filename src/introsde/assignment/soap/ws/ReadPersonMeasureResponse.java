
package introsde.assignment.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readPersonMeasureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readPersonMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeasureProfile" type="{http://ws.soap.assignment.introsde/}measureProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPersonMeasureResponse", propOrder = {
    "measureProfile"
})
public class ReadPersonMeasureResponse {

    @XmlElement(name = "MeasureProfile")
    protected MeasureProfile measureProfile;

    /**
     * Gets the value of the measureProfile property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureProfile }
     *     
     */
    public MeasureProfile getMeasureProfile() {
        return measureProfile;
    }

    /**
     * Sets the value of the measureProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureProfile }
     *     
     */
    public void setMeasureProfile(MeasureProfile value) {
        this.measureProfile = value;
    }

}
