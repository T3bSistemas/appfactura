
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
 *         &lt;element name="timbraRequest" type="{http://tempuri.org/}TimbraCFDI40Request" minOccurs="0"/&gt;
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
@XmlRootElement(name = "TimbraCFDIV40")
public class TimbraCFDIV40 {

    protected TimbraCFDI40Request timbraRequest;

    /**
     * Obtiene el valor de la propiedad timbraRequest.
     * 
     * @return
     *     possible object is
     *     {@link TimbraCFDI40Request }
     *     
     */
    public TimbraCFDI40Request getTimbraRequest() {
        return timbraRequest;
    }

    /**
     * Define el valor de la propiedad timbraRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimbraCFDI40Request }
     *     
     */
    public void setTimbraRequest(TimbraCFDI40Request value) {
        this.timbraRequest = value;
    }

}
