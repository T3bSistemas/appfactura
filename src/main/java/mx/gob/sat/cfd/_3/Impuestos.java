
package mx.gob.sat.cfd._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Impuestos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Impuestos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Traslados" type="{http://www.sat.gob.mx/cfd/3}Traslados" minOccurs="0"/&gt;
 *         &lt;element name="Retenciones" type="{http://www.sat.gob.mx/cfd/3}Retenciones" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TotalImpuestosRetenidos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="TotalImpuestosTrasladados" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Impuestos", propOrder = {
    "traslados",
    "retenciones"
})
public class Impuestos {

    @XmlElement(name = "Traslados")
    protected Traslados traslados;
    @XmlElement(name = "Retenciones")
    protected Retenciones retenciones;
    @XmlAttribute(name = "TotalImpuestosRetenidos", required = true)
    protected BigDecimal totalImpuestosRetenidos;
    @XmlAttribute(name = "TotalImpuestosTrasladados", required = true)
    protected BigDecimal totalImpuestosTrasladados;

    /**
     * Obtiene el valor de la propiedad traslados.
     * 
     * @return
     *     possible object is
     *     {@link Traslados }
     *     
     */
    public Traslados getTraslados() {
        return traslados;
    }

    /**
     * Define el valor de la propiedad traslados.
     * 
     * @param value
     *     allowed object is
     *     {@link Traslados }
     *     
     */
    public void setTraslados(Traslados value) {
        this.traslados = value;
    }

    /**
     * Obtiene el valor de la propiedad retenciones.
     * 
     * @return
     *     possible object is
     *     {@link Retenciones }
     *     
     */
    public Retenciones getRetenciones() {
        return retenciones;
    }

    /**
     * Define el valor de la propiedad retenciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Retenciones }
     *     
     */
    public void setRetenciones(Retenciones value) {
        this.retenciones = value;
    }

    /**
     * Obtiene el valor de la propiedad totalImpuestosRetenidos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalImpuestosRetenidos() {
        return totalImpuestosRetenidos;
    }

    /**
     * Define el valor de la propiedad totalImpuestosRetenidos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalImpuestosRetenidos(BigDecimal value) {
        this.totalImpuestosRetenidos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalImpuestosTrasladados.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalImpuestosTrasladados() {
        return totalImpuestosTrasladados;
    }

    /**
     * Define el valor de la propiedad totalImpuestosTrasladados.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalImpuestosTrasladados(BigDecimal value) {
        this.totalImpuestosTrasladados = value;
    }

}
