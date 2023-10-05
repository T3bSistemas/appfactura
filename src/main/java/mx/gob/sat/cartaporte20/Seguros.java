
package mx.gob.sat.cartaporte20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Seguros complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Seguros"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="AseguraRespCivil" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PolizaRespCivil" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AseguraMedAmbiente" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PolizaMedAmbiente" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AseguraCarga" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PolizaCarga" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PrimaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Seguros")
public class Seguros {

    @XmlAttribute(name = "AseguraRespCivil")
    protected String aseguraRespCivil;
    @XmlAttribute(name = "PolizaRespCivil")
    protected String polizaRespCivil;
    @XmlAttribute(name = "AseguraMedAmbiente")
    protected String aseguraMedAmbiente;
    @XmlAttribute(name = "PolizaMedAmbiente")
    protected String polizaMedAmbiente;
    @XmlAttribute(name = "AseguraCarga")
    protected String aseguraCarga;
    @XmlAttribute(name = "PolizaCarga")
    protected String polizaCarga;
    @XmlAttribute(name = "PrimaSeguro")
    protected String primaSeguro;

    /**
     * Obtiene el valor de la propiedad aseguraRespCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAseguraRespCivil() {
        return aseguraRespCivil;
    }

    /**
     * Define el valor de la propiedad aseguraRespCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAseguraRespCivil(String value) {
        this.aseguraRespCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad polizaRespCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolizaRespCivil() {
        return polizaRespCivil;
    }

    /**
     * Define el valor de la propiedad polizaRespCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolizaRespCivil(String value) {
        this.polizaRespCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad aseguraMedAmbiente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAseguraMedAmbiente() {
        return aseguraMedAmbiente;
    }

    /**
     * Define el valor de la propiedad aseguraMedAmbiente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAseguraMedAmbiente(String value) {
        this.aseguraMedAmbiente = value;
    }

    /**
     * Obtiene el valor de la propiedad polizaMedAmbiente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolizaMedAmbiente() {
        return polizaMedAmbiente;
    }

    /**
     * Define el valor de la propiedad polizaMedAmbiente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolizaMedAmbiente(String value) {
        this.polizaMedAmbiente = value;
    }

    /**
     * Obtiene el valor de la propiedad aseguraCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAseguraCarga() {
        return aseguraCarga;
    }

    /**
     * Define el valor de la propiedad aseguraCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAseguraCarga(String value) {
        this.aseguraCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad polizaCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolizaCarga() {
        return polizaCarga;
    }

    /**
     * Define el valor de la propiedad polizaCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolizaCarga(String value) {
        this.polizaCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad primaSeguro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaSeguro() {
        return primaSeguro;
    }

    /**
     * Define el valor de la propiedad primaSeguro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaSeguro(String value) {
        this.primaSeguro = value;
    }

}
