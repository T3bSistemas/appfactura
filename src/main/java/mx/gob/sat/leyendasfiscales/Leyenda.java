
package mx.gob.sat.leyendasfiscales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Leyenda complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Leyenda"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="disposicionFiscal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="norma" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="textoLeyenda" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Leyenda")
public class Leyenda {

    @XmlAttribute(name = "disposicionFiscal")
    protected String disposicionFiscal;
    @XmlAttribute(name = "norma")
    protected String norma;
    @XmlAttribute(name = "textoLeyenda")
    protected String textoLeyenda;

    /**
     * Obtiene el valor de la propiedad disposicionFiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisposicionFiscal() {
        return disposicionFiscal;
    }

    /**
     * Define el valor de la propiedad disposicionFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisposicionFiscal(String value) {
        this.disposicionFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad norma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNorma() {
        return norma;
    }

    /**
     * Define el valor de la propiedad norma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNorma(String value) {
        this.norma = value;
    }

    /**
     * Obtiene el valor de la propiedad textoLeyenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextoLeyenda() {
        return textoLeyenda;
    }

    /**
     * Define el valor de la propiedad textoLeyenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextoLeyenda(String value) {
        this.textoLeyenda = value;
    }

}
