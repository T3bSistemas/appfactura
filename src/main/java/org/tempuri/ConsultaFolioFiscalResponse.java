
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
 *         &lt;element name="ConsultaFolioFiscalResult" type="{http://tempuri.org/}ConsultaFolioFiscalResponse2" minOccurs="0"/&gt;
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
    "consultaFolioFiscalResult"
})
@XmlRootElement(name = "ConsultaFolioFiscalResponse")
public class ConsultaFolioFiscalResponse {

    @XmlElement(name = "ConsultaFolioFiscalResult")
    protected ConsultaFolioFiscalResponse2 consultaFolioFiscalResult;

    /**
     * Obtiene el valor de la propiedad consultaFolioFiscalResult.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaFolioFiscalResponse2 }
     *     
     */
    public ConsultaFolioFiscalResponse2 getConsultaFolioFiscalResult() {
        return consultaFolioFiscalResult;
    }

    /**
     * Define el valor de la propiedad consultaFolioFiscalResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaFolioFiscalResponse2 }
     *     
     */
    public void setConsultaFolioFiscalResult(ConsultaFolioFiscalResponse2 value) {
        this.consultaFolioFiscalResult = value;
    }

}
