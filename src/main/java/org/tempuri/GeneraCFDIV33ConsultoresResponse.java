
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
 *         &lt;element name="GeneraCFDIV33ConsultoresResult" type="{http://tempuri.org/}CFDIResponse" minOccurs="0"/&gt;
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
    "generaCFDIV33ConsultoresResult"
})
@XmlRootElement(name = "GeneraCFDIV33ConsultoresResponse")
public class GeneraCFDIV33ConsultoresResponse {

    @XmlElement(name = "GeneraCFDIV33ConsultoresResult")
    protected CFDIResponse generaCFDIV33ConsultoresResult;

    /**
     * Obtiene el valor de la propiedad generaCFDIV33ConsultoresResult.
     * 
     * @return
     *     possible object is
     *     {@link CFDIResponse }
     *     
     */
    public CFDIResponse getGeneraCFDIV33ConsultoresResult() {
        return generaCFDIV33ConsultoresResult;
    }

    /**
     * Define el valor de la propiedad generaCFDIV33ConsultoresResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIResponse }
     *     
     */
    public void setGeneraCFDIV33ConsultoresResult(CFDIResponse value) {
        this.generaCFDIV33ConsultoresResult = value;
    }

}
