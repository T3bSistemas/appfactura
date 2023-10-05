
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
 *         &lt;element name="QRRequest" type="{http://tempuri.org/}QRCodeRequest" minOccurs="0"/&gt;
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
    "qrRequest"
})
@XmlRootElement(name = "GenerBytesQRCode")
public class GenerBytesQRCode {

    @XmlElement(name = "QRRequest")
    protected QRCodeRequest qrRequest;

    /**
     * Obtiene el valor de la propiedad qrRequest.
     * 
     * @return
     *     possible object is
     *     {@link QRCodeRequest }
     *     
     */
    public QRCodeRequest getQRRequest() {
        return qrRequest;
    }

    /**
     * Define el valor de la propiedad qrRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link QRCodeRequest }
     *     
     */
    public void setQRRequest(QRCodeRequest value) {
        this.qrRequest = value;
    }

}
