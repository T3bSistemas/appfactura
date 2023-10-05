
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultaFolioFiscalResponse2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaFolioFiscalResponse2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FolioFiscal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Correcto" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaFolioFiscalResponse2", propOrder = {
    "folioFiscal",
    "error",
    "correcto"
})
public class ConsultaFolioFiscalResponse2 {

    @XmlElement(name = "FolioFiscal")
    protected String folioFiscal;
    @XmlElement(name = "Error")
    protected String error;
    @XmlElement(name = "Correcto")
    protected boolean correcto;

    /**
     * Obtiene el valor de la propiedad folioFiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioFiscal() {
        return folioFiscal;
    }

    /**
     * Define el valor de la propiedad folioFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioFiscal(String value) {
        this.folioFiscal = value;
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
     * Obtiene el valor de la propiedad correcto.
     * 
     */
    public boolean isCorrecto() {
        return correcto;
    }

    /**
     * Define el valor de la propiedad correcto.
     * 
     */
    public void setCorrecto(boolean value) {
        this.correcto = value;
    }

}
