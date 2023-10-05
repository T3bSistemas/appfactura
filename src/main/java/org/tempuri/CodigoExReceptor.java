
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CodigoExReceptor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CodigoExReceptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TpoCdgIntRecep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CdgIntRecep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodigoExReceptor", propOrder = {
    "tpoCdgIntRecep",
    "cdgIntRecep"
})
public class CodigoExReceptor {

    @XmlElement(name = "TpoCdgIntRecep")
    protected String tpoCdgIntRecep;
    @XmlElement(name = "CdgIntRecep")
    protected String cdgIntRecep;

    /**
     * Obtiene el valor de la propiedad tpoCdgIntRecep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpoCdgIntRecep() {
        return tpoCdgIntRecep;
    }

    /**
     * Define el valor de la propiedad tpoCdgIntRecep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpoCdgIntRecep(String value) {
        this.tpoCdgIntRecep = value;
    }

    /**
     * Obtiene el valor de la propiedad cdgIntRecep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdgIntRecep() {
        return cdgIntRecep;
    }

    /**
     * Define el valor de la propiedad cdgIntRecep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdgIntRecep(String value) {
        this.cdgIntRecep = value;
    }

}
