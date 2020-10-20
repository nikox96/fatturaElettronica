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
 * <p>Classe Java per DatiCassaPrevidenzialeType complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="DatiCassaPrevidenzialeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoCassa" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}TipoCassaType"/>
 *         &lt;element name="AlCassa" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}RateType"/>
 *         &lt;element name="ImportoContributoCassa" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType"/>
 *         &lt;element name="ImponibileCassa" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType" minOccurs="0"/>
 *         &lt;element name="AliquotaIVA" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}RateType"/>
 *         &lt;element name="Ritenuta" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}RitenutaType" minOccurs="0"/>
 *         &lt;element name="Natura" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}NaturaType" minOccurs="0"/>
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
@XmlType(name = "DatiCassaPrevidenzialeType", propOrder = {
    "tipoCassa",
    "alCassa",
    "importoContributoCassa",
    "imponibileCassa",
    "aliquotaIVA",
    "ritenuta",
    "natura",
    "riferimentoAmministrazione"
})
public class DatiCassaPrevidenzialeType {

    @XmlElement(name = "TipoCassa", required = true)
    @XmlSchemaType(name = "string")
    protected TipoCassaType tipoCassa;
    @XmlElement(name = "AlCassa", required = true)
    protected BigDecimal alCassa;
    @XmlElement(name = "ImportoContributoCassa", required = true)
    protected BigDecimal importoContributoCassa;
    @XmlElement(name = "ImponibileCassa")
    protected BigDecimal imponibileCassa;
    @XmlElement(name = "AliquotaIVA", required = true)
    protected BigDecimal aliquotaIVA;
    @XmlElement(name = "Ritenuta")
    @XmlSchemaType(name = "string")
    protected RitenutaType ritenuta;
    @XmlElement(name = "Natura")
    @XmlSchemaType(name = "string")
    protected NaturaType natura;
    @XmlElement(name = "RiferimentoAmministrazione")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String riferimentoAmministrazione;

    /**
     * Recupera il valore della proprieta' tipoCassa.
     *
     * @return
     *     possible object is
     *     {@link TipoCassaType }
     *
     */
    public TipoCassaType getTipoCassa() {
        return tipoCassa;
    }

    /**
     * Imposta il valore della proprieta' tipoCassa.
     *
     * @param value
     *     allowed object is
     *     {@link TipoCassaType }
     *
     */
    public void setTipoCassa(TipoCassaType value) {
        this.tipoCassa = value;
    }

    /**
     * Recupera il valore della proprieta' alCassa.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getAlCassa() {
        return alCassa;
    }

    /**
     * Imposta il valore della proprieta' alCassa.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setAlCassa(BigDecimal value) {
        this.alCassa = value;
    }

    /**
     * Recupera il valore della proprieta' importoContributoCassa.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getImportoContributoCassa() {
        return importoContributoCassa;
    }

    /**
     * Imposta il valore della proprieta' importoContributoCassa.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setImportoContributoCassa(BigDecimal value) {
        this.importoContributoCassa = value;
    }

    /**
     * Recupera il valore della proprieta' imponibileCassa.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getImponibileCassa() {
        return imponibileCassa;
    }

    /**
     * Imposta il valore della proprieta' imponibileCassa.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setImponibileCassa(BigDecimal value) {
        this.imponibileCassa = value;
    }

    /**
     * Recupera il valore della proprieta' aliquotaIVA.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getAliquotaIVA() {
        return aliquotaIVA;
    }

    /**
     * Imposta il valore della proprieta' aliquotaIVA.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setAliquotaIVA(BigDecimal value) {
        this.aliquotaIVA = value;
    }

    /**
     * Recupera il valore della proprieta' ritenuta.
     *
     * @return
     *     possible object is
     *     {@link RitenutaType }
     *
     */
    public RitenutaType getRitenuta() {
        return ritenuta;
    }

    /**
     * Imposta il valore della proprieta' ritenuta.
     *
     * @param value
     *     allowed object is
     *     {@link RitenutaType }
     *
     */
    public void setRitenuta(RitenutaType value) {
        this.ritenuta = value;
    }

    /**
     * Recupera il valore della proprieta' natura.
     *
     * @return
     *     possible object is
     *     {@link NaturaType }
     *
     */
    public NaturaType getNatura() {
        return natura;
    }

    /**
     * Imposta il valore della proprieta' natura.
     *
     * @param value
     *     allowed object is
     *     {@link NaturaType }
     *
     */
    public void setNatura(NaturaType value) {
        this.natura = value;
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
