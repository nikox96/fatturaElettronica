//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.09.25 alle 10:08:33 AM CEST 
//


package fatturaelettronica.semplificata.fatturaelettronica;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SocioUnicoType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SocioUnicoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SU"/>
 *     &lt;enumeration value="SM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SocioUnicoType", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0")
@XmlEnum
public enum SocioUnicoType {


    /**
     * socio unico
     * 
     */
    SU,

    /**
     * pi� soci
     * 
     */
    SM;

    public String value() {
        return name();
    }

    public static SocioUnicoType fromValue(String v) {
        return valueOf(v);
    }

}
