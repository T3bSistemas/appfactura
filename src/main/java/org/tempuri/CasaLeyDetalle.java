
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CasaLeyDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CasaLeyDetalle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RENGLON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CANTIDAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DESCUENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRECIO_LISTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IMPUESTO_IVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IMPUESTO_IEPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TASA_IVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TASA_IEPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COD_BAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COD_ARTICULO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CasaLeyDetalle", propOrder = {
    "renglon",
    "cantidad",
    "umc",
    "descuento",
    "preciolista",
    "impuestoiva",
    "impuestoieps",
    "tasaiva",
    "tasaieps",
    "codbar",
    "codarticulo"
})
public class CasaLeyDetalle {

    @XmlElement(name = "RENGLON")
    protected String renglon;
    @XmlElement(name = "CANTIDAD")
    protected String cantidad;
    @XmlElement(name = "UMC")
    protected String umc;
    @XmlElement(name = "DESCUENTO")
    protected String descuento;
    @XmlElement(name = "PRECIO_LISTA")
    protected String preciolista;
    @XmlElement(name = "IMPUESTO_IVA")
    protected String impuestoiva;
    @XmlElement(name = "IMPUESTO_IEPS")
    protected String impuestoieps;
    @XmlElement(name = "TASA_IVA")
    protected String tasaiva;
    @XmlElement(name = "TASA_IEPS")
    protected String tasaieps;
    @XmlElement(name = "COD_BAR")
    protected String codbar;
    @XmlElement(name = "COD_ARTICULO")
    protected String codarticulo;

    /**
     * Obtiene el valor de la propiedad renglon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRENGLON() {
        return renglon;
    }

    /**
     * Define el valor de la propiedad renglon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRENGLON(String value) {
        this.renglon = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANTIDAD() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANTIDAD(String value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad umc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMC() {
        return umc;
    }

    /**
     * Define el valor de la propiedad umc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMC(String value) {
        this.umc = value;
    }

    /**
     * Obtiene el valor de la propiedad descuento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCUENTO() {
        return descuento;
    }

    /**
     * Define el valor de la propiedad descuento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCUENTO(String value) {
        this.descuento = value;
    }

    /**
     * Obtiene el valor de la propiedad preciolista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRECIOLISTA() {
        return preciolista;
    }

    /**
     * Define el valor de la propiedad preciolista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRECIOLISTA(String value) {
        this.preciolista = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestoiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPUESTOIVA() {
        return impuestoiva;
    }

    /**
     * Define el valor de la propiedad impuestoiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPUESTOIVA(String value) {
        this.impuestoiva = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestoieps.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPUESTOIEPS() {
        return impuestoieps;
    }

    /**
     * Define el valor de la propiedad impuestoieps.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPUESTOIEPS(String value) {
        this.impuestoieps = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTASAIVA() {
        return tasaiva;
    }

    /**
     * Define el valor de la propiedad tasaiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTASAIVA(String value) {
        this.tasaiva = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaieps.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTASAIEPS() {
        return tasaieps;
    }

    /**
     * Define el valor de la propiedad tasaieps.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTASAIEPS(String value) {
        this.tasaieps = value;
    }

    /**
     * Obtiene el valor de la propiedad codbar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODBAR() {
        return codbar;
    }

    /**
     * Define el valor de la propiedad codbar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODBAR(String value) {
        this.codbar = value;
    }

    /**
     * Obtiene el valor de la propiedad codarticulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODARTICULO() {
        return codarticulo;
    }

    /**
     * Define el valor de la propiedad codarticulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODARTICULO(String value) {
        this.codarticulo = value;
    }

}
