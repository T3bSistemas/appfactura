
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Destinatario20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Destinatario20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumRegIdTrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DomicilioDestinatario" type="{http://tempuri.org/}ArrayOfDomicilioDestinatario20" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Destinatario20", propOrder = {
    "numRegIdTrib",
    "razonSocial",
    "domicilioDestinatario"
})
public class Destinatario20 {

    @XmlElement(name = "NumRegIdTrib")
    protected String numRegIdTrib;
    @XmlElement(name = "RazonSocial")
    protected String razonSocial;
    @XmlElement(name = "DomicilioDestinatario")
    protected ArrayOfDomicilioDestinatario20 domicilioDestinatario;

    /**
     * Obtiene el valor de la propiedad numRegIdTrib.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRegIdTrib() {
        return numRegIdTrib;
    }

    /**
     * Define el valor de la propiedad numRegIdTrib.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRegIdTrib(String value) {
        this.numRegIdTrib = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDomicilioDestinatario20 }
     *     
     */
    public ArrayOfDomicilioDestinatario20 getDomicilioDestinatario() {
        return domicilioDestinatario;
    }

    /**
     * Define el valor de la propiedad domicilioDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDomicilioDestinatario20 }
     *     
     */
    public void setDomicilioDestinatario(ArrayOfDomicilioDestinatario20 value) {
        this.domicilioDestinatario = value;
    }

}
