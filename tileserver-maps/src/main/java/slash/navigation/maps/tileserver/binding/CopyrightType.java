//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.23 at 07:43:29 AM MESZ 
//


package slash.navigation.maps.tileserver.binding;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for copyrightType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="copyrightType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Esri"/>
 *     &lt;enumeration value="Google"/>
 *     &lt;enumeration value="OpenStreetMap"/>
 *     &lt;enumeration value="OutdoorActive"/>
 *     &lt;enumeration value="Thunderforest"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Wanderreitkarte"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "copyrightType")
@XmlEnum
public enum CopyrightType {

    @XmlEnumValue("Esri")
    ESRI("Esri"),
    @XmlEnumValue("Google")
    GOOGLE("Google"),
    @XmlEnumValue("OpenStreetMap")
    OPEN_STREET_MAP("OpenStreetMap"),
    @XmlEnumValue("OutdoorActive")
    OUTDOOR_ACTIVE("OutdoorActive"),
    @XmlEnumValue("Thunderforest")
    THUNDERFOREST("Thunderforest"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Wanderreitkarte")
    WANDERREITKARTE("Wanderreitkarte");
    private final String value;

    CopyrightType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CopyrightType fromValue(String v) {
        for (CopyrightType c: CopyrightType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
