
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CFDIRequestSiVale complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CFDIRequestSiVale"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatosCFDI" type="{http://tempuri.org/}DatosCFDISivale" minOccurs="0"/&gt;
 *         &lt;element name="CFDIRelacion" type="{http://tempuri.org/}CFDISRelacionados" minOccurs="0"/&gt;
 *         &lt;element name="ReceptorCFDI" type="{http://tempuri.org/}ReceptorCFDI" minOccurs="0"/&gt;
 *         &lt;element name="ConceptosCFD" type="{http://tempuri.org/}ConceptosCFDI" minOccurs="0"/&gt;
 *         &lt;element name="Addendas" type="{http://tempuri.org/}Addendas" minOccurs="0"/&gt;
 *         &lt;element name="Complementos" type="{http://tempuri.org/}ComplementosSivale" minOccurs="0"/&gt;
 *         &lt;element name="Pago" type="{http://tempuri.org/}ComplementoPagos" minOccurs="0"/&gt;
 *         &lt;element name="Pago40" type="{http://tempuri.org/}ComplementoPagos40" minOccurs="0"/&gt;
 *         &lt;element name="XMLAddenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFDIRequestSiVale", propOrder = {
    "usuario",
    "contrasena",
    "datosCFDI",
    "cfdiRelacion",
    "receptorCFDI",
    "conceptosCFD",
    "addendas",
    "complementos",
    "pago",
    "pago40",
    "xmlAddenda"
})
public class CFDIRequestSiVale {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Contrasena")
    protected String contrasena;
    @XmlElement(name = "DatosCFDI")
    protected DatosCFDISivale datosCFDI;
    @XmlElement(name = "CFDIRelacion")
    protected CFDISRelacionados cfdiRelacion;
    @XmlElement(name = "ReceptorCFDI")
    protected ReceptorCFDI receptorCFDI;
    @XmlElement(name = "ConceptosCFD")
    protected ConceptosCFDI conceptosCFD;
    @XmlElement(name = "Addendas")
    protected Addendas addendas;
    @XmlElement(name = "Complementos")
    protected ComplementosSivale complementos;
    @XmlElement(name = "Pago")
    protected ComplementoPagos pago;
    @XmlElement(name = "Pago40")
    protected ComplementoPagos40 pago40;
    @XmlElement(name = "XMLAddenda")
    protected String xmlAddenda;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Define el valor de la propiedad contrasena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasena(String value) {
        this.contrasena = value;
    }

    /**
     * Obtiene el valor de la propiedad datosCFDI.
     * 
     * @return
     *     possible object is
     *     {@link DatosCFDISivale }
     *     
     */
    public DatosCFDISivale getDatosCFDI() {
        return datosCFDI;
    }

    /**
     * Define el valor de la propiedad datosCFDI.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosCFDISivale }
     *     
     */
    public void setDatosCFDI(DatosCFDISivale value) {
        this.datosCFDI = value;
    }

    /**
     * Obtiene el valor de la propiedad cfdiRelacion.
     * 
     * @return
     *     possible object is
     *     {@link CFDISRelacionados }
     *     
     */
    public CFDISRelacionados getCFDIRelacion() {
        return cfdiRelacion;
    }

    /**
     * Define el valor de la propiedad cfdiRelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDISRelacionados }
     *     
     */
    public void setCFDIRelacion(CFDISRelacionados value) {
        this.cfdiRelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad receptorCFDI.
     * 
     * @return
     *     possible object is
     *     {@link ReceptorCFDI }
     *     
     */
    public ReceptorCFDI getReceptorCFDI() {
        return receptorCFDI;
    }

    /**
     * Define el valor de la propiedad receptorCFDI.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceptorCFDI }
     *     
     */
    public void setReceptorCFDI(ReceptorCFDI value) {
        this.receptorCFDI = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptosCFD.
     * 
     * @return
     *     possible object is
     *     {@link ConceptosCFDI }
     *     
     */
    public ConceptosCFDI getConceptosCFD() {
        return conceptosCFD;
    }

    /**
     * Define el valor de la propiedad conceptosCFD.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptosCFDI }
     *     
     */
    public void setConceptosCFD(ConceptosCFDI value) {
        this.conceptosCFD = value;
    }

    /**
     * Obtiene el valor de la propiedad addendas.
     * 
     * @return
     *     possible object is
     *     {@link Addendas }
     *     
     */
    public Addendas getAddendas() {
        return addendas;
    }

    /**
     * Define el valor de la propiedad addendas.
     * 
     * @param value
     *     allowed object is
     *     {@link Addendas }
     *     
     */
    public void setAddendas(Addendas value) {
        this.addendas = value;
    }

    /**
     * Obtiene el valor de la propiedad complementos.
     * 
     * @return
     *     possible object is
     *     {@link ComplementosSivale }
     *     
     */
    public ComplementosSivale getComplementos() {
        return complementos;
    }

    /**
     * Define el valor de la propiedad complementos.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementosSivale }
     *     
     */
    public void setComplementos(ComplementosSivale value) {
        this.complementos = value;
    }

    /**
     * Obtiene el valor de la propiedad pago.
     * 
     * @return
     *     possible object is
     *     {@link ComplementoPagos }
     *     
     */
    public ComplementoPagos getPago() {
        return pago;
    }

    /**
     * Define el valor de la propiedad pago.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementoPagos }
     *     
     */
    public void setPago(ComplementoPagos value) {
        this.pago = value;
    }

    /**
     * Obtiene el valor de la propiedad pago40.
     * 
     * @return
     *     possible object is
     *     {@link ComplementoPagos40 }
     *     
     */
    public ComplementoPagos40 getPago40() {
        return pago40;
    }

    /**
     * Define el valor de la propiedad pago40.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementoPagos40 }
     *     
     */
    public void setPago40(ComplementoPagos40 value) {
        this.pago40 = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlAddenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLAddenda() {
        return xmlAddenda;
    }

    /**
     * Define el valor de la propiedad xmlAddenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLAddenda(String value) {
        this.xmlAddenda = value;
    }

}
