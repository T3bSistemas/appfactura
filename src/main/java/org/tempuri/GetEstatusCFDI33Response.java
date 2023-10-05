
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
 *         &lt;element name="GetEstatusCFDI33Result" type="{http://tempuri.org/}CancelacionV33ResponseConsulta" minOccurs="0"/&gt;
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
    "getEstatusCFDI33Result"
})
@XmlRootElement(name = "GetEstatusCFDI33Response")
public class GetEstatusCFDI33Response {

    @XmlElement(name = "GetEstatusCFDI33Result")
    protected CancelacionV33ResponseConsulta getEstatusCFDI33Result;

    /**
     * Obtiene el valor de la propiedad getEstatusCFDI33Result.
     * 
     * @return
     *     possible object is
     *     {@link CancelacionV33ResponseConsulta }
     *     
     */
    public CancelacionV33ResponseConsulta getGetEstatusCFDI33Result() {
        return getEstatusCFDI33Result;
    }

    /**
     * Define el valor de la propiedad getEstatusCFDI33Result.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelacionV33ResponseConsulta }
     *     
     */
    public void setGetEstatusCFDI33Result(CancelacionV33ResponseConsulta value) {
        this.getEstatusCFDI33Result = value;
    }

}
