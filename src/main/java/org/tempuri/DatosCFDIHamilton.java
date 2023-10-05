
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosCFDIHamilton complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosCFDIHamilton"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}DatosCFDITimbradoPlus"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatosAdicionales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MensajePDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CadenaDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreArchivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosCFDIHamilton", propOrder = {
    "datosAdicionales",
    "mensajePDF",
    "emailMensaje",
    "cadenaDocumento",
    "nombreArchivo"
})
public class DatosCFDIHamilton
    extends DatosCFDITimbradoPlus
{

    @XmlElement(name = "DatosAdicionales")
    protected String datosAdicionales;
    @XmlElement(name = "MensajePDF")
    protected String mensajePDF;
    @XmlElement(name = "EmailMensaje")
    protected String emailMensaje;
    @XmlElement(name = "CadenaDocumento")
    protected String cadenaDocumento;
    @XmlElement(name = "NombreArchivo")
    protected String nombreArchivo;

    /**
     * Obtiene el valor de la propiedad datosAdicionales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosAdicionales() {
        return datosAdicionales;
    }

    /**
     * Define el valor de la propiedad datosAdicionales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosAdicionales(String value) {
        this.datosAdicionales = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajePDF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajePDF() {
        return mensajePDF;
    }

    /**
     * Define el valor de la propiedad mensajePDF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajePDF(String value) {
        this.mensajePDF = value;
    }

    /**
     * Obtiene el valor de la propiedad emailMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailMensaje() {
        return emailMensaje;
    }

    /**
     * Define el valor de la propiedad emailMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailMensaje(String value) {
        this.emailMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad cadenaDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadenaDocumento() {
        return cadenaDocumento;
    }

    /**
     * Define el valor de la propiedad cadenaDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadenaDocumento(String value) {
        this.cadenaDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreArchivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * Define el valor de la propiedad nombreArchivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArchivo(String value) {
        this.nombreArchivo = value;
    }

}
