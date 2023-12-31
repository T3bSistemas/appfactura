
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfCuentasAux complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCuentasAux"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CuentasAux" type="{http://tempuri.org/}CuentasAux" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCuentasAux", propOrder = {
    "cuentasAux"
})
public class ArrayOfCuentasAux {

    @XmlElement(name = "CuentasAux", nillable = true)
    protected List<CuentasAux> cuentasAux;

    /**
     * Gets the value of the cuentasAux property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cuentasAux property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCuentasAux().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CuentasAux }
     * 
     * 
     */
    public List<CuentasAux> getCuentasAux() {
        if (cuentasAux == null) {
            cuentasAux = new ArrayList<CuentasAux>();
        }
        return this.cuentasAux;
    }

}
