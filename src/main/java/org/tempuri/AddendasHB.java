
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Addendas_HB complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Addendas_HB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CasaLey" type="{http://tempuri.org/}CasaLey" minOccurs="0"/&gt;
 *         &lt;element name="Costco" type="{http://tempuri.org/}Costco" minOccurs="0"/&gt;
 *         &lt;element name="AMC7_1" type="{http://tempuri.org/}AMC7_1" minOccurs="0"/&gt;
 *         &lt;element name="Coppel" type="{http://tempuri.org/}Coppel" minOccurs="0"/&gt;
 *         &lt;element name="soriana" type="{http://tempuri.org/}SorianaHB" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Addendas_HB", propOrder = {
    "casaLey",
    "costco",
    "amc71",
    "coppel",
    "soriana"
})
public class AddendasHB {

    @XmlElement(name = "CasaLey")
    protected CasaLey casaLey;
    @XmlElement(name = "Costco")
    protected Costco costco;
    @XmlElement(name = "AMC7_1")
    protected AMC71 amc71;
    @XmlElement(name = "Coppel")
    protected Coppel coppel;
    protected SorianaHB soriana;

    /**
     * Obtiene el valor de la propiedad casaLey.
     * 
     * @return
     *     possible object is
     *     {@link CasaLey }
     *     
     */
    public CasaLey getCasaLey() {
        return casaLey;
    }

    /**
     * Define el valor de la propiedad casaLey.
     * 
     * @param value
     *     allowed object is
     *     {@link CasaLey }
     *     
     */
    public void setCasaLey(CasaLey value) {
        this.casaLey = value;
    }

    /**
     * Obtiene el valor de la propiedad costco.
     * 
     * @return
     *     possible object is
     *     {@link Costco }
     *     
     */
    public Costco getCostco() {
        return costco;
    }

    /**
     * Define el valor de la propiedad costco.
     * 
     * @param value
     *     allowed object is
     *     {@link Costco }
     *     
     */
    public void setCostco(Costco value) {
        this.costco = value;
    }

    /**
     * Obtiene el valor de la propiedad amc71.
     * 
     * @return
     *     possible object is
     *     {@link AMC71 }
     *     
     */
    public AMC71 getAMC71() {
        return amc71;
    }

    /**
     * Define el valor de la propiedad amc71.
     * 
     * @param value
     *     allowed object is
     *     {@link AMC71 }
     *     
     */
    public void setAMC71(AMC71 value) {
        this.amc71 = value;
    }

    /**
     * Obtiene el valor de la propiedad coppel.
     * 
     * @return
     *     possible object is
     *     {@link Coppel }
     *     
     */
    public Coppel getCoppel() {
        return coppel;
    }

    /**
     * Define el valor de la propiedad coppel.
     * 
     * @param value
     *     allowed object is
     *     {@link Coppel }
     *     
     */
    public void setCoppel(Coppel value) {
        this.coppel = value;
    }

    /**
     * Obtiene el valor de la propiedad soriana.
     * 
     * @return
     *     possible object is
     *     {@link SorianaHB }
     *     
     */
    public SorianaHB getSoriana() {
        return soriana;
    }

    /**
     * Define el valor de la propiedad soriana.
     * 
     * @param value
     *     allowed object is
     *     {@link SorianaHB }
     *     
     */
    public void setSoriana(SorianaHB value) {
        this.soriana = value;
    }

}
