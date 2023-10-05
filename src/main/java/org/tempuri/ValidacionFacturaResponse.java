
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ValidacionFacturaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ValidacionFacturaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoEstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EsCancelable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RespuestaSAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EFOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Validacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DescripcionError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidacionFacturaResponse", propOrder = {
    "codigoEstatus",
    "estado",
    "esCancelable",
    "respuestaSAT",
    "efos",
    "validacion",
    "descripcionError",
    "codigoError"
})
public class ValidacionFacturaResponse {

    @XmlElement(name = "CodigoEstatus")
    protected String codigoEstatus;
    @XmlElement(name = "Estado")
    protected String estado;
    @XmlElement(name = "EsCancelable")
    protected String esCancelable;
    @XmlElement(name = "RespuestaSAT")
    protected String respuestaSAT;
    @XmlElement(name = "EFOS")
    protected String efos;
    @XmlElement(name = "Validacion")
    protected boolean validacion;
    @XmlElement(name = "DescripcionError")
    protected String descripcionError;
    @XmlElement(name = "CodigoError")
    protected String codigoError;

    /**
     * Obtiene el valor de la propiedad codigoEstatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstatus() {
        return codigoEstatus;
    }

    /**
     * Define el valor de la propiedad codigoEstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstatus(String value) {
        this.codigoEstatus = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad esCancelable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsCancelable() {
        return esCancelable;
    }

    /**
     * Define el valor de la propiedad esCancelable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsCancelable(String value) {
        this.esCancelable = value;
    }

    /**
     * Obtiene el valor de la propiedad respuestaSAT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespuestaSAT() {
        return respuestaSAT;
    }

    /**
     * Define el valor de la propiedad respuestaSAT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespuestaSAT(String value) {
        this.respuestaSAT = value;
    }

    /**
     * Obtiene el valor de la propiedad efos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEFOS() {
        return efos;
    }

    /**
     * Define el valor de la propiedad efos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEFOS(String value) {
        this.efos = value;
    }

    /**
     * Obtiene el valor de la propiedad validacion.
     * 
     */
    public boolean isValidacion() {
        return validacion;
    }

    /**
     * Define el valor de la propiedad validacion.
     * 
     */
    public void setValidacion(boolean value) {
        this.validacion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionError() {
        return descripcionError;
    }

    /**
     * Define el valor de la propiedad descripcionError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionError(String value) {
        this.descripcionError = value;
    }

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

}
