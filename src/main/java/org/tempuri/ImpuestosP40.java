
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ImpuestosP40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ImpuestosP40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetencionesP40" type="{http://tempuri.org/}ArrayOfRetencionesP40" minOccurs="0"/&gt;
 *         &lt;element name="TrasladosP40" type="{http://tempuri.org/}ArrayOfTrasladosP40" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpuestosP40", propOrder = {
    "retencionesP40",
    "trasladosP40"
})
public class ImpuestosP40 {

    @XmlElement(name = "RetencionesP40")
    protected ArrayOfRetencionesP40 retencionesP40;
    @XmlElement(name = "TrasladosP40")
    protected ArrayOfTrasladosP40 trasladosP40;

    /**
     * Obtiene el valor de la propiedad retencionesP40.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRetencionesP40 }
     *     
     */
    public ArrayOfRetencionesP40 getRetencionesP40() {
        return retencionesP40;
    }

    /**
     * Define el valor de la propiedad retencionesP40.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRetencionesP40 }
     *     
     */
    public void setRetencionesP40(ArrayOfRetencionesP40 value) {
        this.retencionesP40 = value;
    }

    /**
     * Obtiene el valor de la propiedad trasladosP40.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrasladosP40 }
     *     
     */
    public ArrayOfTrasladosP40 getTrasladosP40() {
        return trasladosP40;
    }

    /**
     * Define el valor de la propiedad trasladosP40.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrasladosP40 }
     *     
     */
    public void setTrasladosP40(ArrayOfTrasladosP40 value) {
        this.trasladosP40 = value;
    }

}
