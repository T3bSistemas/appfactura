
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
 *         &lt;element name="GeneraCFDIV40CPagosPaseResult" type="{http://tempuri.org/}CFDIResponse40ComplementoDePagos" minOccurs="0"/&gt;
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
    "generaCFDIV40CPagosPaseResult"
})
@XmlRootElement(name = "GeneraCFDIV40CPagosPaseResponse")
public class GeneraCFDIV40CPagosPaseResponse {

    @XmlElement(name = "GeneraCFDIV40CPagosPaseResult")
    protected CFDIResponse40ComplementoDePagos generaCFDIV40CPagosPaseResult;

    /**
     * Obtiene el valor de la propiedad generaCFDIV40CPagosPaseResult.
     * 
     * @return
     *     possible object is
     *     {@link CFDIResponse40ComplementoDePagos }
     *     
     */
    public CFDIResponse40ComplementoDePagos getGeneraCFDIV40CPagosPaseResult() {
        return generaCFDIV40CPagosPaseResult;
    }

    /**
     * Define el valor de la propiedad generaCFDIV40CPagosPaseResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDIResponse40ComplementoDePagos }
     *     
     */
    public void setGeneraCFDIV40CPagosPaseResult(CFDIResponse40ComplementoDePagos value) {
        this.generaCFDIV40CPagosPaseResult = value;
    }

}
