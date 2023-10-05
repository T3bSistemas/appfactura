
package mx.gob.sat.gastoshidrocarburos10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GastosHidrocarburos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GastosHidrocarburos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Erogacion" type="{http://www.sat.gob.mx/GastosHidrocarburos10}Erogacion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumeroContrato" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AreaContractual" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GastosHidrocarburos", propOrder = {
    "erogacion"
})
public class GastosHidrocarburos {

    @XmlElement(name = "Erogacion")
    protected List<Erogacion> erogacion;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "NumeroContrato")
    protected String numeroContrato;
    @XmlAttribute(name = "AreaContractual")
    protected String areaContractual;

    /**
     * Gets the value of the erogacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the erogacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErogacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Erogacion }
     * 
     * 
     */
    public List<Erogacion> getErogacion() {
        if (erogacion == null) {
            erogacion = new ArrayList<Erogacion>();
        }
        return this.erogacion;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * Define el valor de la propiedad numeroContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroContrato(String value) {
        this.numeroContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad areaContractual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaContractual() {
        return areaContractual;
    }

    /**
     * Define el valor de la propiedad areaContractual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaContractual(String value) {
        this.areaContractual = value;
    }

}
