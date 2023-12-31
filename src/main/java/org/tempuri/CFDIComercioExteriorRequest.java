
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CFDIComercioExteriorRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CFDIComercioExteriorRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatosComercioExterior" type="{http://tempuri.org/}DatosComercioExteriorCFDI" minOccurs="0"/&gt;
 *         &lt;element name="ReceptorComercioExterior" type="{http://tempuri.org/}ReceptorComercioExteriorCFDI" minOccurs="0"/&gt;
 *         &lt;element name="Conceptos" type="{http://tempuri.org/}ConceptosComercioCFDI" minOccurs="0"/&gt;
 *         &lt;element name="Impuestos" type="{http://tempuri.org/}ImpuestosComercio" minOccurs="0"/&gt;
 *         &lt;element name="propietario" type="{http://tempuri.org/}PropietarioComercioExterior" minOccurs="0"/&gt;
 *         &lt;element name="Destinatario" type="{http://tempuri.org/}DestinatariosComercioExterior" minOccurs="0"/&gt;
 *         &lt;element name="Mercancias" type="{http://tempuri.org/}MercanciasComercioExterior" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFDIComercioExteriorRequest", propOrder = {
    "usuario",
    "contrasena",
    "datosComercioExterior",
    "receptorComercioExterior",
    "conceptos",
    "impuestos",
    "propietario",
    "destinatario",
    "mercancias"
})
public class CFDIComercioExteriorRequest {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Contrasena")
    protected String contrasena;
    @XmlElement(name = "DatosComercioExterior")
    protected DatosComercioExteriorCFDI datosComercioExterior;
    @XmlElement(name = "ReceptorComercioExterior")
    protected ReceptorComercioExteriorCFDI receptorComercioExterior;
    @XmlElement(name = "Conceptos")
    protected ConceptosComercioCFDI conceptos;
    @XmlElement(name = "Impuestos")
    protected ImpuestosComercio impuestos;
    protected PropietarioComercioExterior propietario;
    @XmlElement(name = "Destinatario")
    protected DestinatariosComercioExterior destinatario;
    @XmlElement(name = "Mercancias")
    protected MercanciasComercioExterior mercancias;

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
     * Obtiene el valor de la propiedad datosComercioExterior.
     * 
     * @return
     *     possible object is
     *     {@link DatosComercioExteriorCFDI }
     *     
     */
    public DatosComercioExteriorCFDI getDatosComercioExterior() {
        return datosComercioExterior;
    }

    /**
     * Define el valor de la propiedad datosComercioExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosComercioExteriorCFDI }
     *     
     */
    public void setDatosComercioExterior(DatosComercioExteriorCFDI value) {
        this.datosComercioExterior = value;
    }

    /**
     * Obtiene el valor de la propiedad receptorComercioExterior.
     * 
     * @return
     *     possible object is
     *     {@link ReceptorComercioExteriorCFDI }
     *     
     */
    public ReceptorComercioExteriorCFDI getReceptorComercioExterior() {
        return receptorComercioExterior;
    }

    /**
     * Define el valor de la propiedad receptorComercioExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceptorComercioExteriorCFDI }
     *     
     */
    public void setReceptorComercioExterior(ReceptorComercioExteriorCFDI value) {
        this.receptorComercioExterior = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptos.
     * 
     * @return
     *     possible object is
     *     {@link ConceptosComercioCFDI }
     *     
     */
    public ConceptosComercioCFDI getConceptos() {
        return conceptos;
    }

    /**
     * Define el valor de la propiedad conceptos.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptosComercioCFDI }
     *     
     */
    public void setConceptos(ConceptosComercioCFDI value) {
        this.conceptos = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestos.
     * 
     * @return
     *     possible object is
     *     {@link ImpuestosComercio }
     *     
     */
    public ImpuestosComercio getImpuestos() {
        return impuestos;
    }

    /**
     * Define el valor de la propiedad impuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpuestosComercio }
     *     
     */
    public void setImpuestos(ImpuestosComercio value) {
        this.impuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad propietario.
     * 
     * @return
     *     possible object is
     *     {@link PropietarioComercioExterior }
     *     
     */
    public PropietarioComercioExterior getPropietario() {
        return propietario;
    }

    /**
     * Define el valor de la propiedad propietario.
     * 
     * @param value
     *     allowed object is
     *     {@link PropietarioComercioExterior }
     *     
     */
    public void setPropietario(PropietarioComercioExterior value) {
        this.propietario = value;
    }

    /**
     * Obtiene el valor de la propiedad destinatario.
     * 
     * @return
     *     possible object is
     *     {@link DestinatariosComercioExterior }
     *     
     */
    public DestinatariosComercioExterior getDestinatario() {
        return destinatario;
    }

    /**
     * Define el valor de la propiedad destinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinatariosComercioExterior }
     *     
     */
    public void setDestinatario(DestinatariosComercioExterior value) {
        this.destinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad mercancias.
     * 
     * @return
     *     possible object is
     *     {@link MercanciasComercioExterior }
     *     
     */
    public MercanciasComercioExterior getMercancias() {
        return mercancias;
    }

    /**
     * Define el valor de la propiedad mercancias.
     * 
     * @param value
     *     allowed object is
     *     {@link MercanciasComercioExterior }
     *     
     */
    public void setMercancias(MercanciasComercioExterior value) {
        this.mercancias = value;
    }

}
