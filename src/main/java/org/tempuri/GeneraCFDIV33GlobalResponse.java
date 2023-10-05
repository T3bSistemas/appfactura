
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
 *         &lt;element name="GeneraCFDIV33GlobalResult" type="{http://tempuri.org/}CFDIResponse" minOccurs="0"/&gt;
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
    "generaCFDIV33GlobalResult"
})
@XmlRootElement(name = "GeneraCFDIV33GlobalResponse")
public class GeneraCFDIV33GlobalResponse {

    @XmlElement(name = "GeneraCFDIV33GlobalResult")
    protected CFDIResponse generaCFDIV33GlobalResult;

    /**
     * Obtiene el valor de la propiedad generaCFDIV33GlobalResult.
     * 
     * @return
     *     possible object is
     *     {@link CFDIResponse }
     *     
     */
    public CFDIResponse getGeneraCFDIV33GlobalResult() {
        return generaCFDIV33GlobalResult;
    }

    /**
     * Define el valor de la propiedad generaCFDIV33GlobalResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIResponse }
     *     
     */
    public void setGeneraCFDIV33GlobalResult(CFDIResponse value) {
        this.generaCFDIV33GlobalResult = value;
    }

}
