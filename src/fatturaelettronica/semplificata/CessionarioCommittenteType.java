//
// Questo file e' stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Qualsiasi modifica a questo file andra' persa durante la ricompilazione dello schema di origine.
// Generato il: 2020.10.05 alle 08:33:50 PM CEST
//


package fatturaelettronica.semplificata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Blocco relativo ai dati del Cessionario / Committente
 *
 * <p>Classe Java per CessionarioCommittenteType complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="CessionarioCommittenteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificativiFiscali" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}IdentificativiFiscaliType"/>
 *         &lt;element name="AltriDatiIdentificativi" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}AltriDatiIdentificativiType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CessionarioCommittenteType", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0", propOrder = {
    "identificativiFiscali",
    "altriDatiIdentificativi"
})
public class CessionarioCommittenteType {

    @XmlElement(name = "IdentificativiFiscali", required = true)
    protected IdentificativiFiscaliType identificativiFiscali;
    @XmlElement(name = "AltriDatiIdentificativi")
    protected AltriDatiIdentificativiType altriDatiIdentificativi;

    /**
     * Recupera il valore della proprieta' identificativiFiscali.
     *
     * @return
     *     possible object is
     *     {@link IdentificativiFiscaliType }
     *
     */
    public IdentificativiFiscaliType getIdentificativiFiscali() {
        return identificativiFiscali;
    }

    /**
     * Imposta il valore della proprieta' identificativiFiscali.
     *
     * @param value
     *     allowed object is
     *     {@link IdentificativiFiscaliType }
     *
     */
    public void setIdentificativiFiscali(IdentificativiFiscaliType value) {
        this.identificativiFiscali = value;
    }

    /**
     * Recupera il valore della proprieta' altriDatiIdentificativi.
     *
     * @return
     *     possible object is
     *     {@link AltriDatiIdentificativiType }
     *
     */
    public AltriDatiIdentificativiType getAltriDatiIdentificativi() {
        return altriDatiIdentificativi;
    }

    /**
     * Imposta il valore della proprieta' altriDatiIdentificativi.
     *
     * @param value
     *     allowed object is
     *     {@link AltriDatiIdentificativiType }
     *
     */
    public void setAltriDatiIdentificativi(AltriDatiIdentificativiType value) {
        this.altriDatiIdentificativi = value;
    }

}
