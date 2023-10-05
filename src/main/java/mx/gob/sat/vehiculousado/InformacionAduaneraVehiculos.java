
package mx.gob.sat.vehiculousado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InformacionAduaneraVehiculos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InformacionAduaneraVehiculos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="numero" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="aduana" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionAduaneraVehiculos")
public class InformacionAduaneraVehiculos {

    @XmlAttribute(name = "numero")
    protected String numero;
    @XmlAttribute(name = "fecha")
    protected String fecha;
    @XmlAttribute(name = "aduana")
    protected String aduana;

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad aduana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAduana() {
        return aduana;
    }

    /**
     * Define el valor de la propiedad aduana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAduana(String value) {
        this.aduana = value;
    }

}
