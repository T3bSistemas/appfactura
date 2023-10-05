
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Addendas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Addendas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Audi" type="{http://tempuri.org/}Audi" minOccurs="0"/&gt;
 *         &lt;element name="Ford" type="{http://tempuri.org/}Ford" minOccurs="0"/&gt;
 *         &lt;element name="Siedel" type="{http://tempuri.org/}Siedel" minOccurs="0"/&gt;
 *         &lt;element name="Soriana" type="{http://tempuri.org/}Soriana" minOccurs="0"/&gt;
 *         &lt;element name="VolksWagenPSV" type="{http://tempuri.org/}VolksWagen_PSV" minOccurs="0"/&gt;
 *         &lt;element name="Mabe" type="{http://tempuri.org/}Mabe" minOccurs="0"/&gt;
 *         &lt;element name="Sivale" type="{http://tempuri.org/}Sivale" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Addendas", propOrder = {
    "audi",
    "ford",
    "siedel",
    "soriana",
    "volksWagenPSV",
    "mabe",
    "sivale"
})
public class Addendas {

    @XmlElement(name = "Audi")
    protected Audi audi;
    @XmlElement(name = "Ford")
    protected Ford ford;
    @XmlElement(name = "Siedel")
    protected Siedel siedel;
    @XmlElement(name = "Soriana")
    protected Soriana soriana;
    @XmlElement(name = "VolksWagenPSV")
    protected VolksWagenPSV volksWagenPSV;
    @XmlElement(name = "Mabe")
    protected Mabe mabe;
    @XmlElement(name = "Sivale")
    protected Sivale sivale;

    /**
     * Obtiene el valor de la propiedad audi.
     * 
     * @return
     *     possible object is
     *     {@link Audi }
     *     
     */
    public Audi getAudi() {
        return audi;
    }

    /**
     * Define el valor de la propiedad audi.
     * 
     * @param value
     *     allowed object is
     *     {@link Audi }
     *     
     */
    public void setAudi(Audi value) {
        this.audi = value;
    }

    /**
     * Obtiene el valor de la propiedad ford.
     * 
     * @return
     *     possible object is
     *     {@link Ford }
     *     
     */
    public Ford getFord() {
        return ford;
    }

    /**
     * Define el valor de la propiedad ford.
     * 
     * @param value
     *     allowed object is
     *     {@link Ford }
     *     
     */
    public void setFord(Ford value) {
        this.ford = value;
    }

    /**
     * Obtiene el valor de la propiedad siedel.
     * 
     * @return
     *     possible object is
     *     {@link Siedel }
     *     
     */
    public Siedel getSiedel() {
        return siedel;
    }

    /**
     * Define el valor de la propiedad siedel.
     * 
     * @param value
     *     allowed object is
     *     {@link Siedel }
     *     
     */
    public void setSiedel(Siedel value) {
        this.siedel = value;
    }

    /**
     * Obtiene el valor de la propiedad soriana.
     * 
     * @return
     *     possible object is
     *     {@link Soriana }
     *     
     */
    public Soriana getSoriana() {
        return soriana;
    }

    /**
     * Define el valor de la propiedad soriana.
     * 
     * @param value
     *     allowed object is
     *     {@link Soriana }
     *     
     */
    public void setSoriana(Soriana value) {
        this.soriana = value;
    }

    /**
     * Obtiene el valor de la propiedad volksWagenPSV.
     * 
     * @return
     *     possible object is
     *     {@link VolksWagenPSV }
     *     
     */
    public VolksWagenPSV getVolksWagenPSV() {
        return volksWagenPSV;
    }

    /**
     * Define el valor de la propiedad volksWagenPSV.
     * 
     * @param value
     *     allowed object is
     *     {@link VolksWagenPSV }
     *     
     */
    public void setVolksWagenPSV(VolksWagenPSV value) {
        this.volksWagenPSV = value;
    }

    /**
     * Obtiene el valor de la propiedad mabe.
     * 
     * @return
     *     possible object is
     *     {@link Mabe }
     *     
     */
    public Mabe getMabe() {
        return mabe;
    }

    /**
     * Define el valor de la propiedad mabe.
     * 
     * @param value
     *     allowed object is
     *     {@link Mabe }
     *     
     */
    public void setMabe(Mabe value) {
        this.mabe = value;
    }

    /**
     * Obtiene el valor de la propiedad sivale.
     * 
     * @return
     *     possible object is
     *     {@link Sivale }
     *     
     */
    public Sivale getSivale() {
        return sivale;
    }

    /**
     * Define el valor de la propiedad sivale.
     * 
     * @param value
     *     allowed object is
     *     {@link Sivale }
     *     
     */
    public void setSivale(Sivale value) {
        this.sivale = value;
    }

}
