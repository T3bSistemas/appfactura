
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
 *         &lt;element name="ObtenXML33Result" type="{http://tempuri.org/}XMLCFDIResponse" minOccurs="0"/&gt;
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
    "obtenXML33Result"
})
@XmlRootElement(name = "ObtenXML33Response")
public class ObtenXML33Response {

    @XmlElement(name = "ObtenXML33Result")
    protected XMLCFDIResponse obtenXML33Result;

    /**
     * Obtiene el valor de la propiedad obtenXML33Result.
     * 
     * @return
     *     possible object is
     *     {@link XMLCFDIResponse }
     *     
     */
    public XMLCFDIResponse getObtenXML33Result() {
        return obtenXML33Result;
    }

    /**
     * Define el valor de la propiedad obtenXML33Result.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLCFDIResponse }
     *     
     */
    public void setObtenXML33Result(XMLCFDIResponse value) {
        this.obtenXML33Result = value;
    }

}
