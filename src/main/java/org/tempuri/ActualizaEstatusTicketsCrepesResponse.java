
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
 *         &lt;element name="ActualizaEstatusTicketsCrepesResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "actualizaEstatusTicketsCrepesResult"
})
@XmlRootElement(name = "ActualizaEstatusTicketsCrepesResponse")
public class ActualizaEstatusTicketsCrepesResponse {

    @XmlElement(name = "ActualizaEstatusTicketsCrepesResult")
    protected boolean actualizaEstatusTicketsCrepesResult;

    /**
     * Obtiene el valor de la propiedad actualizaEstatusTicketsCrepesResult.
     * 
     */
    public boolean isActualizaEstatusTicketsCrepesResult() {
        return actualizaEstatusTicketsCrepesResult;
    }

    /**
     * Define el valor de la propiedad actualizaEstatusTicketsCrepesResult.
     * 
     */
    public void setActualizaEstatusTicketsCrepesResult(boolean value) {
        this.actualizaEstatusTicketsCrepesResult = value;
    }

}
