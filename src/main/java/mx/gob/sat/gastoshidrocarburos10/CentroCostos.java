
package mx.gob.sat.gastoshidrocarburos10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CentroCostos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CentroCostos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Yacimientos" type="{http://www.sat.gob.mx/GastosHidrocarburos10}Yacimientos" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Campo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentroCostos", propOrder = {
    "yacimientos"
})
public class CentroCostos {

    @XmlElement(name = "Yacimientos")
    protected List<Yacimientos> yacimientos;
    @XmlAttribute(name = "Campo")
    protected String campo;

    /**
     * Gets the value of the yacimientos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the yacimientos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYacimientos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Yacimientos }
     * 
     * 
     */
    public List<Yacimientos> getYacimientos() {
        if (yacimientos == null) {
            yacimientos = new ArrayList<Yacimientos>();
        }
        return this.yacimientos;
    }

    /**
     * Obtiene el valor de la propiedad campo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampo() {
        return campo;
    }

    /**
     * Define el valor de la propiedad campo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampo(String value) {
        this.campo = value;
    }

}
