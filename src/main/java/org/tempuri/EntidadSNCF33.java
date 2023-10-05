
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EntidadSNCF33 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EntidadSNCF33"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrigenRecurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MontoRecursoPropio" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntidadSNCF33", propOrder = {
    "origenRecurso",
    "montoRecursoPropio"
})
public class EntidadSNCF33 {

    @XmlElement(name = "OrigenRecurso")
    protected String origenRecurso;
    @XmlElement(name = "MontoRecursoPropio")
    protected double montoRecursoPropio;

    /**
     * Obtiene el valor de la propiedad origenRecurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigenRecurso() {
        return origenRecurso;
    }

    /**
     * Define el valor de la propiedad origenRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigenRecurso(String value) {
        this.origenRecurso = value;
    }

    /**
     * Obtiene el valor de la propiedad montoRecursoPropio.
     * 
     */
    public double getMontoRecursoPropio() {
        return montoRecursoPropio;
    }

    /**
     * Define el valor de la propiedad montoRecursoPropio.
     * 
     */
    public void setMontoRecursoPropio(double value) {
        this.montoRecursoPropio = value;
    }

}
