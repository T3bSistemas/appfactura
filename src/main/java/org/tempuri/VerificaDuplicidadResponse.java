
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
 *         &lt;element name="VerificaDuplicidadResult" type="{http://tempuri.org/}VerificaDuplicidadResponse" minOccurs="0"/&gt;
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
    "verificaDuplicidadResult"
})
@XmlRootElement(name = "VerificaDuplicidadResponse")
public class VerificaDuplicidadResponse {

    @XmlElement(name = "VerificaDuplicidadResult")
    protected VerificaDuplicidadResponse2 verificaDuplicidadResult;

    /**
     * Obtiene el valor de la propiedad verificaDuplicidadResult.
     * 
     * @return
     *     possible object is
     *     {@link VerificaDuplicidadResponse2 }
     *     
     */
    public VerificaDuplicidadResponse2 getVerificaDuplicidadResult() {
        return verificaDuplicidadResult;
    }

    /**
     * Define el valor de la propiedad verificaDuplicidadResult.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificaDuplicidadResponse2 }
     *     
     */
    public void setVerificaDuplicidadResult(VerificaDuplicidadResponse2 value) {
        this.verificaDuplicidadResult = value;
    }

}
