
package bpel.com.oracle.xmlns.gestioneventosvuelos.eventosaereos.bpeleventosaerolineasla;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "bpeleventosaerolineasla_client_ep", targetNamespace = "http://xmlns.oracle.com/GestionEventosVuelos/EventosAereos/BPELEventosAerolineasLA", wsdlLocation = "file:/opt/soa/esb/jboss-fuse-6.3.0.redhat-187/deploy/wsdl/bpel/SOA/WSDLs/bpeleventosaerolineasla_client_ep.wsdl")
public class BpeleventosaerolineaslaClientEp
    extends Service
{

    private final static URL BPELEVENTOSAEROLINEASLACLIENTEP_WSDL_LOCATION;
    private final static WebServiceException BPELEVENTOSAEROLINEASLACLIENTEP_EXCEPTION;
    private final static QName BPELEVENTOSAEROLINEASLACLIENTEP_QNAME = new QName("http://xmlns.oracle.com/GestionEventosVuelos/EventosAereos/BPELEventosAerolineasLA", "bpeleventosaerolineasla_client_ep");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/frank/personal/javeriana/Semestre_II/Implementacion/taller%20soa-eai/GestionEventosVuelos/EventosAereos/SOA/WSDLs/bpeleventosaerolineasla_client_ep.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BPELEVENTOSAEROLINEASLACLIENTEP_WSDL_LOCATION = url;
        BPELEVENTOSAEROLINEASLACLIENTEP_EXCEPTION = e;
    }

    public BpeleventosaerolineaslaClientEp() {
        super(__getWsdlLocation(), BPELEVENTOSAEROLINEASLACLIENTEP_QNAME);
    }

    public BpeleventosaerolineaslaClientEp(WebServiceFeature... features) {
        super(__getWsdlLocation(), BPELEVENTOSAEROLINEASLACLIENTEP_QNAME, features);
    }

    public BpeleventosaerolineaslaClientEp(URL wsdlLocation) {
        super(wsdlLocation, BPELEVENTOSAEROLINEASLACLIENTEP_QNAME);
    }

    public BpeleventosaerolineaslaClientEp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BPELEVENTOSAEROLINEASLACLIENTEP_QNAME, features);
    }

    public BpeleventosaerolineaslaClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BpeleventosaerolineaslaClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BPELEventosAerolineasLA
     */
    @WebEndpoint(name = "BPELEventosAerolineasLA_pt")
    public BPELEventosAerolineasLA getBPELEventosAerolineasLAPt() {
        return super.getPort(new QName("http://xmlns.oracle.com/GestionEventosVuelos/EventosAereos/BPELEventosAerolineasLA", "BPELEventosAerolineasLA_pt"), BPELEventosAerolineasLA.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BPELEventosAerolineasLA
     */
    @WebEndpoint(name = "BPELEventosAerolineasLA_pt")
    public BPELEventosAerolineasLA getBPELEventosAerolineasLAPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/GestionEventosVuelos/EventosAereos/BPELEventosAerolineasLA", "BPELEventosAerolineasLA_pt"), BPELEventosAerolineasLA.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BPELEVENTOSAEROLINEASLACLIENTEP_EXCEPTION!= null) {
            throw BPELEVENTOSAEROLINEASLACLIENTEP_EXCEPTION;
        }
        return BPELEVENTOSAEROLINEASLACLIENTEP_WSDL_LOCATION;
    }

}
