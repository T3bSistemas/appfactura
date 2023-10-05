
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
 *         &lt;element name="decimalesRequest" type="{http://tempuri.org/}DecimalesRequest" minOccurs="0"/&gt;
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
    "decimalesRequest"
})
@XmlRootElement(name = "CambiaDecimalesV33")
public class CambiaDecimalesV33 {

    protected DecimalesRequest decimalesRequest;

    /**
     * Obtiene el valor de la propiedad decimalesRequest.
     * 
     * @return
     *     possible object is
     *     {@link DecimalesRequest }
     *     
     */
    public DecimalesRequest getDecimalesRequest() {
        return decimalesRequest;
    }

    /**
     * Define el valor de la propiedad decimalesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalesRequest }
     *     
     */
    public void setDecimalesRequest(DecimalesRequest value) {
        this.decimalesRequest = value;
    }

}
