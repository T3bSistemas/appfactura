
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
 *         &lt;element name="GeneraCFDIVPaseResult" type="{http://tempuri.org/}CFDIResponse" minOccurs="0"/&gt;
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
    "generaCFDIVPaseResult"
})
@XmlRootElement(name = "GeneraCFDIVPaseResponse")
public class GeneraCFDIVPaseResponse {

    @XmlElement(name = "GeneraCFDIVPaseResult")
    protected CFDIResponse generaCFDIVPaseResult;

    /**
     * Obtiene el valor de la propiedad generaCFDIVPaseResult.
     * 
     * @return
     *     possible object is
     *     {@link CFDIResponse }
     *     
     */
    public CFDIResponse getGeneraCFDIVPaseResult() {
        return generaCFDIVPaseResult;
    }

    /**
     * Define el valor de la propiedad generaCFDIVPaseResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIResponse }
     *     
     */
    public void setGeneraCFDIVPaseResult(CFDIResponse value) {
        this.generaCFDIVPaseResult = value;
    }

}
