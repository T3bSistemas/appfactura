
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Percepciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Percepciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalSueldos" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalSeparacionIndemnizacion" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalJubilacionPensionRetiro" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalGravado" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalExento" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Percepcion" type="{http://tempuri.org/}ArrayOfPercepcion" minOccurs="0"/&gt;
 *         &lt;element name="Jubilacion" type="{http://tempuri.org/}JubilacionPensionRetiro" minOccurs="0"/&gt;
 *         &lt;element name="Separacion" type="{http://tempuri.org/}SeparacionIndemnizacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Percepciones", propOrder = {
    "totalSueldos",
    "totalSeparacionIndemnizacion",
    "totalJubilacionPensionRetiro",
    "totalGravado",
    "totalExento",
    "percepcion",
    "jubilacion",
    "separacion"
})
public class Percepciones {

    @XmlElement(name = "TotalSueldos")
    protected double totalSueldos;
    @XmlElement(name = "TotalSeparacionIndemnizacion")
    protected double totalSeparacionIndemnizacion;
    @XmlElement(name = "TotalJubilacionPensionRetiro")
    protected double totalJubilacionPensionRetiro;
    @XmlElement(name = "TotalGravado")
    protected double totalGravado;
    @XmlElement(name = "TotalExento")
    protected double totalExento;
    @XmlElement(name = "Percepcion")
    protected ArrayOfPercepcion percepcion;
    @XmlElement(name = "Jubilacion")
    protected JubilacionPensionRetiro jubilacion;
    @XmlElement(name = "Separacion")
    protected SeparacionIndemnizacion separacion;

    /**
     * Obtiene el valor de la propiedad totalSueldos.
     * 
     */
    public double getTotalSueldos() {
        return totalSueldos;
    }

    /**
     * Define el valor de la propiedad totalSueldos.
     * 
     */
    public void setTotalSueldos(double value) {
        this.totalSueldos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalSeparacionIndemnizacion.
     * 
     */
    public double getTotalSeparacionIndemnizacion() {
        return totalSeparacionIndemnizacion;
    }

    /**
     * Define el valor de la propiedad totalSeparacionIndemnizacion.
     * 
     */
    public void setTotalSeparacionIndemnizacion(double value) {
        this.totalSeparacionIndemnizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad totalJubilacionPensionRetiro.
     * 
     */
    public double getTotalJubilacionPensionRetiro() {
        return totalJubilacionPensionRetiro;
    }

    /**
     * Define el valor de la propiedad totalJubilacionPensionRetiro.
     * 
     */
    public void setTotalJubilacionPensionRetiro(double value) {
        this.totalJubilacionPensionRetiro = value;
    }

    /**
     * Obtiene el valor de la propiedad totalGravado.
     * 
     */
    public double getTotalGravado() {
        return totalGravado;
    }

    /**
     * Define el valor de la propiedad totalGravado.
     * 
     */
    public void setTotalGravado(double value) {
        this.totalGravado = value;
    }

    /**
     * Obtiene el valor de la propiedad totalExento.
     * 
     */
    public double getTotalExento() {
        return totalExento;
    }

    /**
     * Define el valor de la propiedad totalExento.
     * 
     */
    public void setTotalExento(double value) {
        this.totalExento = value;
    }

    /**
     * Obtiene el valor de la propiedad percepcion.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPercepcion }
     *     
     */
    public ArrayOfPercepcion getPercepcion() {
        return percepcion;
    }

    /**
     * Define el valor de la propiedad percepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPercepcion }
     *     
     */
    public void setPercepcion(ArrayOfPercepcion value) {
        this.percepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad jubilacion.
     * 
     * @return
     *     possible object is
     *     {@link JubilacionPensionRetiro }
     *     
     */
    public JubilacionPensionRetiro getJubilacion() {
        return jubilacion;
    }

    /**
     * Define el valor de la propiedad jubilacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JubilacionPensionRetiro }
     *     
     */
    public void setJubilacion(JubilacionPensionRetiro value) {
        this.jubilacion = value;
    }

    /**
     * Obtiene el valor de la propiedad separacion.
     * 
     * @return
     *     possible object is
     *     {@link SeparacionIndemnizacion }
     *     
     */
    public SeparacionIndemnizacion getSeparacion() {
        return separacion;
    }

    /**
     * Define el valor de la propiedad separacion.
     * 
     * @param value
     *     allowed object is
     *     {@link SeparacionIndemnizacion }
     *     
     */
    public void setSeparacion(SeparacionIndemnizacion value) {
        this.separacion = value;
    }

}
