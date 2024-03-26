
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
 *         &lt;element name="GeneraCFDIVPaseMasivoResult" type="{http://tempuri.org/}CFDIResponse" minOccurs="0"/&gt;
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
    "generaCFDIVPaseMasivoResult"
})
@XmlRootElement(name = "GeneraCFDIVPaseMasivoResponse")
public class GeneraCFDIVPaseMasivoResponse {

    @XmlElement(name = "GeneraCFDIVPaseMasivoResult")
    protected CFDIResponse generaCFDIVPaseMasivoResult;

    /**
     * Obtiene el valor de la propiedad generaCFDIVPaseMasivoResult.
     * 
     * @return
     *     possible object is
     *     {@link CFDIResponse }
     *     
     */
    public CFDIResponse getGeneraCFDIVPaseMasivoResult() {
        return generaCFDIVPaseMasivoResult;
    }

    /**
     * Define el valor de la propiedad generaCFDIVPaseMasivoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIResponse }
     *     
     */
    public void setGeneraCFDIVPaseMasivoResult(CFDIResponse value) {
        this.generaCFDIVPaseMasivoResult = value;
    }

}
