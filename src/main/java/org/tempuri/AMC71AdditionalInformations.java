
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AMC7_1_AdditionalInformations complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AMC7_1_AdditionalInformations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AIF" type="{http://tempuri.org/}ArrayOfAMC7_1_AdditionalInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMC7_1_AdditionalInformations", propOrder = {
    "aif"
})
public class AMC71AdditionalInformations {

    @XmlElement(name = "AIF")
    protected ArrayOfAMC71AdditionalInformation aif;

    /**
     * Obtiene el valor de la propiedad aif.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAMC71AdditionalInformation }
     *     
     */
    public ArrayOfAMC71AdditionalInformation getAIF() {
        return aif;
    }

    /**
     * Define el valor de la propiedad aif.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAMC71AdditionalInformation }
     *     
     */
    public void setAIF(ArrayOfAMC71AdditionalInformation value) {
        this.aif = value;
    }

}
