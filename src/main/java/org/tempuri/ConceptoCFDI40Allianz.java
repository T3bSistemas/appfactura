
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConceptoCFDI40Allianz complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConceptoCFDI40Allianz"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaveProdServ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ClaveUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Unidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValorUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Importe" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Descuento" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ObjetoImp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatosAdicionales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Traslados" type="{http://tempuri.org/}ArrayOfImpuestoTrasladado40" minOccurs="0"/&gt;
 *         &lt;element name="Retenciones" type="{http://tempuri.org/}ArrayOfImpuestoRetenido40" minOccurs="0"/&gt;
 *         &lt;element name="InformacionAduana" type="{http://tempuri.org/}ArrayOfInformacionAduanera40" minOccurs="0"/&gt;
 *         &lt;element name="ACuentaTerceros" type="{http://tempuri.org/}ACuentaTerceros" minOccurs="0"/&gt;
 *         &lt;element name="Predial" type="{http://tempuri.org/}CuentaPredial40" minOccurs="0"/&gt;
 *         &lt;element name="Parte" type="{http://tempuri.org/}ArrayOfParte40" minOccurs="0"/&gt;
 *         &lt;element name="ComplementosConceptos" type="{http://tempuri.org/}ComplementosConcepto40" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptoCFDI40Allianz", propOrder = {
    "claveProdServ",
    "noIdentificacion",
    "cantidad",
    "claveUnidad",
    "unidad",
    "descripcion",
    "valorUnitario",
    "importe",
    "descuento",
    "objetoImp",
    "datosAdicionales",
    "traslados",
    "retenciones",
    "informacionAduana",
    "aCuentaTerceros",
    "predial",
    "parte",
    "complementosConceptos"
})
public class ConceptoCFDI40Allianz {

    @XmlElement(name = "ClaveProdServ")
    protected String claveProdServ;
    @XmlElement(name = "NoIdentificacion")
    protected String noIdentificacion;
    @XmlElement(name = "Cantidad")
    protected double cantidad;
    @XmlElement(name = "ClaveUnidad")
    protected String claveUnidad;
    @XmlElement(name = "Unidad")
    protected String unidad;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "ValorUnitario")
    protected double valorUnitario;
    @XmlElement(name = "Importe")
    protected double importe;
    @XmlElement(name = "Descuento")
    protected double descuento;
    @XmlElement(name = "ObjetoImp")
    protected String objetoImp;
    @XmlElement(name = "DatosAdicionales")
    protected String datosAdicionales;
    @XmlElement(name = "Traslados")
    protected ArrayOfImpuestoTrasladado40 traslados;
    @XmlElement(name = "Retenciones")
    protected ArrayOfImpuestoRetenido40 retenciones;
    @XmlElement(name = "InformacionAduana")
    protected ArrayOfInformacionAduanera40 informacionAduana;
    @XmlElement(name = "ACuentaTerceros")
    protected ACuentaTerceros aCuentaTerceros;
    @XmlElement(name = "Predial")
    protected CuentaPredial40 predial;
    @XmlElement(name = "Parte")
    protected ArrayOfParte40 parte;
    @XmlElement(name = "ComplementosConceptos")
    protected ComplementosConcepto40 complementosConceptos;

    /**
     * Obtiene el valor de la propiedad claveProdServ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveProdServ() {
        return claveProdServ;
    }

    /**
     * Define el valor de la propiedad claveProdServ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveProdServ(String value) {
        this.claveProdServ = value;
    }

    /**
     * Obtiene el valor de la propiedad noIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoIdentificacion() {
        return noIdentificacion;
    }

    /**
     * Define el valor de la propiedad noIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoIdentificacion(String value) {
        this.noIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(double value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad claveUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveUnidad() {
        return claveUnidad;
    }

    /**
     * Define el valor de la propiedad claveUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveUnidad(String value) {
        this.claveUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad unidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * Define el valor de la propiedad unidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidad(String value) {
        this.unidad = value;
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
     * Obtiene el valor de la propiedad valorUnitario.
     * 
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Define el valor de la propiedad valorUnitario.
     * 
     */
    public void setValorUnitario(double value) {
        this.valorUnitario = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     */
    public void setImporte(double value) {
        this.importe = value;
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
     * Obtiene el valor de la propiedad objetoImp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjetoImp() {
        return objetoImp;
    }

    /**
     * Define el valor de la propiedad objetoImp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjetoImp(String value) {
        this.objetoImp = value;
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
     * Obtiene el valor de la propiedad traslados.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImpuestoTrasladado40 }
     *     
     */
    public ArrayOfImpuestoTrasladado40 getTraslados() {
        return traslados;
    }

    /**
     * Define el valor de la propiedad traslados.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImpuestoTrasladado40 }
     *     
     */
    public void setTraslados(ArrayOfImpuestoTrasladado40 value) {
        this.traslados = value;
    }

    /**
     * Obtiene el valor de la propiedad retenciones.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImpuestoRetenido40 }
     *     
     */
    public ArrayOfImpuestoRetenido40 getRetenciones() {
        return retenciones;
    }

    /**
     * Define el valor de la propiedad retenciones.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImpuestoRetenido40 }
     *     
     */
    public void setRetenciones(ArrayOfImpuestoRetenido40 value) {
        this.retenciones = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionAduana.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInformacionAduanera40 }
     *     
     */
    public ArrayOfInformacionAduanera40 getInformacionAduana() {
        return informacionAduana;
    }

    /**
     * Define el valor de la propiedad informacionAduana.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInformacionAduanera40 }
     *     
     */
    public void setInformacionAduana(ArrayOfInformacionAduanera40 value) {
        this.informacionAduana = value;
    }

    /**
     * Obtiene el valor de la propiedad aCuentaTerceros.
     * 
     * @return
     *     possible object is
     *     {@link ACuentaTerceros }
     *     
     */
    public ACuentaTerceros getACuentaTerceros() {
        return aCuentaTerceros;
    }

    /**
     * Define el valor de la propiedad aCuentaTerceros.
     * 
     * @param value
     *     allowed object is
     *     {@link ACuentaTerceros }
     *     
     */
    public void setACuentaTerceros(ACuentaTerceros value) {
        this.aCuentaTerceros = value;
    }

    /**
     * Obtiene el valor de la propiedad predial.
     * 
     * @return
     *     possible object is
     *     {@link CuentaPredial40 }
     *     
     */
    public CuentaPredial40 getPredial() {
        return predial;
    }

    /**
     * Define el valor de la propiedad predial.
     * 
     * @param value
     *     allowed object is
     *     {@link CuentaPredial40 }
     *     
     */
    public void setPredial(CuentaPredial40 value) {
        this.predial = value;
    }

    /**
     * Obtiene el valor de la propiedad parte.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParte40 }
     *     
     */
    public ArrayOfParte40 getParte() {
        return parte;
    }

    /**
     * Define el valor de la propiedad parte.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParte40 }
     *     
     */
    public void setParte(ArrayOfParte40 value) {
        this.parte = value;
    }

    /**
     * Obtiene el valor de la propiedad complementosConceptos.
     * 
     * @return
     *     possible object is
     *     {@link ComplementosConcepto40 }
     *     
     */
    public ComplementosConcepto40 getComplementosConceptos() {
        return complementosConceptos;
    }

    /**
     * Define el valor de la propiedad complementosConceptos.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementosConcepto40 }
     *     
     */
    public void setComplementosConceptos(ComplementosConcepto40 value) {
        this.complementosConceptos = value;
    }

}
