
package mx.gob.sat.nomina12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SeparacionIndemnizacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SeparacionIndemnizacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TotalPagado" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="NumAñosServicio" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="UltimoSueldoMensOrd" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="IngresoAcumulable" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="IngresoNoAcumulable" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeparacionIndemnizacion")
public class SeparacionIndemnizacion {

    @XmlAttribute(name = "TotalPagado", required = true)
    protected double totalPagado;
    @XmlAttribute(name = "NumA\u00f1osServicio", required = true)
    protected long numAñosServicio;
    @XmlAttribute(name = "UltimoSueldoMensOrd", required = true)
    protected double ultimoSueldoMensOrd;
    @XmlAttribute(name = "IngresoAcumulable", required = true)
    protected double ingresoAcumulable;
    @XmlAttribute(name = "IngresoNoAcumulable", required = true)
    protected double ingresoNoAcumulable;

    /**
     * Obtiene el valor de la propiedad totalPagado.
     * 
     */
    public double getTotalPagado() {
        return totalPagado;
    }

    /**
     * Define el valor de la propiedad totalPagado.
     * 
     */
    public void setTotalPagado(double value) {
        this.totalPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad numAñosServicio.
     * 
     */
    public long getNumAñosServicio() {
        return numAñosServicio;
    }

    /**
     * Define el valor de la propiedad numAñosServicio.
     * 
     */
    public void setNumAñosServicio(long value) {
        this.numAñosServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad ultimoSueldoMensOrd.
     * 
     */
    public double getUltimoSueldoMensOrd() {
        return ultimoSueldoMensOrd;
    }

    /**
     * Define el valor de la propiedad ultimoSueldoMensOrd.
     * 
     */
    public void setUltimoSueldoMensOrd(double value) {
        this.ultimoSueldoMensOrd = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresoAcumulable.
     * 
     */
    public double getIngresoAcumulable() {
        return ingresoAcumulable;
    }

    /**
     * Define el valor de la propiedad ingresoAcumulable.
     * 
     */
    public void setIngresoAcumulable(double value) {
        this.ingresoAcumulable = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresoNoAcumulable.
     * 
     */
    public double getIngresoNoAcumulable() {
        return ingresoNoAcumulable;
    }

    /**
     * Define el valor de la propiedad ingresoNoAcumulable.
     * 
     */
    public void setIngresoNoAcumulable(double value) {
        this.ingresoNoAcumulable = value;
    }

}
