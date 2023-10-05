
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
 *         &lt;element name="ObtenXMLRelacionadosResult" type="{http://tempuri.org/}PagosBPResponse" minOccurs="0"/&gt;
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
    "obtenXMLRelacionadosResult"
})
@XmlRootElement(name = "ObtenXMLRelacionadosResponse")
public class ObtenXMLRelacionadosResponse {

    @XmlElement(name = "ObtenXMLRelacionadosResult")
    protected PagosBPResponse obtenXMLRelacionadosResult;

    /**
     * Obtiene el valor de la propiedad obtenXMLRelacionadosResult.
     * 
     * @return
     *     possible object is
     *     {@link PagosBPResponse }
     *     
     */
    public PagosBPResponse getObtenXMLRelacionadosResult() {
        return obtenXMLRelacionadosResult;
    }

    /**
     * Define el valor de la propiedad obtenXMLRelacionadosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link PagosBPResponse }
     *     
     */
    public void setObtenXMLRelacionadosResult(PagosBPResponse value) {
        this.obtenXMLRelacionadosResult = value;
    }

}
