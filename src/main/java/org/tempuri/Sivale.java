
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Sivale complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Sivale"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Documento" type="{http://tempuri.org/}Documento" minOccurs="0"/&gt;
 *         &lt;element name="Personalizados" type="{http://tempuri.org/}Personalizados" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sivale", propOrder = {
    "documento",
    "personalizados"
})
public class Sivale {

    @XmlElement(name = "Documento")
    protected Documento documento;
    @XmlElement(name = "Personalizados")
    protected Personalizados personalizados;

    /**
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link Documento }
     *     
     */
    public Documento getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link Documento }
     *     
     */
    public void setDocumento(Documento value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad personalizados.
     * 
     * @return
     *     possible object is
     *     {@link Personalizados }
     *     
     */
    public Personalizados getPersonalizados() {
        return personalizados;
    }

    /**
     * Define el valor de la propiedad personalizados.
     * 
     * @param value
     *     allowed object is
     *     {@link Personalizados }
     *     
     */
    public void setPersonalizados(Personalizados value) {
        this.personalizados = value;
    }

}
