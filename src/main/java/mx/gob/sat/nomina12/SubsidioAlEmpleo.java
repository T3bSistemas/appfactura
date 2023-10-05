
package mx.gob.sat.nomina12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubsidioAlEmpleo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubsidioAlEmpleo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="SubsidioCausado" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsidioAlEmpleo")
public class SubsidioAlEmpleo {

    @XmlAttribute(name = "SubsidioCausado", required = true)
    protected BigDecimal subsidioCausado;

    /**
     * Obtiene el valor de la propiedad subsidioCausado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubsidioCausado() {
        return subsidioCausado;
    }

    /**
     * Define el valor de la propiedad subsidioCausado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubsidioCausado(BigDecimal value) {
        this.subsidioCausado = value;
    }

}
