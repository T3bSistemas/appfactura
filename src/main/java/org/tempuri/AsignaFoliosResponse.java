
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
 *         &lt;element name="AsignaFoliosResult" type="{http://tempuri.org/}ResponseAsignacion" minOccurs="0"/&gt;
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
    "asignaFoliosResult"
})
@XmlRootElement(name = "AsignaFoliosResponse")
public class AsignaFoliosResponse {

    @XmlElement(name = "AsignaFoliosResult")
    protected ResponseAsignacion asignaFoliosResult;

    /**
     * Obtiene el valor de la propiedad asignaFoliosResult.
     * 
     * @return
     *     possible object is
     *     {@link ResponseAsignacion }
     *     
     */
    public ResponseAsignacion getAsignaFoliosResult() {
        return asignaFoliosResult;
    }

    /**
     * Define el valor de la propiedad asignaFoliosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseAsignacion }
     *     
     */
    public void setAsignaFoliosResult(ResponseAsignacion value) {
        this.asignaFoliosResult = value;
    }

}
