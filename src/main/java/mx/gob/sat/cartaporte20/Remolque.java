
package mx.gob.sat.cartaporte20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Remolque complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Remolque"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="SubTipoRem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Placa" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Remolque")
public class Remolque {

    @XmlAttribute(name = "SubTipoRem")
    protected String subTipoRem;
    @XmlAttribute(name = "Placa")
    protected String placa;

    /**
     * Obtiene el valor de la propiedad subTipoRem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTipoRem() {
        return subTipoRem;
    }

    /**
     * Define el valor de la propiedad subTipoRem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTipoRem(String value) {
        this.subTipoRem = value;
    }

    /**
     * Obtiene el valor de la propiedad placa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define el valor de la propiedad placa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

}
