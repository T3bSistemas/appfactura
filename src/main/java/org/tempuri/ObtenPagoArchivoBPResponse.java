
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
 *         &lt;element name="ObtenPagoArchivoBPResult" type="{http://tempuri.org/}CPagoBPResponse" minOccurs="0"/&gt;
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
    "obtenPagoArchivoBPResult"
})
@XmlRootElement(name = "ObtenPagoArchivoBPResponse")
public class ObtenPagoArchivoBPResponse {

    @XmlElement(name = "ObtenPagoArchivoBPResult")
    protected CPagoBPResponse obtenPagoArchivoBPResult;

    /**
     * Obtiene el valor de la propiedad obtenPagoArchivoBPResult.
     * 
     * @return
     *     possible object is
     *     {@link CPagoBPResponse }
     *     
     */
    public CPagoBPResponse getObtenPagoArchivoBPResult() {
        return obtenPagoArchivoBPResult;
    }

    /**
     * Define el valor de la propiedad obtenPagoArchivoBPResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CPagoBPResponse }
     *     
     */
    public void setObtenPagoArchivoBPResult(CPagoBPResponse value) {
        this.obtenPagoArchivoBPResult = value;
    }

}
