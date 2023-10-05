
package mx.gob.sat.nomina12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para JubilacionPensionRetiro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="JubilacionPensionRetiro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TotalUnaExhibicion" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="TotalParcialidad" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="MontoDiario" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="IngresoAcumulable" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="IngresoNoAcumulable" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JubilacionPensionRetiro")
public class JubilacionPensionRetiro {

    @XmlAttribute(name = "TotalUnaExhibicion", required = true)
    protected BigDecimal totalUnaExhibicion;
    @XmlAttribute(name = "TotalParcialidad", required = true)
    protected BigDecimal totalParcialidad;
    @XmlAttribute(name = "MontoDiario", required = true)
    protected BigDecimal montoDiario;
    @XmlAttribute(name = "IngresoAcumulable", required = true)
    protected BigDecimal ingresoAcumulable;
    @XmlAttribute(name = "IngresoNoAcumulable", required = true)
    protected BigDecimal ingresoNoAcumulable;

    /**
     * Obtiene el valor de la propiedad totalUnaExhibicion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalUnaExhibicion() {
        return totalUnaExhibicion;
    }

    /**
     * Define el valor de la propiedad totalUnaExhibicion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalUnaExhibicion(BigDecimal value) {
        this.totalUnaExhibicion = value;
    }

    /**
     * Obtiene el valor de la propiedad totalParcialidad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalParcialidad() {
        return totalParcialidad;
    }

    /**
     * Define el valor de la propiedad totalParcialidad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalParcialidad(BigDecimal value) {
        this.totalParcialidad = value;
    }

    /**
     * Obtiene el valor de la propiedad montoDiario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoDiario() {
        return montoDiario;
    }

    /**
     * Define el valor de la propiedad montoDiario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoDiario(BigDecimal value) {
        this.montoDiario = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresoAcumulable.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresoAcumulable() {
        return ingresoAcumulable;
    }

    /**
     * Define el valor de la propiedad ingresoAcumulable.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresoAcumulable(BigDecimal value) {
        this.ingresoAcumulable = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresoNoAcumulable.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresoNoAcumulable() {
        return ingresoNoAcumulable;
    }

    /**
     * Define el valor de la propiedad ingresoNoAcumulable.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresoNoAcumulable(BigDecimal value) {
        this.ingresoNoAcumulable = value;
    }

}
