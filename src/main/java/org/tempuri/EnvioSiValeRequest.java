
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EnvioSiValeRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EnvioSiValeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Idfactura" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Receptor" type="{http://tempuri.org/}ReceptorCFDI" minOccurs="0"/&gt;
 *         &lt;element name="Emisor" type="{http://tempuri.org/}ClienteEmisor" minOccurs="0"/&gt;
 *         &lt;element name="XML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatosCFDI" type="{http://tempuri.org/}DatosCFDI" minOccurs="0"/&gt;
 *         &lt;element name="IdClienteReceptor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvioSiValeRequest", propOrder = {
    "usuario",
    "idfactura",
    "receptor",
    "emisor",
    "xml",
    "datosCFDI",
    "idClienteReceptor"
})
public class EnvioSiValeRequest {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Idfactura")
    protected int idfactura;
    @XmlElement(name = "Receptor")
    protected ReceptorCFDI receptor;
    @XmlElement(name = "Emisor")
    protected ClienteEmisor emisor;
    @XmlElement(name = "XML")
    protected String xml;
    @XmlElement(name = "DatosCFDI")
    protected DatosCFDI datosCFDI;
    @XmlElement(name = "IdClienteReceptor")
    protected int idClienteReceptor;

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
     * Obtiene el valor de la propiedad idfactura.
     * 
     */
    public int getIdfactura() {
        return idfactura;
    }

    /**
     * Define el valor de la propiedad idfactura.
     * 
     */
    public void setIdfactura(int value) {
        this.idfactura = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link ReceptorCFDI }
     *     
     */
    public ReceptorCFDI getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceptorCFDI }
     *     
     */
    public void setReceptor(ReceptorCFDI value) {
        this.receptor = value;
    }

    /**
     * Obtiene el valor de la propiedad emisor.
     * 
     * @return
     *     possible object is
     *     {@link ClienteEmisor }
     *     
     */
    public ClienteEmisor getEmisor() {
        return emisor;
    }

    /**
     * Define el valor de la propiedad emisor.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteEmisor }
     *     
     */
    public void setEmisor(ClienteEmisor value) {
        this.emisor = value;
    }

    /**
     * Obtiene el valor de la propiedad xml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXML() {
        return xml;
    }

    /**
     * Define el valor de la propiedad xml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXML(String value) {
        this.xml = value;
    }

    /**
     * Obtiene el valor de la propiedad datosCFDI.
     * 
     * @return
     *     possible object is
     *     {@link DatosCFDI }
     *     
     */
    public DatosCFDI getDatosCFDI() {
        return datosCFDI;
    }

    /**
     * Define el valor de la propiedad datosCFDI.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosCFDI }
     *     
     */
    public void setDatosCFDI(DatosCFDI value) {
        this.datosCFDI = value;
    }

    /**
     * Obtiene el valor de la propiedad idClienteReceptor.
     * 
     */
    public int getIdClienteReceptor() {
        return idClienteReceptor;
    }

    /**
     * Define el valor de la propiedad idClienteReceptor.
     * 
     */
    public void setIdClienteReceptor(int value) {
        this.idClienteReceptor = value;
    }

}
