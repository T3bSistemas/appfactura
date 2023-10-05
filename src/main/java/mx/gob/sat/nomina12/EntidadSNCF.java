
package mx.gob.sat.nomina12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EntidadSNCF complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EntidadSNCF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="OrigenRecurso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MontoRecursoPropio" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntidadSNCF")
public class EntidadSNCF {

    @XmlAttribute(name = "OrigenRecurso")
    protected String origenRecurso;
    @XmlAttribute(name = "MontoRecursoPropio", required = true)
    protected double montoRecursoPropio;

    /**
     * Obtiene el valor de la propiedad origenRecurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigenRecurso() {
        return origenRecurso;
    }

    /**
     * Define el valor de la propiedad origenRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigenRecurso(String value) {
        this.origenRecurso = value;
    }

    /**
     * Obtiene el valor de la propiedad montoRecursoPropio.
     * 
     */
    public double getMontoRecursoPropio() {
        return montoRecursoPropio;
    }

    /**
     * Define el valor de la propiedad montoRecursoPropio.
     * 
     */
    public void setMontoRecursoPropio(double value) {
        this.montoRecursoPropio = value;
    }

}
