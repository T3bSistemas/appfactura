
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
 *         &lt;element name="GeneraCFDIV40SiValeResult" type="{http://tempuri.org/}CFDIResponse" minOccurs="0"/&gt;
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
    "generaCFDIV40SiValeResult"
})
@XmlRootElement(name = "GeneraCFDIV40SiValeResponse")
public class GeneraCFDIV40SiValeResponse {

    @XmlElement(name = "GeneraCFDIV40SiValeResult")
    protected CFDIResponse generaCFDIV40SiValeResult;

    /**
     * Obtiene el valor de la propiedad generaCFDIV40SiValeResult.
     * 
     * @return
     *     possible object is
     *     {@link CFDIResponse }
     *     
     */
    public CFDIResponse getGeneraCFDIV40SiValeResult() {
        return generaCFDIV40SiValeResult;
    }

    /**
     * Define el valor de la propiedad generaCFDIV40SiValeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIResponse }
     *     
     */
    public void setGeneraCFDIV40SiValeResult(CFDIResponse value) {
        this.generaCFDIV40SiValeResult = value;
    }

}
