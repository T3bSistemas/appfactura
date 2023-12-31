
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancelaCFDINominaPlus12V33Result" type="{http://tempuri.org/}TimbradoPlusNominaCancelacionResponse33" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cancelaCFDINominaPlus12V33Result"
})
@XmlRootElement(name = "CancelaCFDINominaPlus12V33Response")
public class CancelaCFDINominaPlus12V33Response {

    @XmlElement(name = "CancelaCFDINominaPlus12V33Result")
    protected TimbradoPlusNominaCancelacionResponse33 cancelaCFDINominaPlus12V33Result;

    /**
     * Obtiene el valor de la propiedad cancelaCFDINominaPlus12V33Result.
     * 
     * @return
     *     possible object is
     *     {@link TimbradoPlusNominaCancelacionResponse33 }
     *     
     */
    public TimbradoPlusNominaCancelacionResponse33 getCancelaCFDINominaPlus12V33Result() {
        return cancelaCFDINominaPlus12V33Result;
    }

    /**
     * Define el valor de la propiedad cancelaCFDINominaPlus12V33Result.
     * 
     * @param value
     *     allowed object is
     *     {@link TimbradoPlusNominaCancelacionResponse33 }
     *     
     */
    public void setCancelaCFDINominaPlus12V33Result(TimbradoPlusNominaCancelacionResponse33 value) {
        this.cancelaCFDINominaPlus12V33Result = value;
    }

}
