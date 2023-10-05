
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
 *         &lt;element name="TimbraCFDIV40B64Result" type="{http://tempuri.org/}TimbraCFDI40Response" minOccurs="0"/&gt;
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
    "timbraCFDIV40B64Result"
})
@XmlRootElement(name = "TimbraCFDIV40B64Response")
public class TimbraCFDIV40B64Response {

    @XmlElement(name = "TimbraCFDIV40B64Result")
    protected TimbraCFDI40Response timbraCFDIV40B64Result;

    /**
     * Obtiene el valor de la propiedad timbraCFDIV40B64Result.
     * 
     * @return
     *     possible object is
     *     {@link TimbraCFDI40Response }
     *     
     */
    public TimbraCFDI40Response getTimbraCFDIV40B64Result() {
        return timbraCFDIV40B64Result;
    }

    /**
     * Define el valor de la propiedad timbraCFDIV40B64Result.
     * 
     * @param value
     *     allowed object is
     *     {@link TimbraCFDI40Response }
     *     
     */
    public void setTimbraCFDIV40B64Result(TimbraCFDI40Response value) {
        this.timbraCFDIV40B64Result = value;
    }

}
