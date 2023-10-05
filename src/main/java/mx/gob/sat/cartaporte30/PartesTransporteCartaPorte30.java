
package mx.gob.sat.cartaporte30;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartesTransporteCartaPorte30 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartesTransporteCartaPorte30"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ParteTransporte" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartesTransporteCartaPorte30")
public class PartesTransporteCartaPorte30 {

    @XmlAttribute(name = "ParteTransporte")
    protected String parteTransporte;

    /**
     * Obtiene el valor de la propiedad parteTransporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParteTransporte() {
        return parteTransporte;
    }

    /**
     * Define el valor de la propiedad parteTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParteTransporte(String value) {
        this.parteTransporte = value;
    }

}
