
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
 *         &lt;element name="GeneraCFDIV40AllianzResult" type="{http://tempuri.org/}CFDIResponse40Allianz" minOccurs="0"/&gt;
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
    "generaCFDIV40AllianzResult"
})
@XmlRootElement(name = "GeneraCFDIV40AllianzResponse")
public class GeneraCFDIV40AllianzResponse {

    @XmlElement(name = "GeneraCFDIV40AllianzResult")
    protected CFDIResponse40Allianz generaCFDIV40AllianzResult;

    /**
     * Obtiene el valor de la propiedad generaCFDIV40AllianzResult.
     * 
     * @return
     *     possible object is
     *     {@link CFDIResponse40Allianz }
     *     
     */
    public CFDIResponse40Allianz getGeneraCFDIV40AllianzResult() {
        return generaCFDIV40AllianzResult;
    }

    /**
     * Define el valor de la propiedad generaCFDIV40AllianzResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIResponse40Allianz }
     *     
     */
    public void setGeneraCFDIV40AllianzResult(CFDIResponse40Allianz value) {
        this.generaCFDIV40AllianzResult = value;
    }

}
