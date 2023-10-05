
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Audi complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Audi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoImpuesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Notas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Partes" type="{http://tempuri.org/}AudiPartes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Audi", propOrder = {
    "tipoDocumento",
    "codigoImpuesto",
    "numProveedor",
    "emailProveedor",
    "emailSolicitante",
    "notas",
    "partes"
})
public class Audi {

    @XmlElement(name = "TipoDocumento")
    protected String tipoDocumento;
    @XmlElement(name = "CodigoImpuesto")
    protected String codigoImpuesto;
    @XmlElement(name = "NumProveedor")
    protected String numProveedor;
    @XmlElement(name = "EmailProveedor")
    protected String emailProveedor;
    @XmlElement(name = "EmailSolicitante")
    protected String emailSolicitante;
    @XmlElement(name = "Notas")
    protected String notas;
    @XmlElement(name = "Partes")
    protected AudiPartes partes;

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
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
     * Obtiene el valor de la propiedad numProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumProveedor() {
        return numProveedor;
    }

    /**
     * Define el valor de la propiedad numProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumProveedor(String value) {
        this.numProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad emailProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailProveedor() {
        return emailProveedor;
    }

    /**
     * Define el valor de la propiedad emailProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailProveedor(String value) {
        this.emailProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad emailSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSolicitante() {
        return emailSolicitante;
    }

    /**
     * Define el valor de la propiedad emailSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSolicitante(String value) {
        this.emailSolicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad notas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotas() {
        return notas;
    }

    /**
     * Define el valor de la propiedad notas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotas(String value) {
        this.notas = value;
    }

    /**
     * Obtiene el valor de la propiedad partes.
     * 
     * @return
     *     possible object is
     *     {@link AudiPartes }
     *     
     */
    public AudiPartes getPartes() {
        return partes;
    }

    /**
     * Define el valor de la propiedad partes.
     * 
     * @param value
     *     allowed object is
     *     {@link AudiPartes }
     *     
     */
    public void setPartes(AudiPartes value) {
        this.partes = value;
    }

}
