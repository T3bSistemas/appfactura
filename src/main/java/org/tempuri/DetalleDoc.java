
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DetalleDoc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleDoc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NroLinDet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CdgItem" type="{http://tempuri.org/}CdgItem" minOccurs="0"/&gt;
 *         &lt;element name="DscLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClaveProdServ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DscItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QtyItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClaveUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnmdItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrcBrutoItem" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="PrcNetoItem" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="MontoNetoItem" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleDoc", propOrder = {
    "nroLinDet",
    "cdgItem",
    "dscLang",
    "claveProdServ",
    "dscItem",
    "qtyItem",
    "claveUnidad",
    "unmdItem",
    "prcBrutoItem",
    "prcNetoItem",
    "montoNetoItem"
})
public class DetalleDoc {

    @XmlElement(name = "NroLinDet")
    protected String nroLinDet;
    @XmlElement(name = "CdgItem")
    protected CdgItem cdgItem;
    @XmlElement(name = "DscLang")
    protected String dscLang;
    @XmlElement(name = "ClaveProdServ")
    protected String claveProdServ;
    @XmlElement(name = "DscItem")
    protected String dscItem;
    @XmlElement(name = "QtyItem")
    protected String qtyItem;
    @XmlElement(name = "ClaveUnidad")
    protected String claveUnidad;
    @XmlElement(name = "UnmdItem")
    protected String unmdItem;
    @XmlElement(name = "PrcBrutoItem")
    protected double prcBrutoItem;
    @XmlElement(name = "PrcNetoItem")
    protected double prcNetoItem;
    @XmlElement(name = "MontoNetoItem")
    protected double montoNetoItem;

    /**
     * Obtiene el valor de la propiedad nroLinDet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroLinDet() {
        return nroLinDet;
    }

    /**
     * Define el valor de la propiedad nroLinDet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroLinDet(String value) {
        this.nroLinDet = value;
    }

    /**
     * Obtiene el valor de la propiedad cdgItem.
     * 
     * @return
     *     possible object is
     *     {@link CdgItem }
     *     
     */
    public CdgItem getCdgItem() {
        return cdgItem;
    }

    /**
     * Define el valor de la propiedad cdgItem.
     * 
     * @param value
     *     allowed object is
     *     {@link CdgItem }
     *     
     */
    public void setCdgItem(CdgItem value) {
        this.cdgItem = value;
    }

    /**
     * Obtiene el valor de la propiedad dscLang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscLang() {
        return dscLang;
    }

    /**
     * Define el valor de la propiedad dscLang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscLang(String value) {
        this.dscLang = value;
    }

    /**
     * Obtiene el valor de la propiedad claveProdServ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveProdServ() {
        return claveProdServ;
    }

    /**
     * Define el valor de la propiedad claveProdServ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveProdServ(String value) {
        this.claveProdServ = value;
    }

    /**
     * Obtiene el valor de la propiedad dscItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscItem() {
        return dscItem;
    }

    /**
     * Define el valor de la propiedad dscItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscItem(String value) {
        this.dscItem = value;
    }

    /**
     * Obtiene el valor de la propiedad qtyItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtyItem() {
        return qtyItem;
    }

    /**
     * Define el valor de la propiedad qtyItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtyItem(String value) {
        this.qtyItem = value;
    }

    /**
     * Obtiene el valor de la propiedad claveUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveUnidad() {
        return claveUnidad;
    }

    /**
     * Define el valor de la propiedad claveUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveUnidad(String value) {
        this.claveUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad unmdItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnmdItem() {
        return unmdItem;
    }

    /**
     * Define el valor de la propiedad unmdItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnmdItem(String value) {
        this.unmdItem = value;
    }

    /**
     * Obtiene el valor de la propiedad prcBrutoItem.
     * 
     */
    public double getPrcBrutoItem() {
        return prcBrutoItem;
    }

    /**
     * Define el valor de la propiedad prcBrutoItem.
     * 
     */
    public void setPrcBrutoItem(double value) {
        this.prcBrutoItem = value;
    }

    /**
     * Obtiene el valor de la propiedad prcNetoItem.
     * 
     */
    public double getPrcNetoItem() {
        return prcNetoItem;
    }

    /**
     * Define el valor de la propiedad prcNetoItem.
     * 
     */
    public void setPrcNetoItem(double value) {
        this.prcNetoItem = value;
    }

    /**
     * Obtiene el valor de la propiedad montoNetoItem.
     * 
     */
    public double getMontoNetoItem() {
        return montoNetoItem;
    }

    /**
     * Define el valor de la propiedad montoNetoItem.
     * 
     */
    public void setMontoNetoItem(double value) {
        this.montoNetoItem = value;
    }

}
