
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
 *         &lt;element name="CFDIRequest" type="{http://tempuri.org/}CFDIRequestComplementoDePago" minOccurs="0"/&gt;
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
    "cfdiRequest"
})
@XmlRootElement(name = "GeneraCFDIV33CPagos")
public class GeneraCFDIV33CPagos {

    @XmlElement(name = "CFDIRequest")
    protected CFDIRequestComplementoDePago cfdiRequest;

    /**
     * Obtiene el valor de la propiedad cfdiRequest.
     * 
     * @return
     *     possible object is
     *     {@link CFDIRequestComplementoDePago }
     *     
     */
    public CFDIRequestComplementoDePago getCFDIRequest() {
        return cfdiRequest;
    }

    /**
     * Define el valor de la propiedad cfdiRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIRequestComplementoDePago }
     *     
     */
    public void setCFDIRequest(CFDIRequestComplementoDePago value) {
        this.cfdiRequest = value;
    }

}
