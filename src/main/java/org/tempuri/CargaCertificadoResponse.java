
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
 *         &lt;element name="CargaCertificadoResult" type="{http://tempuri.org/}DataResponseCreate" minOccurs="0"/&gt;
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
    "cargaCertificadoResult"
})
@XmlRootElement(name = "CargaCertificadoResponse")
public class CargaCertificadoResponse {

    @XmlElement(name = "CargaCertificadoResult")
    protected DataResponseCreate cargaCertificadoResult;

    /**
     * Obtiene el valor de la propiedad cargaCertificadoResult.
     * 
     * @return
     *     possible object is
     *     {@link DataResponseCreate }
     *     
     */
    public DataResponseCreate getCargaCertificadoResult() {
        return cargaCertificadoResult;
    }

    /**
     * Define el valor de la propiedad cargaCertificadoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link DataResponseCreate }
     *     
     */
    public void setCargaCertificadoResult(DataResponseCreate value) {
        this.cargaCertificadoResult = value;
    }

}
