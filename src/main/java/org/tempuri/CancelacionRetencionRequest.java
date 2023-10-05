
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CancelacionRetencionRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CancelacionRetencionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contraseña" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MotivoCancelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FolioSustitucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelacionRetencionRequest", propOrder = {
    "usuario",
    "contrase\u00f1a",
    "uuid",
    "motivoCancelacion",
    "folioSustitucion"
})
public class CancelacionRetencionRequest {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Contrase\u00f1a")
    protected String contraseña;
    @XmlElement(name = "UUID")
    protected String uuid;
    @XmlElement(name = "MotivoCancelacion")
    protected String motivoCancelacion;
    @XmlElement(name = "FolioSustitucion")
    protected String folioSustitucion;

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
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoCancelacion() {
        return motivoCancelacion;
    }

    /**
     * Define el valor de la propiedad motivoCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoCancelacion(String value) {
        this.motivoCancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad folioSustitucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioSustitucion() {
        return folioSustitucion;
    }

    /**
     * Define el valor de la propiedad folioSustitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioSustitucion(String value) {
        this.folioSustitucion = value;
    }

}
