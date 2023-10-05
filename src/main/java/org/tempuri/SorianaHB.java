
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SorianaHB complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SorianaHB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DSCargaRemisionesProv" type="{http://tempuri.org/}DSCargaRemisionesProvHB" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SorianaHB", propOrder = {
    "dsCargaRemisionesProv"
})
public class SorianaHB {

    @XmlElement(name = "DSCargaRemisionesProv")
    protected DSCargaRemisionesProvHB dsCargaRemisionesProv;

    /**
     * Obtiene el valor de la propiedad dsCargaRemisionesProv.
     * 
     * @return
     *     possible object is
     *     {@link DSCargaRemisionesProvHB }
     *     
     */
    public DSCargaRemisionesProvHB getDSCargaRemisionesProv() {
        return dsCargaRemisionesProv;
    }

    /**
     * Define el valor de la propiedad dsCargaRemisionesProv.
     * 
     * @param value
     *     allowed object is
     *     {@link DSCargaRemisionesProvHB }
     *     
     */
    public void setDSCargaRemisionesProv(DSCargaRemisionesProvHB value) {
        this.dsCargaRemisionesProv = value;
    }

}
