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


/**
 * <p>Classe Java per FatturaElettronicaHeaderType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FatturaElettronicaHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatiTrasmissione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}DatiTrasmissioneType"/>
 *         &lt;element name="CedentePrestatore" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}CedentePrestatoreType"/>
 *         &lt;element name="CessionarioCommittente" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}CessionarioCommittenteType"/>
 *         &lt;element name="SoggettoEmittente" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}SoggettoEmittenteType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FatturaElettronicaHeaderType", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0", propOrder = {
    "datiTrasmissione",
    "cedentePrestatore",
    "cessionarioCommittente",
    "soggettoEmittente"
})
public class FatturaElettronicaHeaderType {

    @XmlElement(name = "DatiTrasmissione", required = true)
    protected DatiTrasmissioneType datiTrasmissione;
    @XmlElement(name = "CedentePrestatore", required = true)
    protected CedentePrestatoreType cedentePrestatore;
    @XmlElement(name = "CessionarioCommittente", required = true)
    protected CessionarioCommittenteType cessionarioCommittente;
    @XmlElement(name = "SoggettoEmittente")
    @XmlSchemaType(name = "string")
    protected SoggettoEmittenteType soggettoEmittente;

    /**
     * Recupera il valore della propriet datiTrasmissione.
     * 
     * @return
     *     possible object is
     *     {@link DatiTrasmissioneType }
     *     
     */
    public DatiTrasmissioneType getDatiTrasmissione() {
        return datiTrasmissione;
    }

    /**
     * Imposta il valore della propriet datiTrasmissione.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiTrasmissioneType }
     *     
     */
    public void setDatiTrasmissione(DatiTrasmissioneType value) {
        this.datiTrasmissione = value;
    }

    /**
     * Recupera il valore della propriet cedentePrestatore.
     * 
     * @return
     *     possible object is
     *     {@link CedentePrestatoreType }
     *     
     */
    public CedentePrestatoreType getCedentePrestatore() {
        return cedentePrestatore;
    }

    /**
     * Imposta il valore della propriet cedentePrestatore.
     * 
     * @param value
     *     allowed object is
     *     {@link CedentePrestatoreType }
     *     
     */
    public void setCedentePrestatore(CedentePrestatoreType value) {
        this.cedentePrestatore = value;
    }

    /**
     * Recupera il valore della propriet cessionarioCommittente.
     * 
     * @return
     *     possible object is
     *     {@link CessionarioCommittenteType }
     *     
     */
    public CessionarioCommittenteType getCessionarioCommittente() {
        return cessionarioCommittente;
    }

    /**
     * Imposta il valore della propriet cessionarioCommittente.
     * 
     * @param value
     *     allowed object is
     *     {@link CessionarioCommittenteType }
     *     
     */
    public void setCessionarioCommittente(CessionarioCommittenteType value) {
        this.cessionarioCommittente = value;
    }

    /**
     * Recupera il valore della propriet soggettoEmittente.
     * 
     * @return
     *     possible object is
     *     {@link SoggettoEmittenteType }
     *     
     */
    public SoggettoEmittenteType getSoggettoEmittente() {
        return soggettoEmittente;
    }

    /**
     * Imposta il valore della propriet soggettoEmittente.
     * 
     * @param value
     *     allowed object is
     *     {@link SoggettoEmittenteType }
     *     
     */
    public void setSoggettoEmittente(SoggettoEmittenteType value) {
        this.soggettoEmittente = value;
    }

}
