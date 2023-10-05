
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
 *         &lt;element name="FacturasPendientesRequest" type="{http://tempuri.org/}FacturasPendientesRequest" minOccurs="0"/&gt;
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
    "facturasPendientesRequest"
})
@XmlRootElement(name = "ObtenFacturasPendientesAceptacion")
public class ObtenFacturasPendientesAceptacion {

    @XmlElement(name = "FacturasPendientesRequest")
    protected FacturasPendientesRequest facturasPendientesRequest;

    /**
     * Obtiene el valor de la propiedad facturasPendientesRequest.
     * 
     * @return
     *     possible object is
     *     {@link FacturasPendientesRequest }
     *     
     */
    public FacturasPendientesRequest getFacturasPendientesRequest() {
        return facturasPendientesRequest;
    }

    /**
     * Define el valor de la propiedad facturasPendientesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturasPendientesRequest }
     *     
     */
    public void setFacturasPendientesRequest(FacturasPendientesRequest value) {
        this.facturasPendientesRequest = value;
    }

}
