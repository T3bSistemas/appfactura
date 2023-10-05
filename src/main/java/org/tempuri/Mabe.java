
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Mabe complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Mabe"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Referencia2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoDescuento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionDescuento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImporteDescuento" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="OrdenCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Referencial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImporteConLetra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlantaEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CalleEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPostalEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Detalles" type="{http://tempuri.org/}Detalles" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mabe", propOrder = {
    "referencia2",
    "tipoDescuento",
    "descripcionDescuento",
    "importeDescuento",
    "ordenCompra",
    "referencial",
    "importeConLetra",
    "codigoProveedor",
    "plantaEntrega",
    "calleEntrega",
    "codigoPostalEntrega",
    "detalles"
})
public class Mabe {

    @XmlElement(name = "Referencia2")
    protected String referencia2;
    @XmlElement(name = "TipoDescuento")
    protected String tipoDescuento;
    @XmlElement(name = "DescripcionDescuento")
    protected String descripcionDescuento;
    @XmlElement(name = "ImporteDescuento")
    protected double importeDescuento;
    @XmlElement(name = "OrdenCompra")
    protected String ordenCompra;
    @XmlElement(name = "Referencial")
    protected String referencial;
    @XmlElement(name = "ImporteConLetra")
    protected String importeConLetra;
    @XmlElement(name = "CodigoProveedor")
    protected String codigoProveedor;
    @XmlElement(name = "PlantaEntrega")
    protected String plantaEntrega;
    @XmlElement(name = "CalleEntrega")
    protected String calleEntrega;
    @XmlElement(name = "CodigoPostalEntrega")
    protected String codigoPostalEntrega;
    @XmlElement(name = "Detalles")
    protected Detalles detalles;

    /**
     * Obtiene el valor de la propiedad referencia2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia2() {
        return referencia2;
    }

    /**
     * Define el valor de la propiedad referencia2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia2(String value) {
        this.referencia2 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDescuento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDescuento() {
        return tipoDescuento;
    }

    /**
     * Define el valor de la propiedad tipoDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDescuento(String value) {
        this.tipoDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionDescuento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionDescuento() {
        return descripcionDescuento;
    }

    /**
     * Define el valor de la propiedad descripcionDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionDescuento(String value) {
        this.descripcionDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad importeDescuento.
     * 
     */
    public double getImporteDescuento() {
        return importeDescuento;
    }

    /**
     * Define el valor de la propiedad importeDescuento.
     * 
     */
    public void setImporteDescuento(double value) {
        this.importeDescuento = value;
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
     * Obtiene el valor de la propiedad referencial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencial() {
        return referencial;
    }

    /**
     * Define el valor de la propiedad referencial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencial(String value) {
        this.referencial = value;
    }

    /**
     * Obtiene el valor de la propiedad importeConLetra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteConLetra() {
        return importeConLetra;
    }

    /**
     * Define el valor de la propiedad importeConLetra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteConLetra(String value) {
        this.importeConLetra = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    /**
     * Define el valor de la propiedad codigoProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProveedor(String value) {
        this.codigoProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad plantaEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantaEntrega() {
        return plantaEntrega;
    }

    /**
     * Define el valor de la propiedad plantaEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantaEntrega(String value) {
        this.plantaEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad calleEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalleEntrega() {
        return calleEntrega;
    }

    /**
     * Define el valor de la propiedad calleEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalleEntrega(String value) {
        this.calleEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPostalEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPostalEntrega() {
        return codigoPostalEntrega;
    }

    /**
     * Define el valor de la propiedad codigoPostalEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPostalEntrega(String value) {
        this.codigoPostalEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad detalles.
     * 
     * @return
     *     possible object is
     *     {@link Detalles }
     *     
     */
    public Detalles getDetalles() {
        return detalles;
    }

    /**
     * Define el valor de la propiedad detalles.
     * 
     * @param value
     *     allowed object is
     *     {@link Detalles }
     *     
     */
    public void setDetalles(Detalles value) {
        this.detalles = value;
    }

}
