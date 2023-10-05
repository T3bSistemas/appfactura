
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Ford complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Ford"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GSDB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ASN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ford", propOrder = {
    "gsdb",
    "asn"
})
public class Ford {

    @XmlElement(name = "GSDB")
    protected String gsdb;
    @XmlElement(name = "ASN")
    protected String asn;

    /**
     * Obtiene el valor de la propiedad gsdb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSDB() {
        return gsdb;
    }

    /**
     * Define el valor de la propiedad gsdb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSDB(String value) {
        this.gsdb = value;
    }

    /**
     * Obtiene el valor de la propiedad asn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASN() {
        return asn;
    }

    /**
     * Define el valor de la propiedad asn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASN(String value) {
        this.asn = value;
    }

}
