
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
 *         &lt;element name="IntroduceDatosTicketV40LancetaResult" type="{http://tempuri.org/}TicketResponse40Lanceta" minOccurs="0"/&gt;
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
    "introduceDatosTicketV40LancetaResult"
})
@XmlRootElement(name = "IntroduceDatosTicketV40LancetaResponse")
public class IntroduceDatosTicketV40LancetaResponse {

    @XmlElement(name = "IntroduceDatosTicketV40LancetaResult")
    protected TicketResponse40Lanceta introduceDatosTicketV40LancetaResult;

    /**
     * Obtiene el valor de la propiedad introduceDatosTicketV40LancetaResult.
     * 
     * @return
     *     possible object is
     *     {@link TicketResponse40Lanceta }
     *     
     */
    public TicketResponse40Lanceta getIntroduceDatosTicketV40LancetaResult() {
        return introduceDatosTicketV40LancetaResult;
    }

    /**
     * Define el valor de la propiedad introduceDatosTicketV40LancetaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketResponse40Lanceta }
     *     
     */
    public void setIntroduceDatosTicketV40LancetaResult(TicketResponse40Lanceta value) {
        this.introduceDatosTicketV40LancetaResult = value;
    }

}
