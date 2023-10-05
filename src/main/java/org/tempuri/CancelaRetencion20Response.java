
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
 *         &lt;element name="CancelaRetencion20Result" type="{http://tempuri.org/}CancelacionRetencionResponse" minOccurs="0"/&gt;
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
    "cancelaRetencion20Result"
})
@XmlRootElement(name = "CancelaRetencion20Response")
public class CancelaRetencion20Response {

    @XmlElement(name = "CancelaRetencion20Result")
    protected CancelacionRetencionResponse cancelaRetencion20Result;

    /**
     * Obtiene el valor de la propiedad cancelaRetencion20Result.
     * 
     * @return
     *     possible object is
     *     {@link CancelacionRetencionResponse }
     *     
     */
    public CancelacionRetencionResponse getCancelaRetencion20Result() {
        return cancelaRetencion20Result;
    }

    /**
     * Define el valor de la propiedad cancelaRetencion20Result.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelacionRetencionResponse }
     *     
     */
    public void setCancelaRetencion20Result(CancelacionRetencionResponse value) {
        this.cancelaRetencion20Result = value;
    }

}
