
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
 *         &lt;element name="AlmacenaXMLPaseResult" type="{http://tempuri.org/}PASEResponse" minOccurs="0"/&gt;
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
    "almacenaXMLPaseResult"
})
@XmlRootElement(name = "AlmacenaXMLPaseResponse")
public class AlmacenaXMLPaseResponse {

    @XmlElement(name = "AlmacenaXMLPaseResult")
    protected PASEResponse almacenaXMLPaseResult;

    /**
     * Obtiene el valor de la propiedad almacenaXMLPaseResult.
     * 
     * @return
     *     possible object is
     *     {@link PASEResponse }
     *     
     */
    public PASEResponse getAlmacenaXMLPaseResult() {
        return almacenaXMLPaseResult;
    }

    /**
     * Define el valor de la propiedad almacenaXMLPaseResult.
     * 
     * @param value
     *     allowed object is
     *     {@link PASEResponse }
     *     
     */
    public void setAlmacenaXMLPaseResult(PASEResponse value) {
        this.almacenaXMLPaseResult = value;
    }

}
