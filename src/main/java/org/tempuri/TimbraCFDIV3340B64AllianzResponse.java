
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
 *         &lt;element name="TimbraCFDIV3340B64AllianzResult" type="{http://tempuri.org/}TimbraCFDI40Response" minOccurs="0"/&gt;
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
    "timbraCFDIV3340B64AllianzResult"
})
@XmlRootElement(name = "TimbraCFDIV3340B64AllianzResponse")
public class TimbraCFDIV3340B64AllianzResponse {

    @XmlElement(name = "TimbraCFDIV3340B64AllianzResult")
    protected TimbraCFDI40Response timbraCFDIV3340B64AllianzResult;

    /**
     * Obtiene el valor de la propiedad timbraCFDIV3340B64AllianzResult.
     * 
     * @return
     *     possible object is
     *     {@link TimbraCFDI40Response }
     *     
     */
    public TimbraCFDI40Response getTimbraCFDIV3340B64AllianzResult() {
        return timbraCFDIV3340B64AllianzResult;
    }

    /**
     * Define el valor de la propiedad timbraCFDIV3340B64AllianzResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TimbraCFDI40Response }
     *     
     */
    public void setTimbraCFDIV3340B64AllianzResult(TimbraCFDI40Response value) {
        this.timbraCFDIV3340B64AllianzResult = value;
    }

}
