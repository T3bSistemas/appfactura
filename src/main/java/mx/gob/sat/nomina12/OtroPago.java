
package mx.gob.sat.nomina12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OtroPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OtroPago"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompensacionSaldosAFavor" type="{http://www.sat.gob.mx/nomina12}CompensacionSaldosAFavor" minOccurs="0"/&gt;
 *         &lt;element name="SubsidioAlEmpleo" type="{http://www.sat.gob.mx/nomina12}SubsidioAlEmpleo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TipoOtroPago" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Clave" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Concepto" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Importe" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtroPago", propOrder = {
    "compensacionSaldosAFavor",
    "subsidioAlEmpleo"
})
public class OtroPago {

    @XmlElement(name = "CompensacionSaldosAFavor")
    protected CompensacionSaldosAFavor compensacionSaldosAFavor;
    @XmlElement(name = "SubsidioAlEmpleo")
    protected SubsidioAlEmpleo subsidioAlEmpleo;
    @XmlAttribute(name = "TipoOtroPago")
    protected String tipoOtroPago;
    @XmlAttribute(name = "Clave")
    protected String clave;
    @XmlAttribute(name = "Concepto")
    protected String concepto;
    @XmlAttribute(name = "Importe", required = true)
    protected BigDecimal importe;

    /**
     * Obtiene el valor de la propiedad compensacionSaldosAFavor.
     * 
     * @return
     *     possible object is
     *     {@link CompensacionSaldosAFavor }
     *     
     */
    public CompensacionSaldosAFavor getCompensacionSaldosAFavor() {
        return compensacionSaldosAFavor;
    }

    /**
     * Define el valor de la propiedad compensacionSaldosAFavor.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensacionSaldosAFavor }
     *     
     */
    public void setCompensacionSaldosAFavor(CompensacionSaldosAFavor value) {
        this.compensacionSaldosAFavor = value;
    }

    /**
     * Obtiene el valor de la propiedad subsidioAlEmpleo.
     * 
     * @return
     *     possible object is
     *     {@link SubsidioAlEmpleo }
     *     
     */
    public SubsidioAlEmpleo getSubsidioAlEmpleo() {
        return subsidioAlEmpleo;
    }

    /**
     * Define el valor de la propiedad subsidioAlEmpleo.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidioAlEmpleo }
     *     
     */
    public void setSubsidioAlEmpleo(SubsidioAlEmpleo value) {
        this.subsidioAlEmpleo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOtroPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOtroPago() {
        return tipoOtroPago;
    }

    /**
     * Define el valor de la propiedad tipoOtroPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOtroPago(String value) {
        this.tipoOtroPago = value;
    }

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Obtiene el valor de la propiedad concepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * Define el valor de la propiedad concepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcepto(String value) {
        this.concepto = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporte(BigDecimal value) {
        this.importe = value;
    }

}
