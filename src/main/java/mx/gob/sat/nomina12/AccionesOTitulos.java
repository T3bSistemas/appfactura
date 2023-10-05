
package mx.gob.sat.nomina12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccionesOTitulos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccionesOTitulos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ValorMercado" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="PrecioAlOtorgarse" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccionesOTitulos")
public class AccionesOTitulos {

    @XmlAttribute(name = "ValorMercado", required = true)
    protected BigDecimal valorMercado;
    @XmlAttribute(name = "PrecioAlOtorgarse", required = true)
    protected BigDecimal precioAlOtorgarse;

    /**
     * Obtiene el valor de la propiedad valorMercado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorMercado() {
        return valorMercado;
    }

    /**
     * Define el valor de la propiedad valorMercado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorMercado(BigDecimal value) {
        this.valorMercado = value;
    }

    /**
     * Obtiene el valor de la propiedad precioAlOtorgarse.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecioAlOtorgarse() {
        return precioAlOtorgarse;
    }

    /**
     * Define el valor de la propiedad precioAlOtorgarse.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecioAlOtorgarse(BigDecimal value) {
        this.precioAlOtorgarse = value;
    }

}
