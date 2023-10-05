
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RetencionesRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RetencionesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contraseña" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Datos" type="{http://tempuri.org/}DatosConstanciaRetencion" minOccurs="0"/&gt;
 *         &lt;element name="Receptor" type="{http://tempuri.org/}ReceptorConstanciaRetencion" minOccurs="0"/&gt;
 *         &lt;element name="CFDISRelacionadosRet20" type="{http://tempuri.org/}CFDISRelacionadosRet20" minOccurs="0"/&gt;
 *         &lt;element name="ImpuestosRetencion" type="{http://tempuri.org/}ArrayOfImpuestoRetencion" minOccurs="0"/&gt;
 *         &lt;element name="ComplementosRetencion" type="{http://tempuri.org/}ComplementosRetenciones" minOccurs="0"/&gt;
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
@XmlType(name = "RetencionesRequest", propOrder = {
    "usuario",
    "contrase\u00f1a",
    "datos",
    "receptor",
    "cfdisRelacionadosRet20",
    "impuestosRetencion",
    "complementosRetencion",
    "xmlAddenda"
})
public class RetencionesRequest {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Contrase\u00f1a")
    protected String contraseña;
    @XmlElement(name = "Datos")
    protected DatosConstanciaRetencion datos;
    @XmlElement(name = "Receptor")
    protected ReceptorConstanciaRetencion receptor;
    @XmlElement(name = "CFDISRelacionadosRet20")
    protected CFDISRelacionadosRet20 cfdisRelacionadosRet20;
    @XmlElement(name = "ImpuestosRetencion")
    protected ArrayOfImpuestoRetencion impuestosRetencion;
    @XmlElement(name = "ComplementosRetencion")
    protected ComplementosRetenciones complementosRetencion;
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
     * Obtiene el valor de la propiedad contraseña.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Define el valor de la propiedad contraseña.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContraseña(String value) {
        this.contraseña = value;
    }

    /**
     * Obtiene el valor de la propiedad datos.
     * 
     * @return
     *     possible object is
     *     {@link DatosConstanciaRetencion }
     *     
     */
    public DatosConstanciaRetencion getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosConstanciaRetencion }
     *     
     */
    public void setDatos(DatosConstanciaRetencion value) {
        this.datos = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link ReceptorConstanciaRetencion }
     *     
     */
    public ReceptorConstanciaRetencion getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceptorConstanciaRetencion }
     *     
     */
    public void setReceptor(ReceptorConstanciaRetencion value) {
        this.receptor = value;
    }

    /**
     * Obtiene el valor de la propiedad cfdisRelacionadosRet20.
     * 
     * @return
     *     possible object is
     *     {@link CFDISRelacionadosRet20 }
     *     
     */
    public CFDISRelacionadosRet20 getCFDISRelacionadosRet20() {
        return cfdisRelacionadosRet20;
    }

    /**
     * Define el valor de la propiedad cfdisRelacionadosRet20.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDISRelacionadosRet20 }
     *     
     */
    public void setCFDISRelacionadosRet20(CFDISRelacionadosRet20 value) {
        this.cfdisRelacionadosRet20 = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestosRetencion.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImpuestoRetencion }
     *     
     */
    public ArrayOfImpuestoRetencion getImpuestosRetencion() {
        return impuestosRetencion;
    }

    /**
     * Define el valor de la propiedad impuestosRetencion.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImpuestoRetencion }
     *     
     */
    public void setImpuestosRetencion(ArrayOfImpuestoRetencion value) {
        this.impuestosRetencion = value;
    }

    /**
     * Obtiene el valor de la propiedad complementosRetencion.
     * 
     * @return
     *     possible object is
     *     {@link ComplementosRetenciones }
     *     
     */
    public ComplementosRetenciones getComplementosRetencion() {
        return complementosRetencion;
    }

    /**
     * Define el valor de la propiedad complementosRetencion.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementosRetenciones }
     *     
     */
    public void setComplementosRetencion(ComplementosRetenciones value) {
        this.complementosRetencion = value;
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
