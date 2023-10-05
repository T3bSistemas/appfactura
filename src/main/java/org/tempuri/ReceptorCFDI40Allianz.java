
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReceptorCFDI40Allianz complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReceptorCFDI40Allianz"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResidenciaFiscal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumRegIdTrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsoCfdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DomicilioFiscalReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegimenFiscalReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contacto1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contacto2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefono1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefono2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceptorCFDI40Allianz", propOrder = {
    "rfc",
    "razonSocial",
    "residenciaFiscal",
    "numRegIdTrib",
    "usoCfdi",
    "domicilioFiscalReceptor",
    "regimenFiscalReceptor",
    "noCliente",
    "email",
    "email1",
    "email2",
    "contacto1",
    "contacto2",
    "telefono1",
    "telefono2"
})
public class ReceptorCFDI40Allianz {

    @XmlElement(name = "RFC")
    protected String rfc;
    @XmlElement(name = "RazonSocial")
    protected String razonSocial;
    @XmlElement(name = "ResidenciaFiscal")
    protected String residenciaFiscal;
    @XmlElement(name = "NumRegIdTrib")
    protected String numRegIdTrib;
    @XmlElement(name = "UsoCfdi")
    protected String usoCfdi;
    @XmlElement(name = "DomicilioFiscalReceptor")
    protected String domicilioFiscalReceptor;
    @XmlElement(name = "RegimenFiscalReceptor")
    protected String regimenFiscalReceptor;
    @XmlElement(name = "NoCliente")
    protected String noCliente;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Email1")
    protected String email1;
    @XmlElement(name = "Email2")
    protected String email2;
    @XmlElement(name = "Contacto1")
    protected String contacto1;
    @XmlElement(name = "Contacto2")
    protected String contacto2;
    @XmlElement(name = "Telefono1")
    protected String telefono1;
    @XmlElement(name = "Telefono2")
    protected String telefono2;

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFC() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFC(String value) {
        this.rfc = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad residenciaFiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenciaFiscal() {
        return residenciaFiscal;
    }

    /**
     * Define el valor de la propiedad residenciaFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenciaFiscal(String value) {
        this.residenciaFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad numRegIdTrib.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRegIdTrib() {
        return numRegIdTrib;
    }

    /**
     * Define el valor de la propiedad numRegIdTrib.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRegIdTrib(String value) {
        this.numRegIdTrib = value;
    }

    /**
     * Obtiene el valor de la propiedad usoCfdi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsoCfdi() {
        return usoCfdi;
    }

    /**
     * Define el valor de la propiedad usoCfdi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsoCfdi(String value) {
        this.usoCfdi = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioFiscalReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilioFiscalReceptor() {
        return domicilioFiscalReceptor;
    }

    /**
     * Define el valor de la propiedad domicilioFiscalReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilioFiscalReceptor(String value) {
        this.domicilioFiscalReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad regimenFiscalReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimenFiscalReceptor() {
        return regimenFiscalReceptor;
    }

    /**
     * Define el valor de la propiedad regimenFiscalReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimenFiscalReceptor(String value) {
        this.regimenFiscalReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad noCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCliente() {
        return noCliente;
    }

    /**
     * Define el valor de la propiedad noCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCliente(String value) {
        this.noCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad email1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail1() {
        return email1;
    }

    /**
     * Define el valor de la propiedad email1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail1(String value) {
        this.email1 = value;
    }

    /**
     * Obtiene el valor de la propiedad email2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail2() {
        return email2;
    }

    /**
     * Define el valor de la propiedad email2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail2(String value) {
        this.email2 = value;
    }

    /**
     * Obtiene el valor de la propiedad contacto1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacto1() {
        return contacto1;
    }

    /**
     * Define el valor de la propiedad contacto1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacto1(String value) {
        this.contacto1 = value;
    }

    /**
     * Obtiene el valor de la propiedad contacto2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacto2() {
        return contacto2;
    }

    /**
     * Define el valor de la propiedad contacto2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacto2(String value) {
        this.contacto2 = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono1() {
        return telefono1;
    }

    /**
     * Define el valor de la propiedad telefono1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono1(String value) {
        this.telefono1 = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono2() {
        return telefono2;
    }

    /**
     * Define el valor de la propiedad telefono2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono2(String value) {
        this.telefono2 = value;
    }

}
