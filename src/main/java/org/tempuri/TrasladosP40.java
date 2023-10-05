
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TrasladosP40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TrasladosP40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseP" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ImpuestoP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoFactorP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TasaOCuotaP" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ImporteP" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrasladosP40", propOrder = {
    "baseP",
    "impuestoP",
    "tipoFactorP",
    "tasaOCuotaP",
    "importeP"
})
public class TrasladosP40 {

    @XmlElement(name = "BaseP")
    protected double baseP;
    @XmlElement(name = "ImpuestoP")
    protected String impuestoP;
    @XmlElement(name = "TipoFactorP")
    protected String tipoFactorP;
    @XmlElement(name = "TasaOCuotaP")
    protected double tasaOCuotaP;
    @XmlElement(name = "ImporteP")
    protected double importeP;

    /**
     * Obtiene el valor de la propiedad baseP.
     * 
     */
    public double getBaseP() {
        return baseP;
    }

    /**
     * Define el valor de la propiedad baseP.
     * 
     */
    public void setBaseP(double value) {
        this.baseP = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestoP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpuestoP() {
        return impuestoP;
    }

    /**
     * Define el valor de la propiedad impuestoP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpuestoP(String value) {
        this.impuestoP = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFactorP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFactorP() {
        return tipoFactorP;
    }

    /**
     * Define el valor de la propiedad tipoFactorP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFactorP(String value) {
        this.tipoFactorP = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaOCuotaP.
     * 
     */
    public double getTasaOCuotaP() {
        return tasaOCuotaP;
    }

    /**
     * Define el valor de la propiedad tasaOCuotaP.
     * 
     */
    public void setTasaOCuotaP(double value) {
        this.tasaOCuotaP = value;
    }

    /**
     * Obtiene el valor de la propiedad importeP.
     * 
     */
    public double getImporteP() {
        return importeP;
    }

    /**
     * Define el valor de la propiedad importeP.
     * 
     */
    public void setImporteP(double value) {
        this.importeP = value;
    }

}
