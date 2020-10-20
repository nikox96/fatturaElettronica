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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per IndirizzoType complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="IndirizzoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Indirizzo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}String60LatinType"/>
 *         &lt;element name="NumeroCivico" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}NumeroCivicoType" minOccurs="0"/>
 *         &lt;element name="CAP" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}CAPType"/>
 *         &lt;element name="Comune" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}String60LatinType"/>
 *         &lt;element name="Provincia" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}ProvinciaType" minOccurs="0"/>
 *         &lt;element name="Nazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}NazioneType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndirizzoType", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0", propOrder = {
    "indirizzo",
    "numeroCivico",
    "cap",
    "comune",
    "provincia",
    "nazione"
})
public class IndirizzoType {

    @XmlElement(name = "Indirizzo", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String indirizzo;
    @XmlElement(name = "NumeroCivico")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String numeroCivico;
    @XmlElement(name = "CAP", required = true)
    protected String cap;
    @XmlElement(name = "Comune", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String comune;
    @XmlElement(name = "Provincia")
    protected String provincia;
    @XmlElement(name = "Nazione", required = true, defaultValue = "IT")
    protected String nazione;

    /**
     * Recupera il valore della proprieta' indirizzo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * Imposta il valore della proprieta' indirizzo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIndirizzo(String value) {
        this.indirizzo = value;
    }

    /**
     * Recupera il valore della proprieta' numeroCivico.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroCivico() {
        return numeroCivico;
    }

    /**
     * Imposta il valore della proprieta' numeroCivico.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroCivico(String value) {
        this.numeroCivico = value;
    }

    /**
     * Recupera il valore della proprieta' cap.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCAP() {
        return cap;
    }

    /**
     * Imposta il valore della proprieta' cap.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCAP(String value) {
        this.cap = value;
    }

    /**
     * Recupera il valore della proprieta' comune.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComune() {
        return comune;
    }

    /**
     * Imposta il valore della proprieta' comune.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComune(String value) {
        this.comune = value;
    }

    /**
     * Recupera il valore della proprieta' provincia.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Imposta il valore della proprieta' provincia.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Recupera il valore della proprieta' nazione.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNazione() {
        return nazione;
    }

    /**
     * Imposta il valore della proprieta' nazione.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNazione(String value) {
        this.nazione = value;
    }

}
