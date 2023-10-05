
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
 *         &lt;element name="verificaDuplicidadRequest" type="{http://tempuri.org/}VerificaDuplicidadRequest" minOccurs="0"/&gt;
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
    "verificaDuplicidadRequest"
})
@XmlRootElement(name = "VerificaDuplicidad")
public class VerificaDuplicidad {

    protected VerificaDuplicidadRequest verificaDuplicidadRequest;

    /**
     * Obtiene el valor de la propiedad verificaDuplicidadRequest.
     * 
     * @return
     *     possible object is
     *     {@link VerificaDuplicidadRequest }
     *     
     */
    public VerificaDuplicidadRequest getVerificaDuplicidadRequest() {
        return verificaDuplicidadRequest;
    }

    /**
     * Define el valor de la propiedad verificaDuplicidadRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificaDuplicidadRequest }
     *     
     */
    public void setVerificaDuplicidadRequest(VerificaDuplicidadRequest value) {
        this.verificaDuplicidadRequest = value;
    }

}
