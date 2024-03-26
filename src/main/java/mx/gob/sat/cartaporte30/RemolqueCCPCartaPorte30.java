
package mx.gob.sat.cartaporte30;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RemolqueCCPCartaPorte30 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RemolqueCCPCartaPorte30"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="SubTipoRemCCP" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PlacaCCP" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemolqueCCPCartaPorte30")
public class RemolqueCCPCartaPorte30 {

    @XmlAttribute(name = "SubTipoRemCCP")
    protected String subTipoRemCCP;
    @XmlAttribute(name = "PlacaCCP")
    protected String placaCCP;

    /**
     * Obtiene el valor de la propiedad subTipoRemCCP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTipoRemCCP() {
        return subTipoRemCCP;
    }

    /**
     * Define el valor de la propiedad subTipoRemCCP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTipoRemCCP(String value) {
        this.subTipoRemCCP = value;
    }

    /**
     * Obtiene el valor de la propiedad placaCCP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacaCCP() {
        return placaCCP;
    }

    /**
     * Define el valor de la propiedad placaCCP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacaCCP(String value) {
        this.placaCCP = value;
    }

}
