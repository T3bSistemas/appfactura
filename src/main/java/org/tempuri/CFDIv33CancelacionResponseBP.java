
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CFDIv33CancelacionResponseBP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CFDIv33CancelacionResponseBP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcuseCancelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCancelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCancelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionCancelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefTypeBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FiscalYearBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CancelacionCorrecta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFDIv33CancelacionResponseBP", propOrder = {
    "acuseCancelacion",
    "codigoError",
    "errorCancelacion",
    "codigoCancelacion",
    "descripcionCancelacion",
    "refTypeBP",
    "fiscalYearBP",
    "companyBP",
    "cancelacionCorrecta"
})
public class CFDIv33CancelacionResponseBP {

    @XmlElement(name = "AcuseCancelacion")
    protected String acuseCancelacion;
    @XmlElement(name = "CodigoError")
    protected String codigoError;
    @XmlElement(name = "ErrorCancelacion")
    protected String errorCancelacion;
    @XmlElement(name = "CodigoCancelacion")
    protected String codigoCancelacion;
    @XmlElement(name = "DescripcionCancelacion")
    protected String descripcionCancelacion;
    @XmlElement(name = "RefTypeBP")
    protected String refTypeBP;
    @XmlElement(name = "FiscalYearBP")
    protected String fiscalYearBP;
    @XmlElement(name = "CompanyBP")
    protected String companyBP;
    @XmlElement(name = "CancelacionCorrecta")
    protected int cancelacionCorrecta;

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
     * Obtiene el valor de la propiedad codigoCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCancelacion() {
        return codigoCancelacion;
    }

    /**
     * Define el valor de la propiedad codigoCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCancelacion(String value) {
        this.codigoCancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionCancelacion() {
        return descripcionCancelacion;
    }

    /**
     * Define el valor de la propiedad descripcionCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionCancelacion(String value) {
        this.descripcionCancelacion = value;
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
     * Obtiene el valor de la propiedad cancelacionCorrecta.
     * 
     */
    public int getCancelacionCorrecta() {
        return cancelacionCorrecta;
    }

    /**
     * Define el valor de la propiedad cancelacionCorrecta.
     * 
     */
    public void setCancelacionCorrecta(int value) {
        this.cancelacionCorrecta = value;
    }

}
