
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
 *         &lt;element name="GeneraCFDIComerioExteriorHamilton11V33Result" type="{http://tempuri.org/}CFDIComercioExteriorResponse33" minOccurs="0"/&gt;
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
    "generaCFDIComerioExteriorHamilton11V33Result"
})
@XmlRootElement(name = "GeneraCFDIComerioExteriorHamilton11V33Response")
public class GeneraCFDIComerioExteriorHamilton11V33Response {

    @XmlElement(name = "GeneraCFDIComerioExteriorHamilton11V33Result")
    protected CFDIComercioExteriorResponse33 generaCFDIComerioExteriorHamilton11V33Result;

    /**
     * Obtiene el valor de la propiedad generaCFDIComerioExteriorHamilton11V33Result.
     * 
     * @return
     *     possible object is
     *     {@link CFDIComercioExteriorResponse33 }
     *     
     */
    public CFDIComercioExteriorResponse33 getGeneraCFDIComerioExteriorHamilton11V33Result() {
        return generaCFDIComerioExteriorHamilton11V33Result;
    }

    /**
     * Define el valor de la propiedad generaCFDIComerioExteriorHamilton11V33Result.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIComercioExteriorResponse33 }
     *     
     */
    public void setGeneraCFDIComerioExteriorHamilton11V33Result(CFDIComercioExteriorResponse33 value) {
        this.generaCFDIComerioExteriorHamilton11V33Result = value;
    }

}
