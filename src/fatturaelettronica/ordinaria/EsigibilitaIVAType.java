//
// Questo file  stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.13 alle 03:27:08 PM CET 
//


package fatturaelettronica.ordinaria;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EsigibilitaIVAType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EsigibilitaIVAType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="1"/>
 *     &lt;maxLength value="1"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EsigibilitaIVAType")
@XmlEnum
public enum EsigibilitaIVAType {


    /**
     * esigibilit differita
     * 
     */
    D,

    /**
     * esigibilit immediata
     * 
     */
    I,

    /**
     * scissione dei pagamenti
     * 
     */
    S;

    public String value() {
        return name();
    }

    public static EsigibilitaIVAType fromValue(String v) {
        return valueOf(v);
    }

}
