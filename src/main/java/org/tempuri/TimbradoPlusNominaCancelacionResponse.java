
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TimbradoPlusNominaCancelacionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TimbradoPlusNominaCancelacionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcuseCancelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCancelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CancelacionCorrecta" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimbradoPlusNominaCancelacionResponse", propOrder = {
    "acuseCancelacion",
    "codigoError",
    "errorCancelacion",
    "cancelacionCorrecta"
})
public class TimbradoPlusNominaCancelacionResponse {

    @XmlElement(name = "AcuseCancelacion")
    protected String acuseCancelacion;
    @XmlElement(name = "CodigoError")
    protected String codigoError;
    @XmlElement(name = "ErrorCancelacion")
    protected String errorCancelacion;
    @XmlElement(name = "CancelacionCorrecta")
    protected boolean cancelacionCorrecta;

    /**
     * Obtiene el valor de la propiedad acuseCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcuseCancelacion() {
        return acuseCancelacion;
    }

    /**
     * Define el valor de la propiedad acuseCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcuseCancelacion(String value) {
        this.acuseCancelacion = value;
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
     * Obtiene el valor de la propiedad errorCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCancelacion() {
        return errorCancelacion;
    }

    /**
     * Define el valor de la propiedad errorCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCancelacion(String value) {
        this.errorCancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelacionCorrecta.
     * 
     */
    public boolean isCancelacionCorrecta() {
        return cancelacionCorrecta;
    }

    /**
     * Define el valor de la propiedad cancelacionCorrecta.
     * 
     */
    public void setCancelacionCorrecta(boolean value) {
        this.cancelacionCorrecta = value;
    }

}
