
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SeparacionIndemnizacion33 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SeparacionIndemnizacion33"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalPagado" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="NumAniosServicio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UltimoSueldoMensOrd" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="IngresoAcumulable" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="IngresoNoAcumulable" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeparacionIndemnizacion33", propOrder = {
    "totalPagado",
    "numAniosServicio",
    "ultimoSueldoMensOrd",
    "ingresoAcumulable",
    "ingresoNoAcumulable"
})
public class SeparacionIndemnizacion33 {

    @XmlElement(name = "TotalPagado")
    protected double totalPagado;
    @XmlElement(name = "NumAniosServicio")
    protected int numAniosServicio;
    @XmlElement(name = "UltimoSueldoMensOrd")
    protected double ultimoSueldoMensOrd;
    @XmlElement(name = "IngresoAcumulable")
    protected double ingresoAcumulable;
    @XmlElement(name = "IngresoNoAcumulable")
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
     * Obtiene el valor de la propiedad numAniosServicio.
     * 
     */
    public int getNumAniosServicio() {
        return numAniosServicio;
    }

    /**
     * Define el valor de la propiedad numAniosServicio.
     * 
     */
    public void setNumAniosServicio(int value) {
        this.numAniosServicio = value;
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
