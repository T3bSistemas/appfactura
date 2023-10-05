
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QRCodeResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QRCodeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QRBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="QRCorrecto" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QRCodeResponse", propOrder = {
    "qrBytes",
    "qrCorrecto",
    "mensaje"
})
public class QRCodeResponse {

    @XmlElement(name = "QRBytes")
    protected byte[] qrBytes;
    @XmlElement(name = "QRCorrecto")
    protected boolean qrCorrecto;
    @XmlElement(name = "Mensaje")
    protected String mensaje;

    /**
     * Obtiene el valor de la propiedad qrBytes.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getQRBytes() {
        return qrBytes;
    }

    /**
     * Define el valor de la propiedad qrBytes.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setQRBytes(byte[] value) {
        this.qrBytes = value;
    }

    /**
     * Obtiene el valor de la propiedad qrCorrecto.
     * 
     */
    public boolean isQRCorrecto() {
        return qrCorrecto;
    }

    /**
     * Define el valor de la propiedad qrCorrecto.
     * 
     */
    public void setQRCorrecto(boolean value) {
        this.qrCorrecto = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

}
