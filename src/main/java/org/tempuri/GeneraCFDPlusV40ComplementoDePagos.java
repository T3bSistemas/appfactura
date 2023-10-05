
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
 *         &lt;element name="CFDIRequest" type="{http://tempuri.org/}CFDITimbradoPlusRequest40ComplementoDePagos" minOccurs="0"/&gt;
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
@XmlRootElement(name = "GeneraCFDPlusV40ComplementoDePagos")
public class GeneraCFDPlusV40ComplementoDePagos {

    @XmlElement(name = "CFDIRequest")
    protected CFDITimbradoPlusRequest40ComplementoDePagos cfdiRequest;

    /**
     * Obtiene el valor de la propiedad cfdiRequest.
     * 
     * @return
     *     possible object is
     *     {@link CFDITimbradoPlusRequest40ComplementoDePagos }
     *     
     */
    public CFDITimbradoPlusRequest40ComplementoDePagos getCFDIRequest() {
        return cfdiRequest;
    }

    /**
     * Define el valor de la propiedad cfdiRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDITimbradoPlusRequest40ComplementoDePagos }
     *     
     */
    public void setCFDIRequest(CFDITimbradoPlusRequest40ComplementoDePagos value) {
        this.cfdiRequest = value;
    }

}
