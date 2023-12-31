
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CFDITimbradoPlusReponse40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CFDITimbradoPlusReponse40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XMLCFDIPlus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCFDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CFDICorrecto" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFDITimbradoPlusReponse40", propOrder = {
    "xmlcfdiPlus",
    "codigoError",
    "errorCFDI",
    "cfdiCorrecto"
})
public class CFDITimbradoPlusReponse40 {

    @XmlElement(name = "XMLCFDIPlus")
    protected String xmlcfdiPlus;
    @XmlElement(name = "CodigoError")
    protected String codigoError;
    @XmlElement(name = "ErrorCFDI")
    protected String errorCFDI;
    @XmlElement(name = "CFDICorrecto")
    protected boolean cfdiCorrecto;

    /**
     * Obtiene el valor de la propiedad xmlcfdiPlus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLCFDIPlus() {
        return xmlcfdiPlus;
    }

    /**
     * Define el valor de la propiedad xmlcfdiPlus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLCFDIPlus(String value) {
        this.xmlcfdiPlus = value;
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
     * Obtiene el valor de la propiedad errorCFDI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCFDI() {
        return errorCFDI;
    }

    /**
     * Define el valor de la propiedad errorCFDI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCFDI(String value) {
        this.errorCFDI = value;
    }

    /**
     * Obtiene el valor de la propiedad cfdiCorrecto.
     * 
     */
    public boolean isCFDICorrecto() {
        return cfdiCorrecto;
    }

    /**
     * Define el valor de la propiedad cfdiCorrecto.
     * 
     */
    public void setCFDICorrecto(boolean value) {
        this.cfdiCorrecto = value;
    }

}
