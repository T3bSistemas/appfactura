
package mx.gob.sat.cartaporte30;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransporteFerroviarioCartaPorte30 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransporteFerroviarioCartaPorte30"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DerechosDePaso" type="{http://www.sat.gob.mx/CartaPorte30}DerechosDePasoCartaPorte30" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Carro" type="{http://www.sat.gob.mx/CartaPorte30}CarroCartaPorte30" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TipoDeServicio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TipoDeTrafico" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransporteFerroviarioCartaPorte30", propOrder = {
    "derechosDePaso",
    "carro"
})
public class TransporteFerroviarioCartaPorte30 {

    @XmlElement(name = "DerechosDePaso")
    protected List<DerechosDePasoCartaPorte30> derechosDePaso;
    @XmlElement(name = "Carro")
    protected List<CarroCartaPorte30> carro;
    @XmlAttribute(name = "TipoDeServicio")
    protected String tipoDeServicio;
    @XmlAttribute(name = "TipoDeTrafico")
    protected String tipoDeTrafico;
    @XmlAttribute(name = "NombreAseg")
    protected String nombreAseg;
    @XmlAttribute(name = "NumPolizaSeguro")
    protected String numPolizaSeguro;

    /**
     * Gets the value of the derechosDePaso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derechosDePaso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerechosDePaso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerechosDePasoCartaPorte30 }
     * 
     * 
     */
    public List<DerechosDePasoCartaPorte30> getDerechosDePaso() {
        if (derechosDePaso == null) {
            derechosDePaso = new ArrayList<DerechosDePasoCartaPorte30>();
        }
        return this.derechosDePaso;
    }

    /**
     * Gets the value of the carro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarroCartaPorte30 }
     * 
     * 
     */
    public List<CarroCartaPorte30> getCarro() {
        if (carro == null) {
            carro = new ArrayList<CarroCartaPorte30>();
        }
        return this.carro;
    }

    /**
     * Obtiene el valor de la propiedad tipoDeServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeServicio() {
        return tipoDeServicio;
    }

    /**
     * Define el valor de la propiedad tipoDeServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeServicio(String value) {
        this.tipoDeServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDeTrafico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeTrafico() {
        return tipoDeTrafico;
    }

    /**
     * Define el valor de la propiedad tipoDeTrafico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeTrafico(String value) {
        this.tipoDeTrafico = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAseg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAseg() {
        return nombreAseg;
    }

    /**
     * Define el valor de la propiedad nombreAseg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAseg(String value) {
        this.nombreAseg = value;
    }

    /**
     * Obtiene el valor de la propiedad numPolizaSeguro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPolizaSeguro() {
        return numPolizaSeguro;
    }

    /**
     * Define el valor de la propiedad numPolizaSeguro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPolizaSeguro(String value) {
        this.numPolizaSeguro = value;
    }

}
