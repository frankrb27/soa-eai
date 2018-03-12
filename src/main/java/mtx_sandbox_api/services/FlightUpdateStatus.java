
package mtx_sandbox_api.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para flightUpdateStatus.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="flightUpdateStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SCHEDULED"/>
 *     &lt;enumeration value="ON_GOING"/>
 *     &lt;enumeration value="COMPLETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlRootElement
@XmlType(name = "flightUpdateStatus")
@XmlEnum
public enum FlightUpdateStatus {

    SCHEDULED,
    ON_GOING,
    COMPLETED;

    public String value() {
        return name();
    }

    public static FlightUpdateStatus fromValue(String v) {
        return valueOf(v);
    }

}
