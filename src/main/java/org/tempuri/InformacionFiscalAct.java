
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InformacionFiscalAct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InformacionFiscalAct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsoCFDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegimenFiscal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionFiscalAct", propOrder = {
    "rfc",
    "razonSocial",
    "usoCFDI",
    "regimenFiscal",
    "contacto",
    "emailContacto",
    "codigoPostal",
    "pais"
})
public class InformacionFiscalAct {

    @XmlElement(name = "RFC")
    protected String rfc;
    @XmlElement(name = "RazonSocial")
    protected String razonSocial;
    @XmlElement(name = "UsoCFDI")
    protected String usoCFDI;
    @XmlElement(name = "RegimenFiscal")
    protected String regimenFiscal;
    @XmlElement(name = "Contacto")
    protected String contacto;
    @XmlElement(name = "EmailContacto")
    protected String emailContacto;
    @XmlElement(name = "CodigoPostal")
    protected int codigoPostal;
    @XmlElement(name = "Pais")
    protected String pais;

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
     * Obtiene el valor de la propiedad usoCFDI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsoCFDI() {
        return usoCFDI;
    }

    /**
     * Define el valor de la propiedad usoCFDI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsoCFDI(String value) {
        this.usoCFDI = value;
    }

    /**
     * Obtiene el valor de la propiedad regimenFiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimenFiscal() {
        return regimenFiscal;
    }

    /**
     * Define el valor de la propiedad regimenFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimenFiscal(String value) {
        this.regimenFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad contacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * Define el valor de la propiedad contacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacto(String value) {
        this.contacto = value;
    }

    /**
     * Obtiene el valor de la propiedad emailContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailContacto() {
        return emailContacto;
    }

    /**
     * Define el valor de la propiedad emailContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailContacto(String value) {
        this.emailContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPostal.
     * 
     */
    public int getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Define el valor de la propiedad codigoPostal.
     * 
     */
    public void setCodigoPostal(int value) {
        this.codigoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

}
