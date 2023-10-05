
package mx.gob.sat.cartaporte20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IdentificacionVehicular complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IdentificacionVehicular"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ConfigVehicular" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PlacaVM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AnioModeloVM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificacionVehicular")
public class IdentificacionVehicular {

    @XmlAttribute(name = "ConfigVehicular")
    protected String configVehicular;
    @XmlAttribute(name = "PlacaVM")
    protected String placaVM;
    @XmlAttribute(name = "AnioModeloVM")
    protected String anioModeloVM;

    /**
     * Obtiene el valor de la propiedad configVehicular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigVehicular() {
        return configVehicular;
    }

    /**
     * Define el valor de la propiedad configVehicular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigVehicular(String value) {
        this.configVehicular = value;
    }

    /**
     * Obtiene el valor de la propiedad placaVM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacaVM() {
        return placaVM;
    }

    /**
     * Define el valor de la propiedad placaVM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacaVM(String value) {
        this.placaVM = value;
    }

    /**
     * Obtiene el valor de la propiedad anioModeloVM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnioModeloVM() {
        return anioModeloVM;
    }

    /**
     * Define el valor de la propiedad anioModeloVM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnioModeloVM(String value) {
        this.anioModeloVM = value;
    }

}
