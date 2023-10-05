
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
 *         &lt;element name="GeneraCFDIV33PlusResult" type="{http://tempuri.org/}CFDIResponse" minOccurs="0"/&gt;
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
    "generaCFDIV33PlusResult"
})
@XmlRootElement(name = "GeneraCFDIV33PlusResponse")
public class GeneraCFDIV33PlusResponse {

    @XmlElement(name = "GeneraCFDIV33PlusResult")
    protected CFDIResponse generaCFDIV33PlusResult;

    /**
     * Obtiene el valor de la propiedad generaCFDIV33PlusResult.
     * 
     * @return
     *     possible object is
     *     {@link CFDIResponse }
     *     
     */
    public CFDIResponse getGeneraCFDIV33PlusResult() {
        return generaCFDIV33PlusResult;
    }

    /**
     * Define el valor de la propiedad generaCFDIV33PlusResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIResponse }
     *     
     */
    public void setGeneraCFDIV33PlusResult(CFDIResponse value) {
        this.generaCFDIV33PlusResult = value;
    }

}
