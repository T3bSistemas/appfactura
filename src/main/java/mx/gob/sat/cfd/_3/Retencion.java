
package mx.gob.sat.cfd._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Retencion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Retencion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Base" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="Impuesto" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TipoFactor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TasaOCuota" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="Importe" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Retencion")
public class Retencion {

    @XmlAttribute(name = "Base", required = true)
    protected BigDecimal base;
    @XmlAttribute(name = "Impuesto")
    protected String impuesto;
    @XmlAttribute(name = "TipoFactor")
    protected String tipoFactor;
    @XmlAttribute(name = "TasaOCuota", required = true)
    protected BigDecimal tasaOCuota;
    @XmlAttribute(name = "Importe", required = true)
    protected BigDecimal importe;

    /**
     * Obtiene el valor de la propiedad base.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBase() {
        return base;
    }

    /**
     * Define el valor de la propiedad base.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBase(BigDecimal value) {
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
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasaOCuota() {
        return tasaOCuota;
    }

    /**
     * Define el valor de la propiedad tasaOCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasaOCuota(BigDecimal value) {
        this.tasaOCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporte(BigDecimal value) {
        this.importe = value;
    }

}
