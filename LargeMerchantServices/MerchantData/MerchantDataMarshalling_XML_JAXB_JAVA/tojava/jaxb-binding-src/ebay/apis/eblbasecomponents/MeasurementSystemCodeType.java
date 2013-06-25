//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 06:08:42 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementSystemCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasurementSystemCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="English"/>
 *     &lt;enumeration value="Metric"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeasurementSystemCodeType")
@XmlEnum
public enum MeasurementSystemCodeType {


    /**
     * 
     * 						English system of measurement.
     * 					
     * 
     */
    @XmlEnumValue("English")
    ENGLISH("English"),

    /**
     * 
     * 						Metric system of measurement.
     * 					
     * 
     */
    @XmlEnumValue("Metric")
    METRIC("Metric");
    private final String value;

    MeasurementSystemCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementSystemCodeType fromValue(String v) {
        for (MeasurementSystemCodeType c: MeasurementSystemCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}