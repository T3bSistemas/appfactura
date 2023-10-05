
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
 *         &lt;element name="GeneraCFDINomina12V33MasivaResult" type="{http://tempuri.org/}CFDINominaResponse33" minOccurs="0"/&gt;
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
    "generaCFDINomina12V33MasivaResult"
})
@XmlRootElement(name = "GeneraCFDINomina12V33MasivaResponse")
public class GeneraCFDINomina12V33MasivaResponse {

    @XmlElement(name = "GeneraCFDINomina12V33MasivaResult")
    protected CFDINominaResponse33 generaCFDINomina12V33MasivaResult;

    /**
     * Obtiene el valor de la propiedad generaCFDINomina12V33MasivaResult.
     * 
     * @return
     *     possible object is
     *     {@link CFDINominaResponse33 }
     *     
     */
    public CFDINominaResponse33 getGeneraCFDINomina12V33MasivaResult() {
        return generaCFDINomina12V33MasivaResult;
    }

    /**
     * Define el valor de la propiedad generaCFDINomina12V33MasivaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDINominaResponse33 }
     *     
     */
    public void setGeneraCFDINomina12V33MasivaResult(CFDINominaResponse33 value) {
        this.generaCFDINomina12V33MasivaResult = value;
    }

}
