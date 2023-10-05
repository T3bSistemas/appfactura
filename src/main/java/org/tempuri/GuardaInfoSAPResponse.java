
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
 *         &lt;element name="GuardaInfoSAPResult" type="{http://tempuri.org/}SAPResponse" minOccurs="0"/&gt;
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
    "guardaInfoSAPResult"
})
@XmlRootElement(name = "GuardaInfoSAPResponse")
public class GuardaInfoSAPResponse {

    @XmlElement(name = "GuardaInfoSAPResult")
    protected SAPResponse guardaInfoSAPResult;

    /**
     * Obtiene el valor de la propiedad guardaInfoSAPResult.
     * 
     * @return
     *     possible object is
     *     {@link SAPResponse }
     *     
     */
    public SAPResponse getGuardaInfoSAPResult() {
        return guardaInfoSAPResult;
    }

    /**
     * Define el valor de la propiedad guardaInfoSAPResult.
     * 
     * @param value
     *     allowed object is
     *     {@link SAPResponse }
     *     
     */
    public void setGuardaInfoSAPResult(SAPResponse value) {
        this.guardaInfoSAPResult = value;
    }

}
