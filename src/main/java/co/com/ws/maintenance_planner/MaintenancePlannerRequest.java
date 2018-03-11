
package co.com.ws.maintenance_planner;

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
 *         &lt;element name="arrivalAirport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="arrivalGate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departureAirport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departureGate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "arrivalAirport",
    "arrivalGate",
    "departureAirport",
    "departureGate",
    "startDate",
    "endDate",
    "status"
})
@XmlRootElement(name = "maintenancePlannerRequest")
public class MaintenancePlannerRequest {

    @XmlElement(name = "aircrat-tail-number", required = true)
    protected String aircratTailNumber;
    @XmlElement(name = "flight-external-key", required = true)
    protected String flightExternalKey;
    @XmlElement(required = true)
    protected String arrivalAirport;
    @XmlElement(required = true)
    protected String arrivalGate;
    @XmlElement(required = true)
    protected String departureAirport;
    @XmlElement(required = true)
    protected String departureGate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true)
    protected String status;

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
     * Obtiene el valor de la propiedad arrivalAirport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Define el valor de la propiedad arrivalAirport.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAirport(String value) {
        this.arrivalAirport = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalGate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalGate() {
        return arrivalGate;
    }

    /**
     * Define el valor de la propiedad arrivalGate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalGate(String value) {
        this.arrivalGate = value;
    }

    /**
     * Obtiene el valor de la propiedad departureAirport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Define el valor de la propiedad departureAirport.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureAirport(String value) {
        this.departureAirport = value;
    }

    /**
     * Obtiene el valor de la propiedad departureGate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureGate() {
        return departureGate;
    }

    /**
     * Define el valor de la propiedad departureGate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureGate(String value) {
        this.departureGate = value;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
