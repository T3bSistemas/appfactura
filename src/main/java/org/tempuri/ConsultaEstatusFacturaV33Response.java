
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
 *         &lt;element name="ConsultaEstatusFacturaV33Result" type="{http://tempuri.org/}CancelacionV33ResponseConsulta" minOccurs="0"/&gt;
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
    "consultaEstatusFacturaV33Result"
})
@XmlRootElement(name = "ConsultaEstatusFacturaV33Response")
public class ConsultaEstatusFacturaV33Response {

    @XmlElement(name = "ConsultaEstatusFacturaV33Result")
    protected CancelacionV33ResponseConsulta consultaEstatusFacturaV33Result;

    /**
     * Obtiene el valor de la propiedad consultaEstatusFacturaV33Result.
     * 
     * @return
     *     possible object is
     *     {@link CancelacionV33ResponseConsulta }
     *     
     */
    public CancelacionV33ResponseConsulta getConsultaEstatusFacturaV33Result() {
        return consultaEstatusFacturaV33Result;
    }

    /**
     * Define el valor de la propiedad consultaEstatusFacturaV33Result.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelacionV33ResponseConsulta }
     *     
     */
    public void setConsultaEstatusFacturaV33Result(CancelacionV33ResponseConsulta value) {
        this.consultaEstatusFacturaV33Result = value;
    }

}
