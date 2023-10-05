
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ValidacionFacturaRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ValidacionFacturaRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XMLB64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidacionFacturaRequest", propOrder = {
    "xmlb64"
})
public class ValidacionFacturaRequest {

    @XmlElement(name = "XMLB64")
    protected String xmlb64;

    /**
     * Obtiene el valor de la propiedad xmlb64.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLB64() {
        return xmlb64;
    }

    /**
     * Define el valor de la propiedad xmlb64.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLB64(String value) {
        this.xmlb64 = value;
    }

}
