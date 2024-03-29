
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ImpuestoRetenido20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ImpuestoRetenido20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Base" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Impuesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoFactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TasaOCuota" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Importe" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpuestoRetenido20", propOrder = {
    "base",
    "impuesto",
    "tipoFactor",
    "tasaOCuota",
    "importe"
})
public class ImpuestoRetenido20 {

    @XmlElement(name = "Base")
    protected double base;
    @XmlElement(name = "Impuesto")
    protected String impuesto;
    @XmlElement(name = "TipoFactor")
    protected String tipoFactor;
    @XmlElement(name = "TasaOCuota")
    protected double tasaOCuota;
    @XmlElement(name = "Importe")
    protected double importe;

    /**
     * Obtiene el valor de la propiedad base.
     * 
     */
    public double getBase() {
        return base;
    }

    /**
     * Define el valor de la propiedad base.
     * 
     */
    public void setBase(double value) {
        this.base = value;
    }

    /**
     * Obtiene el valor de la propiedad impuesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpuesto() {
        return impuesto;
    }

    /**
     * Define el valor de la propiedad impuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpuesto(String value) {
        this.impuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFactor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFactor() {
        return tipoFactor;
    }

    /**
     * Define el valor de la propiedad tipoFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFactor(String value) {
        this.tipoFactor = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaOCuota.
     * 
     */
    public double getTasaOCuota() {
        return tasaOCuota;
    }

    /**
     * Define el valor de la propiedad tasaOCuota.
     * 
     */
    public void setTasaOCuota(double value) {
        this.tasaOCuota = value;
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

}
