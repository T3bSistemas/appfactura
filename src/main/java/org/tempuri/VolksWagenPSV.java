
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VolksWagen_PSV complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VolksWagen_PSV"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoDocumentoVWM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoImpuesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorreoContactoProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenciaProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorreoSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Partes" type="{http://tempuri.org/}PSVPartes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolksWagen_PSV", propOrder = {
    "tipoDocumentoVWM",
    "division",
    "codigoImpuesto",
    "codigoProveedor",
    "nombreProveedor",
    "correoContactoProveedor",
    "referenciaProveedor",
    "nombreSolicitante",
    "correoSolicitante",
    "partes"
})
public class VolksWagenPSV {

    @XmlElement(name = "TipoDocumentoVWM")
    protected String tipoDocumentoVWM;
    @XmlElement(name = "Division")
    protected String division;
    @XmlElement(name = "CodigoImpuesto")
    protected String codigoImpuesto;
    @XmlElement(name = "CodigoProveedor")
    protected String codigoProveedor;
    @XmlElement(name = "NombreProveedor")
    protected String nombreProveedor;
    @XmlElement(name = "CorreoContactoProveedor")
    protected String correoContactoProveedor;
    @XmlElement(name = "ReferenciaProveedor")
    protected String referenciaProveedor;
    @XmlElement(name = "NombreSolicitante")
    protected String nombreSolicitante;
    @XmlElement(name = "CorreoSolicitante")
    protected String correoSolicitante;
    @XmlElement(name = "Partes")
    protected PSVPartes partes;

    /**
     * Obtiene el valor de la propiedad tipoDocumentoVWM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoVWM() {
        return tipoDocumentoVWM;
    }

    /**
     * Define el valor de la propiedad tipoDocumentoVWM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoVWM(String value) {
        this.tipoDocumentoVWM = value;
    }

    /**
     * Obtiene el valor de la propiedad division.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Define el valor de la propiedad division.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoImpuesto() {
        return codigoImpuesto;
    }

    /**
     * Define el valor de la propiedad codigoImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoImpuesto(String value) {
        this.codigoImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    /**
     * Define el valor de la propiedad codigoProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProveedor(String value) {
        this.codigoProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    /**
     * Define el valor de la propiedad nombreProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProveedor(String value) {
        this.nombreProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad correoContactoProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoContactoProveedor() {
        return correoContactoProveedor;
    }

    /**
     * Define el valor de la propiedad correoContactoProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoContactoProveedor(String value) {
        this.correoContactoProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaProveedor() {
        return referenciaProveedor;
    }

    /**
     * Define el valor de la propiedad referenciaProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaProveedor(String value) {
        this.referenciaProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    /**
     * Define el valor de la propiedad nombreSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreSolicitante(String value) {
        this.nombreSolicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad correoSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoSolicitante() {
        return correoSolicitante;
    }

    /**
     * Define el valor de la propiedad correoSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoSolicitante(String value) {
        this.correoSolicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad partes.
     * 
     * @return
     *     possible object is
     *     {@link PSVPartes }
     *     
     */
    public PSVPartes getPartes() {
        return partes;
    }

    /**
     * Define el valor de la propiedad partes.
     * 
     * @param value
     *     allowed object is
     *     {@link PSVPartes }
     *     
     */
    public void setPartes(PSVPartes value) {
        this.partes = value;
    }

}
