
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AudiPartes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AudiPartes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partes" type="{http://tempuri.org/}ArrayOfAudiParte" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudiPartes", propOrder = {
    "partes"
})
public class AudiPartes {

    protected ArrayOfAudiParte partes;

    /**
     * Obtiene el valor de la propiedad partes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAudiParte }
     *     
     */
    public ArrayOfAudiParte getPartes() {
        return partes;
    }

    /**
     * Define el valor de la propiedad partes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAudiParte }
     *     
     */
    public void setPartes(ArrayOfAudiParte value) {
        this.partes = value;
    }

}
