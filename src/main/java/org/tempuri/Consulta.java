
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Consulta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Consulta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rfcemisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rfcreceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consulta", propOrder = {
    "uuid",
    "rfcemisor",
    "rfcreceptor",
    "total"
})
public class Consulta {

    protected String uuid;
    protected String rfcemisor;
    protected String rfcreceptor;
    protected String total;

    /**
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcemisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcemisor() {
        return rfcemisor;
    }

    /**
     * Define el valor de la propiedad rfcemisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcemisor(String value) {
        this.rfcemisor = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcreceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcreceptor() {
        return rfcreceptor;
    }

    /**
     * Define el valor de la propiedad rfcreceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcreceptor(String value) {
        this.rfcreceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(String value) {
        this.total = value;
    }

}
