
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
 *         &lt;element name="CancelaCFDIV33BPSAPResult" type="{http://tempuri.org/}CFDIv33CancelacionResponseBPSAP" minOccurs="0"/&gt;
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
    "cancelaCFDIV33BPSAPResult"
})
@XmlRootElement(name = "CancelaCFDIV33BPSAPResponse")
public class CancelaCFDIV33BPSAPResponse {

    @XmlElement(name = "CancelaCFDIV33BPSAPResult")
    protected CFDIv33CancelacionResponseBPSAP cancelaCFDIV33BPSAPResult;

    /**
     * Obtiene el valor de la propiedad cancelaCFDIV33BPSAPResult.
     * 
     * @return
     *     possible object is
     *     {@link CFDIv33CancelacionResponseBPSAP }
     *     
     */
    public CFDIv33CancelacionResponseBPSAP getCancelaCFDIV33BPSAPResult() {
        return cancelaCFDIV33BPSAPResult;
    }

    /**
     * Define el valor de la propiedad cancelaCFDIV33BPSAPResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIv33CancelacionResponseBPSAP }
     *     
     */
    public void setCancelaCFDIV33BPSAPResult(CFDIv33CancelacionResponseBPSAP value) {
        this.cancelaCFDIV33BPSAPResult = value;
    }

}
