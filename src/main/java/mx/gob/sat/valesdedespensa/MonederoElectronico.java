
package mx.gob.sat.valesdedespensa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MonederoElectronico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MonederoElectronico"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Conceptos" type="{http://www.sat.gob.mx/valesdedespensa}ConceptosMonedero" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="tipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="numeroDeCuenta" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="registroPatronal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="total" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonederoElectronico", propOrder = {
    "conceptos"
})
public class MonederoElectronico {

    @XmlElement(name = "Conceptos")
    protected ConceptosMonedero conceptos;
    @XmlAttribute(name = "tipoOperacion")
    protected String tipoOperacion;
    @XmlAttribute(name = "numeroDeCuenta")
    protected String numeroDeCuenta;
    @XmlAttribute(name = "registroPatronal")
    protected String registroPatronal;
    @XmlAttribute(name = "total", required = true)
    protected double total;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Obtiene el valor de la propiedad conceptos.
     * 
     * @return
     *     possible object is
     *     {@link ConceptosMonedero }
     *     
     */
    public ConceptosMonedero getConceptos() {
        return conceptos;
    }

    /**
     * Define el valor de la propiedad conceptos.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptosMonedero }
     *     
     */
    public void setConceptos(ConceptosMonedero value) {
        this.conceptos = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Define el valor de la propiedad tipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperacion(String value) {
        this.tipoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDeCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    /**
     * Define el valor de la propiedad numeroDeCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDeCuenta(String value) {
        this.numeroDeCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad registroPatronal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroPatronal() {
        return registroPatronal;
    }

    /**
     * Define el valor de la propiedad registroPatronal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroPatronal(String value) {
        this.registroPatronal = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public double getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(double value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
