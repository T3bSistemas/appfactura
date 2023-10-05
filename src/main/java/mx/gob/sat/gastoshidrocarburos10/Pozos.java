
package mx.gob.sat.gastoshidrocarburos10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Pozos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Pozos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Pozo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pozos")
public class Pozos {

    @XmlAttribute(name = "Pozo")
    protected String pozo;

    /**
     * Obtiene el valor de la propiedad pozo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozo() {
        return pozo;
    }

    /**
     * Define el valor de la propiedad pozo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozo(String value) {
        this.pozo = value;
    }

}
