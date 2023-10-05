
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
 *         &lt;element name="SAPRequest" type="{http://tempuri.org/}SAPRequest" minOccurs="0"/&gt;
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
    "sapRequest"
})
@XmlRootElement(name = "GuardaInfoSAP")
public class GuardaInfoSAP {

    @XmlElement(name = "SAPRequest")
    protected SAPRequest sapRequest;

    /**
     * Obtiene el valor de la propiedad sapRequest.
     * 
     * @return
     *     possible object is
     *     {@link SAPRequest }
     *     
     */
    public SAPRequest getSAPRequest() {
        return sapRequest;
    }

    /**
     * Define el valor de la propiedad sapRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link SAPRequest }
     *     
     */
    public void setSAPRequest(SAPRequest value) {
        this.sapRequest = value;
    }

}
