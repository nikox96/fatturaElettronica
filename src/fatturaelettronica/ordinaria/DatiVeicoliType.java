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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Blocco relativo ai dati dei Veicoli della Fattura Elettronica (da indicare nei casi di cessioni tra Paesi
 *      membri di mezzi di trasporto nuovi, in base all'art. 38, comma 4 del dl 331 del 1993)
 *
 * <p>Classe Java per DatiVeicoliType complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="DatiVeicoliType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TotalePercorso" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String15Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiVeicoliType", propOrder = {
    "data",
    "totalePercorso"
})
public class DatiVeicoliType {

    @XmlElement(name = "Data", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "TotalePercorso", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String totalePercorso;

    /**
     * Recupera il valore della proprieta' data.
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
     * Imposta il valore della proprieta' data.
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
     * Recupera il valore della proprieta' totalePercorso.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTotalePercorso() {
        return totalePercorso;
    }

    /**
     * Imposta il valore della proprieta' totalePercorso.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTotalePercorso(String value) {
        this.totalePercorso = value;
    }

}
