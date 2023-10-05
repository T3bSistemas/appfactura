
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TrasladoCombustible complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TrasladoCombustible"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Importe" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Impuesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TasaOCuota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrasladoCombustible", propOrder = {
    "importe",
    "impuesto",
    "tasaOCuota"
})
public class TrasladoCombustible {

    @XmlElement(name = "Importe")
    protected double importe;
    @XmlElement(name = "Impuesto")
    protected String impuesto;
    @XmlElement(name = "TasaOCuota")
    protected String tasaOCuota;

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
     * Obtiene el valor de la propiedad tasaOCuota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTasaOCuota() {
        return tasaOCuota;
    }

    /**
     * Define el valor de la propiedad tasaOCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTasaOCuota(String value) {
        this.tasaOCuota = value;
    }

}
