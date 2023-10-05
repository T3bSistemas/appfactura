
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PSVPartes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PSVPartes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partes" type="{http://tempuri.org/}ArrayOfPSVParte" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSVPartes", propOrder = {
    "partes"
})
public class PSVPartes {

    protected ArrayOfPSVParte partes;

    /**
     * Obtiene el valor de la propiedad partes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPSVParte }
     *     
     */
    public ArrayOfPSVParte getPartes() {
        return partes;
    }

    /**
     * Define el valor de la propiedad partes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPSVParte }
     *     
     */
    public void setPartes(ArrayOfPSVParte value) {
        this.partes = value;
    }

}
