
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
 *         &lt;element name="TimbraCFDIB64Result" type="{http://tempuri.org/}TimbraCFDI33Response" minOccurs="0"/&gt;
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
    "timbraCFDIB64Result"
})
@XmlRootElement(name = "TimbraCFDIB64Response")
public class TimbraCFDIB64Response {

    @XmlElement(name = "TimbraCFDIB64Result")
    protected TimbraCFDI33Response timbraCFDIB64Result;

    /**
     * Obtiene el valor de la propiedad timbraCFDIB64Result.
     * 
     * @return
     *     possible object is
     *     {@link TimbraCFDI33Response }
     *     
     */
    public TimbraCFDI33Response getTimbraCFDIB64Result() {
        return timbraCFDIB64Result;
    }

    /**
     * Define el valor de la propiedad timbraCFDIB64Result.
     * 
     * @param value
     *     allowed object is
     *     {@link TimbraCFDI33Response }
     *     
     */
    public void setTimbraCFDIB64Result(TimbraCFDI33Response value) {
        this.timbraCFDIB64Result = value;
    }

}
