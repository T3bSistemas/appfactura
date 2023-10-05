
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
 *         &lt;element name="CargaLogoResult" type="{http://tempuri.org/}LogoResponse" minOccurs="0"/&gt;
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
    "cargaLogoResult"
})
@XmlRootElement(name = "CargaLogoResponse")
public class CargaLogoResponse {

    @XmlElement(name = "CargaLogoResult")
    protected LogoResponse cargaLogoResult;

    /**
     * Obtiene el valor de la propiedad cargaLogoResult.
     * 
     * @return
     *     possible object is
     *     {@link LogoResponse }
     *     
     */
    public LogoResponse getCargaLogoResult() {
        return cargaLogoResult;
    }

    /**
     * Define el valor de la propiedad cargaLogoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoResponse }
     *     
     */
    public void setCargaLogoResult(LogoResponse value) {
        this.cargaLogoResult = value;
    }

}
