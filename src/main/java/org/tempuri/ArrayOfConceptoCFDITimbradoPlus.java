
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfConceptoCFDITimbradoPlus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConceptoCFDITimbradoPlus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConceptoCFDITimbradoPlus" type="{http://tempuri.org/}ConceptoCFDITimbradoPlus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConceptoCFDITimbradoPlus", propOrder = {
    "conceptoCFDITimbradoPlus"
})
public class ArrayOfConceptoCFDITimbradoPlus {

    @XmlElement(name = "ConceptoCFDITimbradoPlus", nillable = true)
    protected List<ConceptoCFDITimbradoPlus> conceptoCFDITimbradoPlus;

    /**
     * Gets the value of the conceptoCFDITimbradoPlus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptoCFDITimbradoPlus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptoCFDITimbradoPlus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptoCFDITimbradoPlus }
     * 
     * 
     */
    public List<ConceptoCFDITimbradoPlus> getConceptoCFDITimbradoPlus() {
        if (conceptoCFDITimbradoPlus == null) {
            conceptoCFDITimbradoPlus = new ArrayList<ConceptoCFDITimbradoPlus>();
        }
        return this.conceptoCFDITimbradoPlus;
    }

}
