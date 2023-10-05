
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
 *         &lt;element name="GeneraTimbradoEFResult" type="{http://tempuri.org/}EFResponse" minOccurs="0"/&gt;
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
    "generaTimbradoEFResult"
})
@XmlRootElement(name = "GeneraTimbradoEFResponse")
public class GeneraTimbradoEFResponse {

    @XmlElement(name = "GeneraTimbradoEFResult")
    protected EFResponse generaTimbradoEFResult;

    /**
     * Obtiene el valor de la propiedad generaTimbradoEFResult.
     * 
     * @return
     *     possible object is
     *     {@link EFResponse }
     *     
     */
    public EFResponse getGeneraTimbradoEFResult() {
        return generaTimbradoEFResult;
    }

    /**
     * Define el valor de la propiedad generaTimbradoEFResult.
     * 
     * @param value
     *     allowed object is
     *     {@link EFResponse }
     *     
     */
    public void setGeneraTimbradoEFResult(EFResponse value) {
        this.generaTimbradoEFResult = value;
    }

}
