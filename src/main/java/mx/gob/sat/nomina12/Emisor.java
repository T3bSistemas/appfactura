
package mx.gob.sat.nomina12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Emisor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Emisor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntidadSNCF" type="{http://www.sat.gob.mx/nomina12}EntidadSNCF" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Curp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RegistroPatronal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RfcPatronOrigen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Emisor", propOrder = {
    "entidadSNCF"
})
public class Emisor {

    @XmlElement(name = "EntidadSNCF")
    protected EntidadSNCF entidadSNCF;
    @XmlAttribute(name = "Curp")
    protected String curp;
    @XmlAttribute(name = "RegistroPatronal")
    protected String registroPatronal;
    @XmlAttribute(name = "RfcPatronOrigen")
    protected String rfcPatronOrigen;

    /**
     * Obtiene el valor de la propiedad entidadSNCF.
     * 
     * @return
     *     possible object is
     *     {@link EntidadSNCF }
     *     
     */
    public EntidadSNCF getEntidadSNCF() {
        return entidadSNCF;
    }

    /**
     * Define el valor de la propiedad entidadSNCF.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadSNCF }
     *     
     */
    public void setEntidadSNCF(EntidadSNCF value) {
        this.entidadSNCF = value;
    }

    /**
     * Obtiene el valor de la propiedad curp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurp() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurp(String value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad registroPatronal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroPatronal() {
        return registroPatronal;
    }

    /**
     * Define el valor de la propiedad registroPatronal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroPatronal(String value) {
        this.registroPatronal = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcPatronOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcPatronOrigen() {
        return rfcPatronOrigen;
    }

    /**
     * Define el valor de la propiedad rfcPatronOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcPatronOrigen(String value) {
        this.rfcPatronOrigen = value;
    }

}
