
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Mercancia20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Mercancia20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FraccionArancelaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CantidadAduana" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="UnidadAduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValorUnitarioAduana" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ValorDolares" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="DescripcionesEspecificas" type="{http://tempuri.org/}ArrayOfDescripcionEspecifica20" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mercancia20", propOrder = {
    "noIdentificacion",
    "fraccionArancelaria",
    "cantidadAduana",
    "unidadAduana",
    "valorUnitarioAduana",
    "valorDolares",
    "descripcionesEspecificas"
})
public class Mercancia20 {

    @XmlElement(name = "NoIdentificacion")
    protected String noIdentificacion;
    @XmlElement(name = "FraccionArancelaria")
    protected String fraccionArancelaria;
    @XmlElement(name = "CantidadAduana")
    protected double cantidadAduana;
    @XmlElement(name = "UnidadAduana")
    protected String unidadAduana;
    @XmlElement(name = "ValorUnitarioAduana")
    protected double valorUnitarioAduana;
    @XmlElement(name = "ValorDolares")
    protected double valorDolares;
    @XmlElement(name = "DescripcionesEspecificas")
    protected ArrayOfDescripcionEspecifica20 descripcionesEspecificas;

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
     * Obtiene el valor de la propiedad fraccionArancelaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraccionArancelaria() {
        return fraccionArancelaria;
    }

    /**
     * Define el valor de la propiedad fraccionArancelaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraccionArancelaria(String value) {
        this.fraccionArancelaria = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadAduana.
     * 
     */
    public double getCantidadAduana() {
        return cantidadAduana;
    }

    /**
     * Define el valor de la propiedad cantidadAduana.
     * 
     */
    public void setCantidadAduana(double value) {
        this.cantidadAduana = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadAduana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadAduana() {
        return unidadAduana;
    }

    /**
     * Define el valor de la propiedad unidadAduana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadAduana(String value) {
        this.unidadAduana = value;
    }

    /**
     * Obtiene el valor de la propiedad valorUnitarioAduana.
     * 
     */
    public double getValorUnitarioAduana() {
        return valorUnitarioAduana;
    }

    /**
     * Define el valor de la propiedad valorUnitarioAduana.
     * 
     */
    public void setValorUnitarioAduana(double value) {
        this.valorUnitarioAduana = value;
    }

    /**
     * Obtiene el valor de la propiedad valorDolares.
     * 
     */
    public double getValorDolares() {
        return valorDolares;
    }

    /**
     * Define el valor de la propiedad valorDolares.
     * 
     */
    public void setValorDolares(double value) {
        this.valorDolares = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionesEspecificas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDescripcionEspecifica20 }
     *     
     */
    public ArrayOfDescripcionEspecifica20 getDescripcionesEspecificas() {
        return descripcionesEspecificas;
    }

    /**
     * Define el valor de la propiedad descripcionesEspecificas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDescripcionEspecifica20 }
     *     
     */
    public void setDescripcionesEspecificas(ArrayOfDescripcionEspecifica20 value) {
        this.descripcionesEspecificas = value;
    }

}
