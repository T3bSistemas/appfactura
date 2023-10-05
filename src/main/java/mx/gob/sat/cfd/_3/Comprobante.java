
package mx.gob.sat.cfd._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Comprobante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Comprobante"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CfdiRelacionados" type="{http://www.sat.gob.mx/cfd/3}CfdiRelacionados" minOccurs="0"/&gt;
 *         &lt;element name="Emisor" type="{http://www.sat.gob.mx/cfd/3}Emisor" minOccurs="0"/&gt;
 *         &lt;element name="Receptor" type="{http://www.sat.gob.mx/cfd/3}Receptor" minOccurs="0"/&gt;
 *         &lt;element name="Conceptos" type="{http://www.sat.gob.mx/cfd/3}Conceptos" minOccurs="0"/&gt;
 *         &lt;element name="Impuestos" type="{http://www.sat.gob.mx/cfd/3}Impuestos" minOccurs="0"/&gt;
 *         &lt;element name="Complemento" type="{http://www.sat.gob.mx/cfd/3}Complemento" minOccurs="0"/&gt;
 *         &lt;element name="MensajePDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatosAdicionales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Folio" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="Fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="Sello" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FormaPago" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NoCertificado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Certificado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SubTotal" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="Descuento" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Total" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TipoDeComprobante" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MetodoPago" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LugarExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Confirmacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{http://www.w3.org/2000/xmlns}xsi"/&gt;
 *       &lt;attribute name="cfdi" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{http://www.w3.org/2001/XMLSchema-instance/}schemaLocation"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Comprobante", propOrder = {
    "cfdiRelacionados",
    "emisor",
    "receptor",
    "conceptos",
    "impuestos",
    "complemento",
    "mensajePDF",
    "datosAdicionales"
})
public class Comprobante {

    @XmlElement(name = "CfdiRelacionados")
    protected CfdiRelacionados cfdiRelacionados;
    @XmlElement(name = "Emisor")
    protected Emisor emisor;
    @XmlElement(name = "Receptor")
    protected Receptor receptor;
    @XmlElement(name = "Conceptos")
    protected Conceptos conceptos;
    @XmlElement(name = "Impuestos")
    protected Impuestos impuestos;
    @XmlElement(name = "Complemento")
    protected Complemento complemento;
    @XmlElement(name = "MensajePDF")
    protected String mensajePDF;
    @XmlElement(name = "DatosAdicionales")
    protected String datosAdicionales;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "Serie")
    protected String serie;
    @XmlAttribute(name = "Folio", required = true)
    protected long folio;
    @XmlAttribute(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlAttribute(name = "Sello")
    protected String sello;
    @XmlAttribute(name = "FormaPago")
    protected String formaPago;
    @XmlAttribute(name = "NoCertificado")
    protected String noCertificado;
    @XmlAttribute(name = "Certificado")
    protected String certificado;
    @XmlAttribute(name = "SubTotal", required = true)
    protected BigDecimal subTotal;
    @XmlAttribute(name = "Descuento")
    protected String descuento;
    @XmlAttribute(name = "Moneda")
    protected String moneda;
    @XmlAttribute(name = "Total")
    protected String total;
    @XmlAttribute(name = "TipoDeComprobante")
    protected String tipoDeComprobante;
    @XmlAttribute(name = "MetodoPago")
    protected String metodoPago;
    @XmlAttribute(name = "LugarExpedicion")
    protected String lugarExpedicion;
    @XmlAttribute(name = "Confirmacion")
    protected String confirmacion;
    @XmlAttribute(name = "xsi", namespace = "http://www.w3.org/2000/xmlns")
    protected String xsi;
    @XmlAttribute(name = "cfdi")
    protected String cfdi;
    @XmlAttribute(name = "schemaLocation", namespace = "http://www.w3.org/2001/XMLSchema-instance/")
    protected String schemaLocation;

    /**
     * Obtiene el valor de la propiedad cfdiRelacionados.
     * 
     * @return
     *     possible object is
     *     {@link CfdiRelacionados }
     *     
     */
    public CfdiRelacionados getCfdiRelacionados() {
        return cfdiRelacionados;
    }

    /**
     * Define el valor de la propiedad cfdiRelacionados.
     * 
     * @param value
     *     allowed object is
     *     {@link CfdiRelacionados }
     *     
     */
    public void setCfdiRelacionados(CfdiRelacionados value) {
        this.cfdiRelacionados = value;
    }

    /**
     * Obtiene el valor de la propiedad emisor.
     * 
     * @return
     *     possible object is
     *     {@link Emisor }
     *     
     */
    public Emisor getEmisor() {
        return emisor;
    }

    /**
     * Define el valor de la propiedad emisor.
     * 
     * @param value
     *     allowed object is
     *     {@link Emisor }
     *     
     */
    public void setEmisor(Emisor value) {
        this.emisor = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link Receptor }
     *     
     */
    public Receptor getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link Receptor }
     *     
     */
    public void setReceptor(Receptor value) {
        this.receptor = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptos.
     * 
     * @return
     *     possible object is
     *     {@link Conceptos }
     *     
     */
    public Conceptos getConceptos() {
        return conceptos;
    }

    /**
     * Define el valor de la propiedad conceptos.
     * 
     * @param value
     *     allowed object is
     *     {@link Conceptos }
     *     
     */
    public void setConceptos(Conceptos value) {
        this.conceptos = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestos.
     * 
     * @return
     *     possible object is
     *     {@link Impuestos }
     *     
     */
    public Impuestos getImpuestos() {
        return impuestos;
    }

    /**
     * Define el valor de la propiedad impuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link Impuestos }
     *     
     */
    public void setImpuestos(Impuestos value) {
        this.impuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad complemento.
     * 
     * @return
     *     possible object is
     *     {@link Complemento }
     *     
     */
    public Complemento getComplemento() {
        return complemento;
    }

    /**
     * Define el valor de la propiedad complemento.
     * 
     * @param value
     *     allowed object is
     *     {@link Complemento }
     *     
     */
    public void setComplemento(Complemento value) {
        this.complemento = value;
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
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

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
     * Obtiene el valor de la propiedad sello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSello() {
        return sello;
    }

    /**
     * Define el valor de la propiedad sello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSello(String value) {
        this.sello = value;
    }

    /**
     * Obtiene el valor de la propiedad formaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Define el valor de la propiedad formaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPago(String value) {
        this.formaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad noCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCertificado() {
        return noCertificado;
    }

    /**
     * Define el valor de la propiedad noCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCertificado(String value) {
        this.noCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad certificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificado() {
        return certificado;
    }

    /**
     * Define el valor de la propiedad certificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificado(String value) {
        this.certificado = value;
    }

    /**
     * Obtiene el valor de la propiedad subTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    /**
     * Define el valor de la propiedad subTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubTotal(BigDecimal value) {
        this.subTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad descuento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescuento() {
        return descuento;
    }

    /**
     * Define el valor de la propiedad descuento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescuento(String value) {
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
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(String value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDeComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeComprobante() {
        return tipoDeComprobante;
    }

    /**
     * Define el valor de la propiedad tipoDeComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeComprobante(String value) {
        this.tipoDeComprobante = value;
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
     * Obtiene el valor de la propiedad lugarExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    /**
     * Define el valor de la propiedad lugarExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarExpedicion(String value) {
        this.lugarExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad confirmacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmacion() {
        return confirmacion;
    }

    /**
     * Define el valor de la propiedad confirmacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmacion(String value) {
        this.confirmacion = value;
    }

    /**
     * Obtiene el valor de la propiedad xsi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXsi() {
        return xsi;
    }

    /**
     * Define el valor de la propiedad xsi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXsi(String value) {
        this.xsi = value;
    }

    /**
     * Obtiene el valor de la propiedad cfdi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfdi() {
        return cfdi;
    }

    /**
     * Define el valor de la propiedad cfdi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfdi(String value) {
        this.cfdi = value;
    }

    /**
     * Obtiene el valor de la propiedad schemaLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaLocation() {
        return schemaLocation;
    }

    /**
     * Define el valor de la propiedad schemaLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaLocation(String value) {
        this.schemaLocation = value;
    }

}
