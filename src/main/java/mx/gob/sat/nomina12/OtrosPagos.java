
package mx.gob.sat.nomina12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OtrosPagos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OtrosPagos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OtroPago" type="{http://www.sat.gob.mx/nomina12}OtroPago" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtrosPagos", propOrder = {
    "otroPago"
})
public class OtrosPagos {

    @XmlElement(name = "OtroPago")
    protected List<OtroPago> otroPago;

    /**
     * Gets the value of the otroPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otroPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtroPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtroPago }
     * 
     * 
     */
    public List<OtroPago> getOtroPago() {
        if (otroPago == null) {
            otroPago = new ArrayList<OtroPago>();
        }
        return this.otroPago;
    }

}
