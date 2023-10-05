
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
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="catalogoDeCuentas" type="{http://tempuri.org/}CatalogoDeCuentas" minOccurs="0"/&gt;
 *         &lt;element name="balanzaComprobacion" type="{http://tempuri.org/}BalanzaComprobacion" minOccurs="0"/&gt;
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
    "usuario",
    "contrasena",
    "catalogoDeCuentas",
    "balanzaComprobacion"
})
@XmlRootElement(name = "GeneraCatalogoConBalanza")
public class GeneraCatalogoConBalanza {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Contrasena")
    protected String contrasena;
    protected CatalogoDeCuentas catalogoDeCuentas;
    protected BalanzaComprobacion balanzaComprobacion;

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
     * Obtiene el valor de la propiedad catalogoDeCuentas.
     * 
     * @return
     *     possible object is
     *     {@link CatalogoDeCuentas }
     *     
     */
    public CatalogoDeCuentas getCatalogoDeCuentas() {
        return catalogoDeCuentas;
    }

    /**
     * Define el valor de la propiedad catalogoDeCuentas.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogoDeCuentas }
     *     
     */
    public void setCatalogoDeCuentas(CatalogoDeCuentas value) {
        this.catalogoDeCuentas = value;
    }

    /**
     * Obtiene el valor de la propiedad balanzaComprobacion.
     * 
     * @return
     *     possible object is
     *     {@link BalanzaComprobacion }
     *     
     */
    public BalanzaComprobacion getBalanzaComprobacion() {
        return balanzaComprobacion;
    }

    /**
     * Define el valor de la propiedad balanzaComprobacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanzaComprobacion }
     *     
     */
    public void setBalanzaComprobacion(BalanzaComprobacion value) {
        this.balanzaComprobacion = value;
    }

}
