
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
 *         &lt;element name="SorianaRequest" type="{http://tempuri.org/}SorianaRequest" minOccurs="0"/&gt;
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
    "sorianaRequest"
})
@XmlRootElement(name = "EnviaXMLSoriana")
public class EnviaXMLSoriana {

    @XmlElement(name = "SorianaRequest")
    protected SorianaRequest sorianaRequest;

    /**
     * Obtiene el valor de la propiedad sorianaRequest.
     * 
     * @return
     *     possible object is
     *     {@link SorianaRequest }
     *     
     */
    public SorianaRequest getSorianaRequest() {
        return sorianaRequest;
    }

    /**
     * Define el valor de la propiedad sorianaRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link SorianaRequest }
     *     
     */
    public void setSorianaRequest(SorianaRequest value) {
        this.sorianaRequest = value;
    }

}
