
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Detalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Detalle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoArticulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Unidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="PrecioSinIva" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ImporteSinIva" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ImporteConIva" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="PrecioConIva" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Detalle", propOrder = {
    "codigoArticulo",
    "descripcion",
    "unidad",
    "cantidad",
    "precioSinIva",
    "importeSinIva",
    "importeConIva",
    "precioConIva"
})
public class Detalle {

    @XmlElement(name = "CodigoArticulo")
    protected String codigoArticulo;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "Unidad")
    protected String unidad;
    @XmlElement(name = "Cantidad")
    protected double cantidad;
    @XmlElement(name = "PrecioSinIva")
    protected double precioSinIva;
    @XmlElement(name = "ImporteSinIva")
    protected double importeSinIva;
    @XmlElement(name = "ImporteConIva")
    protected double importeConIva;
    @XmlElement(name = "PrecioConIva")
    protected double precioConIva;

    /**
     * Obtiene el valor de la propiedad codigoArticulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    /**
     * Define el valor de la propiedad codigoArticulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoArticulo(String value) {
        this.codigoArticulo = value;
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
     * Obtiene el valor de la propiedad precioSinIva.
     * 
     */
    public double getPrecioSinIva() {
        return precioSinIva;
    }

    /**
     * Define el valor de la propiedad precioSinIva.
     * 
     */
    public void setPrecioSinIva(double value) {
        this.precioSinIva = value;
    }

    /**
     * Obtiene el valor de la propiedad importeSinIva.
     * 
     */
    public double getImporteSinIva() {
        return importeSinIva;
    }

    /**
     * Define el valor de la propiedad importeSinIva.
     * 
     */
    public void setImporteSinIva(double value) {
        this.importeSinIva = value;
    }

    /**
     * Obtiene el valor de la propiedad importeConIva.
     * 
     */
    public double getImporteConIva() {
        return importeConIva;
    }

    /**
     * Define el valor de la propiedad importeConIva.
     * 
     */
    public void setImporteConIva(double value) {
        this.importeConIva = value;
    }

    /**
     * Obtiene el valor de la propiedad precioConIva.
     * 
     */
    public double getPrecioConIva() {
        return precioConIva;
    }

    /**
     * Define el valor de la propiedad precioConIva.
     * 
     */
    public void setPrecioConIva(double value) {
        this.precioConIva = value;
    }

}
