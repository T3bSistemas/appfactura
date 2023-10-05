
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
 *         &lt;element name="FielRequest" type="{http://tempuri.org/}FielRequest" minOccurs="0"/&gt;
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
    "fielRequest"
})
@XmlRootElement(name = "FirmaContrato")
public class FirmaContrato {

    @XmlElement(name = "FielRequest")
    protected FielRequest fielRequest;

    /**
     * Obtiene el valor de la propiedad fielRequest.
     * 
     * @return
     *     possible object is
     *     {@link FielRequest }
     *     
     */
    public FielRequest getFielRequest() {
        return fielRequest;
    }

    /**
     * Define el valor de la propiedad fielRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link FielRequest }
     *     
     */
    public void setFielRequest(FielRequest value) {
        this.fielRequest = value;
    }

}
