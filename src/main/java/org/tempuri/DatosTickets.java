
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosTickets complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosTickets"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImporteTicket" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="NumTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Xml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosTickets", propOrder = {
    "idTicket",
    "importeTicket",
    "numTicket",
    "xml"
})
public class DatosTickets {

    @XmlElement(name = "IdTicket")
    protected String idTicket;
    @XmlElement(name = "ImporteTicket")
    protected double importeTicket;
    @XmlElement(name = "NumTicket")
    protected String numTicket;
    @XmlElement(name = "Xml")
    protected String xml;

    /**
     * Obtiene el valor de la propiedad idTicket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTicket() {
        return idTicket;
    }

    /**
     * Define el valor de la propiedad idTicket.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTicket(String value) {
        this.idTicket = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTicket.
     * 
     */
    public double getImporteTicket() {
        return importeTicket;
    }

    /**
     * Define el valor de la propiedad importeTicket.
     * 
     */
    public void setImporteTicket(double value) {
        this.importeTicket = value;
    }

    /**
     * Obtiene el valor de la propiedad numTicket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTicket() {
        return numTicket;
    }

    /**
     * Define el valor de la propiedad numTicket.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTicket(String value) {
        this.numTicket = value;
    }

    /**
     * Obtiene el valor de la propiedad xml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXml() {
        return xml;
    }

    /**
     * Define el valor de la propiedad xml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXml(String value) {
        this.xml = value;
    }

}
