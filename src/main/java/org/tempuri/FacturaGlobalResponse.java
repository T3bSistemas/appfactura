
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FacturaGlobalResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturaGlobalResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="l_DatosTicket" type="{http://tempuri.org/}ArrayOfDatosTickets" minOccurs="0"/&gt;
 *         &lt;element name="ticketsCorrecto" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaGlobalResponse", propOrder = {
    "lDatosTicket",
    "ticketsCorrecto",
    "mensaje"
})
public class FacturaGlobalResponse {

    @XmlElement(name = "l_DatosTicket")
    protected ArrayOfDatosTickets lDatosTicket;
    protected boolean ticketsCorrecto;
    @XmlElement(name = "Mensaje")
    protected String mensaje;

    /**
     * Obtiene el valor de la propiedad lDatosTicket.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDatosTickets }
     *     
     */
    public ArrayOfDatosTickets getLDatosTicket() {
        return lDatosTicket;
    }

    /**
     * Define el valor de la propiedad lDatosTicket.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDatosTickets }
     *     
     */
    public void setLDatosTicket(ArrayOfDatosTickets value) {
        this.lDatosTicket = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketsCorrecto.
     * 
     */
    public boolean isTicketsCorrecto() {
        return ticketsCorrecto;
    }

    /**
     * Define el valor de la propiedad ticketsCorrecto.
     * 
     */
    public void setTicketsCorrecto(boolean value) {
        this.ticketsCorrecto = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

}
