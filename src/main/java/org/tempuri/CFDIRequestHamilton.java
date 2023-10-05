
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CFDIRequestHamilton complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CFDIRequestHamilton"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatosCFDI" type="{http://tempuri.org/}DatosCFDIHamilton" minOccurs="0"/&gt;
 *         &lt;element name="CFDIRelacion" type="{http://tempuri.org/}CFDISRelacionados" minOccurs="0"/&gt;
 *         &lt;element name="ReceptorCFDI" type="{http://tempuri.org/}ReceptorCFDI" minOccurs="0"/&gt;
 *         &lt;element name="Addendas" type="{http://tempuri.org/}Addendas_HB" minOccurs="0"/&gt;
 *         &lt;element name="ConceptosCFD" type="{http://tempuri.org/}ConceptosCFDI" minOccurs="0"/&gt;
 *         &lt;element name="Addenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFDIRequestHamilton", propOrder = {
    "usuario",
    "contrasena",
    "datosCFDI",
    "cfdiRelacion",
    "receptorCFDI",
    "addendas",
    "conceptosCFD",
    "addenda"
})
public class CFDIRequestHamilton {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Contrasena")
    protected String contrasena;
    @XmlElement(name = "DatosCFDI")
    protected DatosCFDIHamilton datosCFDI;
    @XmlElement(name = "CFDIRelacion")
    protected CFDISRelacionados cfdiRelacion;
    @XmlElement(name = "ReceptorCFDI")
    protected ReceptorCFDI receptorCFDI;
    @XmlElement(name = "Addendas")
    protected AddendasHB addendas;
    @XmlElement(name = "ConceptosCFD")
    protected ConceptosCFDI conceptosCFD;
    @XmlElement(name = "Addenda")
    protected String addenda;

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
     *     {@link DatosCFDIHamilton }
     *     
     */
    public DatosCFDIHamilton getDatosCFDI() {
        return datosCFDI;
    }

    /**
     * Define el valor de la propiedad datosCFDI.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosCFDIHamilton }
     *     
     */
    public void setDatosCFDI(DatosCFDIHamilton value) {
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
     * Obtiene el valor de la propiedad addendas.
     * 
     * @return
     *     possible object is
     *     {@link AddendasHB }
     *     
     */
    public AddendasHB getAddendas() {
        return addendas;
    }

    /**
     * Define el valor de la propiedad addendas.
     * 
     * @param value
     *     allowed object is
     *     {@link AddendasHB }
     *     
     */
    public void setAddendas(AddendasHB value) {
        this.addendas = value;
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
     * Obtiene el valor de la propiedad addenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddenda() {
        return addenda;
    }

    /**
     * Define el valor de la propiedad addenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddenda(String value) {
        this.addenda = value;
    }

}
