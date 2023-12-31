
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConceptosComercioTimbrado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConceptosComercioTimbrado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conceptos" type="{http://tempuri.org/}ArrayOfConceptoComercioTimbrado" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptosComercioTimbrado", propOrder = {
    "conceptos"
})
public class ConceptosComercioTimbrado {

    protected ArrayOfConceptoComercioTimbrado conceptos;

    /**
     * Obtiene el valor de la propiedad conceptos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConceptoComercioTimbrado }
     *     
     */
    public ArrayOfConceptoComercioTimbrado getConceptos() {
        return conceptos;
    }

    /**
     * Define el valor de la propiedad conceptos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConceptoComercioTimbrado }
     *     
     */
    public void setConceptos(ArrayOfConceptoComercioTimbrado value) {
        this.conceptos = value;
    }

}
