
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
 *         &lt;element name="GeneraRetencionResult" type="{http://tempuri.org/}RetencionesResponse" minOccurs="0"/&gt;
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
    "generaRetencionResult"
})
@XmlRootElement(name = "GeneraRetencionResponse")
public class GeneraRetencionResponse {

    @XmlElement(name = "GeneraRetencionResult")
    protected RetencionesResponse generaRetencionResult;

    /**
     * Obtiene el valor de la propiedad generaRetencionResult.
     * 
     * @return
     *     possible object is
     *     {@link RetencionesResponse }
     *     
     */
    public RetencionesResponse getGeneraRetencionResult() {
        return generaRetencionResult;
    }

    /**
     * Define el valor de la propiedad generaRetencionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RetencionesResponse }
     *     
     */
    public void setGeneraRetencionResult(RetencionesResponse value) {
        this.generaRetencionResult = value;
    }

}
