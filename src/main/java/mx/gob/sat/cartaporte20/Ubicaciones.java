
package mx.gob.sat.cartaporte20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Ubicaciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Ubicaciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ubicacion" type="{http://www.sat.gob.mx/CartaPorte20}Ubicacion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ubicaciones", propOrder = {
    "ubicacion"
})
public class Ubicaciones {

    @XmlElement(name = "Ubicacion")
    protected List<Ubicacion> ubicacion;

    /**
     * Gets the value of the ubicacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ubicacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUbicacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ubicacion }
     * 
     * 
     */
    public List<Ubicacion> getUbicacion() {
        if (ubicacion == null) {
            ubicacion = new ArrayList<Ubicacion>();
        }
        return this.ubicacion;
    }

}
