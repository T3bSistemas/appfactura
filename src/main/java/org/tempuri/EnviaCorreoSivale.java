
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
 *         &lt;element name="EnvioSiValeRequest" type="{http://tempuri.org/}EnvioSiValeRequest" minOccurs="0"/&gt;
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
    "envioSiValeRequest"
})
@XmlRootElement(name = "EnviaCorreoSivale")
public class EnviaCorreoSivale {

    @XmlElement(name = "EnvioSiValeRequest")
    protected EnvioSiValeRequest envioSiValeRequest;

    /**
     * Obtiene el valor de la propiedad envioSiValeRequest.
     * 
     * @return
     *     possible object is
     *     {@link EnvioSiValeRequest }
     *     
     */
    public EnvioSiValeRequest getEnvioSiValeRequest() {
        return envioSiValeRequest;
    }

    /**
     * Define el valor de la propiedad envioSiValeRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvioSiValeRequest }
     *     
     */
    public void setEnvioSiValeRequest(EnvioSiValeRequest value) {
        this.envioSiValeRequest = value;
    }

}
