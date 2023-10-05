
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfPagoCP40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPagoCP40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PagoCP40" type="{http://tempuri.org/}PagoCP40" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPagoCP40", propOrder = {
    "pagoCP40"
})
public class ArrayOfPagoCP40 {

    @XmlElement(name = "PagoCP40", nillable = true)
    protected List<PagoCP40> pagoCP40;

    /**
     * Gets the value of the pagoCP40 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pagoCP40 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPagoCP40().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PagoCP40 }
     * 
     * 
     */
    public List<PagoCP40> getPagoCP40() {
        if (pagoCP40 == null) {
            pagoCP40 = new ArrayList<PagoCP40>();
        }
        return this.pagoCP40;
    }

}
