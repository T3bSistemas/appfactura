
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
 *         &lt;element name="requets" type="{http://tempuri.org/}RequestAsignacion" minOccurs="0"/&gt;
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
    "requets"
})
@XmlRootElement(name = "RetiraFolios")
public class RetiraFolios {

    protected RequestAsignacion requets;

    /**
     * Obtiene el valor de la propiedad requets.
     * 
     * @return
     *     possible object is
     *     {@link RequestAsignacion }
     *     
     */
    public RequestAsignacion getRequets() {
        return requets;
    }

    /**
     * Define el valor de la propiedad requets.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestAsignacion }
     *     
     */
    public void setRequets(RequestAsignacion value) {
        this.requets = value;
    }

}
