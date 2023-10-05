
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DSCargaRemisionesProvHB complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DSCargaRemisionesProvHB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dscargaRemisionesProv" type="{http://tempuri.org/}ArrayOfDSCargaRemisionProvHB" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSCargaRemisionesProvHB", propOrder = {
    "dscargaRemisionesProv"
})
public class DSCargaRemisionesProvHB {

    protected ArrayOfDSCargaRemisionProvHB dscargaRemisionesProv;

    /**
     * Obtiene el valor de la propiedad dscargaRemisionesProv.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDSCargaRemisionProvHB }
     *     
     */
    public ArrayOfDSCargaRemisionProvHB getDscargaRemisionesProv() {
        return dscargaRemisionesProv;
    }

    /**
     * Define el valor de la propiedad dscargaRemisionesProv.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDSCargaRemisionProvHB }
     *     
     */
    public void setDscargaRemisionesProv(ArrayOfDSCargaRemisionProvHB value) {
        this.dscargaRemisionesProv = value;
    }

}
