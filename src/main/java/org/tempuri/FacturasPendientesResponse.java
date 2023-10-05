
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FacturasPendientesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturasPendientesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FacturasPendientes" type="{http://tempuri.org/}ArrayOfFacturaPendiente" minOccurs="0"/&gt;
 *         &lt;element name="Pendientes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturasPendientesResponse", propOrder = {
    "codigo",
    "descripcion",
    "facturasPendientes",
    "pendientes"
})
public class FacturasPendientesResponse {

    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "FacturasPendientes")
    protected ArrayOfFacturaPendiente facturasPendientes;
    @XmlElement(name = "Pendientes")
    protected boolean pendientes;

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
     * Obtiene el valor de la propiedad facturasPendientes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFacturaPendiente }
     *     
     */
    public ArrayOfFacturaPendiente getFacturasPendientes() {
        return facturasPendientes;
    }

    /**
     * Define el valor de la propiedad facturasPendientes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFacturaPendiente }
     *     
     */
    public void setFacturasPendientes(ArrayOfFacturaPendiente value) {
        this.facturasPendientes = value;
    }

    /**
     * Obtiene el valor de la propiedad pendientes.
     * 
     */
    public boolean isPendientes() {
        return pendientes;
    }

    /**
     * Define el valor de la propiedad pendientes.
     * 
     */
    public void setPendientes(boolean value) {
        this.pendientes = value;
    }

}
