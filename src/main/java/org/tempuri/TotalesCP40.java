
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TotalesCP40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TotalesCP40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalRetencionesIVA" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalRetencionesISR" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalRetencionesIEPS" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalTrasladosBaseIVA16" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalTrasladosImpuestoIVA16" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalTrasladosBaseIVA8" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalTrasladosImpuestoIVA8" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalTrasladosBaseIVA0" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalTrasladosImpuestoIVA0" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalTrasladosBaseIVAExento" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MontoTotalPagos" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalTrasladosBaseExento" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalesCP40", propOrder = {
    "totalRetencionesIVA",
    "totalRetencionesISR",
    "totalRetencionesIEPS",
    "totalTrasladosBaseIVA16",
    "totalTrasladosImpuestoIVA16",
    "totalTrasladosBaseIVA8",
    "totalTrasladosImpuestoIVA8",
    "totalTrasladosBaseIVA0",
    "totalTrasladosImpuestoIVA0",
    "totalTrasladosBaseIVAExento",
    "montoTotalPagos",
    "totalTrasladosBaseExento"
})
public class TotalesCP40 {

    @XmlElement(name = "TotalRetencionesIVA")
    protected double totalRetencionesIVA;
    @XmlElement(name = "TotalRetencionesISR")
    protected double totalRetencionesISR;
    @XmlElement(name = "TotalRetencionesIEPS")
    protected double totalRetencionesIEPS;
    @XmlElement(name = "TotalTrasladosBaseIVA16")
    protected double totalTrasladosBaseIVA16;
    @XmlElement(name = "TotalTrasladosImpuestoIVA16")
    protected double totalTrasladosImpuestoIVA16;
    @XmlElement(name = "TotalTrasladosBaseIVA8")
    protected double totalTrasladosBaseIVA8;
    @XmlElement(name = "TotalTrasladosImpuestoIVA8")
    protected double totalTrasladosImpuestoIVA8;
    @XmlElement(name = "TotalTrasladosBaseIVA0")
    protected double totalTrasladosBaseIVA0;
    @XmlElement(name = "TotalTrasladosImpuestoIVA0")
    protected double totalTrasladosImpuestoIVA0;
    @XmlElement(name = "TotalTrasladosBaseIVAExento")
    protected double totalTrasladosBaseIVAExento;
    @XmlElement(name = "MontoTotalPagos")
    protected double montoTotalPagos;
    @XmlElement(name = "TotalTrasladosBaseExento")
    protected double totalTrasladosBaseExento;

    /**
     * Obtiene el valor de la propiedad totalRetencionesIVA.
     * 
     */
    public double getTotalRetencionesIVA() {
        return totalRetencionesIVA;
    }

    /**
     * Define el valor de la propiedad totalRetencionesIVA.
     * 
     */
    public void setTotalRetencionesIVA(double value) {
        this.totalRetencionesIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRetencionesISR.
     * 
     */
    public double getTotalRetencionesISR() {
        return totalRetencionesISR;
    }

    /**
     * Define el valor de la propiedad totalRetencionesISR.
     * 
     */
    public void setTotalRetencionesISR(double value) {
        this.totalRetencionesISR = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRetencionesIEPS.
     * 
     */
    public double getTotalRetencionesIEPS() {
        return totalRetencionesIEPS;
    }

    /**
     * Define el valor de la propiedad totalRetencionesIEPS.
     * 
     */
    public void setTotalRetencionesIEPS(double value) {
        this.totalRetencionesIEPS = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrasladosBaseIVA16.
     * 
     */
    public double getTotalTrasladosBaseIVA16() {
        return totalTrasladosBaseIVA16;
    }

    /**
     * Define el valor de la propiedad totalTrasladosBaseIVA16.
     * 
     */
    public void setTotalTrasladosBaseIVA16(double value) {
        this.totalTrasladosBaseIVA16 = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrasladosImpuestoIVA16.
     * 
     */
    public double getTotalTrasladosImpuestoIVA16() {
        return totalTrasladosImpuestoIVA16;
    }

    /**
     * Define el valor de la propiedad totalTrasladosImpuestoIVA16.
     * 
     */
    public void setTotalTrasladosImpuestoIVA16(double value) {
        this.totalTrasladosImpuestoIVA16 = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrasladosBaseIVA8.
     * 
     */
    public double getTotalTrasladosBaseIVA8() {
        return totalTrasladosBaseIVA8;
    }

    /**
     * Define el valor de la propiedad totalTrasladosBaseIVA8.
     * 
     */
    public void setTotalTrasladosBaseIVA8(double value) {
        this.totalTrasladosBaseIVA8 = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrasladosImpuestoIVA8.
     * 
     */
    public double getTotalTrasladosImpuestoIVA8() {
        return totalTrasladosImpuestoIVA8;
    }

    /**
     * Define el valor de la propiedad totalTrasladosImpuestoIVA8.
     * 
     */
    public void setTotalTrasladosImpuestoIVA8(double value) {
        this.totalTrasladosImpuestoIVA8 = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrasladosBaseIVA0.
     * 
     */
    public double getTotalTrasladosBaseIVA0() {
        return totalTrasladosBaseIVA0;
    }

    /**
     * Define el valor de la propiedad totalTrasladosBaseIVA0.
     * 
     */
    public void setTotalTrasladosBaseIVA0(double value) {
        this.totalTrasladosBaseIVA0 = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrasladosImpuestoIVA0.
     * 
     */
    public double getTotalTrasladosImpuestoIVA0() {
        return totalTrasladosImpuestoIVA0;
    }

    /**
     * Define el valor de la propiedad totalTrasladosImpuestoIVA0.
     * 
     */
    public void setTotalTrasladosImpuestoIVA0(double value) {
        this.totalTrasladosImpuestoIVA0 = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrasladosBaseIVAExento.
     * 
     */
    public double getTotalTrasladosBaseIVAExento() {
        return totalTrasladosBaseIVAExento;
    }

    /**
     * Define el valor de la propiedad totalTrasladosBaseIVAExento.
     * 
     */
    public void setTotalTrasladosBaseIVAExento(double value) {
        this.totalTrasladosBaseIVAExento = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalPagos.
     * 
     */
    public double getMontoTotalPagos() {
        return montoTotalPagos;
    }

    /**
     * Define el valor de la propiedad montoTotalPagos.
     * 
     */
    public void setMontoTotalPagos(double value) {
        this.montoTotalPagos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrasladosBaseExento.
     * 
     */
    public double getTotalTrasladosBaseExento() {
        return totalTrasladosBaseExento;
    }

    /**
     * Define el valor de la propiedad totalTrasladosBaseExento.
     * 
     */
    public void setTotalTrasladosBaseExento(double value) {
        this.totalTrasladosBaseExento = value;
    }

}
