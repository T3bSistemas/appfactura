
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConceptosCFDI40Allianz complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConceptosCFDI40Allianz"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Conceptos" type="{http://tempuri.org/}ArrayOfConceptoCFDI40Allianz" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptosCFDI40Allianz", propOrder = {
    "conceptos"
})
public class ConceptosCFDI40Allianz {

    @XmlElement(name = "Conceptos")
    protected ArrayOfConceptoCFDI40Allianz conceptos;

    /**
     * Obtiene el valor de la propiedad conceptos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConceptoCFDI40Allianz }
     *     
     */
    public ArrayOfConceptoCFDI40Allianz getConceptos() {
        return conceptos;
    }

    /**
     * Define el valor de la propiedad conceptos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConceptoCFDI40Allianz }
     *     
     */
    public void setConceptos(ArrayOfConceptoCFDI40Allianz value) {
        this.conceptos = value;
    }

}
