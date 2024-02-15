
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CFDIComercioExterior20Request complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CFDIComercioExterior20Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatosComercioExterior" type="{http://tempuri.org/}DatosComercioExterior20CFDI" minOccurs="0"/&gt;
 *         &lt;element name="ReceptorComercioExterior" type="{http://tempuri.org/}ReceptorComercioExterior20" minOccurs="0"/&gt;
 *         &lt;element name="Conceptos" type="{http://tempuri.org/}ConceptosComercio20CFDI40" minOccurs="0"/&gt;
 *         &lt;element name="Impuestos" type="{http://tempuri.org/}ImpuestosComercio20" minOccurs="0"/&gt;
 *         &lt;element name="propietario" type="{http://tempuri.org/}PropietarioComercioExterior20" minOccurs="0"/&gt;
 *         &lt;element name="Destinatario" type="{http://tempuri.org/}DestinatariosComercioExterior20" minOccurs="0"/&gt;
 *         &lt;element name="Mercancias" type="{http://tempuri.org/}MercanciasComercioExterior20" minOccurs="0"/&gt;
 *         &lt;element name="CFDIRelacion40" type="{http://tempuri.org/}ArrayOfCFDISRelacionados40" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFDIComercioExterior20Request", propOrder = {
    "usuario",
    "contrasena",
    "datosComercioExterior",
    "receptorComercioExterior",
    "conceptos",
    "impuestos",
    "propietario",
    "destinatario",
    "mercancias",
    "cfdiRelacion40"
})
public class CFDIComercioExterior20Request {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Contrasena")
    protected String contrasena;
    @XmlElement(name = "DatosComercioExterior")
    protected DatosComercioExterior20CFDI datosComercioExterior;
    @XmlElement(name = "ReceptorComercioExterior")
    protected ReceptorComercioExterior20 receptorComercioExterior;
    @XmlElement(name = "Conceptos")
    protected ConceptosComercio20CFDI40 conceptos;
    @XmlElement(name = "Impuestos")
    protected ImpuestosComercio20 impuestos;
    protected PropietarioComercioExterior20 propietario;
    @XmlElement(name = "Destinatario")
    protected DestinatariosComercioExterior20 destinatario;
    @XmlElement(name = "Mercancias")
    protected MercanciasComercioExterior20 mercancias;
    @XmlElement(name = "CFDIRelacion40")
    protected ArrayOfCFDISRelacionados40 cfdiRelacion40;

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
     *     {@link DatosComercioExterior20CFDI }
     *     
     */
    public DatosComercioExterior20CFDI getDatosComercioExterior() {
        return datosComercioExterior;
    }

    /**
     * Define el valor de la propiedad datosComercioExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosComercioExterior20CFDI }
     *     
     */
    public void setDatosComercioExterior(DatosComercioExterior20CFDI value) {
        this.datosComercioExterior = value;
    }

    /**
     * Obtiene el valor de la propiedad receptorComercioExterior.
     * 
     * @return
     *     possible object is
     *     {@link ReceptorComercioExterior20 }
     *     
     */
    public ReceptorComercioExterior20 getReceptorComercioExterior() {
        return receptorComercioExterior;
    }

    /**
     * Define el valor de la propiedad receptorComercioExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceptorComercioExterior20 }
     *     
     */
    public void setReceptorComercioExterior(ReceptorComercioExterior20 value) {
        this.receptorComercioExterior = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptos.
     * 
     * @return
     *     possible object is
     *     {@link ConceptosComercio20CFDI40 }
     *     
     */
    public ConceptosComercio20CFDI40 getConceptos() {
        return conceptos;
    }

    /**
     * Define el valor de la propiedad conceptos.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptosComercio20CFDI40 }
     *     
     */
    public void setConceptos(ConceptosComercio20CFDI40 value) {
        this.conceptos = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestos.
     * 
     * @return
     *     possible object is
     *     {@link ImpuestosComercio20 }
     *     
     */
    public ImpuestosComercio20 getImpuestos() {
        return impuestos;
    }

    /**
     * Define el valor de la propiedad impuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpuestosComercio20 }
     *     
     */
    public void setImpuestos(ImpuestosComercio20 value) {
        this.impuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad propietario.
     * 
     * @return
     *     possible object is
     *     {@link PropietarioComercioExterior20 }
     *     
     */
    public PropietarioComercioExterior20 getPropietario() {
        return propietario;
    }

    /**
     * Define el valor de la propiedad propietario.
     * 
     * @param value
     *     allowed object is
     *     {@link PropietarioComercioExterior20 }
     *     
     */
    public void setPropietario(PropietarioComercioExterior20 value) {
        this.propietario = value;
    }

    /**
     * Obtiene el valor de la propiedad destinatario.
     * 
     * @return
     *     possible object is
     *     {@link DestinatariosComercioExterior20 }
     *     
     */
    public DestinatariosComercioExterior20 getDestinatario() {
        return destinatario;
    }

    /**
     * Define el valor de la propiedad destinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinatariosComercioExterior20 }
     *     
     */
    public void setDestinatario(DestinatariosComercioExterior20 value) {
        this.destinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad mercancias.
     * 
     * @return
     *     possible object is
     *     {@link MercanciasComercioExterior20 }
     *     
     */
    public MercanciasComercioExterior20 getMercancias() {
        return mercancias;
    }

    /**
     * Define el valor de la propiedad mercancias.
     * 
     * @param value
     *     allowed object is
     *     {@link MercanciasComercioExterior20 }
     *     
     */
    public void setMercancias(MercanciasComercioExterior20 value) {
        this.mercancias = value;
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

}
