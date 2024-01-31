
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfDescripcionEspecifica20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDescripcionEspecifica20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DescripcionEspecifica20" type="{http://tempuri.org/}DescripcionEspecifica20" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDescripcionEspecifica20", propOrder = {
    "descripcionEspecifica20"
})
public class ArrayOfDescripcionEspecifica20 {

    @XmlElement(name = "DescripcionEspecifica20", nillable = true)
    protected List<DescripcionEspecifica20> descripcionEspecifica20;

    /**
     * Gets the value of the descripcionEspecifica20 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descripcionEspecifica20 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescripcionEspecifica20().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescripcionEspecifica20 }
     * 
     * 
     */
    public List<DescripcionEspecifica20> getDescripcionEspecifica20() {
        if (descripcionEspecifica20 == null) {
            descripcionEspecifica20 = new ArrayList<DescripcionEspecifica20>();
        }
        return this.descripcionEspecifica20;
    }

}
