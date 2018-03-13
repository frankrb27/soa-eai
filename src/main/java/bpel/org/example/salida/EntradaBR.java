
package bpel.org.example.salida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para entradaBR complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="entradaBR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tailNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OnAirShopping" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AlertsOnAir" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CancelFlight" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ActualIngate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ActualOutgate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EstimatedIngate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EstimatedOutgate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Combustible" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entradaBR", propOrder = {
    "tailNumber",
    "onAirShopping",
    "alertsOnAir",
    "cancelFlight",
    "actualIngate",
    "actualOutgate",
    "estimatedIngate",
    "estimatedOutgate",
    "status",
    "combustible"
})
public class EntradaBR {

    @XmlElement(required = true)
    protected String tailNumber;
    @XmlElement(name = "OnAirShopping")
    protected boolean onAirShopping;
    @XmlElement(name = "AlertsOnAir")
    protected boolean alertsOnAir;
    @XmlElement(name = "CancelFlight")
    protected boolean cancelFlight;
    @XmlElement(name = "ActualIngate")
    protected boolean actualIngate;
    @XmlElement(name = "ActualOutgate")
    protected boolean actualOutgate;
    @XmlElement(name = "EstimatedIngate")
    protected boolean estimatedIngate;
    @XmlElement(name = "EstimatedOutgate")
    protected boolean estimatedOutgate;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "Combustible")
    protected int combustible;

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
     * Obtiene el valor de la propiedad onAirShopping.
     * 
     */
    public boolean isOnAirShopping() {
        return onAirShopping;
    }

    /**
     * Define el valor de la propiedad onAirShopping.
     * 
     */
    public void setOnAirShopping(boolean value) {
        this.onAirShopping = value;
    }

    /**
     * Obtiene el valor de la propiedad alertsOnAir.
     * 
     */
    public boolean isAlertsOnAir() {
        return alertsOnAir;
    }

    /**
     * Define el valor de la propiedad alertsOnAir.
     * 
     */
    public void setAlertsOnAir(boolean value) {
        this.alertsOnAir = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelFlight.
     * 
     */
    public boolean isCancelFlight() {
        return cancelFlight;
    }

    /**
     * Define el valor de la propiedad cancelFlight.
     * 
     */
    public void setCancelFlight(boolean value) {
        this.cancelFlight = value;
    }

    /**
     * Obtiene el valor de la propiedad actualIngate.
     * 
     */
    public boolean isActualIngate() {
        return actualIngate;
    }

    /**
     * Define el valor de la propiedad actualIngate.
     * 
     */
    public void setActualIngate(boolean value) {
        this.actualIngate = value;
    }

    /**
     * Obtiene el valor de la propiedad actualOutgate.
     * 
     */
    public boolean isActualOutgate() {
        return actualOutgate;
    }

    /**
     * Define el valor de la propiedad actualOutgate.
     * 
     */
    public void setActualOutgate(boolean value) {
        this.actualOutgate = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedIngate.
     * 
     */
    public boolean isEstimatedIngate() {
        return estimatedIngate;
    }

    /**
     * Define el valor de la propiedad estimatedIngate.
     * 
     */
    public void setEstimatedIngate(boolean value) {
        this.estimatedIngate = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedOutgate.
     * 
     */
    public boolean isEstimatedOutgate() {
        return estimatedOutgate;
    }

    /**
     * Define el valor de la propiedad estimatedOutgate.
     * 
     */
    public void setEstimatedOutgate(boolean value) {
        this.estimatedOutgate = value;
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

    /**
     * Obtiene el valor de la propiedad combustible.
     * 
     */
    public int getCombustible() {
        return combustible;
    }

    /**
     * Define el valor de la propiedad combustible.
     * 
     */
    public void setCombustible(int value) {
        this.combustible = value;
    }

}
