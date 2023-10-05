
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CasaLeyDetalles complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CasaLeyDetalles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Detalle" type="{http://tempuri.org/}ArrayOfCasaLeyDetalle" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CasaLeyDetalles", propOrder = {
    "detalle"
})
public class CasaLeyDetalles {

    @XmlElement(name = "Detalle")
    protected ArrayOfCasaLeyDetalle detalle;

    /**
     * Obtiene el valor de la propiedad detalle.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCasaLeyDetalle }
     *     
     */
    public ArrayOfCasaLeyDetalle getDetalle() {
        return detalle;
    }

    /**
     * Define el valor de la propiedad detalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCasaLeyDetalle }
     *     
     */
    public void setDetalle(ArrayOfCasaLeyDetalle value) {
        this.detalle = value;
    }

}
