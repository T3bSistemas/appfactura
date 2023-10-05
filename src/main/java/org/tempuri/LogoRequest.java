
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LogoRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LogoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsuarioLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LogoBase64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogoRequest", propOrder = {
    "usuario",
    "contrasena",
    "usuarioLogo",
    "logoBase64"
})
public class LogoRequest {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Contrasena")
    protected String contrasena;
    @XmlElement(name = "UsuarioLogo")
    protected String usuarioLogo;
    @XmlElement(name = "LogoBase64")
    protected String logoBase64;

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
     * Obtiene el valor de la propiedad usuarioLogo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioLogo() {
        return usuarioLogo;
    }

    /**
     * Define el valor de la propiedad usuarioLogo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioLogo(String value) {
        this.usuarioLogo = value;
    }

    /**
     * Obtiene el valor de la propiedad logoBase64.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoBase64() {
        return logoBase64;
    }

    /**
     * Define el valor de la propiedad logoBase64.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoBase64(String value) {
        this.logoBase64 = value;
    }

}
