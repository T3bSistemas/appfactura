
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfConceptoComercio20CFDI40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConceptoComercio20CFDI40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConceptoComercio20CFDI40" type="{http://tempuri.org/}ConceptoComercio20CFDI40" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConceptoComercio20CFDI40", propOrder = {
    "conceptoComercio20CFDI40"
})
public class ArrayOfConceptoComercio20CFDI40 {

    @XmlElement(name = "ConceptoComercio20CFDI40", nillable = true)
    protected List<ConceptoComercio20CFDI40> conceptoComercio20CFDI40;

    /**
     * Gets the value of the conceptoComercio20CFDI40 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptoComercio20CFDI40 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptoComercio20CFDI40().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptoComercio20CFDI40 }
     * 
     * 
     */
    public List<ConceptoComercio20CFDI40> getConceptoComercio20CFDI40() {
        if (conceptoComercio20CFDI40 == null) {
            conceptoComercio20CFDI40 = new ArrayList<ConceptoComercio20CFDI40>();
        }
        return this.conceptoComercio20CFDI40;
    }

}
