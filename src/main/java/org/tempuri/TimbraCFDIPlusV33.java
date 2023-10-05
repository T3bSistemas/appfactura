
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
 *         &lt;element name="CFDIRequest" type="{http://tempuri.org/}CFDITimbradoPlusRequest" minOccurs="0"/&gt;
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
@XmlRootElement(name = "TimbraCFDIPlusV33")
public class TimbraCFDIPlusV33 {

    @XmlElement(name = "CFDIRequest")
    protected CFDITimbradoPlusRequest cfdiRequest;

    /**
     * Obtiene el valor de la propiedad cfdiRequest.
     * 
     * @return
     *     possible object is
     *     {@link CFDITimbradoPlusRequest }
     *     
     */
    public CFDITimbradoPlusRequest getCFDIRequest() {
        return cfdiRequest;
    }

    /**
     * Define el valor de la propiedad cfdiRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDITimbradoPlusRequest }
     *     
     */
    public void setCFDIRequest(CFDITimbradoPlusRequest value) {
        this.cfdiRequest = value;
    }

}
