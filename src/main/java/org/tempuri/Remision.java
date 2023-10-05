
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Remision complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Remision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Proveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumRemision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Consecutivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaRemision" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Tienda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoBulto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EntregaMercancia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CumpleReqFiscales" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CantidadBultos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Subtotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Descuentos" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="IEPS" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="IVA" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="OtrosImpuestos" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CantidadPedidos" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="FechaEntregaMercancia" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Cita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Remision", propOrder = {
    "proveedor",
    "numRemision",
    "consecutivo",
    "fechaRemision",
    "tienda",
    "tipoMoneda",
    "tipoBulto",
    "entregaMercancia",
    "cumpleReqFiscales",
    "cantidadBultos",
    "subtotal",
    "descuentos",
    "ieps",
    "iva",
    "otrosImpuestos",
    "total",
    "cantidadPedidos",
    "fechaEntregaMercancia",
    "cita"
})
public class Remision {

    @XmlElement(name = "Proveedor")
    protected String proveedor;
    @XmlElement(name = "NumRemision")
    protected String numRemision;
    @XmlElement(name = "Consecutivo")
    protected String consecutivo;
    @XmlElement(name = "FechaRemision", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRemision;
    @XmlElement(name = "Tienda")
    protected String tienda;
    @XmlElement(name = "TipoMoneda")
    protected String tipoMoneda;
    @XmlElement(name = "TipoBulto")
    protected String tipoBulto;
    @XmlElement(name = "EntregaMercancia")
    protected String entregaMercancia;
    @XmlElement(name = "CumpleReqFiscales")
    protected boolean cumpleReqFiscales;
    @XmlElement(name = "CantidadBultos")
    protected String cantidadBultos;
    @XmlElement(name = "Subtotal")
    protected double subtotal;
    @XmlElement(name = "Descuentos")
    protected double descuentos;
    @XmlElement(name = "IEPS")
    protected double ieps;
    @XmlElement(name = "IVA")
    protected double iva;
    @XmlElement(name = "OtrosImpuestos")
    protected double otrosImpuestos;
    @XmlElement(name = "Total")
    protected double total;
    @XmlElement(name = "CantidadPedidos")
    protected double cantidadPedidos;
    @XmlElement(name = "FechaEntregaMercancia", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEntregaMercancia;
    @XmlElement(name = "Cita")
    protected String cita;

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
     * Obtiene el valor de la propiedad numRemision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRemision() {
        return numRemision;
    }

    /**
     * Define el valor de la propiedad numRemision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRemision(String value) {
        this.numRemision = value;
    }

    /**
     * Obtiene el valor de la propiedad consecutivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsecutivo() {
        return consecutivo;
    }

    /**
     * Define el valor de la propiedad consecutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsecutivo(String value) {
        this.consecutivo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRemision.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRemision() {
        return fechaRemision;
    }

    /**
     * Define el valor de la propiedad fechaRemision.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRemision(XMLGregorianCalendar value) {
        this.fechaRemision = value;
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
     * Obtiene el valor de la propiedad tipoMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMoneda() {
        return tipoMoneda;
    }

    /**
     * Define el valor de la propiedad tipoMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMoneda(String value) {
        this.tipoMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoBulto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoBulto() {
        return tipoBulto;
    }

    /**
     * Define el valor de la propiedad tipoBulto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoBulto(String value) {
        this.tipoBulto = value;
    }

    /**
     * Obtiene el valor de la propiedad entregaMercancia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntregaMercancia() {
        return entregaMercancia;
    }

    /**
     * Define el valor de la propiedad entregaMercancia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntregaMercancia(String value) {
        this.entregaMercancia = value;
    }

    /**
     * Obtiene el valor de la propiedad cumpleReqFiscales.
     * 
     */
    public boolean isCumpleReqFiscales() {
        return cumpleReqFiscales;
    }

    /**
     * Define el valor de la propiedad cumpleReqFiscales.
     * 
     */
    public void setCumpleReqFiscales(boolean value) {
        this.cumpleReqFiscales = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadBultos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadBultos() {
        return cantidadBultos;
    }

    /**
     * Define el valor de la propiedad cantidadBultos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadBultos(String value) {
        this.cantidadBultos = value;
    }

    /**
     * Obtiene el valor de la propiedad subtotal.
     * 
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * Define el valor de la propiedad subtotal.
     * 
     */
    public void setSubtotal(double value) {
        this.subtotal = value;
    }

    /**
     * Obtiene el valor de la propiedad descuentos.
     * 
     */
    public double getDescuentos() {
        return descuentos;
    }

    /**
     * Define el valor de la propiedad descuentos.
     * 
     */
    public void setDescuentos(double value) {
        this.descuentos = value;
    }

    /**
     * Obtiene el valor de la propiedad ieps.
     * 
     */
    public double getIEPS() {
        return ieps;
    }

    /**
     * Define el valor de la propiedad ieps.
     * 
     */
    public void setIEPS(double value) {
        this.ieps = value;
    }

    /**
     * Obtiene el valor de la propiedad iva.
     * 
     */
    public double getIVA() {
        return iva;
    }

    /**
     * Define el valor de la propiedad iva.
     * 
     */
    public void setIVA(double value) {
        this.iva = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosImpuestos.
     * 
     */
    public double getOtrosImpuestos() {
        return otrosImpuestos;
    }

    /**
     * Define el valor de la propiedad otrosImpuestos.
     * 
     */
    public void setOtrosImpuestos(double value) {
        this.otrosImpuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public double getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(double value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadPedidos.
     * 
     */
    public double getCantidadPedidos() {
        return cantidadPedidos;
    }

    /**
     * Define el valor de la propiedad cantidadPedidos.
     * 
     */
    public void setCantidadPedidos(double value) {
        this.cantidadPedidos = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEntregaMercancia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEntregaMercancia() {
        return fechaEntregaMercancia;
    }

    /**
     * Define el valor de la propiedad fechaEntregaMercancia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEntregaMercancia(XMLGregorianCalendar value) {
        this.fechaEntregaMercancia = value;
    }

    /**
     * Obtiene el valor de la propiedad cita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCita() {
        return cita;
    }

    /**
     * Define el valor de la propiedad cita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCita(String value) {
        this.cita = value;
    }

}
