
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReporteRequestBellota complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReporteRequestBellota"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValorStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Orden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Receptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReporteRequestBellota", propOrder = {
    "idCliente",
    "valorStatus",
    "orden",
    "status",
    "comprobante",
    "fechaInicial",
    "fechaFinal",
    "receptor"
})
public class ReporteRequestBellota {

    @XmlElement(name = "IdCliente")
    protected String idCliente;
    @XmlElement(name = "ValorStatus")
    protected String valorStatus;
    @XmlElement(name = "Orden")
    protected String orden;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Comprobante")
    protected String comprobante;
    @XmlElement(name = "FechaInicial")
    protected String fechaInicial;
    @XmlElement(name = "FechaFinal")
    protected String fechaFinal;
    @XmlElement(name = "Receptor")
    protected String receptor;

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCliente(String value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad valorStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorStatus() {
        return valorStatus;
    }

    /**
     * Define el valor de la propiedad valorStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorStatus(String value) {
        this.valorStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad orden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrden() {
        return orden;
    }

    /**
     * Define el valor de la propiedad orden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrden(String value) {
        this.orden = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComprobante() {
        return comprobante;
    }

    /**
     * Define el valor de la propiedad comprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComprobante(String value) {
        this.comprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicial() {
        return fechaInicial;
    }

    /**
     * Define el valor de la propiedad fechaInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicial(String value) {
        this.fechaInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFinal() {
        return fechaFinal;
    }

    /**
     * Define el valor de la propiedad fechaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFinal(String value) {
        this.fechaFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceptor(String value) {
        this.receptor = value;
    }

}
