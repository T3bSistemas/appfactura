
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
 *         &lt;element name="RequestBellota" type="{http://tempuri.org/}ReporteRequestBellota" minOccurs="0"/&gt;
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
    "requestBellota"
})
@XmlRootElement(name = "GeneraReporteBellota")
public class GeneraReporteBellota {

    @XmlElement(name = "RequestBellota")
    protected ReporteRequestBellota requestBellota;

    /**
     * Obtiene el valor de la propiedad requestBellota.
     * 
     * @return
     *     possible object is
     *     {@link ReporteRequestBellota }
     *     
     */
    public ReporteRequestBellota getRequestBellota() {
        return requestBellota;
    }

    /**
     * Define el valor de la propiedad requestBellota.
     * 
     * @param value
     *     allowed object is
     *     {@link ReporteRequestBellota }
     *     
     */
    public void setRequestBellota(ReporteRequestBellota value) {
        this.requestBellota = value;
    }

}
