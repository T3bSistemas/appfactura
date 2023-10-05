
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ExEmisor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExEmisor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RFCEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NmbEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DomicilioFiscal" type="{http://tempuri.org/}DomicilioFiscal" minOccurs="0"/&gt;
 *         &lt;element name="LugarExpedicion" type="{http://tempuri.org/}LugarExpedicion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExEmisor", propOrder = {
    "rfcEmisor",
    "nmbEmisor",
    "sucursal",
    "domicilioFiscal",
    "lugarExpedicion"
})
public class ExEmisor {

    @XmlElement(name = "RFCEmisor")
    protected String rfcEmisor;
    @XmlElement(name = "NmbEmisor")
    protected String nmbEmisor;
    @XmlElement(name = "Sucursal")
    protected String sucursal;
    @XmlElement(name = "DomicilioFiscal")
    protected DomicilioFiscal domicilioFiscal;
    @XmlElement(name = "LugarExpedicion")
    protected LugarExpedicion lugarExpedicion;

    /**
     * Obtiene el valor de la propiedad rfcEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCEmisor() {
        return rfcEmisor;
    }

    /**
     * Define el valor de la propiedad rfcEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCEmisor(String value) {
        this.rfcEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad nmbEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmbEmisor() {
        return nmbEmisor;
    }

    /**
     * Define el valor de la propiedad nmbEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmbEmisor(String value) {
        this.nmbEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSucursal() {
        return sucursal;
    }

    /**
     * Define el valor de la propiedad sucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSucursal(String value) {
        this.sucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioFiscal.
     * 
     * @return
     *     possible object is
     *     {@link DomicilioFiscal }
     *     
     */
    public DomicilioFiscal getDomicilioFiscal() {
        return domicilioFiscal;
    }

    /**
     * Define el valor de la propiedad domicilioFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link DomicilioFiscal }
     *     
     */
    public void setDomicilioFiscal(DomicilioFiscal value) {
        this.domicilioFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link LugarExpedicion }
     *     
     */
    public LugarExpedicion getLugarExpedicion() {
        return lugarExpedicion;
    }

    /**
     * Define el valor de la propiedad lugarExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link LugarExpedicion }
     *     
     */
    public void setLugarExpedicion(LugarExpedicion value) {
        this.lugarExpedicion = value;
    }

}
