
package mx.gob.sat.cartaporte30;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UbicacionCartaPorte30 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UbicacionCartaPorte30"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Domicilio" type="{http://www.sat.gob.mx/CartaPorte30}DomicilioCartaPorte30" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TipoUbicacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IDUbicacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RFCRemitenteDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NombreRemitenteDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumRegIdTrib" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ResidenciaFiscal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumEstacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NombreEstacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NavegacionTrafico" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FechaHoraSalidaLlegada" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TipoEstacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DistanciaRecorrida" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UbicacionCartaPorte30", propOrder = {
    "domicilio"
})
public class UbicacionCartaPorte30 {

    @XmlElement(name = "Domicilio")
    protected DomicilioCartaPorte30 domicilio;
    @XmlAttribute(name = "TipoUbicacion")
    protected String tipoUbicacion;
    @XmlAttribute(name = "IDUbicacion")
    protected String idUbicacion;
    @XmlAttribute(name = "RFCRemitenteDestinatario")
    protected String rfcRemitenteDestinatario;
    @XmlAttribute(name = "NombreRemitenteDestinatario")
    protected String nombreRemitenteDestinatario;
    @XmlAttribute(name = "NumRegIdTrib")
    protected String numRegIdTrib;
    @XmlAttribute(name = "ResidenciaFiscal")
    protected String residenciaFiscal;
    @XmlAttribute(name = "NumEstacion")
    protected String numEstacion;
    @XmlAttribute(name = "NombreEstacion")
    protected String nombreEstacion;
    @XmlAttribute(name = "NavegacionTrafico")
    protected String navegacionTrafico;
    @XmlAttribute(name = "FechaHoraSalidaLlegada")
    protected String fechaHoraSalidaLlegada;
    @XmlAttribute(name = "TipoEstacion")
    protected String tipoEstacion;
    @XmlAttribute(name = "DistanciaRecorrida")
    protected String distanciaRecorrida;

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link DomicilioCartaPorte30 }
     *     
     */
    public DomicilioCartaPorte30 getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link DomicilioCartaPorte30 }
     *     
     */
    public void setDomicilio(DomicilioCartaPorte30 value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoUbicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoUbicacion() {
        return tipoUbicacion;
    }

    /**
     * Define el valor de la propiedad tipoUbicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoUbicacion(String value) {
        this.tipoUbicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idUbicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDUbicacion() {
        return idUbicacion;
    }

    /**
     * Define el valor de la propiedad idUbicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDUbicacion(String value) {
        this.idUbicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcRemitenteDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCRemitenteDestinatario() {
        return rfcRemitenteDestinatario;
    }

    /**
     * Define el valor de la propiedad rfcRemitenteDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCRemitenteDestinatario(String value) {
        this.rfcRemitenteDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreRemitenteDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRemitenteDestinatario() {
        return nombreRemitenteDestinatario;
    }

    /**
     * Define el valor de la propiedad nombreRemitenteDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRemitenteDestinatario(String value) {
        this.nombreRemitenteDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad numRegIdTrib.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRegIdTrib() {
        return numRegIdTrib;
    }

    /**
     * Define el valor de la propiedad numRegIdTrib.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRegIdTrib(String value) {
        this.numRegIdTrib = value;
    }

    /**
     * Obtiene el valor de la propiedad residenciaFiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenciaFiscal() {
        return residenciaFiscal;
    }

    /**
     * Define el valor de la propiedad residenciaFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenciaFiscal(String value) {
        this.residenciaFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad numEstacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumEstacion() {
        return numEstacion;
    }

    /**
     * Define el valor de la propiedad numEstacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumEstacion(String value) {
        this.numEstacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEstacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEstacion() {
        return nombreEstacion;
    }

    /**
     * Define el valor de la propiedad nombreEstacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEstacion(String value) {
        this.nombreEstacion = value;
    }

    /**
     * Obtiene el valor de la propiedad navegacionTrafico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavegacionTrafico() {
        return navegacionTrafico;
    }

    /**
     * Define el valor de la propiedad navegacionTrafico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavegacionTrafico(String value) {
        this.navegacionTrafico = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraSalidaLlegada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHoraSalidaLlegada() {
        return fechaHoraSalidaLlegada;
    }

    /**
     * Define el valor de la propiedad fechaHoraSalidaLlegada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHoraSalidaLlegada(String value) {
        this.fechaHoraSalidaLlegada = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEstacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEstacion() {
        return tipoEstacion;
    }

    /**
     * Define el valor de la propiedad tipoEstacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEstacion(String value) {
        this.tipoEstacion = value;
    }

    /**
     * Obtiene el valor de la propiedad distanciaRecorrida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    /**
     * Define el valor de la propiedad distanciaRecorrida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanciaRecorrida(String value) {
        this.distanciaRecorrida = value;
    }

}
