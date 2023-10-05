
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfInformacionAduanera40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInformacionAduanera40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InformacionAduanera40" type="{http://tempuri.org/}InformacionAduanera40" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInformacionAduanera40", propOrder = {
    "informacionAduanera40"
})
public class ArrayOfInformacionAduanera40 {

    @XmlElement(name = "InformacionAduanera40", nillable = true)
    protected List<InformacionAduanera40> informacionAduanera40;

    /**
     * Gets the value of the informacionAduanera40 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informacionAduanera40 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformacionAduanera40().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformacionAduanera40 }
     * 
     * 
     */
    public List<InformacionAduanera40> getInformacionAduanera40() {
        if (informacionAduanera40 == null) {
            informacionAduanera40 = new ArrayList<InformacionAduanera40>();
        }
        return this.informacionAduanera40;
    }

}
