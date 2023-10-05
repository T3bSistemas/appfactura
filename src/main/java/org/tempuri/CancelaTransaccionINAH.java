
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
 *         &lt;element name="CancelacionTransaccionRequest" type="{http://tempuri.org/}CancelacionTransaccionRequest" minOccurs="0"/&gt;
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
    "cancelacionTransaccionRequest"
})
@XmlRootElement(name = "CancelaTransaccionINAH")
public class CancelaTransaccionINAH {

    @XmlElement(name = "CancelacionTransaccionRequest")
    protected CancelacionTransaccionRequest cancelacionTransaccionRequest;

    /**
     * Obtiene el valor de la propiedad cancelacionTransaccionRequest.
     * 
     * @return
     *     possible object is
     *     {@link CancelacionTransaccionRequest }
     *     
     */
    public CancelacionTransaccionRequest getCancelacionTransaccionRequest() {
        return cancelacionTransaccionRequest;
    }

    /**
     * Define el valor de la propiedad cancelacionTransaccionRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelacionTransaccionRequest }
     *     
     */
    public void setCancelacionTransaccionRequest(CancelacionTransaccionRequest value) {
        this.cancelacionTransaccionRequest = value;
    }

}
