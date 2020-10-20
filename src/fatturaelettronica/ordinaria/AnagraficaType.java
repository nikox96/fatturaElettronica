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
 * Il campo Denominazione e' in alternativa ai campi Nome e Cognome
 *
 * <p>Classe Java per AnagraficaType complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="AnagraficaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="Denominazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String80LatinType"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="Nome" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60LatinType"/>
 *             &lt;element name="Cognome" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60LatinType"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="Titolo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}TitoloType" minOccurs="0"/>
 *         &lt;element name="CodEORI" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}CodEORIType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnagraficaType", propOrder = {
    "denominazione",
    "nome",
    "cognome",
    "titolo",
    "codEORI"
})
public class AnagraficaType {

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
    @XmlElement(name = "Titolo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String titolo;
    @XmlElement(name = "CodEORI")
    protected String codEORI;

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
     * Recupera il valore della proprieta' titolo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * Imposta il valore della proprieta' titolo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitolo(String value) {
        this.titolo = value;
    }

    /**
     * Recupera il valore della proprieta' codEORI.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodEORI() {
        return codEORI;
    }

    /**
     * Imposta il valore della proprieta' codEORI.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodEORI(String value) {
        this.codEORI = value;
    }

}
