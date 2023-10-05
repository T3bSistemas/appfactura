
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AMC7_1_LineItems complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AMC7_1_LineItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineItem" type="{http://tempuri.org/}ArrayOfAMC7_1_LineItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMC7_1_LineItems", propOrder = {
    "lineItem"
})
@XmlSeeAlso({
    CoppelLineItems.class
})
public class AMC71LineItems {

    @XmlElement(name = "LineItem")
    protected ArrayOfAMC71LineItem lineItem;

    /**
     * Obtiene el valor de la propiedad lineItem.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAMC71LineItem }
     *     
     */
    public ArrayOfAMC71LineItem getLineItem() {
        return lineItem;
    }

    /**
     * Define el valor de la propiedad lineItem.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAMC71LineItem }
     *     
     */
    public void setLineItem(ArrayOfAMC71LineItem value) {
        this.lineItem = value;
    }

}
