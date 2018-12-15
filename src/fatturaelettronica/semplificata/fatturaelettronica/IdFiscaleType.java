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
 * <p>Classe Java per IdFiscaleType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IdFiscaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdPaese" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}NazioneType"/>
 *         &lt;element name="IdCodice" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}CodiceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdFiscaleType", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0", propOrder = {
    "idPaese",
    "idCodice"
})
public class IdFiscaleType {

    @XmlElement(name = "IdPaese", required = true)
    protected String idPaese;
    @XmlElement(name = "IdCodice", required = true)
    protected String idCodice;

    /**
     * Recupera il valore della propriet� idPaese.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPaese() {
        return idPaese;
    }

    /**
     * Imposta il valore della propriet� idPaese.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPaese(String value) {
        this.idPaese = value;
    }

    /**
     * Recupera il valore della propriet� idCodice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCodice() {
        return idCodice;
    }

    /**
     * Imposta il valore della propriet� idCodice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCodice(String value) {
        this.idCodice = value;
    }

}
