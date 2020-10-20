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
 * Blocco relativo ai dati del Cedente / Prestatore
 *
 * <p>Classe Java per CedentePrestatoreType complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="CedentePrestatoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdFiscaleIVA" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}IdFiscaleType"/>
 *         &lt;element name="CodiceFiscale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}CodiceFiscaleType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="Denominazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}String80LatinType"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="Nome" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}String60LatinType"/>
 *             &lt;element name="Cognome" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}String60LatinType"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="Sede" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}IndirizzoType"/>
 *         &lt;element name="StabileOrganizzazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}IndirizzoType" minOccurs="0"/>
 *         &lt;element name="RappresentanteFiscale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}RappresentanteFiscaleType" minOccurs="0"/>
 *         &lt;element name="IscrizioneREA" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}IscrizioneREAType" minOccurs="0"/>
 *         &lt;element name="RegimeFiscale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}RegimeFiscaleType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CedentePrestatoreType", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0", propOrder = {
    "idFiscaleIVA",
    "codiceFiscale",
    "denominazione",
    "nome",
    "cognome",
    "sede",
    "stabileOrganizzazione",
    "rappresentanteFiscale",
    "iscrizioneREA",
    "regimeFiscale"
})
public class CedentePrestatoreType {

    @XmlElement(name = "IdFiscaleIVA", required = true)
    protected IdFiscaleType idFiscaleIVA;
    @XmlElement(name = "CodiceFiscale")
    protected String codiceFiscale;
    @XmlElement(name = "Denominazione")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String denominazione;
    @XmlElement(name = "Nome")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String nome;
    @XmlElement(name = "Cognome")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cognome;
    @XmlElement(name = "Sede", required = true)
    protected IndirizzoType sede;
    @XmlElement(name = "StabileOrganizzazione")
    protected IndirizzoType stabileOrganizzazione;
    @XmlElement(name = "RappresentanteFiscale")
    protected RappresentanteFiscaleType rappresentanteFiscale;
    @XmlElement(name = "IscrizioneREA")
    protected IscrizioneREAType iscrizioneREA;
    @XmlElement(name = "RegimeFiscale", required = true)
    @XmlSchemaType(name = "string")
    protected RegimeFiscaleType regimeFiscale;

    /**
     * Recupera il valore della proprieta' idFiscaleIVA.
     *
     * @return
     *     possible object is
     *     {@link IdFiscaleType }
     *
     */
    public IdFiscaleType getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    /**
     * Imposta il valore della proprieta' idFiscaleIVA.
     *
     * @param value
     *     allowed object is
     *     {@link IdFiscaleType }
     *
     */
    public void setIdFiscaleIVA(IdFiscaleType value) {
        this.idFiscaleIVA = value;
    }

    /**
     * Recupera il valore della proprieta' codiceFiscale.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Imposta il valore della proprieta' codiceFiscale.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Recupera il valore della proprieta' denominazione.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDenominazione() {
        return denominazione;
    }

    /**
     * Imposta il valore della proprieta' denominazione.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDenominazione(String value) {
        this.denominazione = value;
    }

    /**
     * Recupera il valore della proprieta' nome.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il valore della proprieta' nome.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della proprieta' cognome.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il valore della proprieta' cognome.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCognome(String value) {
        this.cognome = value;
    }

    /**
     * Recupera il valore della proprieta' sede.
     *
     * @return
     *     possible object is
     *     {@link IndirizzoType }
     *
     */
    public IndirizzoType getSede() {
        return sede;
    }

    /**
     * Imposta il valore della proprieta' sede.
     *
     * @param value
     *     allowed object is
     *     {@link IndirizzoType }
     *
     */
    public void setSede(IndirizzoType value) {
        this.sede = value;
    }

    /**
     * Recupera il valore della proprieta' stabileOrganizzazione.
     *
     * @return
     *     possible object is
     *     {@link IndirizzoType }
     *
     */
    public IndirizzoType getStabileOrganizzazione() {
        return stabileOrganizzazione;
    }

    /**
     * Imposta il valore della proprieta' stabileOrganizzazione.
     *
     * @param value
     *     allowed object is
     *     {@link IndirizzoType }
     *
     */
    public void setStabileOrganizzazione(IndirizzoType value) {
        this.stabileOrganizzazione = value;
    }

    /**
     * Recupera il valore della proprieta' rappresentanteFiscale.
     *
     * @return
     *     possible object is
     *     {@link RappresentanteFiscaleType }
     *
     */
    public RappresentanteFiscaleType getRappresentanteFiscale() {
        return rappresentanteFiscale;
    }

    /**
     * Imposta il valore della proprieta' rappresentanteFiscale.
     *
     * @param value
     *     allowed object is
     *     {@link RappresentanteFiscaleType }
     *
     */
    public void setRappresentanteFiscale(RappresentanteFiscaleType value) {
        this.rappresentanteFiscale = value;
    }

    /**
     * Recupera il valore della proprieta' iscrizioneREA.
     *
     * @return
     *     possible object is
     *     {@link IscrizioneREAType }
     *
     */
    public IscrizioneREAType getIscrizioneREA() {
        return iscrizioneREA;
    }

    /**
     * Imposta il valore della proprieta' iscrizioneREA.
     *
     * @param value
     *     allowed object is
     *     {@link IscrizioneREAType }
     *
     */
    public void setIscrizioneREA(IscrizioneREAType value) {
        this.iscrizioneREA = value;
    }

    /**
     * Recupera il valore della proprieta' regimeFiscale.
     *
     * @return
     *     possible object is
     *     {@link RegimeFiscaleType }
     *
     */
    public RegimeFiscaleType getRegimeFiscale() {
        return regimeFiscale;
    }

    /**
     * Imposta il valore della proprieta' regimeFiscale.
     *
     * @param value
     *     allowed object is
     *     {@link RegimeFiscaleType }
     *
     */
    public void setRegimeFiscale(RegimeFiscaleType value) {
        this.regimeFiscale = value;
    }

}
