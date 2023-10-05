
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
 *         &lt;element name="TimbraCFDINominaPlus12V40Result" type="{http://tempuri.org/}TimbradoPlusNominaResponse33" minOccurs="0"/&gt;
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
    "timbraCFDINominaPlus12V40Result"
})
@XmlRootElement(name = "TimbraCFDINominaPlus12V40Response")
public class TimbraCFDINominaPlus12V40Response {

    @XmlElement(name = "TimbraCFDINominaPlus12V40Result")
    protected TimbradoPlusNominaResponse33 timbraCFDINominaPlus12V40Result;

    /**
     * Obtiene el valor de la propiedad timbraCFDINominaPlus12V40Result.
     * 
     * @return
     *     possible object is
     *     {@link TimbradoPlusNominaResponse33 }
     *     
     */
    public TimbradoPlusNominaResponse33 getTimbraCFDINominaPlus12V40Result() {
        return timbraCFDINominaPlus12V40Result;
    }

    /**
     * Define el valor de la propiedad timbraCFDINominaPlus12V40Result.
     * 
     * @param value
     *     allowed object is
     *     {@link TimbradoPlusNominaResponse33 }
     *     
     */
    public void setTimbraCFDINominaPlus12V40Result(TimbradoPlusNominaResponse33 value) {
        this.timbraCFDINominaPlus12V40Result = value;
    }

}
