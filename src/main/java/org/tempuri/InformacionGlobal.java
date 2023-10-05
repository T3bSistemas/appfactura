
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InformacionGlobal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InformacionGlobal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Periodicidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Meses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Año" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Anio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionGlobal", propOrder = {
    "periodicidad",
    "meses",
    "a\u00f1o",
    "anio"
})
public class InformacionGlobal {

    @XmlElement(name = "Periodicidad")
    protected String periodicidad;
    @XmlElement(name = "Meses")
    protected String meses;
    @XmlElement(name = "A\u00f1o")
    protected String año;
    @XmlElement(name = "Anio")
    protected String anio;

    /**
     * Obtiene el valor de la propiedad periodicidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicidad() {
        return periodicidad;
    }

    /**
     * Define el valor de la propiedad periodicidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicidad(String value) {
        this.periodicidad = value;
    }

    /**
     * Obtiene el valor de la propiedad meses.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeses() {
        return meses;
    }

    /**
     * Define el valor de la propiedad meses.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeses(String value) {
        this.meses = value;
    }

    /**
     * Obtiene el valor de la propiedad año.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAño() {
        return año;
    }

    /**
     * Define el valor de la propiedad año.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAño(String value) {
        this.año = value;
    }

    /**
     * Obtiene el valor de la propiedad anio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnio() {
        return anio;
    }

    /**
     * Define el valor de la propiedad anio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnio(String value) {
        this.anio = value;
    }

}
