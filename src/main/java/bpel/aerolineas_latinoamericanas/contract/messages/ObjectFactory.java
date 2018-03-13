
package bpel.aerolineas_latinoamericanas.contract.messages;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aerolineas_latinoamericanas.contract.messages package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aerolineas_latinoamericanas.contract.messages
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DomainEventsInfo }
     * 
     */
    public DomainEventsInfo createDomainEventsInfo() {
        return new DomainEventsInfo();
    }

    /**
     * Create an instance of {@link AircratlineMessage }
     * 
     */
    public AircratlineMessage createAircratlineMessage() {
        return new AircratlineMessage();
    }

    /**
     * Create an instance of {@link FlightLeg }
     * 
     */
    public FlightLeg createFlightLeg() {
        return new FlightLeg();
    }

    /**
     * Create an instance of {@link ScheduledInfo }
     * 
     */
    public ScheduledInfo createScheduledInfo() {
        return new ScheduledInfo();
    }

    /**
     * Create an instance of {@link OperationalInfo }
     * 
     */
    public OperationalInfo createOperationalInfo() {
        return new OperationalInfo();
    }

    /**
     * Create an instance of {@link DomainEventsInfo.AlertOnAir }
     * 
     */
    public DomainEventsInfo.AlertOnAir createDomainEventsInfoAlertOnAir() {
        return new DomainEventsInfo.AlertOnAir();
    }

    /**
     * Create an instance of {@link DomainEventsInfo.OnAirShopping }
     * 
     */
    public DomainEventsInfo.OnAirShopping createDomainEventsInfoOnAirShopping() {
        return new DomainEventsInfo.OnAirShopping();
    }

    /**
     * Create an instance of {@link DomainEventsInfo.ActualOutgate }
     * 
     */
    public DomainEventsInfo.ActualOutgate createDomainEventsInfoActualOutgate() {
        return new DomainEventsInfo.ActualOutgate();
    }

    /**
     * Create an instance of {@link DomainEventsInfo.ActualIngate }
     * 
     */
    public DomainEventsInfo.ActualIngate createDomainEventsInfoActualIngate() {
        return new DomainEventsInfo.ActualIngate();
    }

    /**
     * Create an instance of {@link DomainEventsInfo.EstimatedOutgate }
     * 
     */
    public DomainEventsInfo.EstimatedOutgate createDomainEventsInfoEstimatedOutgate() {
        return new DomainEventsInfo.EstimatedOutgate();
    }

    /**
     * Create an instance of {@link DomainEventsInfo.EstimatedIngate }
     * 
     */
    public DomainEventsInfo.EstimatedIngate createDomainEventsInfoEstimatedIngate() {
        return new DomainEventsInfo.EstimatedIngate();
    }

    /**
     * Create an instance of {@link DomainEventsInfo.CancelFlight }
     * 
     */
    public DomainEventsInfo.CancelFlight createDomainEventsInfoCancelFlight() {
        return new DomainEventsInfo.CancelFlight();
    }

}
