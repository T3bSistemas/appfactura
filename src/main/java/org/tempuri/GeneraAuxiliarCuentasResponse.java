
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
 *         &lt;element name="GeneraAuxiliarCuentasResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "generaAuxiliarCuentasResult"
})
@XmlRootElement(name = "GeneraAuxiliarCuentasResponse")
public class GeneraAuxiliarCuentasResponse {

    @XmlElement(name = "GeneraAuxiliarCuentasResult")
    protected String generaAuxiliarCuentasResult;

    /**
     * Obtiene el valor de la propiedad generaAuxiliarCuentasResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneraAuxiliarCuentasResult() {
        return generaAuxiliarCuentasResult;
    }

    /**
     * Define el valor de la propiedad generaAuxiliarCuentasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneraAuxiliarCuentasResult(String value) {
        this.generaAuxiliarCuentasResult = value;
    }

}
