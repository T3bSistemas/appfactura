
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
 *         &lt;element name="timbraRequest" type="{http://tempuri.org/}TimbraCFDI40RequestAllianz" minOccurs="0"/&gt;
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
@XmlRootElement(name = "TimbraCFDIV3340B64Allianz")
public class TimbraCFDIV3340B64Allianz {

    protected TimbraCFDI40RequestAllianz timbraRequest;

    /**
     * Obtiene el valor de la propiedad timbraRequest.
     * 
     * @return
     *     possible object is
     *     {@link TimbraCFDI40RequestAllianz }
     *     
     */
    public TimbraCFDI40RequestAllianz getTimbraRequest() {
        return timbraRequest;
    }

    /**
     * Define el valor de la propiedad timbraRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimbraCFDI40RequestAllianz }
     *     
     */
    public void setTimbraRequest(TimbraCFDI40RequestAllianz value) {
        this.timbraRequest = value;
    }

}
