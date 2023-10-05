
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
 *         &lt;element name="validaRequest" type="{http://tempuri.org/}ValidaCFDI33Request" minOccurs="0"/&gt;
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
    "validaRequest"
})
@XmlRootElement(name = "ValidaCFDIV33")
public class ValidaCFDIV33 {

    protected ValidaCFDI33Request validaRequest;

    /**
     * Obtiene el valor de la propiedad validaRequest.
     * 
     * @return
     *     possible object is
     *     {@link ValidaCFDI33Request }
     *     
     */
    public ValidaCFDI33Request getValidaRequest() {
        return validaRequest;
    }

    /**
     * Define el valor de la propiedad validaRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidaCFDI33Request }
     *     
     */
    public void setValidaRequest(ValidaCFDI33Request value) {
        this.validaRequest = value;
    }

}
