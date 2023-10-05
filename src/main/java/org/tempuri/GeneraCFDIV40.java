
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CFDIRequest40" type="{http://tempuri.org/}CFDIRequest40" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cfdiRequest40"
})
@XmlRootElement(name = "GeneraCFDIV40")
public class GeneraCFDIV40 {

    @XmlElement(name = "CFDIRequest40")
    protected CFDIRequest40 cfdiRequest40;

    /**
     * Obtiene el valor de la propiedad cfdiRequest40.
     * 
     * @return
     *     possible object is
     *     {@link CFDIRequest40 }
     *     
     */
    public CFDIRequest40 getCFDIRequest40() {
        return cfdiRequest40;
    }

    /**
     * Define el valor de la propiedad cfdiRequest40.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIRequest40 }
     *     
     */
    public void setCFDIRequest40(CFDIRequest40 value) {
        this.cfdiRequest40 = value;
    }

}
