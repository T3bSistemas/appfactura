
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
 *         &lt;element name="RetencionesRequest" type="{http://tempuri.org/}RetencionesRequest" minOccurs="0"/&gt;
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
    "retencionesRequest"
})
@XmlRootElement(name = "GeneraRetencion")
public class GeneraRetencion {

    @XmlElement(name = "RetencionesRequest")
    protected RetencionesRequest retencionesRequest;

    /**
     * Obtiene el valor de la propiedad retencionesRequest.
     * 
     * @return
     *     possible object is
     *     {@link RetencionesRequest }
     *     
     */
    public RetencionesRequest getRetencionesRequest() {
        return retencionesRequest;
    }

    /**
     * Define el valor de la propiedad retencionesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link RetencionesRequest }
     *     
     */
    public void setRetencionesRequest(RetencionesRequest value) {
        this.retencionesRequest = value;
    }

}
