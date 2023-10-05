
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
 *         &lt;element name="GeneraReporteBellotaResult" type="{http://tempuri.org/}ReporteResponseBellota" minOccurs="0"/&gt;
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
    "generaReporteBellotaResult"
})
@XmlRootElement(name = "GeneraReporteBellotaResponse")
public class GeneraReporteBellotaResponse {

    @XmlElement(name = "GeneraReporteBellotaResult")
    protected ReporteResponseBellota generaReporteBellotaResult;

    /**
     * Obtiene el valor de la propiedad generaReporteBellotaResult.
     * 
     * @return
     *     possible object is
     *     {@link ReporteResponseBellota }
     *     
     */
    public ReporteResponseBellota getGeneraReporteBellotaResult() {
        return generaReporteBellotaResult;
    }

    /**
     * Define el valor de la propiedad generaReporteBellotaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ReporteResponseBellota }
     *     
     */
    public void setGeneraReporteBellotaResult(ReporteResponseBellota value) {
        this.generaReporteBellotaResult = value;
    }

}
