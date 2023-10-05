
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
 *         &lt;element name="GenerBytesQRCodeResult" type="{http://tempuri.org/}QRCodeResponse" minOccurs="0"/&gt;
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
    "generBytesQRCodeResult"
})
@XmlRootElement(name = "GenerBytesQRCodeResponse")
public class GenerBytesQRCodeResponse {

    @XmlElement(name = "GenerBytesQRCodeResult")
    protected QRCodeResponse generBytesQRCodeResult;

    /**
     * Obtiene el valor de la propiedad generBytesQRCodeResult.
     * 
     * @return
     *     possible object is
     *     {@link QRCodeResponse }
     *     
     */
    public QRCodeResponse getGenerBytesQRCodeResult() {
        return generBytesQRCodeResult;
    }

    /**
     * Define el valor de la propiedad generBytesQRCodeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link QRCodeResponse }
     *     
     */
    public void setGenerBytesQRCodeResult(QRCodeResponse value) {
        this.generBytesQRCodeResult = value;
    }

}
