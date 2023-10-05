
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReporteResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReporteResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReporteJson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Estatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalFacturas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReporteResponse", propOrder = {
    "reporteJson",
    "estatus",
    "mensaje",
    "totalFacturas"
})
public class ReporteResponse {

    @XmlElement(name = "ReporteJson")
    protected String reporteJson;
    @XmlElement(name = "Estatus")
    protected boolean estatus;
    @XmlElement(name = "Mensaje")
    protected String mensaje;
    @XmlElement(name = "TotalFacturas")
    protected int totalFacturas;

    /**
     * Obtiene el valor de la propiedad reporteJson.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReporteJson() {
        return reporteJson;
    }

    /**
     * Define el valor de la propiedad reporteJson.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReporteJson(String value) {
        this.reporteJson = value;
    }

    /**
     * Obtiene el valor de la propiedad estatus.
     * 
     */
    public boolean isEstatus() {
        return estatus;
    }

    /**
     * Define el valor de la propiedad estatus.
     * 
     */
    public void setEstatus(boolean value) {
        this.estatus = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad totalFacturas.
     * 
     */
    public int getTotalFacturas() {
        return totalFacturas;
    }

    /**
     * Define el valor de la propiedad totalFacturas.
     * 
     */
    public void setTotalFacturas(int value) {
        this.totalFacturas = value;
    }

}
