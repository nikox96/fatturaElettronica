//
// Questo file e' stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Qualsiasi modifica a questo file andra' persa durante la ricompilazione dello schema di origine.
// Generato il: 2020.10.05 alle 08:33:21 PM CEST
//


package fatturaelettronica.ordinaria;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per IscrizioneREAType complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="IscrizioneREAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ufficio" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}ProvinciaType"/>
 *         &lt;element name="NumeroREA" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String20Type"/>
 *         &lt;element name="CapitaleSociale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType" minOccurs="0"/>
 *         &lt;element name="SocioUnico" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}SocioUnicoType" minOccurs="0"/>
 *         &lt;element name="StatoLiquidazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}StatoLiquidazioneType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IscrizioneREAType", propOrder = {
    "ufficio",
    "numeroREA",
    "capitaleSociale",
    "socioUnico",
    "statoLiquidazione"
})
public class IscrizioneREAType {

    @XmlElement(name = "Ufficio", required = true)
    protected String ufficio;
    @XmlElement(name = "NumeroREA", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String numeroREA;
    @XmlElement(name = "CapitaleSociale")
    protected BigDecimal capitaleSociale;
    @XmlElement(name = "SocioUnico")
    @XmlSchemaType(name = "string")
    protected SocioUnicoType socioUnico;
    @XmlElement(name = "StatoLiquidazione", required = true)
    @XmlSchemaType(name = "string")
    protected StatoLiquidazioneType statoLiquidazione;

    /**
     * Recupera il valore della proprieta' ufficio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUfficio() {
        return ufficio;
    }

    /**
     * Imposta il valore della proprieta' ufficio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUfficio(String value) {
        this.ufficio = value;
    }

    /**
     * Recupera il valore della proprieta' numeroREA.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroREA() {
        return numeroREA;
    }

    /**
     * Imposta il valore della proprieta' numeroREA.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroREA(String value) {
        this.numeroREA = value;
    }

    /**
     * Recupera il valore della proprieta' capitaleSociale.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCapitaleSociale() {
        return capitaleSociale;
    }

    /**
     * Imposta il valore della proprieta' capitaleSociale.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCapitaleSociale(BigDecimal value) {
        this.capitaleSociale = value;
    }

    /**
     * Recupera il valore della proprieta' socioUnico.
     *
     * @return
     *     possible object is
     *     {@link SocioUnicoType }
     *
     */
    public SocioUnicoType getSocioUnico() {
        return socioUnico;
    }

    /**
     * Imposta il valore della proprieta' socioUnico.
     *
     * @param value
     *     allowed object is
     *     {@link SocioUnicoType }
     *
     */
    public void setSocioUnico(SocioUnicoType value) {
        this.socioUnico = value;
    }

    /**
     * Recupera il valore della proprieta' statoLiquidazione.
     *
     * @return
     *     possible object is
     *     {@link StatoLiquidazioneType }
     *
     */
    public StatoLiquidazioneType getStatoLiquidazione() {
        return statoLiquidazione;
    }

    /**
     * Imposta il valore della proprieta' statoLiquidazione.
     *
     * @param value
     *     allowed object is
     *     {@link StatoLiquidazioneType }
     *
     */
    public void setStatoLiquidazione(StatoLiquidazioneType value) {
        this.statoLiquidazione = value;
    }

}
