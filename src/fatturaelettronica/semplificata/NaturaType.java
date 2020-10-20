//
// Questo file e' stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Qualsiasi modifica a questo file andra' persa durante la ricompilazione dello schema di origine.
// Generato il: 2020.10.05 alle 08:33:50 PM CEST
//


package fatturaelettronica.semplificata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per NaturaType.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NaturaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="N1"/>
 *     &lt;enumeration value="N2"/>
 *     &lt;enumeration value="N2.1"/>
 *     &lt;enumeration value="N2.2"/>
 *     &lt;enumeration value="N3"/>
 *     &lt;enumeration value="N3.1"/>
 *     &lt;enumeration value="N3.2"/>
 *     &lt;enumeration value="N3.3"/>
 *     &lt;enumeration value="N3.4"/>
 *     &lt;enumeration value="N3.5"/>
 *     &lt;enumeration value="N3.6"/>
 *     &lt;enumeration value="N4"/>
 *     &lt;enumeration value="N5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "NaturaType", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0")
@XmlEnum
public enum NaturaType {


    /**
     * Escluse ex. art. 15
     *
     */
    @XmlEnumValue("N1")
    N_1("N1"),

    /**
     * Non soggette
     *
     */
    @XmlEnumValue("N2")
    N_2("N2"),

    /**
     * Non soggette ad IVA ai sensi degli artt. da 7 a 7-septies del DPR 633/72
     *
     */
    @XmlEnumValue("N2.1")
    N_2_1("N2.1"),

    /**
     * Non soggette - altri casi
     *
     */
    @XmlEnumValue("N2.2")
    N_2_2("N2.2"),

    /**
     * Non imponibili
     *
     */
    @XmlEnumValue("N3")
    N_3("N3"),

    /**
     * Non Imponibili - esportazioni
     *
     */
    @XmlEnumValue("N3.1")
    N_3_1("N3.1"),

    /**
     * Non Imponibili - cessioni intracomunitarie
     *
     */
    @XmlEnumValue("N3.2")
    N_3_2("N3.2"),

    /**
     * Non Imponibili - cessioni verso San Marino
     *
     */
    @XmlEnumValue("N3.3")
    N_3_3("N3.3"),

    /**
     * Non Imponibili - operazioni assimilate alle cessioni all'esportazione
     *
     */
    @XmlEnumValue("N3.4")
    N_3_4("N3.4"),

    /**
     * Non Imponibili - a seguito di dichiarazioni d'intento
     *
     */
    @XmlEnumValue("N3.5")
    N_3_5("N3.5"),

    /**
     * Non Imponibili - altre operazioni che non concorrono alla formazione del plafond
     *
     */
    @XmlEnumValue("N3.6")
    N_3_6("N3.6"),

    /**
     * Esenti
     *
     */
    @XmlEnumValue("N4")
    N_4("N4"),

    /**
     * Regime del margine/IVA non esposta in fattura
     *
     */
    @XmlEnumValue("N5")
    N_5("N5");
    private final String value;

    NaturaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NaturaType fromValue(String v) {
        for (NaturaType c: NaturaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
