
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClienteActualiza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClienteActualiza"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://tempuri.org/}Usuario" minOccurs="0"/&gt;
 *         &lt;element name="InformacionFiscal" type="{http://tempuri.org/}InformacionFiscalAct" minOccurs="0"/&gt;
 *         &lt;element name="UsuarioLogin" type="{http://tempuri.org/}UsuarioLoginAct" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClienteActualiza", propOrder = {
    "usuario",
    "informacionFiscal",
    "usuarioLogin"
})
public class ClienteActualiza {

    @XmlElement(name = "Usuario")
    protected Usuario usuario;
    @XmlElement(name = "InformacionFiscal")
    protected InformacionFiscalAct informacionFiscal;
    @XmlElement(name = "UsuarioLogin")
    protected UsuarioLoginAct usuarioLogin;

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
     *     {@link InformacionFiscalAct }
     *     
     */
    public InformacionFiscalAct getInformacionFiscal() {
        return informacionFiscal;
    }

    /**
     * Define el valor de la propiedad informacionFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionFiscalAct }
     *     
     */
    public void setInformacionFiscal(InformacionFiscalAct value) {
        this.informacionFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioLogin.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioLoginAct }
     *     
     */
    public UsuarioLoginAct getUsuarioLogin() {
        return usuarioLogin;
    }

    /**
     * Define el valor de la propiedad usuarioLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioLoginAct }
     *     
     */
    public void setUsuarioLogin(UsuarioLoginAct value) {
        this.usuarioLogin = value;
    }

}
