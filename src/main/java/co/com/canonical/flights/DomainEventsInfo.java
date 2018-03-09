//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.03.08 a las 08:28:59 PM COT 
//


package co.com.canonical.flights;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para domain-events-info complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="domain-events-info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alert-on-air">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="alert-type" type="{http://aerolineas-latinoamericanas/contract/messages}alert-type"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="on-air-shopping">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="credit-card-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="transaction-date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="actual-outgate">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="gate-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="fuel-percentage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="actual-ingate">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="gate-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="fuel-percentage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="estimated-outgate">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="gate-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="fuel-percentage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="estimated-ingate">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="gate-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="fuel-percentage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cancel-flight">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domain-events-info", propOrder = {
    "alertOnAir",
    "onAirShopping",
    "actualOutgate",
    "actualIngate",
    "estimatedOutgate",
    "estimatedIngate",
    "cancelFlight"
})
public class DomainEventsInfo {

    @XmlElement(name = "alert-on-air", required = true)
    protected DomainEventsInfo.AlertOnAir alertOnAir;
    @XmlElement(name = "on-air-shopping", required = true)
    protected DomainEventsInfo.OnAirShopping onAirShopping;
    @XmlElement(name = "actual-outgate", required = true)
    protected DomainEventsInfo.ActualOutgate actualOutgate;
    @XmlElement(name = "actual-ingate", required = true)
    protected DomainEventsInfo.ActualIngate actualIngate;
    @XmlElement(name = "estimated-outgate", required = true)
    protected DomainEventsInfo.EstimatedOutgate estimatedOutgate;
    @XmlElement(name = "estimated-ingate", required = true)
    protected DomainEventsInfo.EstimatedIngate estimatedIngate;
    @XmlElement(name = "cancel-flight", required = true)
    protected DomainEventsInfo.CancelFlight cancelFlight;

    /**
     * Obtiene el valor de la propiedad alertOnAir.
     * 
     * @return
     *     possible object is
     *     {@link DomainEventsInfo.AlertOnAir }
     *     
     */
    public DomainEventsInfo.AlertOnAir getAlertOnAir() {
        return alertOnAir;
    }

    /**
     * Define el valor de la propiedad alertOnAir.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainEventsInfo.AlertOnAir }
     *     
     */
    public void setAlertOnAir(DomainEventsInfo.AlertOnAir value) {
        this.alertOnAir = value;
    }

    /**
     * Obtiene el valor de la propiedad onAirShopping.
     * 
     * @return
     *     possible object is
     *     {@link DomainEventsInfo.OnAirShopping }
     *     
     */
    public DomainEventsInfo.OnAirShopping getOnAirShopping() {
        return onAirShopping;
    }

    /**
     * Define el valor de la propiedad onAirShopping.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainEventsInfo.OnAirShopping }
     *     
     */
    public void setOnAirShopping(DomainEventsInfo.OnAirShopping value) {
        this.onAirShopping = value;
    }

    /**
     * Obtiene el valor de la propiedad actualOutgate.
     * 
     * @return
     *     possible object is
     *     {@link DomainEventsInfo.ActualOutgate }
     *     
     */
    public DomainEventsInfo.ActualOutgate getActualOutgate() {
        return actualOutgate;
    }

    /**
     * Define el valor de la propiedad actualOutgate.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainEventsInfo.ActualOutgate }
     *     
     */
    public void setActualOutgate(DomainEventsInfo.ActualOutgate value) {
        this.actualOutgate = value;
    }

    /**
     * Obtiene el valor de la propiedad actualIngate.
     * 
     * @return
     *     possible object is
     *     {@link DomainEventsInfo.ActualIngate }
     *     
     */
    public DomainEventsInfo.ActualIngate getActualIngate() {
        return actualIngate;
    }

    /**
     * Define el valor de la propiedad actualIngate.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainEventsInfo.ActualIngate }
     *     
     */
    public void setActualIngate(DomainEventsInfo.ActualIngate value) {
        this.actualIngate = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedOutgate.
     * 
     * @return
     *     possible object is
     *     {@link DomainEventsInfo.EstimatedOutgate }
     *     
     */
    public DomainEventsInfo.EstimatedOutgate getEstimatedOutgate() {
        return estimatedOutgate;
    }

    /**
     * Define el valor de la propiedad estimatedOutgate.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainEventsInfo.EstimatedOutgate }
     *     
     */
    public void setEstimatedOutgate(DomainEventsInfo.EstimatedOutgate value) {
        this.estimatedOutgate = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedIngate.
     * 
     * @return
     *     possible object is
     *     {@link DomainEventsInfo.EstimatedIngate }
     *     
     */
    public DomainEventsInfo.EstimatedIngate getEstimatedIngate() {
        return estimatedIngate;
    }

    /**
     * Define el valor de la propiedad estimatedIngate.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainEventsInfo.EstimatedIngate }
     *     
     */
    public void setEstimatedIngate(DomainEventsInfo.EstimatedIngate value) {
        this.estimatedIngate = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelFlight.
     * 
     * @return
     *     possible object is
     *     {@link DomainEventsInfo.CancelFlight }
     *     
     */
    public DomainEventsInfo.CancelFlight getCancelFlight() {
        return cancelFlight;
    }

    /**
     * Define el valor de la propiedad cancelFlight.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainEventsInfo.CancelFlight }
     *     
     */
    public void setCancelFlight(DomainEventsInfo.CancelFlight value) {
        this.cancelFlight = value;
    }


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
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="gate-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="fuel-percentage" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "date",
        "gateCode",
        "fuelPercentage"
    })
    public static class ActualIngate {

        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlElement(name = "gate-code", required = true)
        protected String gateCode;
        @XmlElement(name = "fuel-percentage")
        protected int fuelPercentage;

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

        /**
         * Obtiene el valor de la propiedad gateCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGateCode() {
            return gateCode;
        }

        /**
         * Define el valor de la propiedad gateCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGateCode(String value) {
            this.gateCode = value;
        }

        /**
         * Obtiene el valor de la propiedad fuelPercentage.
         * 
         */
        public int getFuelPercentage() {
            return fuelPercentage;
        }

        /**
         * Define el valor de la propiedad fuelPercentage.
         * 
         */
        public void setFuelPercentage(int value) {
            this.fuelPercentage = value;
        }

    }


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
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="gate-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="fuel-percentage" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "date",
        "gateCode",
        "fuelPercentage"
    })
    public static class ActualOutgate {

        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlElement(name = "gate-code", required = true)
        protected String gateCode;
        @XmlElement(name = "fuel-percentage")
        protected int fuelPercentage;

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

        /**
         * Obtiene el valor de la propiedad gateCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGateCode() {
            return gateCode;
        }

        /**
         * Define el valor de la propiedad gateCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGateCode(String value) {
            this.gateCode = value;
        }

        /**
         * Obtiene el valor de la propiedad fuelPercentage.
         * 
         */
        public int getFuelPercentage() {
            return fuelPercentage;
        }

        /**
         * Define el valor de la propiedad fuelPercentage.
         * 
         */
        public void setFuelPercentage(int value) {
            this.fuelPercentage = value;
        }

    }


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
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="alert-type" type="{http://aerolineas-latinoamericanas/contract/messages}alert-type"/>
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
        "description",
        "alertType"
    })
    public static class AlertOnAir {

        @XmlElement(required = true)
        protected String description;
        @XmlElement(name = "alert-type", required = true)
        @XmlSchemaType(name = "string")
        protected AlertType alertType;

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
         * Obtiene el valor de la propiedad alertType.
         * 
         * @return
         *     possible object is
         *     {@link AlertType }
         *     
         */
        public AlertType getAlertType() {
            return alertType;
        }

        /**
         * Define el valor de la propiedad alertType.
         * 
         * @param value
         *     allowed object is
         *     {@link AlertType }
         *     
         */
        public void setAlertType(AlertType value) {
            this.alertType = value;
        }

    }


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
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "description"
    })
    public static class CancelFlight {

        @XmlElement(required = true)
        protected String description;

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

    }


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
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="gate-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="fuel-percentage" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "date",
        "gateCode",
        "fuelPercentage"
    })
    public static class EstimatedIngate {

        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlElement(name = "gate-code", required = true)
        protected String gateCode;
        @XmlElement(name = "fuel-percentage")
        protected int fuelPercentage;

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

        /**
         * Obtiene el valor de la propiedad gateCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGateCode() {
            return gateCode;
        }

        /**
         * Define el valor de la propiedad gateCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGateCode(String value) {
            this.gateCode = value;
        }

        /**
         * Obtiene el valor de la propiedad fuelPercentage.
         * 
         */
        public int getFuelPercentage() {
            return fuelPercentage;
        }

        /**
         * Define el valor de la propiedad fuelPercentage.
         * 
         */
        public void setFuelPercentage(int value) {
            this.fuelPercentage = value;
        }

    }


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
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="gate-code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="fuel-percentage" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "date",
        "gateCode",
        "fuelPercentage"
    })
    public static class EstimatedOutgate {

        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlElement(name = "gate-code", required = true)
        protected String gateCode;
        @XmlElement(name = "fuel-percentage")
        protected int fuelPercentage;

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

        /**
         * Obtiene el valor de la propiedad gateCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGateCode() {
            return gateCode;
        }

        /**
         * Define el valor de la propiedad gateCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGateCode(String value) {
            this.gateCode = value;
        }

        /**
         * Obtiene el valor de la propiedad fuelPercentage.
         * 
         */
        public int getFuelPercentage() {
            return fuelPercentage;
        }

        /**
         * Define el valor de la propiedad fuelPercentage.
         * 
         */
        public void setFuelPercentage(int value) {
            this.fuelPercentage = value;
        }

    }


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
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="credit-card-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="transaction-date" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "description",
        "creditCardNumber",
        "value",
        "transactionDate"
    })
    public static class OnAirShopping {

        @XmlElement(required = true)
        protected String description;
        @XmlElement(name = "credit-card-number", required = true)
        protected String creditCardNumber;
        protected long value;
        @XmlElement(name = "transaction-date", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar transactionDate;

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
         * Obtiene el valor de la propiedad creditCardNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditCardNumber() {
            return creditCardNumber;
        }

        /**
         * Define el valor de la propiedad creditCardNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditCardNumber(String value) {
            this.creditCardNumber = value;
        }

        /**
         * Obtiene el valor de la propiedad value.
         * 
         */
        public long getValue() {
            return value;
        }

        /**
         * Define el valor de la propiedad value.
         * 
         */
        public void setValue(long value) {
            this.value = value;
        }

        /**
         * Obtiene el valor de la propiedad transactionDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTransactionDate() {
            return transactionDate;
        }

        /**
         * Define el valor de la propiedad transactionDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTransactionDate(XMLGregorianCalendar value) {
            this.transactionDate = value;
        }

    }

}
