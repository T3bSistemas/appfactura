
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CdgItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CdgItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TpoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VlrCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CdgItem", propOrder = {
    "tpoCodigo",
    "vlrCodigo"
})
public class CdgItem {

    @XmlElement(name = "TpoCodigo")
    protected String tpoCodigo;
    @XmlElement(name = "VlrCodigo")
    protected String vlrCodigo;

    /**
     * Obtiene el valor de la propiedad tpoCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpoCodigo() {
        return tpoCodigo;
    }

    /**
     * Define el valor de la propiedad tpoCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpoCodigo(String value) {
        this.tpoCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlrCodigo() {
        return vlrCodigo;
    }

    /**
     * Define el valor de la propiedad vlrCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlrCodigo(String value) {
        this.vlrCodigo = value;
    }

}
