
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResponseAsignacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResponseAsignacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CausaError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FoliosRestantes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseAsignacion", propOrder = {
    "codigoError",
    "causaError",
    "mensaje",
    "foliosRestantes"
})
public class ResponseAsignacion {

    @XmlElement(name = "CodigoError")
    protected String codigoError;
    @XmlElement(name = "CausaError")
    protected String causaError;
    @XmlElement(name = "Mensaje")
    protected String mensaje;
    @XmlElement(name = "FoliosRestantes")
    protected String foliosRestantes;

    /**
     * Obtiene el valor de la propiedad codigoError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * Define el valor de la propiedad codigoError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoError(String value) {
        this.codigoError = value;
    }

    /**
     * Obtiene el valor de la propiedad causaError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausaError() {
        return causaError;
    }

    /**
     * Define el valor de la propiedad causaError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausaError(String value) {
        this.causaError = value;
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

    /**
     * Obtiene el valor de la propiedad foliosRestantes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoliosRestantes() {
        return foliosRestantes;
    }

    /**
     * Define el valor de la propiedad foliosRestantes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoliosRestantes(String value) {
        this.foliosRestantes = value;
    }

}
