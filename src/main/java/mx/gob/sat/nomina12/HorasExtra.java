
package mx.gob.sat.nomina12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HorasExtra complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HorasExtra"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Dias" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="TipoHoras" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HorasExtra" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ImportePagado" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HorasExtra")
public class HorasExtra {

    @XmlAttribute(name = "Dias", required = true)
    protected long dias;
    @XmlAttribute(name = "TipoHoras")
    protected String tipoHoras;
    @XmlAttribute(name = "HorasExtra", required = true)
    protected long horasExtra;
    @XmlAttribute(name = "ImportePagado", required = true)
    protected BigDecimal importePagado;

    /**
     * Obtiene el valor de la propiedad dias.
     * 
     */
    public long getDias() {
        return dias;
    }

    /**
     * Define el valor de la propiedad dias.
     * 
     */
    public void setDias(long value) {
        this.dias = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoHoras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoHoras() {
        return tipoHoras;
    }

    /**
     * Define el valor de la propiedad tipoHoras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoHoras(String value) {
        this.tipoHoras = value;
    }

    /**
     * Obtiene el valor de la propiedad horasExtra.
     * 
     */
    public long getHorasExtra() {
        return horasExtra;
    }

    /**
     * Define el valor de la propiedad horasExtra.
     * 
     */
    public void setHorasExtra(long value) {
        this.horasExtra = value;
    }

    /**
     * Obtiene el valor de la propiedad importePagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportePagado() {
        return importePagado;
    }

    /**
     * Define el valor de la propiedad importePagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportePagado(BigDecimal value) {
        this.importePagado = value;
    }

}
