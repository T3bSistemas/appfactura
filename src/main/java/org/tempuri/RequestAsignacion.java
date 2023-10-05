
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RequestAsignacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RequestAsignacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClienteEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CantidadFolios" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestAsignacion", propOrder = {
    "usuario",
    "password",
    "rfc",
    "clienteEmail",
    "fechaVigencia",
    "cantidadFolios"
})
public class RequestAsignacion {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "RFC")
    protected String rfc;
    @XmlElement(name = "ClienteEmail")
    protected String clienteEmail;
    @XmlElement(name = "FechaVigencia")
    protected String fechaVigencia;
    @XmlElement(name = "CantidadFolios")
    protected int cantidadFolios;

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
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFC() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFC(String value) {
        this.rfc = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteEmail() {
        return clienteEmail;
    }

    /**
     * Define el valor de la propiedad clienteEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteEmail(String value) {
        this.clienteEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVigencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVigencia() {
        return fechaVigencia;
    }

    /**
     * Define el valor de la propiedad fechaVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVigencia(String value) {
        this.fechaVigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadFolios.
     * 
     */
    public int getCantidadFolios() {
        return cantidadFolios;
    }

    /**
     * Define el valor de la propiedad cantidadFolios.
     * 
     */
    public void setCantidadFolios(int value) {
        this.cantidadFolios = value;
    }

}
