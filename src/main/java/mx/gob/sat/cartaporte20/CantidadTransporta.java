
package mx.gob.sat.cartaporte20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CantidadTransporta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CantidadTransporta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IDOrigen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IDDestino" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CvesTransporte" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CantidadTransporta")
public class CantidadTransporta {

    @XmlAttribute(name = "Cantidad")
    protected String cantidad;
    @XmlAttribute(name = "IDOrigen")
    protected String idOrigen;
    @XmlAttribute(name = "IDDestino")
    protected String idDestino;
    @XmlAttribute(name = "CvesTransporte")
    protected String cvesTransporte;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidad(String value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad idOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDOrigen() {
        return idOrigen;
    }

    /**
     * Define el valor de la propiedad idOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDOrigen(String value) {
        this.idOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad idDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDDestino() {
        return idDestino;
    }

    /**
     * Define el valor de la propiedad idDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDDestino(String value) {
        this.idDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad cvesTransporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvesTransporte() {
        return cvesTransporte;
    }

    /**
     * Define el valor de la propiedad cvesTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvesTransporte(String value) {
        this.cvesTransporte = value;
    }

}
