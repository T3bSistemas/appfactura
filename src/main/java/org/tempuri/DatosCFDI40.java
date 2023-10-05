
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para DatosCFDI40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosCFDI40"&gt;
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
 *         &lt;element name="FechaExpedicionBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemisionBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessLocationBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuslodescripBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefTypeBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FiscalYearBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetPriceBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemperatureBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddendaBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CostcoBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaPedimentoBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlantaBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingConditionBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrganizationBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RFCIBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RAZONIBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REGIMENIBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PODate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FSDB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Soldto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shipto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShiptoName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShiptoAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShiptoCP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Texto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoPedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FolioBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DecimalesOfficeMax" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ImporteConcepto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CodigoConcepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "DatosCFDI40", propOrder = {
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
    "fechaExpedicionBP",
    "remisionBP",
    "businessLocationBP",
    "buslodescripBP",
    "companyBP",
    "refTypeBP",
    "fiscalYearBP",
    "streetPriceBP",
    "temperatureBP",
    "addendaBP",
    "costcoBP",
    "fechaPedimentoBP",
    "plantaBP",
    "shippingConditionBP",
    "salesOrganizationBP",
    "rfciber",
    "razoniber",
    "regimeniber",
    "poid",
    "poDate",
    "fsdb",
    "soldto",
    "shipto",
    "shiptoName",
    "shiptoAddress",
    "shiptoCP",
    "texto",
    "noPedido",
    "folioBP",
    "transaccion",
    "decimalesOfficeMax",
    "importeConcepto",
    "codigoConcepto",
    "complementos"
})
public class DatosCFDI40 {

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
    @XmlElement(name = "FechaExpedicionBP")
    protected String fechaExpedicionBP;
    @XmlElement(name = "RemisionBP")
    protected String remisionBP;
    @XmlElement(name = "BusinessLocationBP")
    protected String businessLocationBP;
    @XmlElement(name = "BuslodescripBP")
    protected String buslodescripBP;
    @XmlElement(name = "CompanyBP")
    protected String companyBP;
    @XmlElement(name = "RefTypeBP")
    protected String refTypeBP;
    @XmlElement(name = "FiscalYearBP")
    protected String fiscalYearBP;
    @XmlElement(name = "StreetPriceBP")
    protected String streetPriceBP;
    @XmlElement(name = "TemperatureBP")
    protected String temperatureBP;
    @XmlElement(name = "AddendaBP")
    protected String addendaBP;
    @XmlElement(name = "CostcoBP")
    protected String costcoBP;
    @XmlElement(name = "FechaPedimentoBP")
    protected String fechaPedimentoBP;
    @XmlElement(name = "PlantaBP")
    protected String plantaBP;
    @XmlElement(name = "ShippingConditionBP")
    protected String shippingConditionBP;
    @XmlElement(name = "SalesOrganizationBP")
    protected String salesOrganizationBP;
    @XmlElement(name = "RFCIBER")
    protected String rfciber;
    @XmlElement(name = "RAZONIBER")
    protected String razoniber;
    @XmlElement(name = "REGIMENIBER")
    protected String regimeniber;
    @XmlElement(name = "POID")
    protected String poid;
    @XmlElement(name = "PODate")
    protected String poDate;
    @XmlElement(name = "FSDB")
    protected String fsdb;
    @XmlElement(name = "Soldto")
    protected String soldto;
    @XmlElement(name = "Shipto")
    protected String shipto;
    @XmlElement(name = "ShiptoName")
    protected String shiptoName;
    @XmlElement(name = "ShiptoAddress")
    protected String shiptoAddress;
    @XmlElement(name = "ShiptoCP")
    protected String shiptoCP;
    @XmlElement(name = "Texto")
    protected String texto;
    @XmlElement(name = "NoPedido")
    protected String noPedido;
    @XmlElement(name = "FolioBP")
    protected String folioBP;
    @XmlElement(name = "Transaccion")
    protected String transaccion;
    @XmlElement(name = "DecimalesOfficeMax")
    protected boolean decimalesOfficeMax;
    @XmlElement(name = "ImporteConcepto")
    protected double importeConcepto;
    @XmlElement(name = "CodigoConcepto")
    protected String codigoConcepto;
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
     * Obtiene el valor de la propiedad fechaExpedicionBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicionBP() {
        return fechaExpedicionBP;
    }

    /**
     * Define el valor de la propiedad fechaExpedicionBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicionBP(String value) {
        this.fechaExpedicionBP = value;
    }

    /**
     * Obtiene el valor de la propiedad remisionBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemisionBP() {
        return remisionBP;
    }

    /**
     * Define el valor de la propiedad remisionBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemisionBP(String value) {
        this.remisionBP = value;
    }

    /**
     * Obtiene el valor de la propiedad businessLocationBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessLocationBP() {
        return businessLocationBP;
    }

    /**
     * Define el valor de la propiedad businessLocationBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessLocationBP(String value) {
        this.businessLocationBP = value;
    }

    /**
     * Obtiene el valor de la propiedad buslodescripBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuslodescripBP() {
        return buslodescripBP;
    }

    /**
     * Define el valor de la propiedad buslodescripBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuslodescripBP(String value) {
        this.buslodescripBP = value;
    }

    /**
     * Obtiene el valor de la propiedad companyBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyBP() {
        return companyBP;
    }

    /**
     * Define el valor de la propiedad companyBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyBP(String value) {
        this.companyBP = value;
    }

    /**
     * Obtiene el valor de la propiedad refTypeBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefTypeBP() {
        return refTypeBP;
    }

    /**
     * Define el valor de la propiedad refTypeBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefTypeBP(String value) {
        this.refTypeBP = value;
    }

    /**
     * Obtiene el valor de la propiedad fiscalYearBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalYearBP() {
        return fiscalYearBP;
    }

    /**
     * Define el valor de la propiedad fiscalYearBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalYearBP(String value) {
        this.fiscalYearBP = value;
    }

    /**
     * Obtiene el valor de la propiedad streetPriceBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetPriceBP() {
        return streetPriceBP;
    }

    /**
     * Define el valor de la propiedad streetPriceBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetPriceBP(String value) {
        this.streetPriceBP = value;
    }

    /**
     * Obtiene el valor de la propiedad temperatureBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperatureBP() {
        return temperatureBP;
    }

    /**
     * Define el valor de la propiedad temperatureBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperatureBP(String value) {
        this.temperatureBP = value;
    }

    /**
     * Obtiene el valor de la propiedad addendaBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddendaBP() {
        return addendaBP;
    }

    /**
     * Define el valor de la propiedad addendaBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddendaBP(String value) {
        this.addendaBP = value;
    }

    /**
     * Obtiene el valor de la propiedad costcoBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostcoBP() {
        return costcoBP;
    }

    /**
     * Define el valor de la propiedad costcoBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostcoBP(String value) {
        this.costcoBP = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPedimentoBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPedimentoBP() {
        return fechaPedimentoBP;
    }

    /**
     * Define el valor de la propiedad fechaPedimentoBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPedimentoBP(String value) {
        this.fechaPedimentoBP = value;
    }

    /**
     * Obtiene el valor de la propiedad plantaBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantaBP() {
        return plantaBP;
    }

    /**
     * Define el valor de la propiedad plantaBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantaBP(String value) {
        this.plantaBP = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingConditionBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingConditionBP() {
        return shippingConditionBP;
    }

    /**
     * Define el valor de la propiedad shippingConditionBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingConditionBP(String value) {
        this.shippingConditionBP = value;
    }

    /**
     * Obtiene el valor de la propiedad salesOrganizationBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrganizationBP() {
        return salesOrganizationBP;
    }

    /**
     * Define el valor de la propiedad salesOrganizationBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrganizationBP(String value) {
        this.salesOrganizationBP = value;
    }

    /**
     * Obtiene el valor de la propiedad rfciber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCIBER() {
        return rfciber;
    }

    /**
     * Define el valor de la propiedad rfciber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCIBER(String value) {
        this.rfciber = value;
    }

    /**
     * Obtiene el valor de la propiedad razoniber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAZONIBER() {
        return razoniber;
    }

    /**
     * Define el valor de la propiedad razoniber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAZONIBER(String value) {
        this.razoniber = value;
    }

    /**
     * Obtiene el valor de la propiedad regimeniber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGIMENIBER() {
        return regimeniber;
    }

    /**
     * Define el valor de la propiedad regimeniber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGIMENIBER(String value) {
        this.regimeniber = value;
    }

    /**
     * Obtiene el valor de la propiedad poid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOID() {
        return poid;
    }

    /**
     * Define el valor de la propiedad poid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOID(String value) {
        this.poid = value;
    }

    /**
     * Obtiene el valor de la propiedad poDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPODate() {
        return poDate;
    }

    /**
     * Define el valor de la propiedad poDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPODate(String value) {
        this.poDate = value;
    }

    /**
     * Obtiene el valor de la propiedad fsdb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSDB() {
        return fsdb;
    }

    /**
     * Define el valor de la propiedad fsdb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSDB(String value) {
        this.fsdb = value;
    }

    /**
     * Obtiene el valor de la propiedad soldto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldto() {
        return soldto;
    }

    /**
     * Define el valor de la propiedad soldto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldto(String value) {
        this.soldto = value;
    }

    /**
     * Obtiene el valor de la propiedad shipto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipto() {
        return shipto;
    }

    /**
     * Define el valor de la propiedad shipto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipto(String value) {
        this.shipto = value;
    }

    /**
     * Obtiene el valor de la propiedad shiptoName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShiptoName() {
        return shiptoName;
    }

    /**
     * Define el valor de la propiedad shiptoName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShiptoName(String value) {
        this.shiptoName = value;
    }

    /**
     * Obtiene el valor de la propiedad shiptoAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShiptoAddress() {
        return shiptoAddress;
    }

    /**
     * Define el valor de la propiedad shiptoAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShiptoAddress(String value) {
        this.shiptoAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad shiptoCP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShiptoCP() {
        return shiptoCP;
    }

    /**
     * Define el valor de la propiedad shiptoCP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShiptoCP(String value) {
        this.shiptoCP = value;
    }

    /**
     * Obtiene el valor de la propiedad texto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Define el valor de la propiedad texto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexto(String value) {
        this.texto = value;
    }

    /**
     * Obtiene el valor de la propiedad noPedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoPedido() {
        return noPedido;
    }

    /**
     * Define el valor de la propiedad noPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoPedido(String value) {
        this.noPedido = value;
    }

    /**
     * Obtiene el valor de la propiedad folioBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioBP() {
        return folioBP;
    }

    /**
     * Define el valor de la propiedad folioBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioBP(String value) {
        this.folioBP = value;
    }

    /**
     * Obtiene el valor de la propiedad transaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransaccion() {
        return transaccion;
    }

    /**
     * Define el valor de la propiedad transaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransaccion(String value) {
        this.transaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad decimalesOfficeMax.
     * 
     */
    public boolean isDecimalesOfficeMax() {
        return decimalesOfficeMax;
    }

    /**
     * Define el valor de la propiedad decimalesOfficeMax.
     * 
     */
    public void setDecimalesOfficeMax(boolean value) {
        this.decimalesOfficeMax = value;
    }

    /**
     * Obtiene el valor de la propiedad importeConcepto.
     * 
     */
    public double getImporteConcepto() {
        return importeConcepto;
    }

    /**
     * Define el valor de la propiedad importeConcepto.
     * 
     */
    public void setImporteConcepto(double value) {
        this.importeConcepto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoConcepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoConcepto() {
        return codigoConcepto;
    }

    /**
     * Define el valor de la propiedad codigoConcepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoConcepto(String value) {
        this.codigoConcepto = value;
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
