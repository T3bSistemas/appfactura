
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfImpuestoRetenido40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfImpuestoRetenido40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImpuestoRetenido40" type="{http://tempuri.org/}ImpuestoRetenido40" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfImpuestoRetenido40", propOrder = {
    "impuestoRetenido40"
})
public class ArrayOfImpuestoRetenido40 {

    @XmlElement(name = "ImpuestoRetenido40", nillable = true)
    protected List<ImpuestoRetenido40> impuestoRetenido40;

    /**
     * Gets the value of the impuestoRetenido40 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impuestoRetenido40 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpuestoRetenido40().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImpuestoRetenido40 }
     * 
     * 
     */
    public List<ImpuestoRetenido40> getImpuestoRetenido40() {
        if (impuestoRetenido40 == null) {
            impuestoRetenido40 = new ArrayList<ImpuestoRetenido40>();
        }
        return this.impuestoRetenido40;
    }

}
