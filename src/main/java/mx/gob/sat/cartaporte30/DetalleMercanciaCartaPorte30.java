
package mx.gob.sat.cartaporte30;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DetalleMercanciaCartaPorte30 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleMercanciaCartaPorte30"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="UnidadPesoMerc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PesoNeto" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PesoTara" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumPiezas" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleMercanciaCartaPorte30")
public class DetalleMercanciaCartaPorte30 {

    @XmlAttribute(name = "UnidadPesoMerc")
    protected String unidadPesoMerc;
    @XmlAttribute(name = "PesoBruto")
    protected String pesoBruto;
    @XmlAttribute(name = "PesoNeto")
    protected String pesoNeto;
    @XmlAttribute(name = "PesoTara")
    protected String pesoTara;
    @XmlAttribute(name = "NumPiezas")
    protected String numPiezas;

    /**
     * Obtiene el valor de la propiedad unidadPesoMerc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadPesoMerc() {
        return unidadPesoMerc;
    }

    /**
     * Define el valor de la propiedad unidadPesoMerc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadPesoMerc(String value) {
        this.unidadPesoMerc = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoBruto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoBruto() {
        return pesoBruto;
    }

    /**
     * Define el valor de la propiedad pesoBruto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoBruto(String value) {
        this.pesoBruto = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoNeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoNeto() {
        return pesoNeto;
    }

    /**
     * Define el valor de la propiedad pesoNeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoNeto(String value) {
        this.pesoNeto = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoTara.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoTara() {
        return pesoTara;
    }

    /**
     * Define el valor de la propiedad pesoTara.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoTara(String value) {
        this.pesoTara = value;
    }

    /**
     * Obtiene el valor de la propiedad numPiezas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPiezas() {
        return numPiezas;
    }

    /**
     * Define el valor de la propiedad numPiezas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPiezas(String value) {
        this.numPiezas = value;
    }

}
