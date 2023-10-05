
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DoctosRelSAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DoctosRelSAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="doctoRelSAP" type="{http://tempuri.org/}ArrayOfDoctoRelSAP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoctosRelSAP", propOrder = {
    "doctoRelSAP"
})
public class DoctosRelSAP {

    protected ArrayOfDoctoRelSAP doctoRelSAP;

    /**
     * Obtiene el valor de la propiedad doctoRelSAP.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDoctoRelSAP }
     *     
     */
    public ArrayOfDoctoRelSAP getDoctoRelSAP() {
        return doctoRelSAP;
    }

    /**
     * Define el valor de la propiedad doctoRelSAP.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDoctoRelSAP }
     *     
     */
    public void setDoctoRelSAP(ArrayOfDoctoRelSAP value) {
        this.doctoRelSAP = value;
    }

}
