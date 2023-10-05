
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para SAPRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SAPRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DoctosRelSAP" type="{http://tempuri.org/}DoctosRelSAP" minOccurs="0"/&gt;
 *         &lt;element name="ubknt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ausfd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="rwbtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rfcprov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="razonsocialprov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="waers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="belnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAPRequest", propOrder = {
    "usuario",
    "contrasena",
    "doctosRelSAP",
    "ubknt",
    "ausfd",
    "rwbtr",
    "rfcprov",
    "razonsocialprov",
    "waers",
    "belnr"
})
public class SAPRequest {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Contrasena")
    protected String contrasena;
    @XmlElement(name = "DoctosRelSAP")
    protected DoctosRelSAP doctosRelSAP;
    protected String ubknt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ausfd;
    protected String rwbtr;
    protected String rfcprov;
    protected String razonsocialprov;
    protected String waers;
    protected String belnr;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Define el valor de la propiedad contrasena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasena(String value) {
        this.contrasena = value;
    }

    /**
     * Obtiene el valor de la propiedad doctosRelSAP.
     * 
     * @return
     *     possible object is
     *     {@link DoctosRelSAP }
     *     
     */
    public DoctosRelSAP getDoctosRelSAP() {
        return doctosRelSAP;
    }

    /**
     * Define el valor de la propiedad doctosRelSAP.
     * 
     * @param value
     *     allowed object is
     *     {@link DoctosRelSAP }
     *     
     */
    public void setDoctosRelSAP(DoctosRelSAP value) {
        this.doctosRelSAP = value;
    }

    /**
     * Obtiene el valor de la propiedad ubknt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbknt() {
        return ubknt;
    }

    /**
     * Define el valor de la propiedad ubknt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbknt(String value) {
        this.ubknt = value;
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

    /**
     * Obtiene el valor de la propiedad rwbtr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRwbtr() {
        return rwbtr;
    }

    /**
     * Define el valor de la propiedad rwbtr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRwbtr(String value) {
        this.rwbtr = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcprov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcprov() {
        return rfcprov;
    }

    /**
     * Define el valor de la propiedad rfcprov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcprov(String value) {
        this.rfcprov = value;
    }

    /**
     * Obtiene el valor de la propiedad razonsocialprov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonsocialprov() {
        return razonsocialprov;
    }

    /**
     * Define el valor de la propiedad razonsocialprov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonsocialprov(String value) {
        this.razonsocialprov = value;
    }

    /**
     * Obtiene el valor de la propiedad waers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaers() {
        return waers;
    }

    /**
     * Define el valor de la propiedad waers.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaers(String value) {
        this.waers = value;
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

}
