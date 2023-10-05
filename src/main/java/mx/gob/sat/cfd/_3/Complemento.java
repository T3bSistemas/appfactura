
package mx.gob.sat.cfd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import mx.gob.sat.nomina12.Nomina;


/**
 * <p>Clase Java para Complemento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Complemento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sat.gob.mx/nomina12}Nomina" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Complemento", propOrder = {
    "nomina"
})
public class Complemento {

    @XmlElement(name = "Nomina", namespace = "http://www.sat.gob.mx/nomina12")
    protected List<Nomina> nomina;

    /**
     * Gets the value of the nomina property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nomina property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNomina().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nomina }
     * 
     * 
     */
    public List<Nomina> getNomina() {
        if (nomina == null) {
            nomina = new ArrayList<Nomina>();
        }
        return this.nomina;
    }

}
