
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DestinatariosComercioExterior20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DestinatariosComercioExterior20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Destinatarios" type="{http://tempuri.org/}ArrayOfDestinatario20" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinatariosComercioExterior20", propOrder = {
    "destinatarios"
})
public class DestinatariosComercioExterior20 {

    @XmlElement(name = "Destinatarios")
    protected ArrayOfDestinatario20 destinatarios;

    /**
     * Obtiene el valor de la propiedad destinatarios.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDestinatario20 }
     *     
     */
    public ArrayOfDestinatario20 getDestinatarios() {
        return destinatarios;
    }

    /**
     * Define el valor de la propiedad destinatarios.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDestinatario20 }
     *     
     */
    public void setDestinatarios(ArrayOfDestinatario20 value) {
        this.destinatarios = value;
    }

}
