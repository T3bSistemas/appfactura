
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
 *         &lt;element name="TimbraCFDIPlus40Result" type="{http://tempuri.org/}CFDITimbradoPlusReponse40" minOccurs="0"/&gt;
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
    "timbraCFDIPlus40Result"
})
@XmlRootElement(name = "TimbraCFDIPlus40Response")
public class TimbraCFDIPlus40Response {

    @XmlElement(name = "TimbraCFDIPlus40Result")
    protected CFDITimbradoPlusReponse40 timbraCFDIPlus40Result;

    /**
     * Obtiene el valor de la propiedad timbraCFDIPlus40Result.
     * 
     * @return
     *     possible object is
     *     {@link CFDITimbradoPlusReponse40 }
     *     
     */
    public CFDITimbradoPlusReponse40 getTimbraCFDIPlus40Result() {
        return timbraCFDIPlus40Result;
    }

    /**
     * Define el valor de la propiedad timbraCFDIPlus40Result.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDITimbradoPlusReponse40 }
     *     
     */
    public void setTimbraCFDIPlus40Result(CFDITimbradoPlusReponse40 value) {
        this.timbraCFDIPlus40Result = value;
    }

}
