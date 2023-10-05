
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Articulos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Articulos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Proveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FolioPedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tienda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CantidadUnidadCompra" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CostoNetoUnidadCompra" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="PorcentajeIEPS" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="PorcentajeIVA" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Articulos", propOrder = {
    "proveedor",
    "remision",
    "folioPedido",
    "tienda",
    "codigo",
    "cantidadUnidadCompra",
    "costoNetoUnidadCompra",
    "porcentajeIEPS",
    "porcentajeIVA"
})
public class Articulos {

    @XmlElement(name = "Proveedor")
    protected String proveedor;
    @XmlElement(name = "Remision")
    protected String remision;
    @XmlElement(name = "FolioPedido")
    protected String folioPedido;
    @XmlElement(name = "Tienda")
    protected String tienda;
    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "CantidadUnidadCompra")
    protected double cantidadUnidadCompra;
    @XmlElement(name = "CostoNetoUnidadCompra")
    protected double costoNetoUnidadCompra;
    @XmlElement(name = "PorcentajeIEPS")
    protected double porcentajeIEPS;
    @XmlElement(name = "PorcentajeIVA")
    protected double porcentajeIVA;

    /**
     * Obtiene el valor de la propiedad proveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProveedor() {
        return proveedor;
    }

    /**
     * Define el valor de la propiedad proveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProveedor(String value) {
        this.proveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad remision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemision() {
        return remision;
    }

    /**
     * Define el valor de la propiedad remision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemision(String value) {
        this.remision = value;
    }

    /**
     * Obtiene el valor de la propiedad folioPedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioPedido() {
        return folioPedido;
    }

    /**
     * Define el valor de la propiedad folioPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioPedido(String value) {
        this.folioPedido = value;
    }

    /**
     * Obtiene el valor de la propiedad tienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTienda() {
        return tienda;
    }

    /**
     * Define el valor de la propiedad tienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTienda(String value) {
        this.tienda = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadUnidadCompra.
     * 
     */
    public double getCantidadUnidadCompra() {
        return cantidadUnidadCompra;
    }

    /**
     * Define el valor de la propiedad cantidadUnidadCompra.
     * 
     */
    public void setCantidadUnidadCompra(double value) {
        this.cantidadUnidadCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad costoNetoUnidadCompra.
     * 
     */
    public double getCostoNetoUnidadCompra() {
        return costoNetoUnidadCompra;
    }

    /**
     * Define el valor de la propiedad costoNetoUnidadCompra.
     * 
     */
    public void setCostoNetoUnidadCompra(double value) {
        this.costoNetoUnidadCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeIEPS.
     * 
     */
    public double getPorcentajeIEPS() {
        return porcentajeIEPS;
    }

    /**
     * Define el valor de la propiedad porcentajeIEPS.
     * 
     */
    public void setPorcentajeIEPS(double value) {
        this.porcentajeIEPS = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeIVA.
     * 
     */
    public double getPorcentajeIVA() {
        return porcentajeIVA;
    }

    /**
     * Define el valor de la propiedad porcentajeIVA.
     * 
     */
    public void setPorcentajeIVA(double value) {
        this.porcentajeIVA = value;
    }

}
