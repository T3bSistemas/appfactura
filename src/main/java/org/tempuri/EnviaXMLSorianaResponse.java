
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
 *         &lt;element name="EnviaXMLSorianaResult" type="{http://tempuri.org/}SorianaResponse" minOccurs="0"/&gt;
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
    "enviaXMLSorianaResult"
})
@XmlRootElement(name = "EnviaXMLSorianaResponse")
public class EnviaXMLSorianaResponse {

    @XmlElement(name = "EnviaXMLSorianaResult")
    protected SorianaResponse enviaXMLSorianaResult;

    /**
     * Obtiene el valor de la propiedad enviaXMLSorianaResult.
     * 
     * @return
     *     possible object is
     *     {@link SorianaResponse }
     *     
     */
    public SorianaResponse getEnviaXMLSorianaResult() {
        return enviaXMLSorianaResult;
    }

    /**
     * Define el valor de la propiedad enviaXMLSorianaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link SorianaResponse }
     *     
     */
    public void setEnviaXMLSorianaResult(SorianaResponse value) {
        this.enviaXMLSorianaResult = value;
    }

}
