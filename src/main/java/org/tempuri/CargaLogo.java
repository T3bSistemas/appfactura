
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
 *         &lt;element name="logoRequest" type="{http://tempuri.org/}LogoRequest" minOccurs="0"/&gt;
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
    "logoRequest"
})
@XmlRootElement(name = "CargaLogo")
public class CargaLogo {

    protected LogoRequest logoRequest;

    /**
     * Obtiene el valor de la propiedad logoRequest.
     * 
     * @return
     *     possible object is
     *     {@link LogoRequest }
     *     
     */
    public LogoRequest getLogoRequest() {
        return logoRequest;
    }

    /**
     * Define el valor de la propiedad logoRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoRequest }
     *     
     */
    public void setLogoRequest(LogoRequest value) {
        this.logoRequest = value;
    }

}
