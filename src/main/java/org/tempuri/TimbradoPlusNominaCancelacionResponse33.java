
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TimbradoPlusNominaCancelacionResponse33 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TimbradoPlusNominaCancelacionResponse33"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcuseCancelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCancelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CanelacionCorrecta" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimbradoPlusNominaCancelacionResponse33", propOrder = {
    "acuseCancelacion",
    "codigoError",
    "errorCancelacion",
    "canelacionCorrecta"
})
public class TimbradoPlusNominaCancelacionResponse33 {

    @XmlElement(name = "AcuseCancelacion")
    protected String acuseCancelacion;
    @XmlElement(name = "CodigoError")
    protected String codigoError;
    @XmlElement(name = "ErrorCancelacion")
    protected String errorCancelacion;
    @XmlElement(name = "CanelacionCorrecta")
    protected boolean canelacionCorrecta;

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
     * Obtiene el valor de la propiedad canelacionCorrecta.
     * 
     */
    public boolean isCanelacionCorrecta() {
        return canelacionCorrecta;
    }

    /**
     * Define el valor de la propiedad canelacionCorrecta.
     * 
     */
    public void setCanelacionCorrecta(boolean value) {
        this.canelacionCorrecta = value;
    }

}
