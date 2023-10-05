
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Totales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Totales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FctConv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MntBase" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MntExe" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MntImp" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MntDcto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="VlrPagar" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="VlrPalabras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Totales", propOrder = {
    "moneda",
    "fctConv",
    "subTotal",
    "mntBase",
    "mntExe",
    "mntImp",
    "mntDcto",
    "vlrPagar",
    "vlrPalabras"
})
public class Totales {

    @XmlElement(name = "Moneda")
    protected String moneda;
    @XmlElement(name = "FctConv")
    protected String fctConv;
    @XmlElement(name = "SubTotal")
    protected double subTotal;
    @XmlElement(name = "MntBase")
    protected double mntBase;
    @XmlElement(name = "MntExe")
    protected double mntExe;
    @XmlElement(name = "MntImp")
    protected double mntImp;
    @XmlElement(name = "MntDcto")
    protected double mntDcto;
    @XmlElement(name = "VlrPagar")
    protected double vlrPagar;
    @XmlElement(name = "VlrPalabras")
    protected String vlrPalabras;

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad fctConv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFctConv() {
        return fctConv;
    }

    /**
     * Define el valor de la propiedad fctConv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFctConv(String value) {
        this.fctConv = value;
    }

    /**
     * Obtiene el valor de la propiedad subTotal.
     * 
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * Define el valor de la propiedad subTotal.
     * 
     */
    public void setSubTotal(double value) {
        this.subTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad mntBase.
     * 
     */
    public double getMntBase() {
        return mntBase;
    }

    /**
     * Define el valor de la propiedad mntBase.
     * 
     */
    public void setMntBase(double value) {
        this.mntBase = value;
    }

    /**
     * Obtiene el valor de la propiedad mntExe.
     * 
     */
    public double getMntExe() {
        return mntExe;
    }

    /**
     * Define el valor de la propiedad mntExe.
     * 
     */
    public void setMntExe(double value) {
        this.mntExe = value;
    }

    /**
     * Obtiene el valor de la propiedad mntImp.
     * 
     */
    public double getMntImp() {
        return mntImp;
    }

    /**
     * Define el valor de la propiedad mntImp.
     * 
     */
    public void setMntImp(double value) {
        this.mntImp = value;
    }

    /**
     * Obtiene el valor de la propiedad mntDcto.
     * 
     */
    public double getMntDcto() {
        return mntDcto;
    }

    /**
     * Define el valor de la propiedad mntDcto.
     * 
     */
    public void setMntDcto(double value) {
        this.mntDcto = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrPagar.
     * 
     */
    public double getVlrPagar() {
        return vlrPagar;
    }

    /**
     * Define el valor de la propiedad vlrPagar.
     * 
     */
    public void setVlrPagar(double value) {
        this.vlrPagar = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrPalabras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlrPalabras() {
        return vlrPalabras;
    }

    /**
     * Define el valor de la propiedad vlrPalabras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlrPalabras(String value) {
        this.vlrPalabras = value;
    }

}
