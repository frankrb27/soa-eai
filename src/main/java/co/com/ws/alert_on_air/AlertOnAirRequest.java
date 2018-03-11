
package co.com.ws.alert_on_air;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aircrat-tail-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flight-external-key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aircratTailNumber",
    "flightExternalKey",
    "level",
    "description",
    "date"
})
@XmlRootElement(name = "alertOnAirRequest")
public class AlertOnAirRequest {

    @XmlElement(name = "aircrat-tail-number", required = true)
    protected String aircratTailNumber;
    @XmlElement(name = "flight-external-key", required = true)
    protected String flightExternalKey;
    @XmlElement(required = true)
    protected String level;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;

    /**
     * Obtiene el valor de la propiedad aircratTailNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircratTailNumber() {
        return aircratTailNumber;
    }

    /**
     * Define el valor de la propiedad aircratTailNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircratTailNumber(String value) {
        this.aircratTailNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad flightExternalKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightExternalKey() {
        return flightExternalKey;
    }

    /**
     * Define el valor de la propiedad flightExternalKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightExternalKey(String value) {
        this.flightExternalKey = value;
    }

    /**
     * Obtiene el valor de la propiedad level.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Define el valor de la propiedad level.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
