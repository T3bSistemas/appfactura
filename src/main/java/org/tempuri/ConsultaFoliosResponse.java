
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
 *         &lt;element name="ConsultaFoliosResult" type="{http://tempuri.org/}ResponseAsignacion" minOccurs="0"/&gt;
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
    "consultaFoliosResult"
})
@XmlRootElement(name = "ConsultaFoliosResponse")
public class ConsultaFoliosResponse {

    @XmlElement(name = "ConsultaFoliosResult")
    protected ResponseAsignacion consultaFoliosResult;

    /**
     * Obtiene el valor de la propiedad consultaFoliosResult.
     * 
     * @return
     *     possible object is
     *     {@link ResponseAsignacion }
     *     
     */
    public ResponseAsignacion getConsultaFoliosResult() {
        return consultaFoliosResult;
    }

    /**
     * Define el valor de la propiedad consultaFoliosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseAsignacion }
     *     
     */
    public void setConsultaFoliosResult(ResponseAsignacion value) {
        this.consultaFoliosResult = value;
    }

}
