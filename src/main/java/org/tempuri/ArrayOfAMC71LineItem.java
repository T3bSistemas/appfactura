
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfAMC7_1_LineItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAMC7_1_LineItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AMC7_1_LineItem" type="{http://tempuri.org/}AMC7_1_LineItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAMC7_1_LineItem", propOrder = {
    "amc71LineItem"
})
public class ArrayOfAMC71LineItem {

    @XmlElement(name = "AMC7_1_LineItem", nillable = true)
    protected List<AMC71LineItem> amc71LineItem;

    /**
     * Gets the value of the amc71LineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amc71LineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAMC71LineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AMC71LineItem }
     * 
     * 
     */
    public List<AMC71LineItem> getAMC71LineItem() {
        if (amc71LineItem == null) {
            amc71LineItem = new ArrayList<AMC71LineItem>();
        }
        return this.amc71LineItem;
    }

}
