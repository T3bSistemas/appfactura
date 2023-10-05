
package mx.gob.sat.nomina12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubContratacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubContratacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="RfcLabora" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="PorcentajeTiempo" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubContratacion")
public class SubContratacion {

    @XmlAttribute(name = "RfcLabora", required = true)
    protected BigDecimal rfcLabora;
    @XmlAttribute(name = "PorcentajeTiempo", required = true)
    protected BigDecimal porcentajeTiempo;

    /**
     * Obtiene el valor de la propiedad rfcLabora.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRfcLabora() {
        return rfcLabora;
    }

    /**
     * Define el valor de la propiedad rfcLabora.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRfcLabora(BigDecimal value) {
        this.rfcLabora = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeTiempo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeTiempo() {
        return porcentajeTiempo;
    }

    /**
     * Define el valor de la propiedad porcentajeTiempo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeTiempo(BigDecimal value) {
        this.porcentajeTiempo = value;
    }

}
