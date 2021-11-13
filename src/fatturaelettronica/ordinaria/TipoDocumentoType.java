//
// Questo file  stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.13 alle 03:27:08 PM CET 
//


package fatturaelettronica.ordinaria;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TipoDocumentoType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoDocumentoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="4"/>
 *     &lt;enumeration value="TD01"/>
 *     &lt;enumeration value="TD02"/>
 *     &lt;enumeration value="TD03"/>
 *     &lt;enumeration value="TD04"/>
 *     &lt;enumeration value="TD05"/>
 *     &lt;enumeration value="TD06"/>
 *     &lt;enumeration value="TD16"/>
 *     &lt;enumeration value="TD17"/>
 *     &lt;enumeration value="TD18"/>
 *     &lt;enumeration value="TD19"/>
 *     &lt;enumeration value="TD20"/>
 *     &lt;enumeration value="TD21"/>
 *     &lt;enumeration value="TD22"/>
 *     &lt;enumeration value="TD23"/>
 *     &lt;enumeration value="TD24"/>
 *     &lt;enumeration value="TD25"/>
 *     &lt;enumeration value="TD26"/>
 *     &lt;enumeration value="TD27"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoDocumentoType")
@XmlEnum
public enum TipoDocumentoType {


    /**
     * Fattura
     * 
     */
    @XmlEnumValue("TD01")
    TD_01("TD01"),

    /**
     * Acconto / anticipo su fattura
     * 
     */
    @XmlEnumValue("TD02")
    TD_02("TD02"),

    /**
     * Acconto / anticipo su parcella
     * 
     */
    @XmlEnumValue("TD03")
    TD_03("TD03"),

    /**
     * Nota di credito
     * 
     */
    @XmlEnumValue("TD04")
    TD_04("TD04"),

    /**
     * Nota di debito
     * 
     */
    @XmlEnumValue("TD05")
    TD_05("TD05"),

    /**
     * Parcella
     * 
     */
    @XmlEnumValue("TD06")
    TD_06("TD06"),

    /**
     * Integrazione fattura reverse charge interno
     * 
     */
    @XmlEnumValue("TD16")
    TD_16("TD16"),

    /**
     * Integrazione/autofattura per acquisto servizi dall'estero
     * 
     */
    @XmlEnumValue("TD17")
    TD_17("TD17"),

    /**
     * Integrazione per acquisto di beni intracomunitari
     * 
     */
    @XmlEnumValue("TD18")
    TD_18("TD18"),

    /**
     * Integrazione/autofattura per acquisto di beni ex art.17 c.2 DPR 633/72
     * 
     */
    @XmlEnumValue("TD19")
    TD_19("TD19"),

    /**
     * Autofattura per regolarizzazione e integrazione delle fatture (ex art.6 c.8 e 9-bis d.lgs.471/97 o art.46 c.5 D.L. 331/93
     * 
     */
    @XmlEnumValue("TD20")
    TD_20("TD20"),

    /**
     * Autofattura per splafonamento
     * 
     */
    @XmlEnumValue("TD21")
    TD_21("TD21"),

    /**
     * Estrazione benida Deposito IVA
     * 
     */
    @XmlEnumValue("TD22")
    TD_22("TD22"),

    /**
     * Estrazione beni da Deposito IVA con versamento dell'IVA
     * 
     */
    @XmlEnumValue("TD23")
    TD_23("TD23"),

    /**
     * Fattura differita di cui all'art.21, comma 4, terzo periodo lett. a) DPR 633/72
     * 
     */
    @XmlEnumValue("TD24")
    TD_24("TD24"),

    /**
     * Fattura differita di cui all'art.21, comma 4, terzo periodo lett. b) DPR 633/72
     * 
     */
    @XmlEnumValue("TD25")
    TD_25("TD25"),

    /**
     * Cessione di beni ammortizzabili e per passaggi interni (ex art.36 DPR 633/72)
     * 
     */
    @XmlEnumValue("TD26")
    TD_26("TD26"),

    /**
     * Fattura per autoconsumo o per cessioni gratuite senza rivalsa
     * 
     */
    @XmlEnumValue("TD27")
    TD_27("TD27");
    private final String value;

    TipoDocumentoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoDocumentoType fromValue(String v) {
        for (TipoDocumentoType c: TipoDocumentoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
