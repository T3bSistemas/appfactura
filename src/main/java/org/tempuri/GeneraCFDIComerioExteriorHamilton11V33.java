
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="comerciorequest" type="{http://tempuri.org/}CFDIComercioExteriorRequest33" minOccurs="0"/&gt;
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
    "comerciorequest"
})
@XmlRootElement(name = "GeneraCFDIComerioExteriorHamilton11V33")
public class GeneraCFDIComerioExteriorHamilton11V33 {

    protected CFDIComercioExteriorRequest33 comerciorequest;

    /**
     * Obtiene el valor de la propiedad comerciorequest.
     * 
     * @return
     *     possible object is
     *     {@link CFDIComercioExteriorRequest33 }
     *     
     */
    public CFDIComercioExteriorRequest33 getComerciorequest() {
        return comerciorequest;
    }

    /**
     * Define el valor de la propiedad comerciorequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIComercioExteriorRequest33 }
     *     
     */
    public void setComerciorequest(CFDIComercioExteriorRequest33 value) {
        this.comerciorequest = value;
    }

}
