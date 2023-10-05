
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
 *         &lt;element name="CargaSerieResult" type="{http://tempuri.org/}DataResponseCreate" minOccurs="0"/&gt;
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
    "cargaSerieResult"
})
@XmlRootElement(name = "CargaSerieResponse")
public class CargaSerieResponse {

    @XmlElement(name = "CargaSerieResult")
    protected DataResponseCreate cargaSerieResult;

    /**
     * Obtiene el valor de la propiedad cargaSerieResult.
     * 
     * @return
     *     possible object is
     *     {@link DataResponseCreate }
     *     
     */
    public DataResponseCreate getCargaSerieResult() {
        return cargaSerieResult;
    }

    /**
     * Define el valor de la propiedad cargaSerieResult.
     * 
     * @param value
     *     allowed object is
     *     {@link DataResponseCreate }
     *     
     */
    public void setCargaSerieResult(DataResponseCreate value) {
        this.cargaSerieResult = value;
    }

}
