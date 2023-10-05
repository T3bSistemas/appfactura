
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ExReceptor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExReceptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RFCReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NmbReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsoCFDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoExReceptor" type="{http://tempuri.org/}CodigoExReceptor" minOccurs="0"/&gt;
 *         &lt;element name="DomicilioFiscal" type="{http://tempuri.org/}DomicilioFiscalReceptor" minOccurs="0"/&gt;
 *         &lt;element name="LugarExpedicion" type="{http://tempuri.org/}LugarReceptor" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExReceptor", propOrder = {
    "rfcReceptor",
    "nmbReceptor",
    "sucursal",
    "usoCFDI",
    "codigoExReceptor",
    "domicilioFiscal",
    "lugarExpedicion"
})
public class ExReceptor {

    @XmlElement(name = "RFCReceptor")
    protected String rfcReceptor;
    @XmlElement(name = "NmbReceptor")
    protected String nmbReceptor;
    @XmlElement(name = "Sucursal")
    protected String sucursal;
    @XmlElement(name = "UsoCFDI")
    protected String usoCFDI;
    @XmlElement(name = "CodigoExReceptor")
    protected CodigoExReceptor codigoExReceptor;
    @XmlElement(name = "DomicilioFiscal")
    protected DomicilioFiscalReceptor domicilioFiscal;
    @XmlElement(name = "LugarExpedicion")
    protected LugarReceptor lugarExpedicion;

    /**
     * Obtiene el valor de la propiedad rfcReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCReceptor() {
        return rfcReceptor;
    }

    /**
     * Define el valor de la propiedad rfcReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCReceptor(String value) {
        this.rfcReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad nmbReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmbReceptor() {
        return nmbReceptor;
    }

    /**
     * Define el valor de la propiedad nmbReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmbReceptor(String value) {
        this.nmbReceptor = value;
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
     * Obtiene el valor de la propiedad usoCFDI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsoCFDI() {
        return usoCFDI;
    }

    /**
     * Define el valor de la propiedad usoCFDI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsoCFDI(String value) {
        this.usoCFDI = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoExReceptor.
     * 
     * @return
     *     possible object is
     *     {@link CodigoExReceptor }
     *     
     */
    public CodigoExReceptor getCodigoExReceptor() {
        return codigoExReceptor;
    }

    /**
     * Define el valor de la propiedad codigoExReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link CodigoExReceptor }
     *     
     */
    public void setCodigoExReceptor(CodigoExReceptor value) {
        this.codigoExReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioFiscal.
     * 
     * @return
     *     possible object is
     *     {@link DomicilioFiscalReceptor }
     *     
     */
    public DomicilioFiscalReceptor getDomicilioFiscal() {
        return domicilioFiscal;
    }

    /**
     * Define el valor de la propiedad domicilioFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link DomicilioFiscalReceptor }
     *     
     */
    public void setDomicilioFiscal(DomicilioFiscalReceptor value) {
        this.domicilioFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link LugarReceptor }
     *     
     */
    public LugarReceptor getLugarExpedicion() {
        return lugarExpedicion;
    }

    /**
     * Define el valor de la propiedad lugarExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link LugarReceptor }
     *     
     */
    public void setLugarExpedicion(LugarReceptor value) {
        this.lugarExpedicion = value;
    }

}
