
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CPagoBPResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CPagoBPResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Documento" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CPBPOK" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPagoBPResponse", propOrder = {
    "documento",
    "id",
    "cpbpok",
    "codigoError",
    "errorPago"
})
public class CPagoBPResponse {

    @XmlElement(name = "Documento")
    protected byte[] documento;
    protected int id;
    @XmlElement(name = "CPBPOK")
    protected boolean cpbpok;
    @XmlElement(name = "CodigoError")
    protected String codigoError;
    @XmlElement(name = "ErrorPago")
    protected String errorPago;

    /**
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocumento(byte[] value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad cpbpok.
     * 
     */
    public boolean isCPBPOK() {
        return cpbpok;
    }

    /**
     * Define el valor de la propiedad cpbpok.
     * 
     */
    public void setCPBPOK(boolean value) {
        this.cpbpok = value;
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

    /**
     * Obtiene el valor de la propiedad errorPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorPago() {
        return errorPago;
    }

    /**
     * Define el valor de la propiedad errorPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorPago(String value) {
        this.errorPago = value;
    }

}
