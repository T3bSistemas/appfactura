
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CFDIResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CFDIResponse"&gt;
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
 *         &lt;element name="RefTypeBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FiscalYearBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetPriceBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeMaxURLXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeMaxURLPDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeMaxTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstatusPublicacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFDIResponse", propOrder = {
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
    "refTypeBP",
    "fiscalYearBP",
    "streetPriceBP",
    "officeMaxURLXML",
    "officeMaxURLPDF",
    "officeMaxTransaccion",
    "estatusPublicacion"
})
public class CFDIResponse {

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
    @XmlElement(name = "RefTypeBP")
    protected String refTypeBP;
    @XmlElement(name = "FiscalYearBP")
    protected String fiscalYearBP;
    @XmlElement(name = "StreetPriceBP")
    protected String streetPriceBP;
    @XmlElement(name = "OfficeMaxURLXML")
    protected String officeMaxURLXML;
    @XmlElement(name = "OfficeMaxURLPDF")
    protected String officeMaxURLPDF;
    @XmlElement(name = "OfficeMaxTransaccion")
    protected String officeMaxTransaccion;
    @XmlElement(name = "EstatusPublicacion")
    protected boolean estatusPublicacion;

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
     * Obtiene el valor de la propiedad streetPriceBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetPriceBP() {
        return streetPriceBP;
    }

    /**
     * Define el valor de la propiedad streetPriceBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetPriceBP(String value) {
        this.streetPriceBP = value;
    }

    /**
     * Obtiene el valor de la propiedad officeMaxURLXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeMaxURLXML() {
        return officeMaxURLXML;
    }

    /**
     * Define el valor de la propiedad officeMaxURLXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeMaxURLXML(String value) {
        this.officeMaxURLXML = value;
    }

    /**
     * Obtiene el valor de la propiedad officeMaxURLPDF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeMaxURLPDF() {
        return officeMaxURLPDF;
    }

    /**
     * Define el valor de la propiedad officeMaxURLPDF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeMaxURLPDF(String value) {
        this.officeMaxURLPDF = value;
    }

    /**
     * Obtiene el valor de la propiedad officeMaxTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeMaxTransaccion() {
        return officeMaxTransaccion;
    }

    /**
     * Define el valor de la propiedad officeMaxTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeMaxTransaccion(String value) {
        this.officeMaxTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad estatusPublicacion.
     * 
     */
    public boolean isEstatusPublicacion() {
        return estatusPublicacion;
    }

    /**
     * Define el valor de la propiedad estatusPublicacion.
     * 
     */
    public void setEstatusPublicacion(boolean value) {
        this.estatusPublicacion = value;
    }

}
