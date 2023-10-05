
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Coppel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Coppel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}AMC7_1"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FechaPromesaEnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IndentificaTipoProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BodegaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BodegaReceptora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FleteCaja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specialServicesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CoppelLineItems" type="{http://tempuri.org/}Coppel_LineItems" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coppel", propOrder = {
    "fechaPromesaEnt",
    "indentificaTipoProv",
    "bodegaDestino",
    "bodegaReceptora",
    "fleteCaja",
    "specialServicesType",
    "coppelLineItems"
})
public class Coppel
    extends AMC71
{

    @XmlElement(name = "FechaPromesaEnt")
    protected String fechaPromesaEnt;
    @XmlElement(name = "IndentificaTipoProv")
    protected String indentificaTipoProv;
    @XmlElement(name = "BodegaDestino")
    protected String bodegaDestino;
    @XmlElement(name = "BodegaReceptora")
    protected String bodegaReceptora;
    @XmlElement(name = "FleteCaja")
    protected String fleteCaja;
    protected String specialServicesType;
    @XmlElement(name = "CoppelLineItems")
    protected CoppelLineItems coppelLineItems;

    /**
     * Obtiene el valor de la propiedad fechaPromesaEnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPromesaEnt() {
        return fechaPromesaEnt;
    }

    /**
     * Define el valor de la propiedad fechaPromesaEnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPromesaEnt(String value) {
        this.fechaPromesaEnt = value;
    }

    /**
     * Obtiene el valor de la propiedad indentificaTipoProv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndentificaTipoProv() {
        return indentificaTipoProv;
    }

    /**
     * Define el valor de la propiedad indentificaTipoProv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndentificaTipoProv(String value) {
        this.indentificaTipoProv = value;
    }

    /**
     * Obtiene el valor de la propiedad bodegaDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodegaDestino() {
        return bodegaDestino;
    }

    /**
     * Define el valor de la propiedad bodegaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodegaDestino(String value) {
        this.bodegaDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad bodegaReceptora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodegaReceptora() {
        return bodegaReceptora;
    }

    /**
     * Define el valor de la propiedad bodegaReceptora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodegaReceptora(String value) {
        this.bodegaReceptora = value;
    }

    /**
     * Obtiene el valor de la propiedad fleteCaja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleteCaja() {
        return fleteCaja;
    }

    /**
     * Define el valor de la propiedad fleteCaja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFleteCaja(String value) {
        this.fleteCaja = value;
    }

    /**
     * Obtiene el valor de la propiedad specialServicesType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialServicesType() {
        return specialServicesType;
    }

    /**
     * Define el valor de la propiedad specialServicesType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialServicesType(String value) {
        this.specialServicesType = value;
    }

    /**
     * Obtiene el valor de la propiedad coppelLineItems.
     * 
     * @return
     *     possible object is
     *     {@link CoppelLineItems }
     *     
     */
    public CoppelLineItems getCoppelLineItems() {
        return coppelLineItems;
    }

    /**
     * Define el valor de la propiedad coppelLineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link CoppelLineItems }
     *     
     */
    public void setCoppelLineItems(CoppelLineItems value) {
        this.coppelLineItems = value;
    }

}
