
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PolizasPeriodo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PolizasPeriodo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}GeneralesConta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoSolicitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroTramite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Polizas" type="{http://tempuri.org/}ArrayOfPoliza" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolizasPeriodo", propOrder = {
    "tipoSolicitud",
    "numeroOrden",
    "numeroTramite",
    "polizas"
})
public class PolizasPeriodo
    extends GeneralesConta
{

    @XmlElement(name = "TipoSolicitud")
    protected String tipoSolicitud;
    @XmlElement(name = "NumeroOrden")
    protected String numeroOrden;
    @XmlElement(name = "NumeroTramite")
    protected String numeroTramite;
    @XmlElement(name = "Polizas")
    protected ArrayOfPoliza polizas;

    /**
     * Obtiene el valor de la propiedad tipoSolicitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    /**
     * Define el valor de la propiedad tipoSolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSolicitud(String value) {
        this.tipoSolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroOrden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroOrden() {
        return numeroOrden;
    }

    /**
     * Define el valor de la propiedad numeroOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroOrden(String value) {
        this.numeroOrden = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTramite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTramite() {
        return numeroTramite;
    }

    /**
     * Define el valor de la propiedad numeroTramite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTramite(String value) {
        this.numeroTramite = value;
    }

    /**
     * Obtiene el valor de la propiedad polizas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPoliza }
     *     
     */
    public ArrayOfPoliza getPolizas() {
        return polizas;
    }

    /**
     * Define el valor de la propiedad polizas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPoliza }
     *     
     */
    public void setPolizas(ArrayOfPoliza value) {
        this.polizas = value;
    }

}
