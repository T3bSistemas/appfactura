
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Siedel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Siedel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenceIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonOrDepartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Siedel", propOrder = {
    "referenceIdentification",
    "personOrDepartmentName"
})
public class Siedel {

    @XmlElement(name = "ReferenceIdentification")
    protected String referenceIdentification;
    @XmlElement(name = "PersonOrDepartmentName")
    protected String personOrDepartmentName;

    /**
     * Obtiene el valor de la propiedad referenceIdentification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceIdentification() {
        return referenceIdentification;
    }

    /**
     * Define el valor de la propiedad referenceIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceIdentification(String value) {
        this.referenceIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad personOrDepartmentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonOrDepartmentName() {
        return personOrDepartmentName;
    }

    /**
     * Define el valor de la propiedad personOrDepartmentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonOrDepartmentName(String value) {
        this.personOrDepartmentName = value;
    }

}
