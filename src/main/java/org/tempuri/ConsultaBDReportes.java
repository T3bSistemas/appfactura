
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
 *         &lt;element name="consulta" type="{http://tempuri.org/}ConsultaReportesRequest" minOccurs="0"/&gt;
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
    "consulta"
})
@XmlRootElement(name = "ConsultaBDReportes")
public class ConsultaBDReportes {

    protected ConsultaReportesRequest consulta;

    /**
     * Obtiene el valor de la propiedad consulta.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaReportesRequest }
     *     
     */
    public ConsultaReportesRequest getConsulta() {
        return consulta;
    }

    /**
     * Define el valor de la propiedad consulta.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaReportesRequest }
     *     
     */
    public void setConsulta(ConsultaReportesRequest value) {
        this.consulta = value;
    }

}
