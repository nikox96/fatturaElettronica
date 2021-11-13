//
// Questo file  stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.13 alle 03:28:06 PM CET 
//


package fatturaelettronica.semplificata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Blocco relativo ai dati di trasmissione della Fattura Elettronica
 * 
 * <p>Classe Java per DatiTrasmissioneType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiTrasmissioneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdTrasmittente" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}IdFiscaleType"/>
 *         &lt;element name="ProgressivoInvio" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}String10Type"/>
 *         &lt;element name="FormatoTrasmissione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}FormatoTrasmissioneType"/>
 *         &lt;element name="CodiceDestinatario" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}CodiceDestinatarioType"/>
 *         &lt;element name="PECDestinatario" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}EmailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiTrasmissioneType", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0", propOrder = {
    "idTrasmittente",
    "progressivoInvio",
    "formatoTrasmissione",
    "codiceDestinatario",
    "pecDestinatario"
})
public class DatiTrasmissioneType {

    @XmlElement(name = "IdTrasmittente", required = true)
    protected IdFiscaleType idTrasmittente;
    @XmlElement(name = "ProgressivoInvio", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String progressivoInvio;
    @XmlElement(name = "FormatoTrasmissione", required = true)
    @XmlSchemaType(name = "string")
    protected FormatoTrasmissioneType formatoTrasmissione;
    @XmlElement(name = "CodiceDestinatario", required = true)
    protected String codiceDestinatario;
    @XmlElement(name = "PECDestinatario")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pecDestinatario;

    /**
     * Recupera il valore della propriet idTrasmittente.
     * 
     * @return
     *     possible object is
     *     {@link IdFiscaleType }
     *     
     */
    public IdFiscaleType getIdTrasmittente() {
        return idTrasmittente;
    }

    /**
     * Imposta il valore della propriet idTrasmittente.
     * 
     * @param value
     *     allowed object is
     *     {@link IdFiscaleType }
     *     
     */
    public void setIdTrasmittente(IdFiscaleType value) {
        this.idTrasmittente = value;
    }

    /**
     * Recupera il valore della propriet progressivoInvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgressivoInvio() {
        return progressivoInvio;
    }

    /**
     * Imposta il valore della propriet progressivoInvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgressivoInvio(String value) {
        this.progressivoInvio = value;
    }

    /**
     * Recupera il valore della propriet formatoTrasmissione.
     * 
     * @return
     *     possible object is
     *     {@link FormatoTrasmissioneType }
     *     
     */
    public FormatoTrasmissioneType getFormatoTrasmissione() {
        return formatoTrasmissione;
    }

    /**
     * Imposta il valore della propriet formatoTrasmissione.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatoTrasmissioneType }
     *     
     */
    public void setFormatoTrasmissione(FormatoTrasmissioneType value) {
        this.formatoTrasmissione = value;
    }

    /**
     * Recupera il valore della propriet codiceDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceDestinatario() {
        return codiceDestinatario;
    }

    /**
     * Imposta il valore della propriet codiceDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceDestinatario(String value) {
        this.codiceDestinatario = value;
    }

    /**
     * Recupera il valore della propriet pecDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPECDestinatario() {
        return pecDestinatario;
    }

    /**
     * Imposta il valore della propriet pecDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPECDestinatario(String value) {
        this.pecDestinatario = value;
    }

}
