
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfDSCargaRemisionProv complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSCargaRemisionProv"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DSCargaRemisionProv" type="{http://tempuri.org/}DSCargaRemisionProv" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSCargaRemisionProv", propOrder = {
    "dsCargaRemisionProv"
})
public class ArrayOfDSCargaRemisionProv {

    @XmlElement(name = "DSCargaRemisionProv", nillable = true)
    protected List<DSCargaRemisionProv> dsCargaRemisionProv;

    /**
     * Gets the value of the dsCargaRemisionProv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dsCargaRemisionProv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSCargaRemisionProv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSCargaRemisionProv }
     * 
     * 
     */
    public List<DSCargaRemisionProv> getDSCargaRemisionProv() {
        if (dsCargaRemisionProv == null) {
            dsCargaRemisionProv = new ArrayList<DSCargaRemisionProv>();
        }
        return this.dsCargaRemisionProv;
    }

}
