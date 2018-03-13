
package bpel.aerolineas_latinoamericanas.contract.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para scheduled-info complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="scheduled-info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estimated-outgate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estimated-ingate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estimated-outgate-time" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="estimated-ingate-time" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduled-info", propOrder = {
    "estimatedOutgate",
    "estimatedIngate",
    "estimatedOutgateTime",
    "estimatedIngateTime"
})
public class ScheduledInfo {

    @XmlElement(name = "estimated-outgate", required = true)
    protected String estimatedOutgate;
    @XmlElement(name = "estimated-ingate", required = true)
    protected String estimatedIngate;
    @XmlElement(name = "estimated-outgate-time", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar estimatedOutgateTime;
    @XmlElement(name = "estimated-ingate-time", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar estimatedIngateTime;

    /**
     * Obtiene el valor de la propiedad estimatedOutgate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedOutgate() {
        return estimatedOutgate;
    }

    /**
     * Define el valor de la propiedad estimatedOutgate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedOutgate(String value) {
        this.estimatedOutgate = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedIngate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedIngate() {
        return estimatedIngate;
    }

    /**
     * Define el valor de la propiedad estimatedIngate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedIngate(String value) {
        this.estimatedIngate = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedOutgateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedOutgateTime() {
        return estimatedOutgateTime;
    }

    /**
     * Define el valor de la propiedad estimatedOutgateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedOutgateTime(XMLGregorianCalendar value) {
        this.estimatedOutgateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedIngateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedIngateTime() {
        return estimatedIngateTime;
    }

    /**
     * Define el valor de la propiedad estimatedIngateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedIngateTime(XMLGregorianCalendar value) {
        this.estimatedIngateTime = value;
    }

}
