
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
 *         &lt;element name="CancelaTransaccionINAHResult" type="{http://tempuri.org/}CancelacionTransaccionResponse" minOccurs="0"/&gt;
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
    "cancelaTransaccionINAHResult"
})
@XmlRootElement(name = "CancelaTransaccionINAHResponse")
public class CancelaTransaccionINAHResponse {

    @XmlElement(name = "CancelaTransaccionINAHResult")
    protected CancelacionTransaccionResponse cancelaTransaccionINAHResult;

    /**
     * Obtiene el valor de la propiedad cancelaTransaccionINAHResult.
     * 
     * @return
     *     possible object is
     *     {@link CancelacionTransaccionResponse }
     *     
     */
    public CancelacionTransaccionResponse getCancelaTransaccionINAHResult() {
        return cancelaTransaccionINAHResult;
    }

    /**
     * Define el valor de la propiedad cancelaTransaccionINAHResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelacionTransaccionResponse }
     *     
     */
    public void setCancelaTransaccionINAHResult(CancelacionTransaccionResponse value) {
        this.cancelaTransaccionINAHResult = value;
    }

}
