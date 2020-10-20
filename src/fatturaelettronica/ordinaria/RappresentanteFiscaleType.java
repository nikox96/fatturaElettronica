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
import javax.xml.bind.annotation.XmlType;


/**
 * Blocco relativo ai dati del Rappresentante Fiscale
 *
 * <p>Classe Java per RappresentanteFiscaleType complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="RappresentanteFiscaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatiAnagrafici" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}DatiAnagraficiRappresentanteType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RappresentanteFiscaleType", propOrder = {
    "datiAnagrafici"
})
public class RappresentanteFiscaleType {

    @XmlElement(name = "DatiAnagrafici", required = true)
    protected DatiAnagraficiRappresentanteType datiAnagrafici;

    /**
     * Recupera il valore della proprieta' datiAnagrafici.
     *
     * @return
     *     possible object is
     *     {@link DatiAnagraficiRappresentanteType }
     *
     */
    public DatiAnagraficiRappresentanteType getDatiAnagrafici() {
        return datiAnagrafici;
    }

    /**
     * Imposta il valore della proprieta' datiAnagrafici.
     *
     * @param value
     *     allowed object is
     *     {@link DatiAnagraficiRappresentanteType }
     *
     */
    public void setDatiAnagrafici(DatiAnagraficiRappresentanteType value) {
        this.datiAnagrafici = value;
    }

}
