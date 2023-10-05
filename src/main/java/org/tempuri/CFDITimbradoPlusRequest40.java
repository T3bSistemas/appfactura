
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CFDITimbradoPlusRequest40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CFDITimbradoPlusRequest40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CFDIRelacionTP" type="{http://tempuri.org/}ArrayOfCFDISRelacionados40" minOccurs="0"/&gt;
 *         &lt;element name="InformacionGlobal" type="{http://tempuri.org/}InformacionGlobal" minOccurs="0"/&gt;
 *         &lt;element name="DatosCFDITP" type="{http://tempuri.org/}DatosCFDI40" minOccurs="0"/&gt;
 *         &lt;element name="EmisorCFDITP" type="{http://tempuri.org/}EmisorCFDITimbradoPlus40" minOccurs="0"/&gt;
 *         &lt;element name="ReceptorCFDITP" type="{http://tempuri.org/}ReceptorCFDITimbradoPlus40" minOccurs="0"/&gt;
 *         &lt;element name="ConceptosCFDITP" type="{http://tempuri.org/}ConceptosCFDI40" minOccurs="0"/&gt;
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
@XmlType(name = "CFDITimbradoPlusRequest40", propOrder = {
    "usuario",
    "contrasena",
    "cfdiRelacionTP",
    "informacionGlobal",
    "datosCFDITP",
    "emisorCFDITP",
    "receptorCFDITP",
    "conceptosCFDITP",
    "addenda"
})
public class CFDITimbradoPlusRequest40 {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Contrasena")
    protected String contrasena;
    @XmlElement(name = "CFDIRelacionTP")
    protected ArrayOfCFDISRelacionados40 cfdiRelacionTP;
    @XmlElement(name = "InformacionGlobal")
    protected InformacionGlobal informacionGlobal;
    @XmlElement(name = "DatosCFDITP")
    protected DatosCFDI40 datosCFDITP;
    @XmlElement(name = "EmisorCFDITP")
    protected EmisorCFDITimbradoPlus40 emisorCFDITP;
    @XmlElement(name = "ReceptorCFDITP")
    protected ReceptorCFDITimbradoPlus40 receptorCFDITP;
    @XmlElement(name = "ConceptosCFDITP")
    protected ConceptosCFDI40 conceptosCFDITP;
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
     * Obtiene el valor de la propiedad cfdiRelacionTP.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCFDISRelacionados40 }
     *     
     */
    public ArrayOfCFDISRelacionados40 getCFDIRelacionTP() {
        return cfdiRelacionTP;
    }

    /**
     * Define el valor de la propiedad cfdiRelacionTP.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCFDISRelacionados40 }
     *     
     */
    public void setCFDIRelacionTP(ArrayOfCFDISRelacionados40 value) {
        this.cfdiRelacionTP = value;
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
     * Obtiene el valor de la propiedad datosCFDITP.
     * 
     * @return
     *     possible object is
     *     {@link DatosCFDI40 }
     *     
     */
    public DatosCFDI40 getDatosCFDITP() {
        return datosCFDITP;
    }

    /**
     * Define el valor de la propiedad datosCFDITP.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosCFDI40 }
     *     
     */
    public void setDatosCFDITP(DatosCFDI40 value) {
        this.datosCFDITP = value;
    }

    /**
     * Obtiene el valor de la propiedad emisorCFDITP.
     * 
     * @return
     *     possible object is
     *     {@link EmisorCFDITimbradoPlus40 }
     *     
     */
    public EmisorCFDITimbradoPlus40 getEmisorCFDITP() {
        return emisorCFDITP;
    }

    /**
     * Define el valor de la propiedad emisorCFDITP.
     * 
     * @param value
     *     allowed object is
     *     {@link EmisorCFDITimbradoPlus40 }
     *     
     */
    public void setEmisorCFDITP(EmisorCFDITimbradoPlus40 value) {
        this.emisorCFDITP = value;
    }

    /**
     * Obtiene el valor de la propiedad receptorCFDITP.
     * 
     * @return
     *     possible object is
     *     {@link ReceptorCFDITimbradoPlus40 }
     *     
     */
    public ReceptorCFDITimbradoPlus40 getReceptorCFDITP() {
        return receptorCFDITP;
    }

    /**
     * Define el valor de la propiedad receptorCFDITP.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceptorCFDITimbradoPlus40 }
     *     
     */
    public void setReceptorCFDITP(ReceptorCFDITimbradoPlus40 value) {
        this.receptorCFDITP = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptosCFDITP.
     * 
     * @return
     *     possible object is
     *     {@link ConceptosCFDI40 }
     *     
     */
    public ConceptosCFDI40 getConceptosCFDITP() {
        return conceptosCFDITP;
    }

    /**
     * Define el valor de la propiedad conceptosCFDITP.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptosCFDI40 }
     *     
     */
    public void setConceptosCFDITP(ConceptosCFDI40 value) {
        this.conceptosCFDITP = value;
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
