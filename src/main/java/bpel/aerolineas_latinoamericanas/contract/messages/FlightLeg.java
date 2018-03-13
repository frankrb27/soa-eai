
package bpel.aerolineas_latinoamericanas.contract.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para flight-leg complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flight-leg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operational-info" type="{http://aerolineas-latinoamericanas/contract/messages}operational-info"/>
 *         &lt;element name="scheduled-info" type="{http://aerolineas-latinoamericanas/contract/messages}scheduled-info"/>
 *         &lt;element name="domain-events-info" type="{http://aerolineas-latinoamericanas/contract/messages}domain-events-info"/>
 *       &lt;/sequence>
 *       &lt;attribute name="external-key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://aerolineas-latinoamericanas/contract/messages}flight-status" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flight-leg", propOrder = {
    "operationalInfo",
    "scheduledInfo",
    "domainEventsInfo"
})
public class FlightLeg {

    @XmlElement(name = "operational-info", required = true)
    protected OperationalInfo operationalInfo;
    @XmlElement(name = "scheduled-info", required = true)
    protected ScheduledInfo scheduledInfo;
    @XmlElement(name = "domain-events-info", required = true)
    protected DomainEventsInfo domainEventsInfo;
    @XmlAttribute(name = "external-key")
    protected String externalKey;
    @XmlAttribute(name = "status")
    protected FlightStatus status;
    @XmlAttribute(name = "version")
    protected Integer version;

    /**
     * Obtiene el valor de la propiedad operationalInfo.
     * 
     * @return
     *     possible object is
     *     {@link OperationalInfo }
     *     
     */
    public OperationalInfo getOperationalInfo() {
        return operationalInfo;
    }

    /**
     * Define el valor de la propiedad operationalInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalInfo }
     *     
     */
    public void setOperationalInfo(OperationalInfo value) {
        this.operationalInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad scheduledInfo.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledInfo }
     *     
     */
    public ScheduledInfo getScheduledInfo() {
        return scheduledInfo;
    }

    /**
     * Define el valor de la propiedad scheduledInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledInfo }
     *     
     */
    public void setScheduledInfo(ScheduledInfo value) {
        this.scheduledInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad domainEventsInfo.
     * 
     * @return
     *     possible object is
     *     {@link DomainEventsInfo }
     *     
     */
    public DomainEventsInfo getDomainEventsInfo() {
        return domainEventsInfo;
    }

    /**
     * Define el valor de la propiedad domainEventsInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainEventsInfo }
     *     
     */
    public void setDomainEventsInfo(DomainEventsInfo value) {
        this.domainEventsInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad externalKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalKey() {
        return externalKey;
    }

    /**
     * Define el valor de la propiedad externalKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalKey(String value) {
        this.externalKey = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatus }
     *     
     */
    public FlightStatus getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatus }
     *     
     */
    public void setStatus(FlightStatus value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

}
