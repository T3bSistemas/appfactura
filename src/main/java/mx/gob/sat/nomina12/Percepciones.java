
package mx.gob.sat.nomina12;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="Percepcion" type="{http://www.sat.gob.mx/nomina12}Percepcion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JubilacionPensionRetiro" type="{http://www.sat.gob.mx/nomina12}JubilacionPensionRetiro" minOccurs="0"/&gt;
 *         &lt;element name="SeparacionIndemnizacion" type="{http://www.sat.gob.mx/nomina12}SeparacionIndemnizacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TotalSueldos" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="TotalSeparacionIndemnizacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TotalJubilacionPensionRetiro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TotalGravado" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="TotalExento" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Percepciones", propOrder = {
    "percepcion",
    "jubilacionPensionRetiro",
    "separacionIndemnizacion"
})
public class Percepciones {

    @XmlElement(name = "Percepcion")
    protected List<Percepcion> percepcion;
    @XmlElement(name = "JubilacionPensionRetiro")
    protected JubilacionPensionRetiro jubilacionPensionRetiro;
    @XmlElement(name = "SeparacionIndemnizacion")
    protected SeparacionIndemnizacion separacionIndemnizacion;
    @XmlAttribute(name = "TotalSueldos", required = true)
    protected double totalSueldos;
    @XmlAttribute(name = "TotalSeparacionIndemnizacion")
    protected String totalSeparacionIndemnizacion;
    @XmlAttribute(name = "TotalJubilacionPensionRetiro")
    protected String totalJubilacionPensionRetiro;
    @XmlAttribute(name = "TotalGravado", required = true)
    protected BigDecimal totalGravado;
    @XmlAttribute(name = "TotalExento", required = true)
    protected BigDecimal totalExento;

    /**
     * Gets the value of the percepcion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the percepcion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPercepcion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Percepcion }
     * 
     * 
     */
    public List<Percepcion> getPercepcion() {
        if (percepcion == null) {
            percepcion = new ArrayList<Percepcion>();
        }
        return this.percepcion;
    }

    /**
     * Obtiene el valor de la propiedad jubilacionPensionRetiro.
     * 
     * @return
     *     possible object is
     *     {@link JubilacionPensionRetiro }
     *     
     */
    public JubilacionPensionRetiro getJubilacionPensionRetiro() {
        return jubilacionPensionRetiro;
    }

    /**
     * Define el valor de la propiedad jubilacionPensionRetiro.
     * 
     * @param value
     *     allowed object is
     *     {@link JubilacionPensionRetiro }
     *     
     */
    public void setJubilacionPensionRetiro(JubilacionPensionRetiro value) {
        this.jubilacionPensionRetiro = value;
    }

    /**
     * Obtiene el valor de la propiedad separacionIndemnizacion.
     * 
     * @return
     *     possible object is
     *     {@link SeparacionIndemnizacion }
     *     
     */
    public SeparacionIndemnizacion getSeparacionIndemnizacion() {
        return separacionIndemnizacion;
    }

    /**
     * Define el valor de la propiedad separacionIndemnizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link SeparacionIndemnizacion }
     *     
     */
    public void setSeparacionIndemnizacion(SeparacionIndemnizacion value) {
        this.separacionIndemnizacion = value;
    }

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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalSeparacionIndemnizacion() {
        return totalSeparacionIndemnizacion;
    }

    /**
     * Define el valor de la propiedad totalSeparacionIndemnizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalSeparacionIndemnizacion(String value) {
        this.totalSeparacionIndemnizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad totalJubilacionPensionRetiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalJubilacionPensionRetiro() {
        return totalJubilacionPensionRetiro;
    }

    /**
     * Define el valor de la propiedad totalJubilacionPensionRetiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalJubilacionPensionRetiro(String value) {
        this.totalJubilacionPensionRetiro = value;
    }

    /**
     * Obtiene el valor de la propiedad totalGravado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalGravado() {
        return totalGravado;
    }

    /**
     * Define el valor de la propiedad totalGravado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalGravado(BigDecimal value) {
        this.totalGravado = value;
    }

    /**
     * Obtiene el valor de la propiedad totalExento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalExento() {
        return totalExento;
    }

    /**
     * Define el valor de la propiedad totalExento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalExento(BigDecimal value) {
        this.totalExento = value;
    }

}
