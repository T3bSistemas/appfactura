
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfDomicilioDestinatario20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDomicilioDestinatario20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DomicilioDestinatario20" type="{http://tempuri.org/}DomicilioDestinatario20" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDomicilioDestinatario20", propOrder = {
    "domicilioDestinatario20"
})
public class ArrayOfDomicilioDestinatario20 {

    @XmlElement(name = "DomicilioDestinatario20", nillable = true)
    protected List<DomicilioDestinatario20> domicilioDestinatario20;

    /**
     * Gets the value of the domicilioDestinatario20 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domicilioDestinatario20 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomicilioDestinatario20().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomicilioDestinatario20 }
     * 
     * 
     */
    public List<DomicilioDestinatario20> getDomicilioDestinatario20() {
        if (domicilioDestinatario20 == null) {
            domicilioDestinatario20 = new ArrayList<DomicilioDestinatario20>();
        }
        return this.domicilioDestinatario20;
    }

}
