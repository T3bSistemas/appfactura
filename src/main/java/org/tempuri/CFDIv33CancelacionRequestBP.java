
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CFDIv33CancelacionRequestBP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CFDIv33CancelacionRequestBP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefTypeBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FiscalYearBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CFDIv33CancelacionRequestBP", propOrder = {
    "usuario",
    "contrasena",
    "uuid",
    "refTypeBP",
    "fiscalYearBP",
    "companyBP",
    "tipoComprobante",
    "version",
    "motivoCancelacion",
    "folioSustitucion"
})
public class CFDIv33CancelacionRequestBP {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Contrasena")
    protected String contrasena;
    @XmlElement(name = "UUID")
    protected String uuid;
    @XmlElement(name = "RefTypeBP")
    protected String refTypeBP;
    @XmlElement(name = "FiscalYearBP")
    protected String fiscalYearBP;
    @XmlElement(name = "CompanyBP")
    protected String companyBP;
    @XmlElement(name = "TipoComprobante")
    protected String tipoComprobante;
    @XmlElement(name = "Version")
    protected String version;
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
     * Obtiene el valor de la propiedad refTypeBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefTypeBP() {
        return refTypeBP;
    }

    /**
     * Define el valor de la propiedad refTypeBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefTypeBP(String value) {
        this.refTypeBP = value;
    }

    /**
     * Obtiene el valor de la propiedad fiscalYearBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalYearBP() {
        return fiscalYearBP;
    }

    /**
     * Define el valor de la propiedad fiscalYearBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalYearBP(String value) {
        this.fiscalYearBP = value;
    }

    /**
     * Obtiene el valor de la propiedad companyBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyBP() {
        return companyBP;
    }

    /**
     * Define el valor de la propiedad companyBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyBP(String value) {
        this.companyBP = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoComprobante() {
        return tipoComprobante;
    }

    /**
     * Define el valor de la propiedad tipoComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoComprobante(String value) {
        this.tipoComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
