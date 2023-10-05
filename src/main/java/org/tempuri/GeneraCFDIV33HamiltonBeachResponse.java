
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
 *         &lt;element name="GeneraCFDIV33HamiltonBeachResult" type="{http://tempuri.org/}CFDIResponseHamilton" minOccurs="0"/&gt;
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
    "generaCFDIV33HamiltonBeachResult"
})
@XmlRootElement(name = "GeneraCFDIV33HamiltonBeachResponse")
public class GeneraCFDIV33HamiltonBeachResponse {

    @XmlElement(name = "GeneraCFDIV33HamiltonBeachResult")
    protected CFDIResponseHamilton generaCFDIV33HamiltonBeachResult;

    /**
     * Obtiene el valor de la propiedad generaCFDIV33HamiltonBeachResult.
     * 
     * @return
     *     possible object is
     *     {@link CFDIResponseHamilton }
     *     
     */
    public CFDIResponseHamilton getGeneraCFDIV33HamiltonBeachResult() {
        return generaCFDIV33HamiltonBeachResult;
    }

    /**
     * Define el valor de la propiedad generaCFDIV33HamiltonBeachResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIResponseHamilton }
     *     
     */
    public void setGeneraCFDIV33HamiltonBeachResult(CFDIResponseHamilton value) {
        this.generaCFDIV33HamiltonBeachResult = value;
    }

}
