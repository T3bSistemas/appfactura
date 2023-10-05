
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
 *         &lt;element name="FirmaContratoResult" type="{http://tempuri.org/}DataResponseFielB64" minOccurs="0"/&gt;
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
    "firmaContratoResult"
})
@XmlRootElement(name = "FirmaContratoResponse")
public class FirmaContratoResponse {

    @XmlElement(name = "FirmaContratoResult")
    protected DataResponseFielB64 firmaContratoResult;

    /**
     * Obtiene el valor de la propiedad firmaContratoResult.
     * 
     * @return
     *     possible object is
     *     {@link DataResponseFielB64 }
     *     
     */
    public DataResponseFielB64 getFirmaContratoResult() {
        return firmaContratoResult;
    }

    /**
     * Define el valor de la propiedad firmaContratoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link DataResponseFielB64 }
     *     
     */
    public void setFirmaContratoResult(DataResponseFielB64 value) {
        this.firmaContratoResult = value;
    }

}
