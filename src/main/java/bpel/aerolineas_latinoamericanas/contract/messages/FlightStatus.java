
package bpel.aerolineas_latinoamericanas.contract.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para flight-status.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="flight-status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SCHEDULED"/>
 *     &lt;enumeration value="IN_PROGRESS"/>
 *     &lt;enumeration value="COMPLETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "flight-status")
@XmlEnum
public enum FlightStatus {

    SCHEDULED,
    IN_PROGRESS,
    COMPLETED;

    public String value() {
        return name();
    }

    public static FlightStatus fromValue(String v) {
        return valueOf(v);
    }

}
