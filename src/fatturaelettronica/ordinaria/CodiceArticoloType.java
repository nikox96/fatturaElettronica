//
// Questo file  stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.13 alle 03:27:08 PM CET 
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
 * <p>Classe Java per CodiceArticoloType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CodiceArticoloType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceTipo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String35Type"/>
 *         &lt;element name="CodiceValore" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String35LatinExtType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodiceArticoloType", propOrder = {
    "codiceTipo",
    "codiceValore"
})
public class CodiceArticoloType {

    @XmlElement(name = "CodiceTipo", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String codiceTipo;
    @XmlElement(name = "CodiceValore", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String codiceValore;

    /**
     * Recupera il valore della propriet codiceTipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceTipo() {
        return codiceTipo;
    }

    /**
     * Imposta il valore della propriet codiceTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceTipo(String value) {
        this.codiceTipo = value;
    }

    /**
     * Recupera il valore della propriet codiceValore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceValore() {
        return codiceValore;
    }

    /**
     * Imposta il valore della propriet codiceValore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceValore(String value) {
        this.codiceValore = value;
    }

}
