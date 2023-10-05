
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfCuentaBalanza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCuentaBalanza"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CuentaBalanza" type="{http://tempuri.org/}CuentaBalanza" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCuentaBalanza", propOrder = {
    "cuentaBalanza"
})
public class ArrayOfCuentaBalanza {

    @XmlElement(name = "CuentaBalanza", nillable = true)
    protected List<CuentaBalanza> cuentaBalanza;

    /**
     * Gets the value of the cuentaBalanza property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cuentaBalanza property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCuentaBalanza().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CuentaBalanza }
     * 
     * 
     */
    public List<CuentaBalanza> getCuentaBalanza() {
        if (cuentaBalanza == null) {
            cuentaBalanza = new ArrayList<CuentaBalanza>();
        }
        return this.cuentaBalanza;
    }

}
