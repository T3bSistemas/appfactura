
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CertificadosResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CertificadosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertificadosCorrecto" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Certificados" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificadosResponse", propOrder = {
    "certificadosCorrecto",
    "certificados",
    "error",
    "codigoError"
})
public class CertificadosResponse {

    @XmlElement(name = "CertificadosCorrecto")
    protected boolean certificadosCorrecto;
    @XmlElement(name = "Certificados")
    protected ArrayOfString certificados;
    @XmlElement(name = "Error")
    protected String error;
    @XmlElement(name = "CodigoError")
    protected String codigoError;

    /**
     * Obtiene el valor de la propiedad certificadosCorrecto.
     * 
     */
    public boolean isCertificadosCorrecto() {
        return certificadosCorrecto;
    }

    /**
     * Define el valor de la propiedad certificadosCorrecto.
     * 
     */
    public void setCertificadosCorrecto(boolean value) {
        this.certificadosCorrecto = value;
    }

    /**
     * Obtiene el valor de la propiedad certificados.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCertificados() {
        return certificados;
    }

    /**
     * Define el valor de la propiedad certificados.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCertificados(ArrayOfString value) {
        this.certificados = value;
    }

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * Define el valor de la propiedad codigoError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoError(String value) {
        this.codigoError = value;
    }

}
