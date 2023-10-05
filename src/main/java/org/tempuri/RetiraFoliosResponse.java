
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
 *         &lt;element name="RetiraFoliosResult" type="{http://tempuri.org/}ResponseAsignacion" minOccurs="0"/&gt;
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
    "retiraFoliosResult"
})
@XmlRootElement(name = "RetiraFoliosResponse")
public class RetiraFoliosResponse {

    @XmlElement(name = "RetiraFoliosResult")
    protected ResponseAsignacion retiraFoliosResult;

    /**
     * Obtiene el valor de la propiedad retiraFoliosResult.
     * 
     * @return
     *     possible object is
     *     {@link ResponseAsignacion }
     *     
     */
    public ResponseAsignacion getRetiraFoliosResult() {
        return retiraFoliosResult;
    }

    /**
     * Define el valor de la propiedad retiraFoliosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseAsignacion }
     *     
     */
    public void setRetiraFoliosResult(ResponseAsignacion value) {
        this.retiraFoliosResult = value;
    }

}
