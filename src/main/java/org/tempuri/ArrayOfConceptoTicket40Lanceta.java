
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfConceptoTicket40Lanceta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConceptoTicket40Lanceta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConceptoTicket40Lanceta" type="{http://tempuri.org/}ConceptoTicket40Lanceta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConceptoTicket40Lanceta", propOrder = {
    "conceptoTicket40Lanceta"
})
public class ArrayOfConceptoTicket40Lanceta {

    @XmlElement(name = "ConceptoTicket40Lanceta", nillable = true)
    protected List<ConceptoTicket40Lanceta> conceptoTicket40Lanceta;

    /**
     * Gets the value of the conceptoTicket40Lanceta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptoTicket40Lanceta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptoTicket40Lanceta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptoTicket40Lanceta }
     * 
     * 
     */
    public List<ConceptoTicket40Lanceta> getConceptoTicket40Lanceta() {
        if (conceptoTicket40Lanceta == null) {
            conceptoTicket40Lanceta = new ArrayList<ConceptoTicket40Lanceta>();
        }
        return this.conceptoTicket40Lanceta;
    }

}
