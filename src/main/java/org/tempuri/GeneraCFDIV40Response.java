
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
 *         &lt;element name="GeneraCFDIV40Result" type="{http://tempuri.org/}CFDIResponse40" minOccurs="0"/&gt;
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
    "generaCFDIV40Result"
})
@XmlRootElement(name = "GeneraCFDIV40Response")
public class GeneraCFDIV40Response {

    @XmlElement(name = "GeneraCFDIV40Result")
    protected CFDIResponse40 generaCFDIV40Result;

    /**
     * Obtiene el valor de la propiedad generaCFDIV40Result.
     * 
     * @return
     *     possible object is
     *     {@link CFDIResponse40 }
     *     
     */
    public CFDIResponse40 getGeneraCFDIV40Result() {
        return generaCFDIV40Result;
    }

    /**
     * Define el valor de la propiedad generaCFDIV40Result.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIResponse40 }
     *     
     */
    public void setGeneraCFDIV40Result(CFDIResponse40 value) {
        this.generaCFDIV40Result = value;
    }

}
