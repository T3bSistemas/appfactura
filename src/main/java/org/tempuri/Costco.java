
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Costco complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Costco"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SufijoProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoOc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Costco", propOrder = {
    "tipoProveedor",
    "noProveedor",
    "sufijoProveedor",
    "noOc",
    "moneda",
    "idFactura"
})
public class Costco {

    @XmlElement(name = "TipoProveedor")
    protected String tipoProveedor;
    @XmlElement(name = "NoProveedor")
    protected String noProveedor;
    @XmlElement(name = "SufijoProveedor")
    protected String sufijoProveedor;
    @XmlElement(name = "NoOc")
    protected String noOc;
    @XmlElement(name = "Moneda")
    protected String moneda;
    @XmlElement(name = "IDFactura")
    protected String idFactura;

    /**
     * Obtiene el valor de la propiedad tipoProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoProveedor() {
        return tipoProveedor;
    }

    /**
     * Define el valor de la propiedad tipoProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoProveedor(String value) {
        this.tipoProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad noProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoProveedor() {
        return noProveedor;
    }

    /**
     * Define el valor de la propiedad noProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoProveedor(String value) {
        this.noProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad sufijoProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSufijoProveedor() {
        return sufijoProveedor;
    }

    /**
     * Define el valor de la propiedad sufijoProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSufijoProveedor(String value) {
        this.sufijoProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad noOc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOc() {
        return noOc;
    }

    /**
     * Define el valor de la propiedad noOc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOc(String value) {
        this.noOc = value;
    }

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
     * Obtiene el valor de la propiedad idFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDFactura() {
        return idFactura;
    }

    /**
     * Define el valor de la propiedad idFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDFactura(String value) {
        this.idFactura = value;
    }

}
