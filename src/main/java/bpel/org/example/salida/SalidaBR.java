
package bpel.org.example.salida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para salidaBR complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="salidaBR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mensajeSalida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salidaBR", propOrder = {
    "estado",
    "mensajeSalida"
})
public class SalidaBR {

    protected int estado;
    @XmlElement(required = true)
    protected String mensajeSalida;

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     */
    public void setEstado(int value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeSalida() {
        return mensajeSalida;
    }

    /**
     * Define el valor de la propiedad mensajeSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeSalida(String value) {
        this.mensajeSalida = value;
    }

}
