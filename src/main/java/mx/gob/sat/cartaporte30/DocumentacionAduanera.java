
package mx.gob.sat.cartaporte30;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DocumentacionAduanera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DocumentacionAduanera"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumPedimento" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IdentDocAduanero" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RFCImpo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentacionAduanera")
public class DocumentacionAduanera {

    @XmlAttribute(name = "TipoDocumento")
    protected String tipoDocumento;
    @XmlAttribute(name = "NumPedimento")
    protected String numPedimento;
    @XmlAttribute(name = "IdentDocAduanero")
    protected String identDocAduanero;
    @XmlAttribute(name = "RFCImpo")
    protected String rfcImpo;

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad numPedimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPedimento() {
        return numPedimento;
    }

    /**
     * Define el valor de la propiedad numPedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPedimento(String value) {
        this.numPedimento = value;
    }

    /**
     * Obtiene el valor de la propiedad identDocAduanero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentDocAduanero() {
        return identDocAduanero;
    }

    /**
     * Define el valor de la propiedad identDocAduanero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentDocAduanero(String value) {
        this.identDocAduanero = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcImpo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCImpo() {
        return rfcImpo;
    }

    /**
     * Define el valor de la propiedad rfcImpo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCImpo(String value) {
        this.rfcImpo = value;
    }

}
