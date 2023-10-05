
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfDSCargaRemisionProvHB complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSCargaRemisionProvHB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DSCargaRemisionProvHB" type="{http://tempuri.org/}DSCargaRemisionProvHB" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSCargaRemisionProvHB", propOrder = {
    "dsCargaRemisionProvHB"
})
public class ArrayOfDSCargaRemisionProvHB {

    @XmlElement(name = "DSCargaRemisionProvHB", nillable = true)
    protected List<DSCargaRemisionProvHB> dsCargaRemisionProvHB;

    /**
     * Gets the value of the dsCargaRemisionProvHB property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dsCargaRemisionProvHB property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSCargaRemisionProvHB().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSCargaRemisionProvHB }
     * 
     * 
     */
    public List<DSCargaRemisionProvHB> getDSCargaRemisionProvHB() {
        if (dsCargaRemisionProvHB == null) {
            dsCargaRemisionProvHB = new ArrayList<DSCargaRemisionProvHB>();
        }
        return this.dsCargaRemisionProvHB;
    }

}
