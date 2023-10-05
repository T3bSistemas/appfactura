
package mx.gob.sat.nomina12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Incapacidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Incapacidad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DiasIncapacidad" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="TipoIncapacidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ImporteMonetario" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Incapacidad")
public class Incapacidad {

    @XmlAttribute(name = "DiasIncapacidad", required = true)
    protected long diasIncapacidad;
    @XmlAttribute(name = "TipoIncapacidad")
    protected String tipoIncapacidad;
    @XmlAttribute(name = "ImporteMonetario", required = true)
    protected BigDecimal importeMonetario;

    /**
     * Obtiene el valor de la propiedad diasIncapacidad.
     * 
     */
    public long getDiasIncapacidad() {
        return diasIncapacidad;
    }

    /**
     * Define el valor de la propiedad diasIncapacidad.
     * 
     */
    public void setDiasIncapacidad(long value) {
        this.diasIncapacidad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIncapacidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIncapacidad() {
        return tipoIncapacidad;
    }

    /**
     * Define el valor de la propiedad tipoIncapacidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIncapacidad(String value) {
        this.tipoIncapacidad = value;
    }

    /**
     * Obtiene el valor de la propiedad importeMonetario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteMonetario() {
        return importeMonetario;
    }

    /**
     * Define el valor de la propiedad importeMonetario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteMonetario(BigDecimal value) {
        this.importeMonetario = value;
    }

}
