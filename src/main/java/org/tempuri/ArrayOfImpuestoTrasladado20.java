
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfImpuestoTrasladado20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfImpuestoTrasladado20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImpuestoTrasladado20" type="{http://tempuri.org/}ImpuestoTrasladado20" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfImpuestoTrasladado20", propOrder = {
    "impuestoTrasladado20"
})
public class ArrayOfImpuestoTrasladado20 {

    @XmlElement(name = "ImpuestoTrasladado20", nillable = true)
    protected List<ImpuestoTrasladado20> impuestoTrasladado20;

    /**
     * Gets the value of the impuestoTrasladado20 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impuestoTrasladado20 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpuestoTrasladado20().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImpuestoTrasladado20 }
     * 
     * 
     */
    public List<ImpuestoTrasladado20> getImpuestoTrasladado20() {
        if (impuestoTrasladado20 == null) {
            impuestoTrasladado20 = new ArrayList<ImpuestoTrasladado20>();
        }
        return this.impuestoTrasladado20;
    }

}
