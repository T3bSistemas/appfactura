
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
 *         &lt;element name="EnvioCorreosBPDownstreamResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "envioCorreosBPDownstreamResult"
})
@XmlRootElement(name = "EnvioCorreosBPDownstreamResponse")
public class EnvioCorreosBPDownstreamResponse {

    @XmlElement(name = "EnvioCorreosBPDownstreamResult")
    protected String envioCorreosBPDownstreamResult;

    /**
     * Obtiene el valor de la propiedad envioCorreosBPDownstreamResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvioCorreosBPDownstreamResult() {
        return envioCorreosBPDownstreamResult;
    }

    /**
     * Define el valor de la propiedad envioCorreosBPDownstreamResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvioCorreosBPDownstreamResult(String value) {
        this.envioCorreosBPDownstreamResult = value;
    }

}
