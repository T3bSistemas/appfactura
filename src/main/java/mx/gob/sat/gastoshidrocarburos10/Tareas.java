
package mx.gob.sat.gastoshidrocarburos10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Tareas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Tareas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TareaRelacionada" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tareas")
public class Tareas {

    @XmlAttribute(name = "TareaRelacionada")
    protected String tareaRelacionada;

    /**
     * Obtiene el valor de la propiedad tareaRelacionada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTareaRelacionada() {
        return tareaRelacionada;
    }

    /**
     * Define el valor de la propiedad tareaRelacionada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTareaRelacionada(String value) {
        this.tareaRelacionada = value;
    }

}
