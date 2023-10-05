
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
 *         &lt;element name="InsertaClienteResult" type="{http://tempuri.org/}ClienteResponse" minOccurs="0"/&gt;
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
    "insertaClienteResult"
})
@XmlRootElement(name = "InsertaClienteResponse")
public class InsertaClienteResponse {

    @XmlElement(name = "InsertaClienteResult")
    protected ClienteResponse insertaClienteResult;

    /**
     * Obtiene el valor de la propiedad insertaClienteResult.
     * 
     * @return
     *     possible object is
     *     {@link ClienteResponse }
     *     
     */
    public ClienteResponse getInsertaClienteResult() {
        return insertaClienteResult;
    }

    /**
     * Define el valor de la propiedad insertaClienteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteResponse }
     *     
     */
    public void setInsertaClienteResult(ClienteResponse value) {
        this.insertaClienteResult = value;
    }

}
