
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para SAPResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SAPResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SAPCorrecto" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="belnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ausfd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAPResponse", propOrder = {
    "mensaje",
    "sapCorrecto",
    "belnr",
    "ausfd"
})
public class SAPResponse {

    @XmlElement(name = "Mensaje")
    protected String mensaje;
    @XmlElement(name = "SAPCorrecto")
    protected boolean sapCorrecto;
    protected String belnr;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ausfd;

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

    /**
     * Obtiene el valor de la propiedad sapCorrecto.
     * 
     */
    public boolean isSAPCorrecto() {
        return sapCorrecto;
    }

    /**
     * Define el valor de la propiedad sapCorrecto.
     * 
     */
    public void setSAPCorrecto(boolean value) {
        this.sapCorrecto = value;
    }

    /**
     * Obtiene el valor de la propiedad belnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelnr() {
        return belnr;
    }

    /**
     * Define el valor de la propiedad belnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelnr(String value) {
        this.belnr = value;
    }

    /**
     * Obtiene el valor de la propiedad ausfd.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAusfd() {
        return ausfd;
    }

    /**
     * Define el valor de la propiedad ausfd.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAusfd(XMLGregorianCalendar value) {
        this.ausfd = value;
    }

}
