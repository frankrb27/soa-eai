
package mtx_sandbox_api.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mtx_sandbox_api.services package. 
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

    private final static QName _SendMoppResponse_QNAME = new QName("http://mtx-sandbox-api/services", "sendMoppResponse");
    private final static QName _Update_QNAME = new QName("http://mtx-sandbox-api/services", "update");
    private final static QName _UpdateResponse_QNAME = new QName("http://mtx-sandbox-api/services", "updateResponse");
    private final static QName _SendMopp_QNAME = new QName("http://mtx-sandbox-api/services", "sendMopp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mtx_sandbox_api.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendMoppResponse }
     * 
     */
    public SendMoppResponse createSendMoppResponse() {
        return new SendMoppResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link SendMopp }
     * 
     */
    public SendMopp createSendMopp() {
        return new SendMopp();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link FlightUpdateRequest }
     * 
     */
    public FlightUpdateRequest createFlightUpdateRequest() {
        return new FlightUpdateRequest();
    }

    /**
     * Create an instance of {@link MoppRequest }
     * 
     */
    public MoppRequest createMoppRequest() {
        return new MoppRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMoppResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mtx-sandbox-api/services", name = "sendMoppResponse")
    public JAXBElement<SendMoppResponse> createSendMoppResponse(SendMoppResponse value) {
        return new JAXBElement<SendMoppResponse>(_SendMoppResponse_QNAME, SendMoppResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mtx-sandbox-api/services", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mtx-sandbox-api/services", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMopp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mtx-sandbox-api/services", name = "sendMopp")
    public JAXBElement<SendMopp> createSendMopp(SendMopp value) {
        return new JAXBElement<SendMopp>(_SendMopp_QNAME, SendMopp.class, null, value);
    }

}
