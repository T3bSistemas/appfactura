
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EFResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EFResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XMLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimbradoOk" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFResponse", propOrder = {
    "codigoError",
    "descripcionError",
    "xmlt",
    "timbradoOk"
})
public class EFResponse {

    @XmlElement(name = "CodigoError")
    protected String codigoError;
    @XmlElement(name = "DescripcionError")
    protected String descripcionError;
    @XmlElement(name = "XMLT")
    protected String xmlt;
    @XmlElement(name = "TimbradoOk")
    protected boolean timbradoOk;

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
     * Obtiene el valor de la propiedad descripcionError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionError() {
        return descripcionError;
    }

    /**
     * Define el valor de la propiedad descripcionError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionError(String value) {
        this.descripcionError = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLT() {
        return xmlt;
    }

    /**
     * Define el valor de la propiedad xmlt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLT(String value) {
        this.xmlt = value;
    }

    /**
     * Obtiene el valor de la propiedad timbradoOk.
     * 
     */
    public boolean isTimbradoOk() {
        return timbradoOk;
    }

    /**
     * Define el valor de la propiedad timbradoOk.
     * 
     */
    public void setTimbradoOk(boolean value) {
        this.timbradoOk = value;
    }

}
