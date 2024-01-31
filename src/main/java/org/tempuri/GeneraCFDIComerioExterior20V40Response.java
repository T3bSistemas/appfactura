
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
 *         &lt;element name="GeneraCFDIComerioExterior20V40Result" type="{http://tempuri.org/}CFDIComercioExterior20Response" minOccurs="0"/&gt;
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
    "generaCFDIComerioExterior20V40Result"
})
@XmlRootElement(name = "GeneraCFDIComerioExterior20V40Response")
public class GeneraCFDIComerioExterior20V40Response {

    @XmlElement(name = "GeneraCFDIComerioExterior20V40Result")
    protected CFDIComercioExterior20Response generaCFDIComerioExterior20V40Result;

    /**
     * Obtiene el valor de la propiedad generaCFDIComerioExterior20V40Result.
     * 
     * @return
     *     possible object is
     *     {@link CFDIComercioExterior20Response }
     *     
     */
    public CFDIComercioExterior20Response getGeneraCFDIComerioExterior20V40Result() {
        return generaCFDIComerioExterior20V40Result;
    }

    /**
     * Define el valor de la propiedad generaCFDIComerioExterior20V40Result.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIComercioExterior20Response }
     *     
     */
    public void setGeneraCFDIComerioExterior20V40Result(CFDIComercioExterior20Response value) {
        this.generaCFDIComerioExterior20V40Result = value;
    }

}
