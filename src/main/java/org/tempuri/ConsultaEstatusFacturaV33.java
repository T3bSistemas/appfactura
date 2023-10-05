
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
 *         &lt;element name="cancelacionRequest" type="{http://tempuri.org/}CancelacionV33RequestConsulta" minOccurs="0"/&gt;
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
    "cancelacionRequest"
})
@XmlRootElement(name = "ConsultaEstatusFacturaV33")
public class ConsultaEstatusFacturaV33 {

    protected CancelacionV33RequestConsulta cancelacionRequest;

    /**
     * Obtiene el valor de la propiedad cancelacionRequest.
     * 
     * @return
     *     possible object is
     *     {@link CancelacionV33RequestConsulta }
     *     
     */
    public CancelacionV33RequestConsulta getCancelacionRequest() {
        return cancelacionRequest;
    }

    /**
     * Define el valor de la propiedad cancelacionRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelacionV33RequestConsulta }
     *     
     */
    public void setCancelacionRequest(CancelacionV33RequestConsulta value) {
        this.cancelacionRequest = value;
    }

}
