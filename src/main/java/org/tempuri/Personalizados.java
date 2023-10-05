
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Personalizados complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Personalizados"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personalizados" type="{http://tempuri.org/}ArrayOfPersonalizado" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Personalizados", propOrder = {
    "personalizados"
})
public class Personalizados {

    protected ArrayOfPersonalizado personalizados;

    /**
     * Obtiene el valor de la propiedad personalizados.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPersonalizado }
     *     
     */
    public ArrayOfPersonalizado getPersonalizados() {
        return personalizados;
    }

    /**
     * Define el valor de la propiedad personalizados.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPersonalizado }
     *     
     */
    public void setPersonalizados(ArrayOfPersonalizado value) {
        this.personalizados = value;
    }

}
