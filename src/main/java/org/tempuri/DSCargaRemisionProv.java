
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DSCargaRemisionProv complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DSCargaRemisionProv"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Remision" type="{http://tempuri.org/}Remision" minOccurs="0"/&gt;
 *         &lt;element name="Pedimento" type="{http://tempuri.org/}Pedimento" minOccurs="0"/&gt;
 *         &lt;element name="Pedido" type="{http://tempuri.org/}Pedidos" minOccurs="0"/&gt;
 *         &lt;element name="Articulo" type="{http://tempuri.org/}Articulos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSCargaRemisionProv", propOrder = {
    "remision",
    "pedimento",
    "pedido",
    "articulo"
})
public class DSCargaRemisionProv {

    @XmlElement(name = "Remision")
    protected Remision remision;
    @XmlElement(name = "Pedimento")
    protected Pedimento pedimento;
    @XmlElement(name = "Pedido")
    protected Pedidos pedido;
    @XmlElement(name = "Articulo")
    protected Articulos articulo;

    /**
     * Obtiene el valor de la propiedad remision.
     * 
     * @return
     *     possible object is
     *     {@link Remision }
     *     
     */
    public Remision getRemision() {
        return remision;
    }

    /**
     * Define el valor de la propiedad remision.
     * 
     * @param value
     *     allowed object is
     *     {@link Remision }
     *     
     */
    public void setRemision(Remision value) {
        this.remision = value;
    }

    /**
     * Obtiene el valor de la propiedad pedimento.
     * 
     * @return
     *     possible object is
     *     {@link Pedimento }
     *     
     */
    public Pedimento getPedimento() {
        return pedimento;
    }

    /**
     * Define el valor de la propiedad pedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Pedimento }
     *     
     */
    public void setPedimento(Pedimento value) {
        this.pedimento = value;
    }

    /**
     * Obtiene el valor de la propiedad pedido.
     * 
     * @return
     *     possible object is
     *     {@link Pedidos }
     *     
     */
    public Pedidos getPedido() {
        return pedido;
    }

    /**
     * Define el valor de la propiedad pedido.
     * 
     * @param value
     *     allowed object is
     *     {@link Pedidos }
     *     
     */
    public void setPedido(Pedidos value) {
        this.pedido = value;
    }

    /**
     * Obtiene el valor de la propiedad articulo.
     * 
     * @return
     *     possible object is
     *     {@link Articulos }
     *     
     */
    public Articulos getArticulo() {
        return articulo;
    }

    /**
     * Define el valor de la propiedad articulo.
     * 
     * @param value
     *     allowed object is
     *     {@link Articulos }
     *     
     */
    public void setArticulo(Articulos value) {
        this.articulo = value;
    }

}
