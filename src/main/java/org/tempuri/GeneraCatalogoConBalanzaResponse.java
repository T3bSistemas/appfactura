
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
 *         &lt;element name="GeneraCatalogoConBalanzaResult" type="{http://tempuri.org/}CatalogoBalanzaResponse" minOccurs="0"/&gt;
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
    "generaCatalogoConBalanzaResult"
})
@XmlRootElement(name = "GeneraCatalogoConBalanzaResponse")
public class GeneraCatalogoConBalanzaResponse {

    @XmlElement(name = "GeneraCatalogoConBalanzaResult")
    protected CatalogoBalanzaResponse generaCatalogoConBalanzaResult;

    /**
     * Obtiene el valor de la propiedad generaCatalogoConBalanzaResult.
     * 
     * @return
     *     possible object is
     *     {@link CatalogoBalanzaResponse }
     *     
     */
    public CatalogoBalanzaResponse getGeneraCatalogoConBalanzaResult() {
        return generaCatalogoConBalanzaResult;
    }

    /**
     * Define el valor de la propiedad generaCatalogoConBalanzaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogoBalanzaResponse }
     *     
     */
    public void setGeneraCatalogoConBalanzaResult(CatalogoBalanzaResponse value) {
        this.generaCatalogoConBalanzaResult = value;
    }

}
