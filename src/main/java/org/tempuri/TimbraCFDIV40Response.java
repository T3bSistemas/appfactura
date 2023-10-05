
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
 *         &lt;element name="TimbraCFDIV40Result" type="{http://tempuri.org/}TimbraCFDI40Response" minOccurs="0"/&gt;
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
    "timbraCFDIV40Result"
})
@XmlRootElement(name = "TimbraCFDIV40Response")
public class TimbraCFDIV40Response {

    @XmlElement(name = "TimbraCFDIV40Result")
    protected TimbraCFDI40Response timbraCFDIV40Result;

    /**
     * Obtiene el valor de la propiedad timbraCFDIV40Result.
     * 
     * @return
     *     possible object is
     *     {@link TimbraCFDI40Response }
     *     
     */
    public TimbraCFDI40Response getTimbraCFDIV40Result() {
        return timbraCFDIV40Result;
    }

    /**
     * Define el valor de la propiedad timbraCFDIV40Result.
     * 
     * @param value
     *     allowed object is
     *     {@link TimbraCFDI40Response }
     *     
     */
    public void setTimbraCFDIV40Result(TimbraCFDI40Response value) {
        this.timbraCFDIV40Result = value;
    }

}
