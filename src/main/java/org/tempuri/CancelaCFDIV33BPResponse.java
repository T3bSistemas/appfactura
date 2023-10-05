
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
 *         &lt;element name="CancelaCFDIV33BPResult" type="{http://tempuri.org/}CFDIv33CancelacionResponseBP" minOccurs="0"/&gt;
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
    "cancelaCFDIV33BPResult"
})
@XmlRootElement(name = "CancelaCFDIV33BPResponse")
public class CancelaCFDIV33BPResponse {

    @XmlElement(name = "CancelaCFDIV33BPResult")
    protected CFDIv33CancelacionResponseBP cancelaCFDIV33BPResult;

    /**
     * Obtiene el valor de la propiedad cancelaCFDIV33BPResult.
     * 
     * @return
     *     possible object is
     *     {@link CFDIv33CancelacionResponseBP }
     *     
     */
    public CFDIv33CancelacionResponseBP getCancelaCFDIV33BPResult() {
        return cancelaCFDIV33BPResult;
    }

    /**
     * Define el valor de la propiedad cancelaCFDIV33BPResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIv33CancelacionResponseBP }
     *     
     */
    public void setCancelaCFDIV33BPResult(CFDIv33CancelacionResponseBP value) {
        this.cancelaCFDIV33BPResult = value;
    }

}
