
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
 * <p>Clase Java para Percepcion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Percepcion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccionesOTitulos" type="{http://www.sat.gob.mx/nomina12}AccionesOTitulos" minOccurs="0"/&gt;
 *         &lt;element name="HorasExtra" type="{http://www.sat.gob.mx/nomina12}HorasExtra" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TipoPercepcion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Clave" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Concepto" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ImporteGravado" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="ImporteExento" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Percepcion", propOrder = {
    "accionesOTitulos",
    "horasExtra"
})
public class Percepcion {

    @XmlElement(name = "AccionesOTitulos")
    protected AccionesOTitulos accionesOTitulos;
    @XmlElement(name = "HorasExtra")
    protected List<HorasExtra> horasExtra;
    @XmlAttribute(name = "TipoPercepcion")
    protected String tipoPercepcion;
    @XmlAttribute(name = "Clave")
    protected String clave;
    @XmlAttribute(name = "Concepto")
    protected String concepto;
    @XmlAttribute(name = "ImporteGravado", required = true)
    protected BigDecimal importeGravado;
    @XmlAttribute(name = "ImporteExento", required = true)
    protected BigDecimal importeExento;

    /**
     * Obtiene el valor de la propiedad accionesOTitulos.
     * 
     * @return
     *     possible object is
     *     {@link AccionesOTitulos }
     *     
     */
    public AccionesOTitulos getAccionesOTitulos() {
        return accionesOTitulos;
    }

    /**
     * Define el valor de la propiedad accionesOTitulos.
     * 
     * @param value
     *     allowed object is
     *     {@link AccionesOTitulos }
     *     
     */
    public void setAccionesOTitulos(AccionesOTitulos value) {
        this.accionesOTitulos = value;
    }

    /**
     * Gets the value of the horasExtra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horasExtra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHorasExtra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HorasExtra }
     * 
     * 
     */
    public List<HorasExtra> getHorasExtra() {
        if (horasExtra == null) {
            horasExtra = new ArrayList<HorasExtra>();
        }
        return this.horasExtra;
    }

    /**
     * Obtiene el valor de la propiedad tipoPercepcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPercepcion() {
        return tipoPercepcion;
    }

    /**
     * Define el valor de la propiedad tipoPercepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPercepcion(String value) {
        this.tipoPercepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Obtiene el valor de la propiedad concepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * Define el valor de la propiedad concepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcepto(String value) {
        this.concepto = value;
    }

    /**
     * Obtiene el valor de la propiedad importeGravado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteGravado() {
        return importeGravado;
    }

    /**
     * Define el valor de la propiedad importeGravado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteGravado(BigDecimal value) {
        this.importeGravado = value;
    }

    /**
     * Obtiene el valor de la propiedad importeExento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteExento() {
        return importeExento;
    }

    /**
     * Define el valor de la propiedad importeExento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteExento(BigDecimal value) {
        this.importeExento = value;
    }

}
