
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosConstanciaRetencion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosConstanciaRetencion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LugarExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ClaveRetenciones" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DescripcionRetencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MesInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MesFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ejercicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MontoTotalOperacion" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MontoTotalGravado" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MontoTotalExento" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MontoTotalRetenciones" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="UtilidadBimestral" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ISRCorrespondiente" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DatosAdicionales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MensajePDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosConstanciaRetencion", propOrder = {
    "fechaExpedicion",
    "lugarExpedicion",
    "folio",
    "claveRetenciones",
    "descripcionRetencion",
    "mesInicial",
    "mesFin",
    "ejercicio",
    "montoTotalOperacion",
    "montoTotalGravado",
    "montoTotalExento",
    "montoTotalRetenciones",
    "utilidadBimestral",
    "isrCorrespondiente",
    "datosAdicionales",
    "mensajePDF"
})
public class DatosConstanciaRetencion {

    @XmlElement(name = "FechaExpedicion")
    protected String fechaExpedicion;
    @XmlElement(name = "LugarExpedicion")
    protected String lugarExpedicion;
    @XmlElement(name = "Folio")
    protected int folio;
    @XmlElement(name = "ClaveRetenciones")
    protected int claveRetenciones;
    @XmlElement(name = "DescripcionRetencion")
    protected String descripcionRetencion;
    @XmlElement(name = "MesInicial")
    protected String mesInicial;
    @XmlElement(name = "MesFin")
    protected String mesFin;
    @XmlElement(name = "Ejercicio")
    protected String ejercicio;
    @XmlElement(name = "MontoTotalOperacion")
    protected double montoTotalOperacion;
    @XmlElement(name = "MontoTotalGravado")
    protected double montoTotalGravado;
    @XmlElement(name = "MontoTotalExento")
    protected double montoTotalExento;
    @XmlElement(name = "MontoTotalRetenciones")
    protected double montoTotalRetenciones;
    @XmlElement(name = "UtilidadBimestral")
    protected double utilidadBimestral;
    @XmlElement(name = "ISRCorrespondiente")
    protected double isrCorrespondiente;
    @XmlElement(name = "DatosAdicionales")
    protected String datosAdicionales;
    @XmlElement(name = "MensajePDF")
    protected String mensajePDF;

    /**
     * Obtiene el valor de la propiedad fechaExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Define el valor de la propiedad fechaExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicion(String value) {
        this.fechaExpedicion = value;
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
     * Obtiene el valor de la propiedad folio.
     * 
     */
    public int getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     */
    public void setFolio(int value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad claveRetenciones.
     * 
     */
    public int getClaveRetenciones() {
        return claveRetenciones;
    }

    /**
     * Define el valor de la propiedad claveRetenciones.
     * 
     */
    public void setClaveRetenciones(int value) {
        this.claveRetenciones = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionRetencion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionRetencion() {
        return descripcionRetencion;
    }

    /**
     * Define el valor de la propiedad descripcionRetencion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionRetencion(String value) {
        this.descripcionRetencion = value;
    }

    /**
     * Obtiene el valor de la propiedad mesInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesInicial() {
        return mesInicial;
    }

    /**
     * Define el valor de la propiedad mesInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesInicial(String value) {
        this.mesInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad mesFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesFin() {
        return mesFin;
    }

    /**
     * Define el valor de la propiedad mesFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesFin(String value) {
        this.mesFin = value;
    }

    /**
     * Obtiene el valor de la propiedad ejercicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEjercicio() {
        return ejercicio;
    }

    /**
     * Define el valor de la propiedad ejercicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEjercicio(String value) {
        this.ejercicio = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalOperacion.
     * 
     */
    public double getMontoTotalOperacion() {
        return montoTotalOperacion;
    }

    /**
     * Define el valor de la propiedad montoTotalOperacion.
     * 
     */
    public void setMontoTotalOperacion(double value) {
        this.montoTotalOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalGravado.
     * 
     */
    public double getMontoTotalGravado() {
        return montoTotalGravado;
    }

    /**
     * Define el valor de la propiedad montoTotalGravado.
     * 
     */
    public void setMontoTotalGravado(double value) {
        this.montoTotalGravado = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalExento.
     * 
     */
    public double getMontoTotalExento() {
        return montoTotalExento;
    }

    /**
     * Define el valor de la propiedad montoTotalExento.
     * 
     */
    public void setMontoTotalExento(double value) {
        this.montoTotalExento = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalRetenciones.
     * 
     */
    public double getMontoTotalRetenciones() {
        return montoTotalRetenciones;
    }

    /**
     * Define el valor de la propiedad montoTotalRetenciones.
     * 
     */
    public void setMontoTotalRetenciones(double value) {
        this.montoTotalRetenciones = value;
    }

    /**
     * Obtiene el valor de la propiedad utilidadBimestral.
     * 
     */
    public double getUtilidadBimestral() {
        return utilidadBimestral;
    }

    /**
     * Define el valor de la propiedad utilidadBimestral.
     * 
     */
    public void setUtilidadBimestral(double value) {
        this.utilidadBimestral = value;
    }

    /**
     * Obtiene el valor de la propiedad isrCorrespondiente.
     * 
     */
    public double getISRCorrespondiente() {
        return isrCorrespondiente;
    }

    /**
     * Define el valor de la propiedad isrCorrespondiente.
     * 
     */
    public void setISRCorrespondiente(double value) {
        this.isrCorrespondiente = value;
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

}
