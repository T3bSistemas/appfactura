
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultaReportesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaReportesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="candadoCorrecto" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="queryDatos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MensajeError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaReportesResponse", propOrder = {
    "candadoCorrecto",
    "queryDatos",
    "mensajeError"
})
public class ConsultaReportesResponse {

    protected boolean candadoCorrecto;
    protected String queryDatos;
    @XmlElement(name = "MensajeError")
    protected String mensajeError;

    /**
     * Obtiene el valor de la propiedad candadoCorrecto.
     * 
     */
    public boolean isCandadoCorrecto() {
        return candadoCorrecto;
    }

    /**
     * Define el valor de la propiedad candadoCorrecto.
     * 
     */
    public void setCandadoCorrecto(boolean value) {
        this.candadoCorrecto = value;
    }

    /**
     * Obtiene el valor de la propiedad queryDatos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryDatos() {
        return queryDatos;
    }

    /**
     * Define el valor de la propiedad queryDatos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryDatos(String value) {
        this.queryDatos = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeError() {
        return mensajeError;
    }

    /**
     * Define el valor de la propiedad mensajeError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeError(String value) {
        this.mensajeError = value;
    }

}
