
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
 *         &lt;element name="IntroduceDatosTransaccionINAHResult" type="{http://tempuri.org/}TransaccionResponse" minOccurs="0"/&gt;
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
    "introduceDatosTransaccionINAHResult"
})
@XmlRootElement(name = "IntroduceDatosTransaccionINAHResponse")
public class IntroduceDatosTransaccionINAHResponse {

    @XmlElement(name = "IntroduceDatosTransaccionINAHResult")
    protected TransaccionResponse introduceDatosTransaccionINAHResult;

    /**
     * Obtiene el valor de la propiedad introduceDatosTransaccionINAHResult.
     * 
     * @return
     *     possible object is
     *     {@link TransaccionResponse }
     *     
     */
    public TransaccionResponse getIntroduceDatosTransaccionINAHResult() {
        return introduceDatosTransaccionINAHResult;
    }

    /**
     * Define el valor de la propiedad introduceDatosTransaccionINAHResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TransaccionResponse }
     *     
     */
    public void setIntroduceDatosTransaccionINAHResult(TransaccionResponse value) {
        this.introduceDatosTransaccionINAHResult = value;
    }

}
