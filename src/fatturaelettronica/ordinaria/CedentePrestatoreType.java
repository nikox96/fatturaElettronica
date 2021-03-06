//
// Questo file e' stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Qualsiasi modifica a questo file andra' persa durante la ricompilazione dello schema di origine.
// Generato il: 2020.10.05 alle 08:33:21 PM CEST
//


package fatturaelettronica.ordinaria;

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
 *         &lt;element name="DatiAnagrafici" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}DatiAnagraficiCedenteType"/>
 *         &lt;element name="Sede" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}IndirizzoType"/>
 *         &lt;element name="StabileOrganizzazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}IndirizzoType" minOccurs="0"/>
 *         &lt;element name="IscrizioneREA" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}IscrizioneREAType" minOccurs="0"/>
 *         &lt;element name="Contatti" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}ContattiType" minOccurs="0"/>
 *         &lt;element name="RiferimentoAmministrazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String20Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CedentePrestatoreType", propOrder = {
    "datiAnagrafici",
    "sede",
    "stabileOrganizzazione",
    "iscrizioneREA",
    "contatti",
    "riferimentoAmministrazione"
})
public class CedentePrestatoreType {

    @XmlElement(name = "DatiAnagrafici", required = true)
    protected DatiAnagraficiCedenteType datiAnagrafici;
    @XmlElement(name = "Sede", required = true)
    protected IndirizzoType sede;
    @XmlElement(name = "StabileOrganizzazione")
    protected IndirizzoType stabileOrganizzazione;
    @XmlElement(name = "IscrizioneREA")
    protected IscrizioneREAType iscrizioneREA;
    @XmlElement(name = "Contatti")
    protected ContattiType contatti;
    @XmlElement(name = "RiferimentoAmministrazione")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String riferimentoAmministrazione;

    /**
     * Recupera il valore della proprieta' datiAnagrafici.
     *
     * @return
     *     possible object is
     *     {@link DatiAnagraficiCedenteType }
     *
     */
    public DatiAnagraficiCedenteType getDatiAnagrafici() {
        return datiAnagrafici;
    }

    /**
     * Imposta il valore della proprieta' datiAnagrafici.
     *
     * @param value
     *     allowed object is
     *     {@link DatiAnagraficiCedenteType }
     *
     */
    public void setDatiAnagrafici(DatiAnagraficiCedenteType value) {
        this.datiAnagrafici = value;
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
     * Recupera il valore della proprieta' contatti.
     *
     * @return
     *     possible object is
     *     {@link ContattiType }
     *
     */
    public ContattiType getContatti() {
        return contatti;
    }

    /**
     * Imposta il valore della proprieta' contatti.
     *
     * @param value
     *     allowed object is
     *     {@link ContattiType }
     *
     */
    public void setContatti(ContattiType value) {
        this.contatti = value;
    }

    /**
     * Recupera il valore della proprieta' riferimentoAmministrazione.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRiferimentoAmministrazione() {
        return riferimentoAmministrazione;
    }

    /**
     * Imposta il valore della proprieta' riferimentoAmministrazione.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRiferimentoAmministrazione(String value) {
        this.riferimentoAmministrazione = value;
    }

}
