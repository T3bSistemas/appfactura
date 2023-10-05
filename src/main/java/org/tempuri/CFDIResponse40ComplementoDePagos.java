
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CFDIResponse40ComplementoDePagos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CFDIResponse40ComplementoDePagos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XMLCFDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCFDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CFDICorrecto" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaTimbrado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FiscalYearBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFDIResponse40ComplementoDePagos", propOrder = {
    "xmlcfdi",
    "codigoError",
    "errorCFDI",
    "cfdiCorrecto",
    "uuid",
    "folio",
    "serie",
    "version",
    "fechaTimbrado",
    "companyBP",
    "fiscalYearBP"
})
public class CFDIResponse40ComplementoDePagos {

    @XmlElement(name = "XMLCFDI")
    protected String xmlcfdi;
    @XmlElement(name = "CodigoError")
    protected String codigoError;
    @XmlElement(name = "ErrorCFDI")
    protected String errorCFDI;
    @XmlElement(name = "CFDICorrecto")
    protected boolean cfdiCorrecto;
    @XmlElement(name = "UUID")
    protected String uuid;
    @XmlElement(name = "Folio")
    protected String folio;
    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "FechaTimbrado")
    protected String fechaTimbrado;
    @XmlElement(name = "CompanyBP")
    protected String companyBP;
    @XmlElement(name = "FiscalYearBP")
    protected String fiscalYearBP;

    /**
     * Obtiene el valor de la propiedad xmlcfdi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLCFDI() {
        return xmlcfdi;
    }

    /**
     * Define el valor de la propiedad xmlcfdi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLCFDI(String value) {
        this.xmlcfdi = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * Define el valor de la propiedad codigoError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoError(String value) {
        this.codigoError = value;
    }

    /**
     * Obtiene el valor de la propiedad errorCFDI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCFDI() {
        return errorCFDI;
    }

    /**
     * Define el valor de la propiedad errorCFDI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCFDI(String value) {
        this.errorCFDI = value;
    }

    /**
     * Obtiene el valor de la propiedad cfdiCorrecto.
     * 
     */
    public boolean isCFDICorrecto() {
        return cfdiCorrecto;
    }

    /**
     * Define el valor de la propiedad cfdiCorrecto.
     * 
     */
    public void setCFDICorrecto(boolean value) {
        this.cfdiCorrecto = value;
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
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
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
     * Obtiene el valor de la propiedad fechaTimbrado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaTimbrado() {
        return fechaTimbrado;
    }

    /**
     * Define el valor de la propiedad fechaTimbrado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaTimbrado(String value) {
        this.fechaTimbrado = value;
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

}
