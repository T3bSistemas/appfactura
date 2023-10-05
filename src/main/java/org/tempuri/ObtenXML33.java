
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
 *         &lt;element name="xmlrequest" type="{http://tempuri.org/}XMLCFDIRequest" minOccurs="0"/&gt;
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
    "xmlrequest"
})
@XmlRootElement(name = "ObtenXML33")
public class ObtenXML33 {

    protected XMLCFDIRequest xmlrequest;

    /**
     * Obtiene el valor de la propiedad xmlrequest.
     * 
     * @return
     *     possible object is
     *     {@link XMLCFDIRequest }
     *     
     */
    public XMLCFDIRequest getXmlrequest() {
        return xmlrequest;
    }

    /**
     * Define el valor de la propiedad xmlrequest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLCFDIRequest }
     *     
     */
    public void setXmlrequest(XMLCFDIRequest value) {
        this.xmlrequest = value;
    }

}
