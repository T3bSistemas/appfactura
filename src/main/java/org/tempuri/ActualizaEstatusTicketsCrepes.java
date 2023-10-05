
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
 *         &lt;element name="facturaGRequest" type="{http://tempuri.org/}FacturaGlobalRequest" minOccurs="0"/&gt;
 *         &lt;element name="facturaGResponse" type="{http://tempuri.org/}FacturaGlobalResponse" minOccurs="0"/&gt;
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
    "facturaGRequest",
    "facturaGResponse"
})
@XmlRootElement(name = "ActualizaEstatusTicketsCrepes")
public class ActualizaEstatusTicketsCrepes {

    protected FacturaGlobalRequest facturaGRequest;
    protected FacturaGlobalResponse facturaGResponse;

    /**
     * Obtiene el valor de la propiedad facturaGRequest.
     * 
     * @return
     *     possible object is
     *     {@link FacturaGlobalRequest }
     *     
     */
    public FacturaGlobalRequest getFacturaGRequest() {
        return facturaGRequest;
    }

    /**
     * Define el valor de la propiedad facturaGRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaGlobalRequest }
     *     
     */
    public void setFacturaGRequest(FacturaGlobalRequest value) {
        this.facturaGRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad facturaGResponse.
     * 
     * @return
     *     possible object is
     *     {@link FacturaGlobalResponse }
     *     
     */
    public FacturaGlobalResponse getFacturaGResponse() {
        return facturaGResponse;
    }

    /**
     * Define el valor de la propiedad facturaGResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaGlobalResponse }
     *     
     */
    public void setFacturaGResponse(FacturaGlobalResponse value) {
        this.facturaGResponse = value;
    }

}
