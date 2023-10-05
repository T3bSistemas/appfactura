
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CancelacionV33ResponseConsulta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CancelacionV33ResponseConsulta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoEstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EsCancelable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RespuestaSAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstatusCancelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidacionEFOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelacionV33ResponseConsulta", propOrder = {
    "codigoEstatus",
    "estado",
    "esCancelable",
    "respuestaSAT",
    "estatusCancelacion",
    "validacionEFOS"
})
public class CancelacionV33ResponseConsulta {

    @XmlElement(name = "CodigoEstatus")
    protected String codigoEstatus;
    @XmlElement(name = "Estado")
    protected String estado;
    @XmlElement(name = "EsCancelable")
    protected String esCancelable;
    @XmlElement(name = "RespuestaSAT")
    protected String respuestaSAT;
    @XmlElement(name = "EstatusCancelacion")
    protected String estatusCancelacion;
    @XmlElement(name = "ValidacionEFOS")
    protected String validacionEFOS;

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
     * Obtiene el valor de la propiedad estatusCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstatusCancelacion() {
        return estatusCancelacion;
    }

    /**
     * Define el valor de la propiedad estatusCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstatusCancelacion(String value) {
        this.estatusCancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad validacionEFOS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidacionEFOS() {
        return validacionEFOS;
    }

    /**
     * Define el valor de la propiedad validacionEFOS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidacionEFOS(String value) {
        this.validacionEFOS = value;
    }

}
