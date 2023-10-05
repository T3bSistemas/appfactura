
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
 *         &lt;element name="CambiaDecimalesV33Result" type="{http://tempuri.org/}DecimalesResponse" minOccurs="0"/&gt;
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
    "cambiaDecimalesV33Result"
})
@XmlRootElement(name = "CambiaDecimalesV33Response")
public class CambiaDecimalesV33Response {

    @XmlElement(name = "CambiaDecimalesV33Result")
    protected DecimalesResponse cambiaDecimalesV33Result;

    /**
     * Obtiene el valor de la propiedad cambiaDecimalesV33Result.
     * 
     * @return
     *     possible object is
     *     {@link DecimalesResponse }
     *     
     */
    public DecimalesResponse getCambiaDecimalesV33Result() {
        return cambiaDecimalesV33Result;
    }

    /**
     * Define el valor de la propiedad cambiaDecimalesV33Result.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalesResponse }
     *     
     */
    public void setCambiaDecimalesV33Result(DecimalesResponse value) {
        this.cambiaDecimalesV33Result = value;
    }

}
