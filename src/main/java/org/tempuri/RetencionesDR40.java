
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RetencionesDR40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RetencionesDR40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseDR" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ImpuestoDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoFactorDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TasaOCuotaDR" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ImporteDR" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetencionesDR40", propOrder = {
    "baseDR",
    "impuestoDR",
    "tipoFactorDR",
    "tasaOCuotaDR",
    "importeDR"
})
public class RetencionesDR40 {

    @XmlElement(name = "BaseDR")
    protected double baseDR;
    @XmlElement(name = "ImpuestoDR")
    protected String impuestoDR;
    @XmlElement(name = "TipoFactorDR")
    protected String tipoFactorDR;
    @XmlElement(name = "TasaOCuotaDR")
    protected double tasaOCuotaDR;
    @XmlElement(name = "ImporteDR")
    protected double importeDR;

    /**
     * Obtiene el valor de la propiedad baseDR.
     * 
     */
    public double getBaseDR() {
        return baseDR;
    }

    /**
     * Define el valor de la propiedad baseDR.
     * 
     */
    public void setBaseDR(double value) {
        this.baseDR = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestoDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpuestoDR() {
        return impuestoDR;
    }

    /**
     * Define el valor de la propiedad impuestoDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpuestoDR(String value) {
        this.impuestoDR = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFactorDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFactorDR() {
        return tipoFactorDR;
    }

    /**
     * Define el valor de la propiedad tipoFactorDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFactorDR(String value) {
        this.tipoFactorDR = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaOCuotaDR.
     * 
     */
    public double getTasaOCuotaDR() {
        return tasaOCuotaDR;
    }

    /**
     * Define el valor de la propiedad tasaOCuotaDR.
     * 
     */
    public void setTasaOCuotaDR(double value) {
        this.tasaOCuotaDR = value;
    }

    /**
     * Obtiene el valor de la propiedad importeDR.
     * 
     */
    public double getImporteDR() {
        return importeDR;
    }

    /**
     * Define el valor de la propiedad importeDR.
     * 
     */
    public void setImporteDR(double value) {
        this.importeDR = value;
    }

}
