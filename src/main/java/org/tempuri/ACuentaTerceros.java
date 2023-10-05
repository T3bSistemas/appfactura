
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ACuentaTerceros complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ACuentaTerceros"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RfcACuentaTerceros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreACuentaTerceros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegimenFiscalACuentaTerceros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DomicilioFiscalACuentaTerceros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACuentaTerceros", propOrder = {
    "rfcACuentaTerceros",
    "nombreACuentaTerceros",
    "regimenFiscalACuentaTerceros",
    "domicilioFiscalACuentaTerceros"
})
public class ACuentaTerceros {

    @XmlElement(name = "RfcACuentaTerceros")
    protected String rfcACuentaTerceros;
    @XmlElement(name = "NombreACuentaTerceros")
    protected String nombreACuentaTerceros;
    @XmlElement(name = "RegimenFiscalACuentaTerceros")
    protected String regimenFiscalACuentaTerceros;
    @XmlElement(name = "DomicilioFiscalACuentaTerceros")
    protected String domicilioFiscalACuentaTerceros;

    /**
     * Obtiene el valor de la propiedad rfcACuentaTerceros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcACuentaTerceros() {
        return rfcACuentaTerceros;
    }

    /**
     * Define el valor de la propiedad rfcACuentaTerceros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcACuentaTerceros(String value) {
        this.rfcACuentaTerceros = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreACuentaTerceros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreACuentaTerceros() {
        return nombreACuentaTerceros;
    }

    /**
     * Define el valor de la propiedad nombreACuentaTerceros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreACuentaTerceros(String value) {
        this.nombreACuentaTerceros = value;
    }

    /**
     * Obtiene el valor de la propiedad regimenFiscalACuentaTerceros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimenFiscalACuentaTerceros() {
        return regimenFiscalACuentaTerceros;
    }

    /**
     * Define el valor de la propiedad regimenFiscalACuentaTerceros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimenFiscalACuentaTerceros(String value) {
        this.regimenFiscalACuentaTerceros = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioFiscalACuentaTerceros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilioFiscalACuentaTerceros() {
        return domicilioFiscalACuentaTerceros;
    }

    /**
     * Define el valor de la propiedad domicilioFiscalACuentaTerceros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilioFiscalACuentaTerceros(String value) {
        this.domicilioFiscalACuentaTerceros = value;
    }

}
