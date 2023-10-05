
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="timbraRequest" type="{http://tempuri.org/}TimbraCFDI33Request" minOccurs="0"/&gt;
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
    "timbraRequest"
})
@XmlRootElement(name = "TimbraCFDIB64")
public class TimbraCFDIB64 {

    protected TimbraCFDI33Request timbraRequest;

    /**
     * Obtiene el valor de la propiedad timbraRequest.
     * 
     * @return
     *     possible object is
     *     {@link TimbraCFDI33Request }
     *     
     */
    public TimbraCFDI33Request getTimbraRequest() {
        return timbraRequest;
    }

    /**
     * Define el valor de la propiedad timbraRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimbraCFDI33Request }
     *     
     */
    public void setTimbraRequest(TimbraCFDI33Request value) {
        this.timbraRequest = value;
    }

}
