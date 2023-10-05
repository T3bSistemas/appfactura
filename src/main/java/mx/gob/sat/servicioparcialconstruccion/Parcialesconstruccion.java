
package mx.gob.sat.servicioparcialconstruccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Parcialesconstruccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Parcialesconstruccion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Inmueble" type="{http://www.sat.gob.mx/servicioparcialconstruccion}Inmueble" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="NumPerLicoAut" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parcialesconstruccion", propOrder = {
    "inmueble"
})
public class Parcialesconstruccion {

    @XmlElement(name = "Inmueble")
    protected Inmueble inmueble;
    @XmlAttribute(name = "NumPerLicoAut")
    protected String numPerLicoAut;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * Obtiene el valor de la propiedad inmueble.
     * 
     * @return
     *     possible object is
     *     {@link Inmueble }
     *     
     */
    public Inmueble getInmueble() {
        return inmueble;
    }

    /**
     * Define el valor de la propiedad inmueble.
     * 
     * @param value
     *     allowed object is
     *     {@link Inmueble }
     *     
     */
    public void setInmueble(Inmueble value) {
        this.inmueble = value;
    }

    /**
     * Obtiene el valor de la propiedad numPerLicoAut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPerLicoAut() {
        return numPerLicoAut;
    }

    /**
     * Define el valor de la propiedad numPerLicoAut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPerLicoAut(String value) {
        this.numPerLicoAut = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
