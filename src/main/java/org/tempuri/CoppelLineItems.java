
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Coppel_LineItems complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Coppel_LineItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}AMC7_1_LineItems"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoppelLineItem" type="{http://tempuri.org/}ArrayOfCoppel_LineItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coppel_LineItems", propOrder = {
    "coppelLineItem"
})
public class CoppelLineItems
    extends AMC71LineItems
{

    @XmlElement(name = "CoppelLineItem")
    protected ArrayOfCoppelLineItem coppelLineItem;

    /**
     * Obtiene el valor de la propiedad coppelLineItem.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCoppelLineItem }
     *     
     */
    public ArrayOfCoppelLineItem getCoppelLineItem() {
        return coppelLineItem;
    }

    /**
     * Define el valor de la propiedad coppelLineItem.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCoppelLineItem }
     *     
     */
    public void setCoppelLineItem(ArrayOfCoppelLineItem value) {
        this.coppelLineItem = value;
    }

}
