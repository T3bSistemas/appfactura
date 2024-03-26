
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfImpuestoRetenido20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfImpuestoRetenido20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImpuestoRetenido20" type="{http://tempuri.org/}ImpuestoRetenido20" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfImpuestoRetenido20", propOrder = {
    "impuestoRetenido20"
})
public class ArrayOfImpuestoRetenido20 {

    @XmlElement(name = "ImpuestoRetenido20", nillable = true)
    protected List<ImpuestoRetenido20> impuestoRetenido20;

    /**
     * Gets the value of the impuestoRetenido20 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impuestoRetenido20 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpuestoRetenido20().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImpuestoRetenido20 }
     * 
     * 
     */
    public List<ImpuestoRetenido20> getImpuestoRetenido20() {
        if (impuestoRetenido20 == null) {
            impuestoRetenido20 = new ArrayList<ImpuestoRetenido20>();
        }
        return this.impuestoRetenido20;
    }

}
