
package mx.gob.sat.nomina12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Deducciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Deducciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Deduccion" type="{http://www.sat.gob.mx/nomina12}Deduccion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TotalOtrasDeducciones" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TotalImpuestosRetenidos" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deducciones", propOrder = {
    "deduccion"
})
public class Deducciones {

    @XmlElement(name = "Deduccion")
    protected List<Deduccion> deduccion;
    @XmlAttribute(name = "TotalOtrasDeducciones")
    protected String totalOtrasDeducciones;
    @XmlAttribute(name = "TotalImpuestosRetenidos")
    protected String totalImpuestosRetenidos;

    /**
     * Gets the value of the deduccion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deduccion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeduccion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Deduccion }
     * 
     * 
     */
    public List<Deduccion> getDeduccion() {
        if (deduccion == null) {
            deduccion = new ArrayList<Deduccion>();
        }
        return this.deduccion;
    }

    /**
     * Obtiene el valor de la propiedad totalOtrasDeducciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalOtrasDeducciones() {
        return totalOtrasDeducciones;
    }

    /**
     * Define el valor de la propiedad totalOtrasDeducciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalOtrasDeducciones(String value) {
        this.totalOtrasDeducciones = value;
    }

    /**
     * Obtiene el valor de la propiedad totalImpuestosRetenidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalImpuestosRetenidos() {
        return totalImpuestosRetenidos;
    }

    /**
     * Define el valor de la propiedad totalImpuestosRetenidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalImpuestosRetenidos(String value) {
        this.totalImpuestosRetenidos = value;
    }

}
