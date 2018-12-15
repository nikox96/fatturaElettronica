//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.09.25 alle 10:08:33 AM CEST 
//


package fatturaelettronica.semplificata.fatturaelettronica;

import fatturaelettronica.ordinaria.fatturaelettronica.TipoDocumentoType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DatiGeneraliDocumentoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiGeneraliDocumentoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoDocumento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}TipoDocumentoType"/>
 *         &lt;element name="Divisa" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}DivisaType"/>
 *         &lt;element name="Data" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}DataFatturaType"/>
 *         &lt;element name="Numero" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}String20Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiGeneraliDocumentoType", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0", propOrder = {
    "tipoDocumento",
    "divisa",
    "data",
    "numero"
})
public class DatiGeneraliDocumentoType {

    @XmlElement(name = "TipoDocumento", required = true)
    @XmlSchemaType(name = "string")
    protected TipoDocumentoType tipoDocumento;
    @XmlElement(name = "Divisa", required = true)
    protected String divisa;
    @XmlElement(name = "Data", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "Numero", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String numero;

    /**
     * Recupera il valore della propriet� tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoType }
     *     
     */
    public TipoDocumentoType getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Imposta il valore della propriet� tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoType }
     *     
     */
    public void setTipoDocumento(TipoDocumentoType value) {
        this.tipoDocumento = value;
    }

    /**
     * Recupera il valore della propriet� divisa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivisa() {
        return divisa;
    }

    /**
     * Imposta il valore della propriet� divisa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivisa(String value) {
        this.divisa = value;
    }

    /**
     * Recupera il valore della propriet� data.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Imposta il valore della propriet� data.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Recupera il valore della propriet� numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Imposta il valore della propriet� numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

}
