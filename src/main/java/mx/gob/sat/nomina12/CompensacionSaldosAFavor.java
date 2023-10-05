
package mx.gob.sat.nomina12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CompensacionSaldosAFavor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CompensacionSaldosAFavor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="SaldoAFavor" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="Año" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="RemanenteSalFav" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompensacionSaldosAFavor")
public class CompensacionSaldosAFavor {

    @XmlAttribute(name = "SaldoAFavor", required = true)
    protected BigDecimal saldoAFavor;
    @XmlAttribute(name = "A\u00f1o", required = true)
    protected long año;
    @XmlAttribute(name = "RemanenteSalFav", required = true)
    protected BigDecimal remanenteSalFav;

    /**
     * Obtiene el valor de la propiedad saldoAFavor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoAFavor() {
        return saldoAFavor;
    }

    /**
     * Define el valor de la propiedad saldoAFavor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoAFavor(BigDecimal value) {
        this.saldoAFavor = value;
    }

    /**
     * Obtiene el valor de la propiedad año.
     * 
     */
    public long getAño() {
        return año;
    }

    /**
     * Define el valor de la propiedad año.
     * 
     */
    public void setAño(long value) {
        this.año = value;
    }

    /**
     * Obtiene el valor de la propiedad remanenteSalFav.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemanenteSalFav() {
        return remanenteSalFav;
    }

    /**
     * Define el valor de la propiedad remanenteSalFav.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemanenteSalFav(BigDecimal value) {
        this.remanenteSalFav = value;
    }

}
