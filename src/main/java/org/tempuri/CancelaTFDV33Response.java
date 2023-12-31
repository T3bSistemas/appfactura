
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
 *         &lt;element name="CancelaTFDV33Result" type="{http://tempuri.org/}Timbradov33CancelacionResponse" minOccurs="0"/&gt;
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
    "cancelaTFDV33Result"
})
@XmlRootElement(name = "CancelaTFDV33Response")
public class CancelaTFDV33Response {

    @XmlElement(name = "CancelaTFDV33Result")
    protected Timbradov33CancelacionResponse cancelaTFDV33Result;

    /**
     * Obtiene el valor de la propiedad cancelaTFDV33Result.
     * 
     * @return
     *     possible object is
     *     {@link Timbradov33CancelacionResponse }
     *     
     */
    public Timbradov33CancelacionResponse getCancelaTFDV33Result() {
        return cancelaTFDV33Result;
    }

    /**
     * Define el valor de la propiedad cancelaTFDV33Result.
     * 
     * @param value
     *     allowed object is
     *     {@link Timbradov33CancelacionResponse }
     *     
     */
    public void setCancelaTFDV33Result(Timbradov33CancelacionResponse value) {
        this.cancelaTFDV33Result = value;
    }

}
