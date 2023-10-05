
package mx.gob.sat.gastoshidrocarburos10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Yacimientos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Yacimientos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pozos" type="{http://www.sat.gob.mx/GastosHidrocarburos10}Pozos" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Yacimiento" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Yacimientos", propOrder = {
    "pozos"
})
public class Yacimientos {

    @XmlElement(name = "Pozos")
    protected List<Pozos> pozos;
    @XmlAttribute(name = "Yacimiento")
    protected String yacimiento;

    /**
     * Gets the value of the pozos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pozos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPozos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pozos }
     * 
     * 
     */
    public List<Pozos> getPozos() {
        if (pozos == null) {
            pozos = new ArrayList<Pozos>();
        }
        return this.pozos;
    }

    /**
     * Obtiene el valor de la propiedad yacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYacimiento() {
        return yacimiento;
    }

    /**
     * Define el valor de la propiedad yacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYacimiento(String value) {
        this.yacimiento = value;
    }

}
