
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
 *         &lt;element name="ConsultaBDReportesResult" type="{http://tempuri.org/}ConsultaReportesResponse" minOccurs="0"/&gt;
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
    "consultaBDReportesResult"
})
@XmlRootElement(name = "ConsultaBDReportesResponse")
public class ConsultaBDReportesResponse {

    @XmlElement(name = "ConsultaBDReportesResult")
    protected ConsultaReportesResponse consultaBDReportesResult;

    /**
     * Obtiene el valor de la propiedad consultaBDReportesResult.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaReportesResponse }
     *     
     */
    public ConsultaReportesResponse getConsultaBDReportesResult() {
        return consultaBDReportesResult;
    }

    /**
     * Define el valor de la propiedad consultaBDReportesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaReportesResponse }
     *     
     */
    public void setConsultaBDReportesResult(ConsultaReportesResponse value) {
        this.consultaBDReportesResult = value;
    }

}
