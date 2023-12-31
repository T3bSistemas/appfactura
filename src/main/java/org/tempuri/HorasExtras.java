
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HorasExtras complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HorasExtras"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dias" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TIpoHoras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HoraExtra" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ImportePagado" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HorasExtras", propOrder = {
    "dias",
    "tIpoHoras",
    "horaExtra",
    "importePagado"
})
public class HorasExtras {

    @XmlElement(name = "Dias")
    protected int dias;
    @XmlElement(name = "TIpoHoras")
    protected String tIpoHoras;
    @XmlElement(name = "HoraExtra")
    protected int horaExtra;
    @XmlElement(name = "ImportePagado")
    protected double importePagado;

    /**
     * Obtiene el valor de la propiedad dias.
     * 
     */
    public int getDias() {
        return dias;
    }

    /**
     * Define el valor de la propiedad dias.
     * 
     */
    public void setDias(int value) {
        this.dias = value;
    }

    /**
     * Obtiene el valor de la propiedad tIpoHoras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIpoHoras() {
        return tIpoHoras;
    }

    /**
     * Define el valor de la propiedad tIpoHoras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIpoHoras(String value) {
        this.tIpoHoras = value;
    }

    /**
     * Obtiene el valor de la propiedad horaExtra.
     * 
     */
    public int getHoraExtra() {
        return horaExtra;
    }

    /**
     * Define el valor de la propiedad horaExtra.
     * 
     */
    public void setHoraExtra(int value) {
        this.horaExtra = value;
    }

    /**
     * Obtiene el valor de la propiedad importePagado.
     * 
     */
    public double getImportePagado() {
        return importePagado;
    }

    /**
     * Define el valor de la propiedad importePagado.
     * 
     */
    public void setImportePagado(double value) {
        this.importePagado = value;
    }

}
