
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConceptosMonedero complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConceptosMonedero"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conceptosMonedero" type="{http://tempuri.org/}ArrayOfConceptoMonedero" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptosMonedero", propOrder = {
    "conceptosMonedero"
})
public class ConceptosMonedero {

    protected ArrayOfConceptoMonedero conceptosMonedero;

    /**
     * Obtiene el valor de la propiedad conceptosMonedero.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConceptoMonedero }
     *     
     */
    public ArrayOfConceptoMonedero getConceptosMonedero() {
        return conceptosMonedero;
    }

    /**
     * Define el valor de la propiedad conceptosMonedero.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConceptoMonedero }
     *     
     */
    public void setConceptosMonedero(ArrayOfConceptoMonedero value) {
        this.conceptosMonedero = value;
    }

}
