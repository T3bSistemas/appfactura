
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataResponseFielB64 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DataResponseFielB64"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Exitoso" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="pdfB64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "DataResponseFielB64", propOrder = {
    "exitoso",
    "pdfB64",
    "mensaje"
})
public class DataResponseFielB64 {

    @XmlElement(name = "Exitoso")
    protected boolean exitoso;
    protected String pdfB64;
    @XmlElement(name = "Mensaje")
    protected String mensaje;

    /**
     * Obtiene el valor de la propiedad exitoso.
     * 
     */
    public boolean isExitoso() {
        return exitoso;
    }

    /**
     * Define el valor de la propiedad exitoso.
     * 
     */
    public void setExitoso(boolean value) {
        this.exitoso = value;
    }

    /**
     * Obtiene el valor de la propiedad pdfB64.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfB64() {
        return pdfB64;
    }

    /**
     * Define el valor de la propiedad pdfB64.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfB64(String value) {
        this.pdfB64 = value;
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
