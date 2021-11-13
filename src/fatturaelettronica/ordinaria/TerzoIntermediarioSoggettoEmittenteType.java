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
import javax.xml.bind.annotation.XmlType;


/**
 * Blocco relativo ai dati del Terzo Intermediario che emette fattura elettronica per conto del Cedente/Prestatore
 * 
 * <p>Classe Java per TerzoIntermediarioSoggettoEmittenteType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TerzoIntermediarioSoggettoEmittenteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatiAnagrafici" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}DatiAnagraficiTerzoIntermediarioType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerzoIntermediarioSoggettoEmittenteType", propOrder = {
    "datiAnagrafici"
})
public class TerzoIntermediarioSoggettoEmittenteType {

    @XmlElement(name = "DatiAnagrafici", required = true)
    protected DatiAnagraficiTerzoIntermediarioType datiAnagrafici;

    /**
     * Recupera il valore della propriet datiAnagrafici.
     * 
     * @return
     *     possible object is
     *     {@link DatiAnagraficiTerzoIntermediarioType }
     *     
     */
    public DatiAnagraficiTerzoIntermediarioType getDatiAnagrafici() {
        return datiAnagrafici;
    }

    /**
     * Imposta il valore della propriet datiAnagrafici.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiAnagraficiTerzoIntermediarioType }
     *     
     */
    public void setDatiAnagrafici(DatiAnagraficiTerzoIntermediarioType value) {
        this.datiAnagrafici = value;
    }

}
