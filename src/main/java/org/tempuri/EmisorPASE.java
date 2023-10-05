
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EmisorPASE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EmisorPASE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RFCEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RazonSocialEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegimenFiscalEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Certificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PasswordCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KeyCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmisorPASE", propOrder = {
    "rfcEmisor",
    "razonSocialEmisor",
    "regimenFiscalEmisor",
    "certificado",
    "passwordCertificado",
    "keyCertificado"
})
public class EmisorPASE {

    @XmlElement(name = "RFCEmisor")
    protected String rfcEmisor;
    @XmlElement(name = "RazonSocialEmisor")
    protected String razonSocialEmisor;
    @XmlElement(name = "RegimenFiscalEmisor")
    protected String regimenFiscalEmisor;
    @XmlElement(name = "Certificado")
    protected String certificado;
    @XmlElement(name = "PasswordCertificado")
    protected String passwordCertificado;
    @XmlElement(name = "KeyCertificado")
    protected String keyCertificado;

    /**
     * Obtiene el valor de la propiedad rfcEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCEmisor() {
        return rfcEmisor;
    }

    /**
     * Define el valor de la propiedad rfcEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCEmisor(String value) {
        this.rfcEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocialEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocialEmisor() {
        return razonSocialEmisor;
    }

    /**
     * Define el valor de la propiedad razonSocialEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocialEmisor(String value) {
        this.razonSocialEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad regimenFiscalEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimenFiscalEmisor() {
        return regimenFiscalEmisor;
    }

    /**
     * Define el valor de la propiedad regimenFiscalEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimenFiscalEmisor(String value) {
        this.regimenFiscalEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad certificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificado() {
        return certificado;
    }

    /**
     * Define el valor de la propiedad certificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificado(String value) {
        this.certificado = value;
    }

    /**
     * Obtiene el valor de la propiedad passwordCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordCertificado() {
        return passwordCertificado;
    }

    /**
     * Define el valor de la propiedad passwordCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordCertificado(String value) {
        this.passwordCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad keyCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyCertificado() {
        return keyCertificado;
    }

    /**
     * Define el valor de la propiedad keyCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyCertificado(String value) {
        this.keyCertificado = value;
    }

}
