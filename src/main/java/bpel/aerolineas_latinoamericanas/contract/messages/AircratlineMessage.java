
package bpel.aerolineas_latinoamericanas.contract.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="departure-airport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="arrival-airport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tail-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flight-leg" type="{http://aerolineas-latinoamericanas/contract/messages}flight-leg" maxOccurs="unbounded" minOccurs="0"/>
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
    "departureAirport",
    "arrivalAirport",
    "tailNumber",
    "flightLeg"
})
@XmlRootElement(name = "aircratline-message")
public class AircratlineMessage {

    @XmlElement(name = "departure-airport", required = true)
    protected String departureAirport;
    @XmlElement(name = "arrival-airport", required = true)
    protected String arrivalAirport;
    @XmlElement(name = "tail-number", required = true)
    protected String tailNumber;
    @XmlElement(name = "flight-leg")
    protected List<FlightLeg> flightLeg;

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
     * Obtiene el valor de la propiedad tailNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTailNumber() {
        return tailNumber;
    }

    /**
     * Define el valor de la propiedad tailNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTailNumber(String value) {
        this.tailNumber = value;
    }

    /**
     * Gets the value of the flightLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightLeg }
     * 
     * 
     */
    public List<FlightLeg> getFlightLeg() {
        if (flightLeg == null) {
            flightLeg = new ArrayList<FlightLeg>();
        }
        return this.flightLeg;
    }

}
