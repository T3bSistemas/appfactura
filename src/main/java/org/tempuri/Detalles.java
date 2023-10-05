
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Detalles complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Detalles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detalles" type="{http://tempuri.org/}ArrayOfDetalle" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Detalles", propOrder = {
    "detalles"
})
public class Detalles {

    protected ArrayOfDetalle detalles;

    /**
     * Obtiene el valor de la propiedad detalles.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDetalle }
     *     
     */
    public ArrayOfDetalle getDetalles() {
        return detalles;
    }

    /**
     * Define el valor de la propiedad detalles.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDetalle }
     *     
     */
    public void setDetalles(ArrayOfDetalle value) {
        this.detalles = value;
    }

}
