
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccionesOTitulos33 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccionesOTitulos33"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValorMercado" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="PrecioAlOtorgarse" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccionesOTitulos33", propOrder = {
    "valorMercado",
    "precioAlOtorgarse"
})
public class AccionesOTitulos33 {

    @XmlElement(name = "ValorMercado")
    protected double valorMercado;
    @XmlElement(name = "PrecioAlOtorgarse")
    protected double precioAlOtorgarse;

    /**
     * Obtiene el valor de la propiedad valorMercado.
     * 
     */
    public double getValorMercado() {
        return valorMercado;
    }

    /**
     * Define el valor de la propiedad valorMercado.
     * 
     */
    public void setValorMercado(double value) {
        this.valorMercado = value;
    }

    /**
     * Obtiene el valor de la propiedad precioAlOtorgarse.
     * 
     */
    public double getPrecioAlOtorgarse() {
        return precioAlOtorgarse;
    }

    /**
     * Define el valor de la propiedad precioAlOtorgarse.
     * 
     */
    public void setPrecioAlOtorgarse(double value) {
        this.precioAlOtorgarse = value;
    }

}
