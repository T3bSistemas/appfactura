
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CFDIv33CancelacionResponseBPSAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CFDIv33CancelacionResponseBPSAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcuseCancelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCancelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CancelacionCorrecta" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RespuestaSAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FolioBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RFCEMISOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FolioSustitucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FiscalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFDIv33CancelacionResponseBPSAP", propOrder = {
    "acuseCancelacion",
    "codigoError",
    "errorCancelacion",
    "mensaje",
    "cancelacionCorrecta",
    "respuestaSAT",
    "uuid",
    "folioBP",
    "refType",
    "companyBP",
    "rfcemisor",
    "fecha",
    "folioSustitucion",
    "fiscalYear"
})
public class CFDIv33CancelacionResponseBPSAP {

    @XmlElement(name = "AcuseCancelacion")
    protected String acuseCancelacion;
    @XmlElement(name = "CodigoError")
    protected String codigoError;
    @XmlElement(name = "ErrorCancelacion")
    protected String errorCancelacion;
    @XmlElement(name = "Mensaje")
    protected String mensaje;
    @XmlElement(name = "CancelacionCorrecta")
    protected boolean cancelacionCorrecta;
    @XmlElement(name = "RespuestaSAT")
    protected String respuestaSAT;
    @XmlElement(name = "UUID")
    protected String uuid;
    @XmlElement(name = "FolioBP")
    protected String folioBP;
    @XmlElement(name = "RefType")
    protected String refType;
    @XmlElement(name = "CompanyBP")
    protected String companyBP;
    @XmlElement(name = "RFCEMISOR")
    protected String rfcemisor;
    @XmlElement(name = "Fecha")
    protected String fecha;
    @XmlElement(name = "FolioSustitucion")
    protected String folioSustitucion;
    @XmlElement(name = "FiscalYear")
    protected String fiscalYear;

    /**
     * Obtiene el valor de la propiedad acuseCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcuseCancelacion() {
        return acuseCancelacion;
    }

    /**
     * Define el valor de la propiedad acuseCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcuseCancelacion(String value) {
        this.acuseCancelacion = value;
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
     * Obtiene el valor de la propiedad errorCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCancelacion() {
        return errorCancelacion;
    }

    /**
     * Define el valor de la propiedad errorCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCancelacion(String value) {
        this.errorCancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelacionCorrecta.
     * 
     */
    public boolean isCancelacionCorrecta() {
        return cancelacionCorrecta;
    }

    /**
     * Define el valor de la propiedad cancelacionCorrecta.
     * 
     */
    public void setCancelacionCorrecta(boolean value) {
        this.cancelacionCorrecta = value;
    }

    /**
     * Obtiene el valor de la propiedad respuestaSAT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespuestaSAT() {
        return respuestaSAT;
    }

    /**
     * Define el valor de la propiedad respuestaSAT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespuestaSAT(String value) {
        this.respuestaSAT = value;
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
     * Obtiene el valor de la propiedad folioBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioBP() {
        return folioBP;
    }

    /**
     * Define el valor de la propiedad folioBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioBP(String value) {
        this.folioBP = value;
    }

    /**
     * Obtiene el valor de la propiedad refType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefType() {
        return refType;
    }

    /**
     * Define el valor de la propiedad refType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefType(String value) {
        this.refType = value;
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
     * Obtiene el valor de la propiedad rfcemisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCEMISOR() {
        return rfcemisor;
    }

    /**
     * Define el valor de la propiedad rfcemisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCEMISOR(String value) {
        this.rfcemisor = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
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

    /**
     * Obtiene el valor de la propiedad fiscalYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalYear() {
        return fiscalYear;
    }

    /**
     * Define el valor de la propiedad fiscalYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalYear(String value) {
        this.fiscalYear = value;
    }

}
