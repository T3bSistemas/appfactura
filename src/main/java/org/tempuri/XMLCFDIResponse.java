
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para XMLCFDIResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="XMLCFDIResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XMLCorrecto" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Cancelado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AcuseCancelado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Timbres" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Folios" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMLCFDIResponse", propOrder = {
    "xml",
    "codigoError",
    "errorXML",
    "xmlCorrecto",
    "cancelado",
    "acuseCancelado",
    "timbres",
    "folios"
})
public class XMLCFDIResponse {

    @XmlElement(name = "XML")
    protected String xml;
    @XmlElement(name = "CodigoError")
    protected String codigoError;
    @XmlElement(name = "ErrorXML")
    protected String errorXML;
    @XmlElement(name = "XMLCorrecto")
    protected boolean xmlCorrecto;
    @XmlElement(name = "Cancelado")
    protected String cancelado;
    @XmlElement(name = "AcuseCancelado")
    protected String acuseCancelado;
    @XmlElement(name = "Timbres")
    protected int timbres;
    @XmlElement(name = "Folios")
    protected int folios;

    /**
     * Obtiene el valor de la propiedad xml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXML() {
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
    public void setXML(String value) {
        this.xml = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * Define el valor de la propiedad codigoError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoError(String value) {
        this.codigoError = value;
    }

    /**
     * Obtiene el valor de la propiedad errorXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorXML() {
        return errorXML;
    }

    /**
     * Define el valor de la propiedad errorXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorXML(String value) {
        this.errorXML = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlCorrecto.
     * 
     */
    public boolean isXMLCorrecto() {
        return xmlCorrecto;
    }

    /**
     * Define el valor de la propiedad xmlCorrecto.
     * 
     */
    public void setXMLCorrecto(boolean value) {
        this.xmlCorrecto = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelado() {
        return cancelado;
    }

    /**
     * Define el valor de la propiedad cancelado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelado(String value) {
        this.cancelado = value;
    }

    /**
     * Obtiene el valor de la propiedad acuseCancelado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcuseCancelado() {
        return acuseCancelado;
    }

    /**
     * Define el valor de la propiedad acuseCancelado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcuseCancelado(String value) {
        this.acuseCancelado = value;
    }

    /**
     * Obtiene el valor de la propiedad timbres.
     * 
     */
    public int getTimbres() {
        return timbres;
    }

    /**
     * Define el valor de la propiedad timbres.
     * 
     */
    public void setTimbres(int value) {
        this.timbres = value;
    }

    /**
     * Obtiene el valor de la propiedad folios.
     * 
     */
    public int getFolios() {
        return folios;
    }

    /**
     * Define el valor de la propiedad folios.
     * 
     */
    public void setFolios(int value) {
        this.folios = value;
    }

}
