
package mx.gob.sat.cartaporte30;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RemolquesCartaPorte30 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RemolquesCartaPorte30"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Remolque" type="{http://www.sat.gob.mx/CartaPorte30}RemolqueCartaPorte30" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemolquesCartaPorte30", propOrder = {
    "remolque"
})
public class RemolquesCartaPorte30 {

    @XmlElement(name = "Remolque")
    protected List<RemolqueCartaPorte30> remolque;

    /**
     * Gets the value of the remolque property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remolque property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemolque().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemolqueCartaPorte30 }
     * 
     * 
     */
    public List<RemolqueCartaPorte30> getRemolque() {
        if (remolque == null) {
            remolque = new ArrayList<RemolqueCartaPorte30>();
        }
        return this.remolque;
    }

}
