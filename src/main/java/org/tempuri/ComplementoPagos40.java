
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ComplementoPagos40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComplementoPagos40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Totales" type="{http://tempuri.org/}TotalesCP40" minOccurs="0"/&gt;
 *         &lt;element name="CFDIPagos40" type="{http://tempuri.org/}ArrayOfPagoCP40" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplementoPagos40", propOrder = {
    "totales",
    "cfdiPagos40"
})
public class ComplementoPagos40 {

    @XmlElement(name = "Totales")
    protected TotalesCP40 totales;
    @XmlElement(name = "CFDIPagos40")
    protected ArrayOfPagoCP40 cfdiPagos40;

    /**
     * Obtiene el valor de la propiedad totales.
     * 
     * @return
     *     possible object is
     *     {@link TotalesCP40 }
     *     
     */
    public TotalesCP40 getTotales() {
        return totales;
    }

    /**
     * Define el valor de la propiedad totales.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalesCP40 }
     *     
     */
    public void setTotales(TotalesCP40 value) {
        this.totales = value;
    }

    /**
     * Obtiene el valor de la propiedad cfdiPagos40.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPagoCP40 }
     *     
     */
    public ArrayOfPagoCP40 getCFDIPagos40() {
        return cfdiPagos40;
    }

    /**
     * Define el valor de la propiedad cfdiPagos40.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPagoCP40 }
     *     
     */
    public void setCFDIPagos40(ArrayOfPagoCP40 value) {
        this.cfdiPagos40 = value;
    }

}
