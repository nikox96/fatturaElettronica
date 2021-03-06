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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per AltriDatiGestionaliType complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="AltriDatiGestionaliType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoDato" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String10Type"/>
 *         &lt;element name="RiferimentoTesto" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60LatinType" minOccurs="0"/>
 *         &lt;element name="RiferimentoNumero" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount8DecimalType" minOccurs="0"/>
 *         &lt;element name="RiferimentoData" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltriDatiGestionaliType", propOrder = {
    "tipoDato",
    "riferimentoTesto",
    "riferimentoNumero",
    "riferimentoData"
})
public class AltriDatiGestionaliType {

    @XmlElement(name = "TipoDato", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tipoDato;
    @XmlElement(name = "RiferimentoTesto")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String riferimentoTesto;
    @XmlElement(name = "RiferimentoNumero")
    protected BigDecimal riferimentoNumero;
    @XmlElement(name = "RiferimentoData")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar riferimentoData;

    /**
     * Recupera il valore della proprieta' tipoDato.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoDato() {
        return tipoDato;
    }

    /**
     * Imposta il valore della proprieta' tipoDato.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoDato(String value) {
        this.tipoDato = value;
    }

    /**
     * Recupera il valore della proprieta' riferimentoTesto.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRiferimentoTesto() {
        return riferimentoTesto;
    }

    /**
     * Imposta il valore della proprieta' riferimentoTesto.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRiferimentoTesto(String value) {
        this.riferimentoTesto = value;
    }

    /**
     * Recupera il valore della proprieta' riferimentoNumero.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getRiferimentoNumero() {
        return riferimentoNumero;
    }

    /**
     * Imposta il valore della proprieta' riferimentoNumero.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setRiferimentoNumero(BigDecimal value) {
        this.riferimentoNumero = value;
    }

    /**
     * Recupera il valore della proprieta' riferimentoData.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getRiferimentoData() {
        return riferimentoData;
    }

    /**
     * Imposta il valore della proprieta' riferimentoData.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setRiferimentoData(XMLGregorianCalendar value) {
        this.riferimentoData = value;
    }

}
