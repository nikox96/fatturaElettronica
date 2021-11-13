//
// Questo file  stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.13 alle 03:27:08 PM CET 
//


package fatturaelettronica.ordinaria;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DatiBolloType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiBolloType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BolloVirtuale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}BolloVirtualeType"/>
 *         &lt;element name="ImportoBollo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiBolloType", propOrder = {
    "bolloVirtuale",
    "importoBollo"
})
public class DatiBolloType {

    @XmlElement(name = "BolloVirtuale", required = true)
    @XmlSchemaType(name = "string")
    protected BolloVirtualeType bolloVirtuale;
    @XmlElement(name = "ImportoBollo")
    protected BigDecimal importoBollo;

    /**
     * Recupera il valore della propriet bolloVirtuale.
     * 
     * @return
     *     possible object is
     *     {@link BolloVirtualeType }
     *     
     */
    public BolloVirtualeType getBolloVirtuale() {
        return bolloVirtuale;
    }

    /**
     * Imposta il valore della propriet bolloVirtuale.
     * 
     * @param value
     *     allowed object is
     *     {@link BolloVirtualeType }
     *     
     */
    public void setBolloVirtuale(BolloVirtualeType value) {
        this.bolloVirtuale = value;
    }

    /**
     * Recupera il valore della propriet importoBollo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoBollo() {
        return importoBollo;
    }

    /**
     * Imposta il valore della propriet importoBollo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoBollo(BigDecimal value) {
        this.importoBollo = value;
    }

}
