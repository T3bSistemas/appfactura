
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para DoctoRelSAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DoctoRelSAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bldat" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="xblnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoctoRelSAP", propOrder = {
    "uuid",
    "bldat",
    "xblnr"
})
public class DoctoRelSAP {

    @XmlElement(name = "UUID")
    protected String uuid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bldat;
    protected String xblnr;

    /**
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
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
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Obtiene el valor de la propiedad bldat.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBldat() {
        return bldat;
    }

    /**
     * Define el valor de la propiedad bldat.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBldat(XMLGregorianCalendar value) {
        this.bldat = value;
    }

    /**
     * Obtiene el valor de la propiedad xblnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXblnr() {
        return xblnr;
    }

    /**
     * Define el valor de la propiedad xblnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXblnr(String value) {
        this.xblnr = value;
    }

}
