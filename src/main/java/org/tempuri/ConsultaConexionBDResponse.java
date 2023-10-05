
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
 *         &lt;element name="ConsultaConexionBDResult" type="{http://tempuri.org/}ConexionResponse" minOccurs="0"/&gt;
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
    "consultaConexionBDResult"
})
@XmlRootElement(name = "ConsultaConexionBDResponse")
public class ConsultaConexionBDResponse {

    @XmlElement(name = "ConsultaConexionBDResult")
    protected ConexionResponse consultaConexionBDResult;

    /**
     * Obtiene el valor de la propiedad consultaConexionBDResult.
     * 
     * @return
     *     possible object is
     *     {@link ConexionResponse }
     *     
     */
    public ConexionResponse getConsultaConexionBDResult() {
        return consultaConexionBDResult;
    }

    /**
     * Define el valor de la propiedad consultaConexionBDResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ConexionResponse }
     *     
     */
    public void setConsultaConexionBDResult(ConexionResponse value) {
        this.consultaConexionBDResult = value;
    }

}
