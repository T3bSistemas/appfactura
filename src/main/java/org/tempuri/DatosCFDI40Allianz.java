
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para DatosCFDI40Allianz complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosCFDI40Allianz"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FormadePago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CondicionesDePago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Subtotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Descuento" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCambio" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TipodeComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MetodoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LugarDeExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Exportacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatosAdicionales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MensajePDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="complementos" type="{http://tempuri.org/}ComplementosCFDI40" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosCFDI40Allianz", propOrder = {
    "serie",
    "folio",
    "fecha",
    "formadePago",
    "condicionesDePago",
    "subtotal",
    "descuento",
    "moneda",
    "tipoCambio",
    "total",
    "tipodeComprobante",
    "metodoPago",
    "lugarDeExpedicion",
    "exportacion",
    "datosAdicionales",
    "mensajePDF",
    "emailMensaje",
    "complementos"
})
public class DatosCFDI40Allianz {

    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "Folio")
    protected long folio;
    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "FormadePago")
    protected String formadePago;
    @XmlElement(name = "CondicionesDePago")
    protected String condicionesDePago;
    @XmlElement(name = "Subtotal")
    protected double subtotal;
    @XmlElement(name = "Descuento")
    protected double descuento;
    @XmlElement(name = "Moneda")
    protected String moneda;
    @XmlElement(name = "TipoCambio")
    protected double tipoCambio;
    @XmlElement(name = "Total")
    protected double total;
    @XmlElement(name = "TipodeComprobante")
    protected String tipodeComprobante;
    @XmlElement(name = "MetodoPago")
    protected String metodoPago;
    @XmlElement(name = "LugarDeExpedicion")
    protected String lugarDeExpedicion;
    @XmlElement(name = "Exportacion")
    protected String exportacion;
    @XmlElement(name = "DatosAdicionales")
    protected String datosAdicionales;
    @XmlElement(name = "MensajePDF")
    protected String mensajePDF;
    @XmlElement(name = "EmailMensaje")
    protected String emailMensaje;
    protected ComplementosCFDI40 complementos;

    /**
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     */
    public long getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     */
    public void setFolio(long value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad formadePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormadePago() {
        return formadePago;
    }

    /**
     * Define el valor de la propiedad formadePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormadePago(String value) {
        this.formadePago = value;
    }

    /**
     * Obtiene el valor de la propiedad condicionesDePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionesDePago() {
        return condicionesDePago;
    }

    /**
     * Define el valor de la propiedad condicionesDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionesDePago(String value) {
        this.condicionesDePago = value;
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
     * Obtiene el valor de la propiedad descuento.
     * 
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * Define el valor de la propiedad descuento.
     * 
     */
    public void setDescuento(double value) {
        this.descuento = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambio.
     * 
     */
    public double getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Define el valor de la propiedad tipoCambio.
     * 
     */
    public void setTipoCambio(double value) {
        this.tipoCambio = value;
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
     * Obtiene el valor de la propiedad tipodeComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipodeComprobante() {
        return tipodeComprobante;
    }

    /**
     * Define el valor de la propiedad tipodeComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipodeComprobante(String value) {
        this.tipodeComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad metodoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodoPago() {
        return metodoPago;
    }

    /**
     * Define el valor de la propiedad metodoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodoPago(String value) {
        this.metodoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarDeExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarDeExpedicion() {
        return lugarDeExpedicion;
    }

    /**
     * Define el valor de la propiedad lugarDeExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarDeExpedicion(String value) {
        this.lugarDeExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad exportacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportacion() {
        return exportacion;
    }

    /**
     * Define el valor de la propiedad exportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportacion(String value) {
        this.exportacion = value;
    }

    /**
     * Obtiene el valor de la propiedad datosAdicionales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosAdicionales() {
        return datosAdicionales;
    }

    /**
     * Define el valor de la propiedad datosAdicionales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosAdicionales(String value) {
        this.datosAdicionales = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajePDF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajePDF() {
        return mensajePDF;
    }

    /**
     * Define el valor de la propiedad mensajePDF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajePDF(String value) {
        this.mensajePDF = value;
    }

    /**
     * Obtiene el valor de la propiedad emailMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailMensaje() {
        return emailMensaje;
    }

    /**
     * Define el valor de la propiedad emailMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailMensaje(String value) {
        this.emailMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad complementos.
     * 
     * @return
     *     possible object is
     *     {@link ComplementosCFDI40 }
     *     
     */
    public ComplementosCFDI40 getComplementos() {
        return complementos;
    }

    /**
     * Define el valor de la propiedad complementos.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementosCFDI40 }
     *     
     */
    public void setComplementos(ComplementosCFDI40 value) {
        this.complementos = value;
    }

}
