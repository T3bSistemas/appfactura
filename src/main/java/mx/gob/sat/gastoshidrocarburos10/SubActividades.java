
package mx.gob.sat.gastoshidrocarburos10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubActividades complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubActividades"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tareas" type="{http://www.sat.gob.mx/GastosHidrocarburos10}Tareas" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SubActividadRelacionada" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubActividades", propOrder = {
    "tareas"
})
public class SubActividades {

    @XmlElement(name = "Tareas")
    protected List<Tareas> tareas;
    @XmlAttribute(name = "SubActividadRelacionada")
    protected String subActividadRelacionada;

    /**
     * Gets the value of the tareas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tareas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTareas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tareas }
     * 
     * 
     */
    public List<Tareas> getTareas() {
        if (tareas == null) {
            tareas = new ArrayList<Tareas>();
        }
        return this.tareas;
    }

    /**
     * Obtiene el valor de la propiedad subActividadRelacionada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubActividadRelacionada() {
        return subActividadRelacionada;
    }

    /**
     * Define el valor de la propiedad subActividadRelacionada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubActividadRelacionada(String value) {
        this.subActividadRelacionada = value;
    }

}
