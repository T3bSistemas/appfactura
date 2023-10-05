
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PSVParte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PSVParte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DescripcionMaterial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CantidadMaterial" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="UnidadMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrecioUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MontoLinea" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CodigoImpuesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrdenCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Posicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSVParte", propOrder = {
    "descripcionMaterial",
    "cantidadMaterial",
    "unidadMedida",
    "precioUnitario",
    "montoLinea",
    "codigoImpuesto",
    "ordenCompra",
    "posicion"
})
public class PSVParte {

    @XmlElement(name = "DescripcionMaterial")
    protected String descripcionMaterial;
    @XmlElement(name = "CantidadMaterial")
    protected double cantidadMaterial;
    @XmlElement(name = "UnidadMedida")
    protected String unidadMedida;
    @XmlElement(name = "PrecioUnitario")
    protected double precioUnitario;
    @XmlElement(name = "MontoLinea")
    protected double montoLinea;
    @XmlElement(name = "CodigoImpuesto")
    protected String codigoImpuesto;
    @XmlElement(name = "OrdenCompra")
    protected String ordenCompra;
    @XmlElement(name = "Posicion")
    protected String posicion;

    /**
     * Obtiene el valor de la propiedad descripcionMaterial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMaterial() {
        return descripcionMaterial;
    }

    /**
     * Define el valor de la propiedad descripcionMaterial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMaterial(String value) {
        this.descripcionMaterial = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadMaterial.
     * 
     */
    public double getCantidadMaterial() {
        return cantidadMaterial;
    }

    /**
     * Define el valor de la propiedad cantidadMaterial.
     * 
     */
    public void setCantidadMaterial(double value) {
        this.cantidadMaterial = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadMedida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadMedida() {
        return unidadMedida;
    }

    /**
     * Define el valor de la propiedad unidadMedida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadMedida(String value) {
        this.unidadMedida = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUnitario.
     * 
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Define el valor de la propiedad precioUnitario.
     * 
     */
    public void setPrecioUnitario(double value) {
        this.precioUnitario = value;
    }

    /**
     * Obtiene el valor de la propiedad montoLinea.
     * 
     */
    public double getMontoLinea() {
        return montoLinea;
    }

    /**
     * Define el valor de la propiedad montoLinea.
     * 
     */
    public void setMontoLinea(double value) {
        this.montoLinea = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoImpuesto() {
        return codigoImpuesto;
    }

    /**
     * Define el valor de la propiedad codigoImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoImpuesto(String value) {
        this.codigoImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdenCompra() {
        return ordenCompra;
    }

    /**
     * Define el valor de la propiedad ordenCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdenCompra(String value) {
        this.ordenCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad posicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * Define el valor de la propiedad posicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosicion(String value) {
        this.posicion = value;
    }

}
