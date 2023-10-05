
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IdDoc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IdDoc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NroAprob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnoAprob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroInterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaEmis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MedioPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LugarExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumCtaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CondPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TermPagoCdg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdDoc", propOrder = {
    "nroAprob",
    "anoAprob",
    "tipo",
    "folio",
    "estado",
    "numeroInterno",
    "fechaEmis",
    "formaPago",
    "medioPago",
    "lugarExpedicion",
    "numCtaPago",
    "condPago",
    "termPagoCdg"
})
public class IdDoc {

    @XmlElement(name = "NroAprob")
    protected String nroAprob;
    @XmlElement(name = "AnoAprob")
    protected String anoAprob;
    @XmlElement(name = "Tipo")
    protected String tipo;
    @XmlElement(name = "Folio")
    protected String folio;
    @XmlElement(name = "Estado")
    protected String estado;
    @XmlElement(name = "NumeroInterno")
    protected String numeroInterno;
    @XmlElement(name = "FechaEmis")
    protected String fechaEmis;
    @XmlElement(name = "FormaPago")
    protected String formaPago;
    @XmlElement(name = "MedioPago")
    protected String medioPago;
    @XmlElement(name = "LugarExpedicion")
    protected String lugarExpedicion;
    @XmlElement(name = "NumCtaPago")
    protected String numCtaPago;
    @XmlElement(name = "CondPago")
    protected String condPago;
    @XmlElement(name = "TermPagoCdg")
    protected String termPagoCdg;

    /**
     * Obtiene el valor de la propiedad nroAprob.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroAprob() {
        return nroAprob;
    }

    /**
     * Define el valor de la propiedad nroAprob.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroAprob(String value) {
        this.nroAprob = value;
    }

    /**
     * Obtiene el valor de la propiedad anoAprob.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnoAprob() {
        return anoAprob;
    }

    /**
     * Define el valor de la propiedad anoAprob.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoAprob(String value) {
        this.anoAprob = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
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
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroInterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroInterno() {
        return numeroInterno;
    }

    /**
     * Define el valor de la propiedad numeroInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroInterno(String value) {
        this.numeroInterno = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEmis() {
        return fechaEmis;
    }

    /**
     * Define el valor de la propiedad fechaEmis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEmis(String value) {
        this.fechaEmis = value;
    }

    /**
     * Obtiene el valor de la propiedad formaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Define el valor de la propiedad formaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPago(String value) {
        this.formaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad medioPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedioPago() {
        return medioPago;
    }

    /**
     * Define el valor de la propiedad medioPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedioPago(String value) {
        this.medioPago = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    /**
     * Define el valor de la propiedad lugarExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarExpedicion(String value) {
        this.lugarExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad numCtaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCtaPago() {
        return numCtaPago;
    }

    /**
     * Define el valor de la propiedad numCtaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCtaPago(String value) {
        this.numCtaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad condPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondPago() {
        return condPago;
    }

    /**
     * Define el valor de la propiedad condPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondPago(String value) {
        this.condPago = value;
    }

    /**
     * Obtiene el valor de la propiedad termPagoCdg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermPagoCdg() {
        return termPagoCdg;
    }

    /**
     * Define el valor de la propiedad termPagoCdg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermPagoCdg(String value) {
        this.termPagoCdg = value;
    }

}
