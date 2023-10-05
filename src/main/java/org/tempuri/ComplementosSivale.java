
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ComplementosSivale complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComplementosSivale"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ConceptosMonedero" type="{http://tempuri.org/}ConceptosMonedero" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplementosSivale", propOrder = {
    "tipoOperacion",
    "noCuenta",
    "total",
    "conceptosMonedero"
})
public class ComplementosSivale {

    @XmlElement(name = "TipoOperacion")
    protected String tipoOperacion;
    @XmlElement(name = "NoCuenta")
    protected String noCuenta;
    @XmlElement(name = "Total")
    protected double total;
    @XmlElement(name = "ConceptosMonedero")
    protected ConceptosMonedero conceptosMonedero;

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
     * Obtiene el valor de la propiedad noCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCuenta() {
        return noCuenta;
    }

    /**
     * Define el valor de la propiedad noCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCuenta(String value) {
        this.noCuenta = value;
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
     * Obtiene el valor de la propiedad conceptosMonedero.
     * 
     * @return
     *     possible object is
     *     {@link ConceptosMonedero }
     *     
     */
    public ConceptosMonedero getConceptosMonedero() {
        return conceptosMonedero;
    }

    /**
     * Define el valor de la propiedad conceptosMonedero.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptosMonedero }
     *     
     */
    public void setConceptosMonedero(ConceptosMonedero value) {
        this.conceptosMonedero = value;
    }

}
