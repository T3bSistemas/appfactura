
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EFRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EFRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Key1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Key2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Key3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFRequest", propOrder = {
    "key1",
    "key2",
    "key3"
})
public class EFRequest {

    @XmlElement(name = "Key1")
    protected String key1;
    @XmlElement(name = "Key2")
    protected String key2;
    @XmlElement(name = "Key3")
    protected String key3;

    /**
     * Obtiene el valor de la propiedad key1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey1() {
        return key1;
    }

    /**
     * Define el valor de la propiedad key1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey1(String value) {
        this.key1 = value;
    }

    /**
     * Obtiene el valor de la propiedad key2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey2() {
        return key2;
    }

    /**
     * Define el valor de la propiedad key2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey2(String value) {
        this.key2 = value;
    }

    /**
     * Obtiene el valor de la propiedad key3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey3() {
        return key3;
    }

    /**
     * Define el valor de la propiedad key3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey3(String value) {
        this.key3 = value;
    }

}
