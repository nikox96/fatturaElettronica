//
// Questo file  stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.13 alle 03:27:08 PM CET 
//


package fatturaelettronica.ordinaria;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Blocco relativo ai dati di Pagamento della Fattura Elettronica
 * 
 * <p>Classe Java per DatiPagamentoType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiPagamentoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CondizioniPagamento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}CondizioniPagamentoType"/>
 *         &lt;element name="DettaglioPagamento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}DettaglioPagamentoType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiPagamentoType", propOrder = {
    "condizioniPagamento",
    "dettaglioPagamento"
})
public class DatiPagamentoType {

    @XmlElement(name = "CondizioniPagamento", required = true)
    @XmlSchemaType(name = "string")
    protected CondizioniPagamentoType condizioniPagamento;
    @XmlElement(name = "DettaglioPagamento", required = true)
    protected List<DettaglioPagamentoType> dettaglioPagamento;

    /**
     * Recupera il valore della propriet condizioniPagamento.
     * 
     * @return
     *     possible object is
     *     {@link CondizioniPagamentoType }
     *     
     */
    public CondizioniPagamentoType getCondizioniPagamento() {
        return condizioniPagamento;
    }

    /**
     * Imposta il valore della propriet condizioniPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link CondizioniPagamentoType }
     *     
     */
    public void setCondizioniPagamento(CondizioniPagamentoType value) {
        this.condizioniPagamento = value;
    }

    /**
     * Gets the value of the dettaglioPagamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettaglioPagamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDettaglioPagamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DettaglioPagamentoType }
     * 
     * 
     */
    public List<DettaglioPagamentoType> getDettaglioPagamento() {
        if (dettaglioPagamento == null) {
            dettaglioPagamento = new ArrayList<DettaglioPagamentoType>();
        }
        return this.dettaglioPagamento;
    }

}
