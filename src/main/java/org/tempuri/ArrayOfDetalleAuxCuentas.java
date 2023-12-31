
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfDetalleAuxCuentas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDetalleAuxCuentas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DetalleAuxCuentas" type="{http://tempuri.org/}DetalleAuxCuentas" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDetalleAuxCuentas", propOrder = {
    "detalleAuxCuentas"
})
public class ArrayOfDetalleAuxCuentas {

    @XmlElement(name = "DetalleAuxCuentas", nillable = true)
    protected List<DetalleAuxCuentas> detalleAuxCuentas;

    /**
     * Gets the value of the detalleAuxCuentas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalleAuxCuentas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalleAuxCuentas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetalleAuxCuentas }
     * 
     * 
     */
    public List<DetalleAuxCuentas> getDetalleAuxCuentas() {
        if (detalleAuxCuentas == null) {
            detalleAuxCuentas = new ArrayList<DetalleAuxCuentas>();
        }
        return this.detalleAuxCuentas;
    }

}
