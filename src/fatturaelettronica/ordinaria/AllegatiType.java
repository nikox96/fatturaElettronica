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


/**
 * Blocco relativo ai dati di eventuali allegati
 *
 * <p>Classe Java per AllegatiType complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="AllegatiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NomeAttachment" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60LatinType"/>
 *         &lt;element name="AlgoritmoCompressione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String10Type" minOccurs="0"/>
 *         &lt;element name="FormatoAttachment" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String10Type" minOccurs="0"/>
 *         &lt;element name="DescrizioneAttachment" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String100LatinType" minOccurs="0"/>
 *         &lt;element name="Attachment" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllegatiType", propOrder = {
    "nomeAttachment",
    "algoritmoCompressione",
    "formatoAttachment",
    "descrizioneAttachment",
    "attachment"
})
public class AllegatiType {

    @XmlElement(name = "NomeAttachment", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String nomeAttachment;
    @XmlElement(name = "AlgoritmoCompressione")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String algoritmoCompressione;
    @XmlElement(name = "FormatoAttachment")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String formatoAttachment;
    @XmlElement(name = "DescrizioneAttachment")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String descrizioneAttachment;
    @XmlElement(name = "Attachment", required = true)
    protected byte[] attachment;

    /**
     * Recupera il valore della proprieta' nomeAttachment.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNomeAttachment() {
        return nomeAttachment;
    }

    /**
     * Imposta il valore della proprieta' nomeAttachment.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNomeAttachment(String value) {
        this.nomeAttachment = value;
    }

    /**
     * Recupera il valore della proprieta' algoritmoCompressione.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAlgoritmoCompressione() {
        return algoritmoCompressione;
    }

    /**
     * Imposta il valore della proprieta' algoritmoCompressione.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAlgoritmoCompressione(String value) {
        this.algoritmoCompressione = value;
    }

    /**
     * Recupera il valore della proprieta' formatoAttachment.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFormatoAttachment() {
        return formatoAttachment;
    }

    /**
     * Imposta il valore della proprieta' formatoAttachment.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFormatoAttachment(String value) {
        this.formatoAttachment = value;
    }

    /**
     * Recupera il valore della proprieta' descrizioneAttachment.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescrizioneAttachment() {
        return descrizioneAttachment;
    }

    /**
     * Imposta il valore della proprieta' descrizioneAttachment.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescrizioneAttachment(String value) {
        this.descrizioneAttachment = value;
    }

    /**
     * Recupera il valore della proprieta' attachment.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAttachment() {
        return attachment;
    }

    /**
     * Imposta il valore della proprieta' attachment.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAttachment(byte[] value) {
        this.attachment = value;
    }

}
