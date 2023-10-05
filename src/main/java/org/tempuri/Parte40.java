
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Parte40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Parte40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaveProdServ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Unidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValorUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Importe" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="InformacionAduana" type="{http://tempuri.org/}ArrayOfInformacionAduanera40" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parte40", propOrder = {
    "claveProdServ",
    "noIdentificacion",
    "cantidad",
    "unidad",
    "descripcion",
    "valorUnitario",
    "importe",
    "informacionAduana"
})
public class Parte40 {

    @XmlElement(name = "ClaveProdServ")
    protected String claveProdServ;
    @XmlElement(name = "NoIdentificacion")
    protected String noIdentificacion;
    @XmlElement(name = "Cantidad")
    protected double cantidad;
    @XmlElement(name = "Unidad")
    protected String unidad;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "ValorUnitario")
    protected double valorUnitario;
    @XmlElement(name = "Importe")
    protected double importe;
    @XmlElement(name = "InformacionAduana")
    protected ArrayOfInformacionAduanera40 informacionAduana;

    /**
     * Obtiene el valor de la propiedad claveProdServ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveProdServ() {
        return claveProdServ;
    }

    /**
     * Define el valor de la propiedad claveProdServ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveProdServ(String value) {
        this.claveProdServ = value;
    }

    /**
     * Obtiene el valor de la propiedad noIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoIdentificacion() {
        return noIdentificacion;
    }

    /**
     * Define el valor de la propiedad noIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoIdentificacion(String value) {
        this.noIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(double value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad unidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * Define el valor de la propiedad unidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidad(String value) {
        this.unidad = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad valorUnitario.
     * 
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Define el valor de la propiedad valorUnitario.
     * 
     */
    public void setValorUnitario(double value) {
        this.valorUnitario = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     */
    public void setImporte(double value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionAduana.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInformacionAduanera40 }
     *     
     */
    public ArrayOfInformacionAduanera40 getInformacionAduana() {
        return informacionAduana;
    }

    /**
     * Define el valor de la propiedad informacionAduana.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInformacionAduanera40 }
     *     
     */
    public void setInformacionAduana(ArrayOfInformacionAduanera40 value) {
        this.informacionAduana = value;
    }

}
