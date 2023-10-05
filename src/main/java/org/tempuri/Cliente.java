
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://tempuri.org/}Usuario" minOccurs="0"/&gt;
 *         &lt;element name="InformacionFiscal" type="{http://tempuri.org/}InformacionFiscal" minOccurs="0"/&gt;
 *         &lt;element name="UsuarioLogin" type="{http://tempuri.org/}UsuarioLogin" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cliente", propOrder = {
    "usuario",
    "informacionFiscal",
    "usuarioLogin"
})
public class Cliente {

    @XmlElement(name = "Usuario")
    protected Usuario usuario;
    @XmlElement(name = "InformacionFiscal")
    protected InformacionFiscal informacionFiscal;
    @XmlElement(name = "UsuarioLogin")
    protected UsuarioLogin usuarioLogin;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionFiscal.
     * 
     * @return
     *     possible object is
     *     {@link InformacionFiscal }
     *     
     */
    public InformacionFiscal getInformacionFiscal() {
        return informacionFiscal;
    }

    /**
     * Define el valor de la propiedad informacionFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionFiscal }
     *     
     */
    public void setInformacionFiscal(InformacionFiscal value) {
        this.informacionFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioLogin.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioLogin }
     *     
     */
    public UsuarioLogin getUsuarioLogin() {
        return usuarioLogin;
    }

    /**
     * Define el valor de la propiedad usuarioLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioLogin }
     *     
     */
    public void setUsuarioLogin(UsuarioLogin value) {
        this.usuarioLogin = value;
    }

}
