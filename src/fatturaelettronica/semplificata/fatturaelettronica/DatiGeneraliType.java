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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Blocco relativo ai Dati Generali della Fattura Elettronica
 * 			
 * 
 * <p>Classe Java per DatiGeneraliType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiGeneraliType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatiGeneraliDocumento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}DatiGeneraliDocumentoType"/>
 *         &lt;element name="DatiFatturaRettificata" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}DatiFatturaRettificataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiGeneraliType", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0", propOrder = {
    "datiGeneraliDocumento",
    "datiFatturaRettificata"
})
public class DatiGeneraliType {

    @XmlElement(name = "DatiGeneraliDocumento", required = true)
    protected DatiGeneraliDocumentoType datiGeneraliDocumento;
    @XmlElement(name = "DatiFatturaRettificata")
    protected DatiFatturaRettificataType datiFatturaRettificata;

    /**
     * Recupera il valore della propriet� datiGeneraliDocumento.
     * 
     * @return
     *     possible object is
     *     {@link DatiGeneraliDocumentoType }
     *     
     */
    public DatiGeneraliDocumentoType getDatiGeneraliDocumento() {
        return datiGeneraliDocumento;
    }

    /**
     * Imposta il valore della propriet� datiGeneraliDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiGeneraliDocumentoType }
     *     
     */
    public void setDatiGeneraliDocumento(DatiGeneraliDocumentoType value) {
        this.datiGeneraliDocumento = value;
    }

    /**
     * Recupera il valore della propriet� datiFatturaRettificata.
     * 
     * @return
     *     possible object is
     *     {@link DatiFatturaRettificataType }
     *     
     */
    public DatiFatturaRettificataType getDatiFatturaRettificata() {
        return datiFatturaRettificata;
    }

    /**
     * Imposta il valore della propriet� datiFatturaRettificata.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiFatturaRettificataType }
     *     
     */
    public void setDatiFatturaRettificata(DatiFatturaRettificataType value) {
        this.datiFatturaRettificata = value;
    }

}
