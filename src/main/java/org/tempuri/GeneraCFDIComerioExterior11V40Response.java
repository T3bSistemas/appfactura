
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
 *         &lt;element name="GeneraCFDIComerioExterior11V40Result" type="{http://tempuri.org/}CFDIComercioExteriorResponse40" minOccurs="0"/&gt;
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
    "generaCFDIComerioExterior11V40Result"
})
@XmlRootElement(name = "GeneraCFDIComerioExterior11V40Response")
public class GeneraCFDIComerioExterior11V40Response {

    @XmlElement(name = "GeneraCFDIComerioExterior11V40Result")
    protected CFDIComercioExteriorResponse40 generaCFDIComerioExterior11V40Result;

    /**
     * Obtiene el valor de la propiedad generaCFDIComerioExterior11V40Result.
     * 
     * @return
     *     possible object is
     *     {@link CFDIComercioExteriorResponse40 }
     *     
     */
    public CFDIComercioExteriorResponse40 getGeneraCFDIComerioExterior11V40Result() {
        return generaCFDIComerioExterior11V40Result;
    }

    /**
     * Define el valor de la propiedad generaCFDIComerioExterior11V40Result.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIComercioExteriorResponse40 }
     *     
     */
    public void setGeneraCFDIComerioExterior11V40Result(CFDIComercioExteriorResponse40 value) {
        this.generaCFDIComerioExterior11V40Result = value;
    }

}
