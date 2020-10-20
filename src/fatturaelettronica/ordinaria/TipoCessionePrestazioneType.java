//
// Questo file e' stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Qualsiasi modifica a questo file andra' persa durante la ricompilazione dello schema di origine.
// Generato il: 2020.10.05 alle 08:33:21 PM CEST
//


package fatturaelettronica.ordinaria;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TipoCessionePrestazioneType.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoCessionePrestazioneType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="2"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="AC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "TipoCessionePrestazioneType")
@XmlEnum
public enum TipoCessionePrestazioneType {


    /**
     * Sconto
     *
     */
    SC,

    /**
     * Premio
     *
     */
    PR,

    /**
     * Abbuono
     *
     */
    AB,

    /**
     * Spesa accessoria
     *
     */
    AC;

    public String value() {
        return name();
    }

    public static TipoCessionePrestazioneType fromValue(String v) {
        return valueOf(v);
    }

}
