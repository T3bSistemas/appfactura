
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DetallesDoc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetallesDoc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detallesDoc" type="{http://tempuri.org/}ArrayOfDetalleDoc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetallesDoc", propOrder = {
    "detallesDoc"
})
public class DetallesDoc {

    protected ArrayOfDetalleDoc detallesDoc;

    /**
     * Obtiene el valor de la propiedad detallesDoc.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDetalleDoc }
     *     
     */
    public ArrayOfDetalleDoc getDetallesDoc() {
        return detallesDoc;
    }

    /**
     * Define el valor de la propiedad detallesDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDetalleDoc }
     *     
     */
    public void setDetallesDoc(ArrayOfDetalleDoc value) {
        this.detallesDoc = value;
    }

}
