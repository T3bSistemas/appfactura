
package mx.gob.sat.nomina12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Deduccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Deduccion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TipoDeduccion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "Deduccion")
public class Deduccion {

    @XmlAttribute(name = "TipoDeduccion")
    protected String tipoDeduccion;
    @XmlAttribute(name = "Clave")
    protected String clave;
    @XmlAttribute(name = "Concepto")
    protected String concepto;
    @XmlAttribute(name = "Importe", required = true)
    protected BigDecimal importe;

    /**
     * Obtiene el valor de la propiedad tipoDeduccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeduccion() {
        return tipoDeduccion;
    }

    /**
     * Define el valor de la propiedad tipoDeduccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeduccion(String value) {
        this.tipoDeduccion = value;
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
