
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
 *         &lt;element name="GetEstatusTFD33Result" type="{http://tempuri.org/}CancelacionV33ResponseConsulta" minOccurs="0"/&gt;
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
    "getEstatusTFD33Result"
})
@XmlRootElement(name = "GetEstatusTFD33Response")
public class GetEstatusTFD33Response {

    @XmlElement(name = "GetEstatusTFD33Result")
    protected CancelacionV33ResponseConsulta getEstatusTFD33Result;

    /**
     * Obtiene el valor de la propiedad getEstatusTFD33Result.
     * 
     * @return
     *     possible object is
     *     {@link CancelacionV33ResponseConsulta }
     *     
     */
    public CancelacionV33ResponseConsulta getGetEstatusTFD33Result() {
        return getEstatusTFD33Result;
    }

    /**
     * Define el valor de la propiedad getEstatusTFD33Result.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelacionV33ResponseConsulta }
     *     
     */
    public void setGetEstatusTFD33Result(CancelacionV33ResponseConsulta value) {
        this.getEstatusTFD33Result = value;
    }

}
