//
// Questo file e' stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Qualsiasi modifica a questo file andra' persa durante la ricompilazione dello schema di origine.
// Generato il: 2020.10.05 alle 08:33:50 PM CEST
//


package fatturaelettronica.semplificata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BolloVirtualeType.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BolloVirtualeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "BolloVirtualeType", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0")
@XmlEnum
public enum BolloVirtualeType {

    SI;

    public String value() {
        return name();
    }

    public static BolloVirtualeType fromValue(String v) {
        return valueOf(v);
    }

}
