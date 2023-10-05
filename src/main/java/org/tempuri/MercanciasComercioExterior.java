
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MercanciasComercioExterior complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MercanciasComercioExterior"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mercancias" type="{http://tempuri.org/}ArrayOfMercancia" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MercanciasComercioExterior", propOrder = {
    "mercancias"
})
public class MercanciasComercioExterior {

    @XmlElement(name = "Mercancias")
    protected ArrayOfMercancia mercancias;

    /**
     * Obtiene el valor de la propiedad mercancias.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMercancia }
     *     
     */
    public ArrayOfMercancia getMercancias() {
        return mercancias;
    }

    /**
     * Define el valor de la propiedad mercancias.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMercancia }
     *     
     */
    public void setMercancias(ArrayOfMercancia value) {
        this.mercancias = value;
    }

}
