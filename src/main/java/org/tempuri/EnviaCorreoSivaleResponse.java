
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
 *         &lt;element name="EnviaCorreoSivaleResult" type="{http://tempuri.org/}EnvioSiValeResponse" minOccurs="0"/&gt;
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
    "enviaCorreoSivaleResult"
})
@XmlRootElement(name = "EnviaCorreoSivaleResponse")
public class EnviaCorreoSivaleResponse {

    @XmlElement(name = "EnviaCorreoSivaleResult")
    protected EnvioSiValeResponse enviaCorreoSivaleResult;

    /**
     * Obtiene el valor de la propiedad enviaCorreoSivaleResult.
     * 
     * @return
     *     possible object is
     *     {@link EnvioSiValeResponse }
     *     
     */
    public EnvioSiValeResponse getEnviaCorreoSivaleResult() {
        return enviaCorreoSivaleResult;
    }

    /**
     * Define el valor de la propiedad enviaCorreoSivaleResult.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvioSiValeResponse }
     *     
     */
    public void setEnviaCorreoSivaleResult(EnvioSiValeResponse value) {
        this.enviaCorreoSivaleResult = value;
    }

}
