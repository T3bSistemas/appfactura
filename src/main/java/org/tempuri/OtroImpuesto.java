
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OtroImpuesto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OtroImpuesto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tasa" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Importe" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtroImpuesto", propOrder = {
    "nombre",
    "tipo",
    "tasa",
    "importe"
})
public class OtroImpuesto {

    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "Tipo")
    protected String tipo;
    @XmlElement(name = "Tasa")
    protected double tasa;
    @XmlElement(name = "Importe")
    protected double importe;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad tasa.
     * 
     */
    public double getTasa() {
        return tasa;
    }

    /**
     * Define el valor de la propiedad tasa.
     * 
     */
    public void setTasa(double value) {
        this.tasa = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     */
    public void setImporte(double value) {
        this.importe = value;
    }

}
