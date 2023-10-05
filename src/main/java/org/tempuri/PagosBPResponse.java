
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PagosBPResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PagosBPResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PagoCorrecto" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MensajeError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MensajeExitoso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatosAdicionales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagosBPResponse", propOrder = {
    "xml",
    "pagoCorrecto",
    "mensajeError",
    "mensajeExitoso",
    "datosAdicionales"
})
public class PagosBPResponse {

    @XmlElement(name = "XML")
    protected String xml;
    @XmlElement(name = "PagoCorrecto")
    protected boolean pagoCorrecto;
    @XmlElement(name = "MensajeError")
    protected String mensajeError;
    @XmlElement(name = "MensajeExitoso")
    protected String mensajeExitoso;
    @XmlElement(name = "DatosAdicionales")
    protected String datosAdicionales;

    /**
     * Obtiene el valor de la propiedad xml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXML() {
        return xml;
    }

    /**
     * Define el valor de la propiedad xml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXML(String value) {
        this.xml = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoCorrecto.
     * 
     */
    public boolean isPagoCorrecto() {
        return pagoCorrecto;
    }

    /**
     * Define el valor de la propiedad pagoCorrecto.
     * 
     */
    public void setPagoCorrecto(boolean value) {
        this.pagoCorrecto = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeError() {
        return mensajeError;
    }

    /**
     * Define el valor de la propiedad mensajeError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeError(String value) {
        this.mensajeError = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeExitoso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeExitoso() {
        return mensajeExitoso;
    }

    /**
     * Define el valor de la propiedad mensajeExitoso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeExitoso(String value) {
        this.mensajeExitoso = value;
    }

    /**
     * Obtiene el valor de la propiedad datosAdicionales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosAdicionales() {
        return datosAdicionales;
    }

    /**
     * Define el valor de la propiedad datosAdicionales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosAdicionales(String value) {
        this.datosAdicionales = value;
    }

}
