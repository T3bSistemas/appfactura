
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
 *         &lt;element name="IntroduceDatosTicketV40Result" type="{http://tempuri.org/}TicketResponse40" minOccurs="0"/&gt;
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
    "introduceDatosTicketV40Result"
})
@XmlRootElement(name = "IntroduceDatosTicketV40Response")
public class IntroduceDatosTicketV40Response {

    @XmlElement(name = "IntroduceDatosTicketV40Result")
    protected TicketResponse40 introduceDatosTicketV40Result;

    /**
     * Obtiene el valor de la propiedad introduceDatosTicketV40Result.
     * 
     * @return
     *     possible object is
     *     {@link TicketResponse40 }
     *     
     */
    public TicketResponse40 getIntroduceDatosTicketV40Result() {
        return introduceDatosTicketV40Result;
    }

    /**
     * Define el valor de la propiedad introduceDatosTicketV40Result.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketResponse40 }
     *     
     */
    public void setIntroduceDatosTicketV40Result(TicketResponse40 value) {
        this.introduceDatosTicketV40Result = value;
    }

}
