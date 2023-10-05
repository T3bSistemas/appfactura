
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfImpuestoTrasladado40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfImpuestoTrasladado40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImpuestoTrasladado40" type="{http://tempuri.org/}ImpuestoTrasladado40" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfImpuestoTrasladado40", propOrder = {
    "impuestoTrasladado40"
})
public class ArrayOfImpuestoTrasladado40 {

    @XmlElement(name = "ImpuestoTrasladado40", nillable = true)
    protected List<ImpuestoTrasladado40> impuestoTrasladado40;

    /**
     * Gets the value of the impuestoTrasladado40 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impuestoTrasladado40 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpuestoTrasladado40().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImpuestoTrasladado40 }
     * 
     * 
     */
    public List<ImpuestoTrasladado40> getImpuestoTrasladado40() {
        if (impuestoTrasladado40 == null) {
            impuestoTrasladado40 = new ArrayList<ImpuestoTrasladado40>();
        }
        return this.impuestoTrasladado40;
    }

}
