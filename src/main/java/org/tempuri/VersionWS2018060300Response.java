
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
 *         &lt;element name="VersionWS20180603_00Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "versionWS2018060300Result"
})
@XmlRootElement(name = "VersionWS20180603_00Response")
public class VersionWS2018060300Response {

    @XmlElement(name = "VersionWS20180603_00Result")
    protected String versionWS2018060300Result;

    /**
     * Obtiene el valor de la propiedad versionWS2018060300Result.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionWS2018060300Result() {
        return versionWS2018060300Result;
    }

    /**
     * Define el valor de la propiedad versionWS2018060300Result.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionWS2018060300Result(String value) {
        this.versionWS2018060300Result = value;
    }

}
