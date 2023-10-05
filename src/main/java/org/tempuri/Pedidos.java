
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Pedidos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Pedidos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Proveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FolioPedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tienda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CantidadArticulos" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pedidos", propOrder = {
    "proveedor",
    "remision",
    "folioPedido",
    "tienda",
    "cantidadArticulos"
})
public class Pedidos {

    @XmlElement(name = "Proveedor")
    protected String proveedor;
    @XmlElement(name = "Remision")
    protected String remision;
    @XmlElement(name = "FolioPedido")
    protected String folioPedido;
    @XmlElement(name = "Tienda")
    protected String tienda;
    @XmlElement(name = "CantidadArticulos")
    protected double cantidadArticulos;

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
     * Obtiene el valor de la propiedad cantidadArticulos.
     * 
     */
    public double getCantidadArticulos() {
        return cantidadArticulos;
    }

    /**
     * Define el valor de la propiedad cantidadArticulos.
     * 
     */
    public void setCantidadArticulos(double value) {
        this.cantidadArticulos = value;
    }

}
