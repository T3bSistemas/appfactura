
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfCFDISRelacionado40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCFDISRelacionado40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CFDISRelacionado40" type="{http://tempuri.org/}CFDISRelacionado40" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCFDISRelacionado40", propOrder = {
    "cfdisRelacionado40"
})
public class ArrayOfCFDISRelacionado40 {

    @XmlElement(name = "CFDISRelacionado40", nillable = true)
    protected List<CFDISRelacionado40> cfdisRelacionado40;

    /**
     * Gets the value of the cfdisRelacionado40 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfdisRelacionado40 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCFDISRelacionado40().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CFDISRelacionado40 }
     * 
     * 
     */
    public List<CFDISRelacionado40> getCFDISRelacionado40() {
        if (cfdisRelacionado40 == null) {
            cfdisRelacionado40 = new ArrayList<CFDISRelacionado40>();
        }
        return this.cfdisRelacionado40;
    }

}
