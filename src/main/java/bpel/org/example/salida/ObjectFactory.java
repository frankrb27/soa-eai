
package bpel.org.example.salida;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.salida package. 
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

    private final static QName _NodoSalida_QNAME = new QName("http://www.example.org/salida", "nodoSalida");
    private final static QName _NodoEntradaBR_QNAME = new QName("http://www.example.org/salida", "nodoEntradaBR");
    private final static QName _NodoSalidaBR_QNAME = new QName("http://www.example.org/salida", "nodoSalidaBR");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.salida
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Salida }
     * 
     */
    public Salida createSalida() {
        return new Salida();
    }

    /**
     * Create an instance of {@link EntradaBR }
     * 
     */
    public EntradaBR createEntradaBR() {
        return new EntradaBR();
    }

    /**
     * Create an instance of {@link SalidaBR }
     * 
     */
    public SalidaBR createSalidaBR() {
        return new SalidaBR();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Salida }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/salida", name = "nodoSalida")
    public JAXBElement<Salida> createNodoSalida(Salida value) {
        return new JAXBElement<Salida>(_NodoSalida_QNAME, Salida.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntradaBR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/salida", name = "nodoEntradaBR")
    public JAXBElement<EntradaBR> createNodoEntradaBR(EntradaBR value) {
        return new JAXBElement<EntradaBR>(_NodoEntradaBR_QNAME, EntradaBR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalidaBR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/salida", name = "nodoSalidaBR")
    public JAXBElement<SalidaBR> createNodoSalidaBR(SalidaBR value) {
        return new JAXBElement<SalidaBR>(_NodoSalidaBR_QNAME, SalidaBR.class, null, value);
    }

}
