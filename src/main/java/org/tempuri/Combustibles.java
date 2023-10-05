
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Combustibles complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Combustibles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumeroDeCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConceptosCombustibles" type="{http://tempuri.org/}ArrayOfConceptoCombustible" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Combustibles", propOrder = {
    "numeroDeCuenta",
    "subTotal",
    "tipoOperacion",
    "total",
    "version",
    "conceptosCombustibles"
})
public class Combustibles {

    @XmlElement(name = "NumeroDeCuenta")
    protected String numeroDeCuenta;
    @XmlElement(name = "SubTotal")
    protected double subTotal;
    @XmlElement(name = "TipoOperacion")
    protected String tipoOperacion;
    @XmlElement(name = "Total")
    protected double total;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "ConceptosCombustibles")
    protected ArrayOfConceptoCombustible conceptosCombustibles;

    /**
     * Obtiene el valor de la propiedad numeroDeCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    /**
     * Define el valor de la propiedad numeroDeCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDeCuenta(String value) {
        this.numeroDeCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad subTotal.
     * 
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * Define el valor de la propiedad subTotal.
     * 
     */
    public void setSubTotal(double value) {
        this.subTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Define el valor de la propiedad tipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperacion(String value) {
        this.tipoOperacion = value;
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
     * Obtiene el valor de la propiedad conceptosCombustibles.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConceptoCombustible }
     *     
     */
    public ArrayOfConceptoCombustible getConceptosCombustibles() {
        return conceptosCombustibles;
    }

    /**
     * Define el valor de la propiedad conceptosCombustibles.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConceptoCombustible }
     *     
     */
    public void setConceptosCombustibles(ArrayOfConceptoCombustible value) {
        this.conceptosCombustibles = value;
    }

}
