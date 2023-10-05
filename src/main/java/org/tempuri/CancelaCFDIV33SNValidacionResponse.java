
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancelaCFDIV33SNValidacionResult" type="{http://tempuri.org/}CFDIv33CancelacionResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cancelaCFDIV33SNValidacionResult"
})
@XmlRootElement(name = "CancelaCFDIV33SNValidacionResponse")
public class CancelaCFDIV33SNValidacionResponse {

    @XmlElement(name = "CancelaCFDIV33SNValidacionResult")
    protected CFDIv33CancelacionResponse cancelaCFDIV33SNValidacionResult;

    /**
     * Obtiene el valor de la propiedad cancelaCFDIV33SNValidacionResult.
     * 
     * @return
     *     possible object is
     *     {@link CFDIv33CancelacionResponse }
     *     
     */
    public CFDIv33CancelacionResponse getCancelaCFDIV33SNValidacionResult() {
        return cancelaCFDIV33SNValidacionResult;
    }

    /**
     * Define el valor de la propiedad cancelaCFDIV33SNValidacionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIv33CancelacionResponse }
     *     
     */
    public void setCancelaCFDIV33SNValidacionResult(CFDIv33CancelacionResponse value) {
        this.cancelaCFDIV33SNValidacionResult = value;
    }

}
