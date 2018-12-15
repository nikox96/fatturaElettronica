//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.09.25 alle 10:08:33 AM CEST 
//


package fatturaelettronica.semplificata.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DatiFatturaRettificataType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiFatturaRettificataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroFR" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}String20Type"/>
 *         &lt;element name="DataFR" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}DataFatturaType"/>
 *         &lt;element name="ElementiRettificati" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}String1000LatinType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiFatturaRettificataType", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0", propOrder = {
    "numeroFR",
    "dataFR",
    "elementiRettificati"
})
public class DatiFatturaRettificataType {

    @XmlElement(name = "NumeroFR", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String numeroFR;
    @XmlElement(name = "DataFR", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataFR;
    @XmlElement(name = "ElementiRettificati", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String elementiRettificati;

    /**
     * Recupera il valore della propriet� numeroFR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFR() {
        return numeroFR;
    }

    /**
     * Imposta il valore della propriet� numeroFR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFR(String value) {
        this.numeroFR = value;
    }

    /**
     * Recupera il valore della propriet� dataFR.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFR() {
        return dataFR;
    }

    /**
     * Imposta il valore della propriet� dataFR.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFR(XMLGregorianCalendar value) {
        this.dataFR = value;
    }

    /**
     * Recupera il valore della propriet� elementiRettificati.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementiRettificati() {
        return elementiRettificati;
    }

    /**
     * Imposta il valore della propriet� elementiRettificati.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementiRettificati(String value) {
        this.elementiRettificati = value;
    }

}
