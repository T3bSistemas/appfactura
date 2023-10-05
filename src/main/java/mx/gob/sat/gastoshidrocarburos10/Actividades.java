
package mx.gob.sat.gastoshidrocarburos10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Actividades complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Actividades"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubActividades" type="{http://www.sat.gob.mx/GastosHidrocarburos10}SubActividades" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ActividadRelacionada" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Actividades", propOrder = {
    "subActividades"
})
public class Actividades {

    @XmlElement(name = "SubActividades")
    protected List<SubActividades> subActividades;
    @XmlAttribute(name = "ActividadRelacionada")
    protected String actividadRelacionada;

    /**
     * Gets the value of the subActividades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subActividades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubActividades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubActividades }
     * 
     * 
     */
    public List<SubActividades> getSubActividades() {
        if (subActividades == null) {
            subActividades = new ArrayList<SubActividades>();
        }
        return this.subActividades;
    }

    /**
     * Obtiene el valor de la propiedad actividadRelacionada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActividadRelacionada() {
        return actividadRelacionada;
    }

    /**
     * Define el valor de la propiedad actividadRelacionada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActividadRelacionada(String value) {
        this.actividadRelacionada = value;
    }

}
