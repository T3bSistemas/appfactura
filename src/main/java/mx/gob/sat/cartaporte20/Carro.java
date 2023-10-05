
package mx.gob.sat.cartaporte20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Carro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Carro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Contenedor" type="{http://www.sat.gob.mx/CartaPorte20}Contenedor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TipoCarro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MatriculaCarro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GuiaCarro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ToneladasNetasCarro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Carro", propOrder = {
    "contenedor"
})
public class Carro {

    @XmlElement(name = "Contenedor")
    protected List<Contenedor> contenedor;
    @XmlAttribute(name = "TipoCarro")
    protected String tipoCarro;
    @XmlAttribute(name = "MatriculaCarro")
    protected String matriculaCarro;
    @XmlAttribute(name = "GuiaCarro")
    protected String guiaCarro;
    @XmlAttribute(name = "ToneladasNetasCarro")
    protected String toneladasNetasCarro;

    /**
     * Gets the value of the contenedor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contenedor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContenedor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contenedor }
     * 
     * 
     */
    public List<Contenedor> getContenedor() {
        if (contenedor == null) {
            contenedor = new ArrayList<Contenedor>();
        }
        return this.contenedor;
    }

    /**
     * Obtiene el valor de la propiedad tipoCarro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCarro() {
        return tipoCarro;
    }

    /**
     * Define el valor de la propiedad tipoCarro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCarro(String value) {
        this.tipoCarro = value;
    }

    /**
     * Obtiene el valor de la propiedad matriculaCarro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaCarro() {
        return matriculaCarro;
    }

    /**
     * Define el valor de la propiedad matriculaCarro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaCarro(String value) {
        this.matriculaCarro = value;
    }

    /**
     * Obtiene el valor de la propiedad guiaCarro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiaCarro() {
        return guiaCarro;
    }

    /**
     * Define el valor de la propiedad guiaCarro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiaCarro(String value) {
        this.guiaCarro = value;
    }

    /**
     * Obtiene el valor de la propiedad toneladasNetasCarro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToneladasNetasCarro() {
        return toneladasNetasCarro;
    }

    /**
     * Define el valor de la propiedad toneladasNetasCarro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToneladasNetasCarro(String value) {
        this.toneladasNetasCarro = value;
    }

}
