
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
 *         &lt;element name="GeneraCFDINomina12V40Result" type="{http://tempuri.org/}CFDINominaResponse33" minOccurs="0"/&gt;
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
    "generaCFDINomina12V40Result"
})
@XmlRootElement(name = "GeneraCFDINomina12V40Response")
public class GeneraCFDINomina12V40Response {

    @XmlElement(name = "GeneraCFDINomina12V40Result")
    protected CFDINominaResponse33 generaCFDINomina12V40Result;

    /**
     * Obtiene el valor de la propiedad generaCFDINomina12V40Result.
     * 
     * @return
     *     possible object is
     *     {@link CFDINominaResponse33 }
     *     
     */
    public CFDINominaResponse33 getGeneraCFDINomina12V40Result() {
        return generaCFDINomina12V40Result;
    }

    /**
     * Define el valor de la propiedad generaCFDINomina12V40Result.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDINominaResponse33 }
     *     
     */
    public void setGeneraCFDINomina12V40Result(CFDINominaResponse33 value) {
        this.generaCFDINomina12V40Result = value;
    }

}
