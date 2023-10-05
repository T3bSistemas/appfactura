
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
 *         &lt;element name="requestOtroPac" type="{http://tempuri.org/}CancelacionRequestOtroPac" minOccurs="0"/&gt;
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
    "requestOtroPac"
})
@XmlRootElement(name = "SubeArchivoOtroPac")
public class SubeArchivoOtroPac {

    protected CancelacionRequestOtroPac requestOtroPac;

    /**
     * Obtiene el valor de la propiedad requestOtroPac.
     * 
     * @return
     *     possible object is
     *     {@link CancelacionRequestOtroPac }
     *     
     */
    public CancelacionRequestOtroPac getRequestOtroPac() {
        return requestOtroPac;
    }

    /**
     * Define el valor de la propiedad requestOtroPac.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelacionRequestOtroPac }
     *     
     */
    public void setRequestOtroPac(CancelacionRequestOtroPac value) {
        this.requestOtroPac = value;
    }

}
