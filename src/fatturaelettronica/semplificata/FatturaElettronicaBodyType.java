//
// Questo file e' stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Qualsiasi modifica a questo file andra' persa durante la ricompilazione dello schema di origine.
// Generato il: 2020.10.05 alle 08:33:50 PM CEST
//


package fatturaelettronica.semplificata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FatturaElettronicaBodyType complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="FatturaElettronicaBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatiGenerali" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}DatiGeneraliType"/>
 *         &lt;element name="DatiBeniServizi" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}DatiBeniServiziType" maxOccurs="unbounded"/>
 *         &lt;element name="Allegati" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0}AllegatiType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FatturaElettronicaBodyType", namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.0", propOrder = {
    "datiGenerali",
    "datiBeniServizi",
    "allegati"
})
public class FatturaElettronicaBodyType {

    @XmlElement(name = "DatiGenerali", required = true)
    protected DatiGeneraliType datiGenerali;
    @XmlElement(name = "DatiBeniServizi", required = true)
    protected List<DatiBeniServiziType> datiBeniServizi;
    @XmlElement(name = "Allegati")
    protected List<AllegatiType> allegati;

    /**
     * Recupera il valore della proprieta' datiGenerali.
     *
     * @return
     *     possible object is
     *     {@link DatiGeneraliType }
     *
     */
    public DatiGeneraliType getDatiGenerali() {
        return datiGenerali;
    }

    /**
     * Imposta il valore della proprieta' datiGenerali.
     *
     * @param value
     *     allowed object is
     *     {@link DatiGeneraliType }
     *
     */
    public void setDatiGenerali(DatiGeneraliType value) {
        this.datiGenerali = value;
    }

    /**
     * Gets the value of the datiBeniServizi property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datiBeniServizi property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatiBeniServizi().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatiBeniServiziType }
     *
     *
     */
    public List<DatiBeniServiziType> getDatiBeniServizi() {
        if (datiBeniServizi == null) {
            datiBeniServizi = new ArrayList<DatiBeniServiziType>();
        }
        return this.datiBeniServizi;
    }

    /**
     * Gets the value of the allegati property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allegati property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllegati().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllegatiType }
     *
     *
     */
    public List<AllegatiType> getAllegati() {
        if (allegati == null) {
            allegati = new ArrayList<AllegatiType>();
        }
        return this.allegati;
    }

}
