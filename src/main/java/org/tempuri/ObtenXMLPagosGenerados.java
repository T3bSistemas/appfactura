
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="pagosBPRequest" type="{http://tempuri.org/}PagosBPRequest" minOccurs="0"/&gt;
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
    "pagosBPRequest"
})
@XmlRootElement(name = "ObtenXMLPagosGenerados")
public class ObtenXMLPagosGenerados {

    protected PagosBPRequest pagosBPRequest;

    /**
     * Obtiene el valor de la propiedad pagosBPRequest.
     * 
     * @return
     *     possible object is
     *     {@link PagosBPRequest }
     *     
     */
    public PagosBPRequest getPagosBPRequest() {
        return pagosBPRequest;
    }

    /**
     * Define el valor de la propiedad pagosBPRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link PagosBPRequest }
     *     
     */
    public void setPagosBPRequest(PagosBPRequest value) {
        this.pagosBPRequest = value;
    }

}
