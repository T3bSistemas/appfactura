
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfImpuesto20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfImpuesto20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Impuesto20" type="{http://tempuri.org/}Impuesto20" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfImpuesto20", propOrder = {
    "impuesto20"
})
public class ArrayOfImpuesto20 {

    @XmlElement(name = "Impuesto20", nillable = true)
    protected List<Impuesto20> impuesto20;

    /**
     * Gets the value of the impuesto20 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impuesto20 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpuesto20().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Impuesto20 }
     * 
     * 
     */
    public List<Impuesto20> getImpuesto20() {
        if (impuesto20 == null) {
            impuesto20 = new ArrayList<Impuesto20>();
        }
        return this.impuesto20;
    }

}
