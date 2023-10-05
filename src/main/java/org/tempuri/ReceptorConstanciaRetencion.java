
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReceptorConstanciaRetencion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReceptorConstanciaRetencion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroRegistroIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DomicilioFiscal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EsNacional" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Email1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceptorConstanciaRetencion", propOrder = {
    "rfc",
    "razonSocial",
    "curp",
    "numeroRegistroIdentificacion",
    "domicilioFiscal",
    "esNacional",
    "email1",
    "email2",
    "email3"
})
public class ReceptorConstanciaRetencion {

    @XmlElement(name = "RFC")
    protected String rfc;
    @XmlElement(name = "RazonSocial")
    protected String razonSocial;
    @XmlElement(name = "CURP")
    protected String curp;
    @XmlElement(name = "NumeroRegistroIdentificacion")
    protected String numeroRegistroIdentificacion;
    @XmlElement(name = "DomicilioFiscal")
    protected String domicilioFiscal;
    @XmlElement(name = "EsNacional")
    protected boolean esNacional;
    @XmlElement(name = "Email1")
    protected String email1;
    @XmlElement(name = "Email2")
    protected String email2;
    @XmlElement(name = "Email3")
    protected String email3;

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
     * Obtiene el valor de la propiedad curp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURP() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURP(String value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroRegistroIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRegistroIdentificacion() {
        return numeroRegistroIdentificacion;
    }

    /**
     * Define el valor de la propiedad numeroRegistroIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRegistroIdentificacion(String value) {
        this.numeroRegistroIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioFiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilioFiscal() {
        return domicilioFiscal;
    }

    /**
     * Define el valor de la propiedad domicilioFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilioFiscal(String value) {
        this.domicilioFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad esNacional.
     * 
     */
    public boolean isEsNacional() {
        return esNacional;
    }

    /**
     * Define el valor de la propiedad esNacional.
     * 
     */
    public void setEsNacional(boolean value) {
        this.esNacional = value;
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
     * Obtiene el valor de la propiedad email3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail3() {
        return email3;
    }

    /**
     * Define el valor de la propiedad email3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail3(String value) {
        this.email3 = value;
    }

}
