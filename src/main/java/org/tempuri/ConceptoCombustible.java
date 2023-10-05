
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ConceptoCombustible complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConceptoCombustible"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ClaveEstacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FolioOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Importe" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="NombreCombustible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCombustible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValorUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TrasladosCombustibles" type="{http://tempuri.org/}ArrayOfTrasladoCombustible" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptoCombustible", propOrder = {
    "cantidad",
    "claveEstacion",
    "fecha",
    "folioOperacion",
    "identificador",
    "importe",
    "nombreCombustible",
    "rfc",
    "tipoCombustible",
    "valorUnitario",
    "trasladosCombustibles"
})
public class ConceptoCombustible {

    @XmlElement(name = "Cantidad")
    protected double cantidad;
    @XmlElement(name = "ClaveEstacion")
    protected String claveEstacion;
    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "FolioOperacion")
    protected String folioOperacion;
    @XmlElement(name = "Identificador")
    protected String identificador;
    @XmlElement(name = "Importe")
    protected double importe;
    @XmlElement(name = "NombreCombustible")
    protected String nombreCombustible;
    @XmlElement(name = "Rfc")
    protected String rfc;
    @XmlElement(name = "TipoCombustible")
    protected String tipoCombustible;
    @XmlElement(name = "ValorUnitario")
    protected double valorUnitario;
    @XmlElement(name = "TrasladosCombustibles")
    protected ArrayOfTrasladoCombustible trasladosCombustibles;

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
     * Obtiene el valor de la propiedad claveEstacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveEstacion() {
        return claveEstacion;
    }

    /**
     * Define el valor de la propiedad claveEstacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveEstacion(String value) {
        this.claveEstacion = value;
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
     * Obtiene el valor de la propiedad folioOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioOperacion() {
        return folioOperacion;
    }

    /**
     * Define el valor de la propiedad folioOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioOperacion(String value) {
        this.folioOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad identificador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Define el valor de la propiedad identificador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificador(String value) {
        this.identificador = value;
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
     * Obtiene el valor de la propiedad nombreCombustible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCombustible() {
        return nombreCombustible;
    }

    /**
     * Define el valor de la propiedad nombreCombustible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCombustible(String value) {
        this.nombreCombustible = value;
    }

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc(String value) {
        this.rfc = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCombustible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    /**
     * Define el valor de la propiedad tipoCombustible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCombustible(String value) {
        this.tipoCombustible = value;
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
     * Obtiene el valor de la propiedad trasladosCombustibles.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrasladoCombustible }
     *     
     */
    public ArrayOfTrasladoCombustible getTrasladosCombustibles() {
        return trasladosCombustibles;
    }

    /**
     * Define el valor de la propiedad trasladosCombustibles.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrasladoCombustible }
     *     
     */
    public void setTrasladosCombustibles(ArrayOfTrasladoCombustible value) {
        this.trasladosCombustibles = value;
    }

}
