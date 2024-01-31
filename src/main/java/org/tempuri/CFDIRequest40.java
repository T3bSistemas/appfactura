
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CFDIRequest40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CFDIRequest40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatosCFDI40" type="{http://tempuri.org/}DatosCFDI40" minOccurs="0"/&gt;
 *         &lt;element name="CFDIRelacion40" type="{http://tempuri.org/}ArrayOfCFDISRelacionados40" minOccurs="0"/&gt;
 *         &lt;element name="InformacionGlobal" type="{http://tempuri.org/}InformacionGlobal" minOccurs="0"/&gt;
 *         &lt;element name="ReceptorCFDI40" type="{http://tempuri.org/}ReceptorCFDI40" minOccurs="0"/&gt;
 *         &lt;element name="ConceptosCFDI40" type="{http://tempuri.org/}ConceptosCFDI40" minOccurs="0"/&gt;
 *         &lt;element name="Addenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Addenda2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FoliosBancarios" type="{http://tempuri.org/}ArrayOfFoliosBancario" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFDIRequest40", propOrder = {
    "usuario",
    "contrasena",
    "datosCFDI40",
    "cfdiRelacion40",
    "informacionGlobal",
    "receptorCFDI40",
    "conceptosCFDI40",
    "addenda",
    "addenda2",
    "foliosBancarios"
})
public class CFDIRequest40 {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Contrasena")
    protected String contrasena;
    @XmlElement(name = "DatosCFDI40")
    protected DatosCFDI40 datosCFDI40;
    @XmlElement(name = "CFDIRelacion40")
    protected ArrayOfCFDISRelacionados40 cfdiRelacion40;
    @XmlElement(name = "InformacionGlobal")
    protected InformacionGlobal informacionGlobal;
    @XmlElement(name = "ReceptorCFDI40")
    protected ReceptorCFDI40 receptorCFDI40;
    @XmlElement(name = "ConceptosCFDI40")
    protected ConceptosCFDI40 conceptosCFDI40;
    @XmlElement(name = "Addenda")
    protected String addenda;
    @XmlElement(name = "Addenda2")
    protected String addenda2;
    @XmlElement(name = "FoliosBancarios")
    protected ArrayOfFoliosBancario foliosBancarios;

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
     * Obtiene el valor de la propiedad datosCFDI40.
     * 
     * @return
     *     possible object is
     *     {@link DatosCFDI40 }
     *     
     */
    public DatosCFDI40 getDatosCFDI40() {
        return datosCFDI40;
    }

    /**
     * Define el valor de la propiedad datosCFDI40.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosCFDI40 }
     *     
     */
    public void setDatosCFDI40(DatosCFDI40 value) {
        this.datosCFDI40 = value;
    }

    /**
     * Obtiene el valor de la propiedad cfdiRelacion40.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCFDISRelacionados40 }
     *     
     */
    public ArrayOfCFDISRelacionados40 getCFDIRelacion40() {
        return cfdiRelacion40;
    }

    /**
     * Define el valor de la propiedad cfdiRelacion40.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCFDISRelacionados40 }
     *     
     */
    public void setCFDIRelacion40(ArrayOfCFDISRelacionados40 value) {
        this.cfdiRelacion40 = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionGlobal.
     * 
     * @return
     *     possible object is
     *     {@link InformacionGlobal }
     *     
     */
    public InformacionGlobal getInformacionGlobal() {
        return informacionGlobal;
    }

    /**
     * Define el valor de la propiedad informacionGlobal.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionGlobal }
     *     
     */
    public void setInformacionGlobal(InformacionGlobal value) {
        this.informacionGlobal = value;
    }

    /**
     * Obtiene el valor de la propiedad receptorCFDI40.
     * 
     * @return
     *     possible object is
     *     {@link ReceptorCFDI40 }
     *     
     */
    public ReceptorCFDI40 getReceptorCFDI40() {
        return receptorCFDI40;
    }

    /**
     * Define el valor de la propiedad receptorCFDI40.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceptorCFDI40 }
     *     
     */
    public void setReceptorCFDI40(ReceptorCFDI40 value) {
        this.receptorCFDI40 = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptosCFDI40.
     * 
     * @return
     *     possible object is
     *     {@link ConceptosCFDI40 }
     *     
     */
    public ConceptosCFDI40 getConceptosCFDI40() {
        return conceptosCFDI40;
    }

    /**
     * Define el valor de la propiedad conceptosCFDI40.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptosCFDI40 }
     *     
     */
    public void setConceptosCFDI40(ConceptosCFDI40 value) {
        this.conceptosCFDI40 = value;
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

    /**
     * Obtiene el valor de la propiedad addenda2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddenda2() {
        return addenda2;
    }

    /**
     * Define el valor de la propiedad addenda2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddenda2(String value) {
        this.addenda2 = value;
    }

    /**
     * Obtiene el valor de la propiedad foliosBancarios.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFoliosBancario }
     *     
     */
    public ArrayOfFoliosBancario getFoliosBancarios() {
        return foliosBancarios;
    }

    /**
     * Define el valor de la propiedad foliosBancarios.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFoliosBancario }
     *     
     */
    public void setFoliosBancarios(ArrayOfFoliosBancario value) {
        this.foliosBancarios = value;
    }

}
