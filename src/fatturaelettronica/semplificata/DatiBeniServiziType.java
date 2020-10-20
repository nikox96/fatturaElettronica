//
// Questo file e' stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Qualsiasi modifica a questo file andra' persa durante la ricompilazione dello schema di origine.
// Generato il: 2020.10.05 alle 08:33:50 PM CEST
//


package fatturaelettronica.semplificata;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Blocco relativo ai dati di Beni Servizi della Fattura  Elettronica
 *
 * <p>Classe Java per DatiBeniServiziType complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="DatiBeniServiziType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Descrizione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}String1000LatinType"/>
 *         &lt;element name="Importo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}Amount2DecimalType"/>
 *         &lt;element name="DatiIVA" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}DatiIVAType"/>
 *         &lt;element name="Natura" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}NaturaType" minOccurs="0"/>
 *         &lt;element name="RiferimentoNormativo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}String100LatinType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiBeniServiziType", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0", propOrder = {
    "descrizione",
    "importo",
    "datiIVA",
    "natura",
    "riferimentoNormativo"
})
public class DatiBeniServiziType {

    @XmlElement(name = "Descrizione", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String descrizione;
    @XmlElement(name = "Importo", required = true)
    protected BigDecimal importo;
    @XmlElement(name = "DatiIVA", required = true)
    protected DatiIVAType datiIVA;
    @XmlElement(name = "Natura")
    @XmlSchemaType(name = "string")
    protected NaturaType natura;
    @XmlElement(name = "RiferimentoNormativo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String riferimentoNormativo;

    /**
     * Recupera il valore della proprieta' descrizione.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Imposta il valore della proprieta' descrizione.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Recupera il valore della proprieta' importo.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getImporto() {
        return importo;
    }

    /**
     * Imposta il valore della proprieta' importo.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setImporto(BigDecimal value) {
        this.importo = value;
    }

    /**
     * Recupera il valore della proprieta' datiIVA.
     *
     * @return
     *     possible object is
     *     {@link DatiIVAType }
     *
     */
    public DatiIVAType getDatiIVA() {
        return datiIVA;
    }

    /**
     * Imposta il valore della proprieta' datiIVA.
     *
     * @param value
     *     allowed object is
     *     {@link DatiIVAType }
     *
     */
    public void setDatiIVA(DatiIVAType value) {
        this.datiIVA = value;
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
     * Recupera il valore della proprieta' riferimentoNormativo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRiferimentoNormativo() {
        return riferimentoNormativo;
    }

    /**
     * Imposta il valore della proprieta' riferimentoNormativo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRiferimentoNormativo(String value) {
        this.riferimentoNormativo = value;
    }

}
