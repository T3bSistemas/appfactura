
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfConceptoCFDI40Allianz complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConceptoCFDI40Allianz"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConceptoCFDI40Allianz" type="{http://tempuri.org/}ConceptoCFDI40Allianz" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConceptoCFDI40Allianz", propOrder = {
    "conceptoCFDI40Allianz"
})
public class ArrayOfConceptoCFDI40Allianz {

    @XmlElement(name = "ConceptoCFDI40Allianz", nillable = true)
    protected List<ConceptoCFDI40Allianz> conceptoCFDI40Allianz;

    /**
     * Gets the value of the conceptoCFDI40Allianz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptoCFDI40Allianz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptoCFDI40Allianz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptoCFDI40Allianz }
     * 
     * 
     */
    public List<ConceptoCFDI40Allianz> getConceptoCFDI40Allianz() {
        if (conceptoCFDI40Allianz == null) {
            conceptoCFDI40Allianz = new ArrayList<ConceptoCFDI40Allianz>();
        }
        return this.conceptoCFDI40Allianz;
    }

}
