
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfConceptoCFDI40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConceptoCFDI40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConceptoCFDI40" type="{http://tempuri.org/}ConceptoCFDI40" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConceptoCFDI40", propOrder = {
    "conceptoCFDI40"
})
public class ArrayOfConceptoCFDI40 {

    @XmlElement(name = "ConceptoCFDI40", nillable = true)
    protected List<ConceptoCFDI40> conceptoCFDI40;

    /**
     * Gets the value of the conceptoCFDI40 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptoCFDI40 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptoCFDI40().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptoCFDI40 }
     * 
     * 
     */
    public List<ConceptoCFDI40> getConceptoCFDI40() {
        if (conceptoCFDI40 == null) {
            conceptoCFDI40 = new ArrayList<ConceptoCFDI40>();
        }
        return this.conceptoCFDI40;
    }

}
