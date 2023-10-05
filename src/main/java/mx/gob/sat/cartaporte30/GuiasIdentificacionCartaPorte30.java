
package mx.gob.sat.cartaporte30;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GuiasIdentificacionCartaPorte30 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GuiasIdentificacionCartaPorte30"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="NumeroGuiaIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DescripGuiaIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PesoGuiaIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuiasIdentificacionCartaPorte30")
public class GuiasIdentificacionCartaPorte30 {

    @XmlAttribute(name = "NumeroGuiaIdentificacion")
    protected String numeroGuiaIdentificacion;
    @XmlAttribute(name = "DescripGuiaIdentificacion")
    protected String descripGuiaIdentificacion;
    @XmlAttribute(name = "PesoGuiaIdentificacion")
    protected String pesoGuiaIdentificacion;

    /**
     * Obtiene el valor de la propiedad numeroGuiaIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaIdentificacion() {
        return numeroGuiaIdentificacion;
    }

    /**
     * Define el valor de la propiedad numeroGuiaIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaIdentificacion(String value) {
        this.numeroGuiaIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripGuiaIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripGuiaIdentificacion() {
        return descripGuiaIdentificacion;
    }

    /**
     * Define el valor de la propiedad descripGuiaIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripGuiaIdentificacion(String value) {
        this.descripGuiaIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoGuiaIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoGuiaIdentificacion() {
        return pesoGuiaIdentificacion;
    }

    /**
     * Define el valor de la propiedad pesoGuiaIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoGuiaIdentificacion(String value) {
        this.pesoGuiaIdentificacion = value;
    }

}
