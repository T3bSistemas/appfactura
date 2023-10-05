
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
 *         &lt;element name="GeneraCFDPlusV40ComplementoDePagosResult" type="{http://tempuri.org/}CFDITimbradoPlusReponse40ComplementoDePagos" minOccurs="0"/&gt;
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
    "generaCFDPlusV40ComplementoDePagosResult"
})
@XmlRootElement(name = "GeneraCFDPlusV40ComplementoDePagosResponse")
public class GeneraCFDPlusV40ComplementoDePagosResponse {

    @XmlElement(name = "GeneraCFDPlusV40ComplementoDePagosResult")
    protected CFDITimbradoPlusReponse40ComplementoDePagos generaCFDPlusV40ComplementoDePagosResult;

    /**
     * Obtiene el valor de la propiedad generaCFDPlusV40ComplementoDePagosResult.
     * 
     * @return
     *     possible object is
     *     {@link CFDITimbradoPlusReponse40ComplementoDePagos }
     *     
     */
    public CFDITimbradoPlusReponse40ComplementoDePagos getGeneraCFDPlusV40ComplementoDePagosResult() {
        return generaCFDPlusV40ComplementoDePagosResult;
    }

    /**
     * Define el valor de la propiedad generaCFDPlusV40ComplementoDePagosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDITimbradoPlusReponse40ComplementoDePagos }
     *     
     */
    public void setGeneraCFDPlusV40ComplementoDePagosResult(CFDITimbradoPlusReponse40ComplementoDePagos value) {
        this.generaCFDPlusV40ComplementoDePagosResult = value;
    }

}
