
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CancelacionRequestOtroPac complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CancelacionRequestOtroPac"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contraseña" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimbradoPlus" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelacionRequestOtroPac", propOrder = {
    "usuario",
    "contrase\u00f1a",
    "xml",
    "timbradoPlus"
})
public class CancelacionRequestOtroPac {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Contrase\u00f1a")
    protected String contraseña;
    @XmlElement(name = "XML")
    protected String xml;
    @XmlElement(name = "TimbradoPlus")
    protected boolean timbradoPlus;

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
     * Obtiene el valor de la propiedad contraseña.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Define el valor de la propiedad contraseña.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContraseña(String value) {
        this.contraseña = value;
    }

    /**
     * Obtiene el valor de la propiedad xml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXML() {
        return xml;
    }

    /**
     * Define el valor de la propiedad xml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXML(String value) {
        this.xml = value;
    }

    /**
     * Obtiene el valor de la propiedad timbradoPlus.
     * 
     */
    public boolean isTimbradoPlus() {
        return timbradoPlus;
    }

    /**
     * Define el valor de la propiedad timbradoPlus.
     * 
     */
    public void setTimbradoPlus(boolean value) {
        this.timbradoPlus = value;
    }

}
