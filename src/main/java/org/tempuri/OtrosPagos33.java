
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OtrosPagos33 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OtrosPagos33"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="otrospagos" type="{http://tempuri.org/}ArrayOfOtroPago33" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtrosPagos33", propOrder = {
    "otrospagos"
})
public class OtrosPagos33 {

    protected ArrayOfOtroPago33 otrospagos;

    /**
     * Obtiene el valor de la propiedad otrospagos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOtroPago33 }
     *     
     */
    public ArrayOfOtroPago33 getOtrospagos() {
        return otrospagos;
    }

    /**
     * Define el valor de la propiedad otrospagos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOtroPago33 }
     *     
     */
    public void setOtrospagos(ArrayOfOtroPago33 value) {
        this.otrospagos = value;
    }

}
