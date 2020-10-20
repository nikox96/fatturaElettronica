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
 * <p>Classe Java per FatturaPrincipaleType complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="FatturaPrincipaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroFatturaPrincipale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String20Type"/>
 *         &lt;element name="DataFatturaPrincipale" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FatturaPrincipaleType", propOrder = {
    "numeroFatturaPrincipale",
    "dataFatturaPrincipale"
})
public class FatturaPrincipaleType {

    @XmlElement(name = "NumeroFatturaPrincipale", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String numeroFatturaPrincipale;
    @XmlElement(name = "DataFatturaPrincipale", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataFatturaPrincipale;

    /**
     * Recupera il valore della proprieta' numeroFatturaPrincipale.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroFatturaPrincipale() {
        return numeroFatturaPrincipale;
    }

    /**
     * Imposta il valore della proprieta' numeroFatturaPrincipale.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroFatturaPrincipale(String value) {
        this.numeroFatturaPrincipale = value;
    }

    /**
     * Recupera il valore della proprieta' dataFatturaPrincipale.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDataFatturaPrincipale() {
        return dataFatturaPrincipale;
    }

    /**
     * Imposta il valore della proprieta' dataFatturaPrincipale.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDataFatturaPrincipale(XMLGregorianCalendar value) {
        this.dataFatturaPrincipale = value;
    }

}
