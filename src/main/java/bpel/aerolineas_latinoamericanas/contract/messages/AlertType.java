
package bpel.aerolineas_latinoamericanas.contract.messages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para alert-type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="alert-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="DANGER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "alert-type")
@XmlEnum
public enum AlertType {

    WARNING,
    DANGER;

    public String value() {
        return name();
    }

    public static AlertType fromValue(String v) {
        return valueOf(v);
    }

}
