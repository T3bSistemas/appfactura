
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ImpuestosDR40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ImpuestosDR40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetencionesDR40" type="{http://tempuri.org/}ArrayOfRetencionesDR40" minOccurs="0"/&gt;
 *         &lt;element name="TrasladosDR40" type="{http://tempuri.org/}ArrayOfTrasladosDR40" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpuestosDR40", propOrder = {
    "retencionesDR40",
    "trasladosDR40"
})
public class ImpuestosDR40 {

    @XmlElement(name = "RetencionesDR40")
    protected ArrayOfRetencionesDR40 retencionesDR40;
    @XmlElement(name = "TrasladosDR40")
    protected ArrayOfTrasladosDR40 trasladosDR40;

    /**
     * Obtiene el valor de la propiedad retencionesDR40.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRetencionesDR40 }
     *     
     */
    public ArrayOfRetencionesDR40 getRetencionesDR40() {
        return retencionesDR40;
    }

    /**
     * Define el valor de la propiedad retencionesDR40.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRetencionesDR40 }
     *     
     */
    public void setRetencionesDR40(ArrayOfRetencionesDR40 value) {
        this.retencionesDR40 = value;
    }

    /**
     * Obtiene el valor de la propiedad trasladosDR40.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrasladosDR40 }
     *     
     */
    public ArrayOfTrasladosDR40 getTrasladosDR40() {
        return trasladosDR40;
    }

    /**
     * Define el valor de la propiedad trasladosDR40.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrasladosDR40 }
     *     
     */
    public void setTrasladosDR40(ArrayOfTrasladosDR40 value) {
        this.trasladosDR40 = value;
    }

}
