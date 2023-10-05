
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AuxiliarFolios complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AuxiliarFolios"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}GeneralesAuxiliares"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Detalles" type="{http://tempuri.org/}ArrayOfDetallesAxuFolios" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuxiliarFolios", propOrder = {
    "detalles"
})
public class AuxiliarFolios
    extends GeneralesAuxiliares
{

    @XmlElement(name = "Detalles")
    protected ArrayOfDetallesAxuFolios detalles;

    /**
     * Obtiene el valor de la propiedad detalles.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDetallesAxuFolios }
     *     
     */
    public ArrayOfDetallesAxuFolios getDetalles() {
        return detalles;
    }

    /**
     * Define el valor de la propiedad detalles.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDetallesAxuFolios }
     *     
     */
    public void setDetalles(ArrayOfDetallesAxuFolios value) {
        this.detalles = value;
    }

}
