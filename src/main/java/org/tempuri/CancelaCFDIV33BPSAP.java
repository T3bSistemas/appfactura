
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="cancelacionrequest" type="{http://tempuri.org/}CFDIv33CancelacionRequestBPSAP" minOccurs="0"/&gt;
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
    "cancelacionrequest"
})
@XmlRootElement(name = "CancelaCFDIV33BPSAP")
public class CancelaCFDIV33BPSAP {

    protected CFDIv33CancelacionRequestBPSAP cancelacionrequest;

    /**
     * Obtiene el valor de la propiedad cancelacionrequest.
     * 
     * @return
     *     possible object is
     *     {@link CFDIv33CancelacionRequestBPSAP }
     *     
     */
    public CFDIv33CancelacionRequestBPSAP getCancelacionrequest() {
        return cancelacionrequest;
    }

    /**
     * Define el valor de la propiedad cancelacionrequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIv33CancelacionRequestBPSAP }
     *     
     */
    public void setCancelacionrequest(CFDIv33CancelacionRequestBPSAP value) {
        this.cancelacionrequest = value;
    }

}
