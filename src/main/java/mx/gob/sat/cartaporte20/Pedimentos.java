
package mx.gob.sat.cartaporte20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Pedimentos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Pedimentos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Pedimento" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pedimentos")
public class Pedimentos {

    @XmlAttribute(name = "Pedimento")
    protected String pedimento;

    /**
     * Obtiene el valor de la propiedad pedimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPedimento() {
        return pedimento;
    }

    /**
     * Define el valor de la propiedad pedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPedimento(String value) {
        this.pedimento = value;
    }

}
