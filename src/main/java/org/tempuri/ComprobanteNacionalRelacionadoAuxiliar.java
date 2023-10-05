
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ComprobanteNacionalRelacionadoAuxiliar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComprobanteNacionalRelacionadoAuxiliar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}ComprobanteNacionalRelacionado"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MetodoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComprobanteNacionalRelacionadoAuxiliar", propOrder = {
    "metodoPago"
})
public class ComprobanteNacionalRelacionadoAuxiliar
    extends ComprobanteNacionalRelacionado
{

    @XmlElement(name = "MetodoPago")
    protected String metodoPago;

    /**
     * Obtiene el valor de la propiedad metodoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodoPago() {
        return metodoPago;
    }

    /**
     * Define el valor de la propiedad metodoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodoPago(String value) {
        this.metodoPago = value;
    }

}
