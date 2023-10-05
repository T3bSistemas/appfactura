
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfDatosTickets complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDatosTickets"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatosTickets" type="{http://tempuri.org/}DatosTickets" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDatosTickets", propOrder = {
    "datosTickets"
})
public class ArrayOfDatosTickets {

    @XmlElement(name = "DatosTickets", nillable = true)
    protected List<DatosTickets> datosTickets;

    /**
     * Gets the value of the datosTickets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosTickets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosTickets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosTickets }
     * 
     * 
     */
    public List<DatosTickets> getDatosTickets() {
        if (datosTickets == null) {
            datosTickets = new ArrayList<DatosTickets>();
        }
        return this.datosTickets;
    }

}
