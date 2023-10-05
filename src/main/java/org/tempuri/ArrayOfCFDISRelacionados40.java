
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfCFDISRelacionados40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCFDISRelacionados40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CFDISRelacionados40" type="{http://tempuri.org/}CFDISRelacionados40" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCFDISRelacionados40", propOrder = {
    "cfdisRelacionados40"
})
public class ArrayOfCFDISRelacionados40 {

    @XmlElement(name = "CFDISRelacionados40", nillable = true)
    protected List<CFDISRelacionados40> cfdisRelacionados40;

    /**
     * Gets the value of the cfdisRelacionados40 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfdisRelacionados40 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCFDISRelacionados40().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CFDISRelacionados40 }
     * 
     * 
     */
    public List<CFDISRelacionados40> getCFDISRelacionados40() {
        if (cfdisRelacionados40 == null) {
            cfdisRelacionados40 = new ArrayList<CFDISRelacionados40>();
        }
        return this.cfdisRelacionados40;
    }

}
