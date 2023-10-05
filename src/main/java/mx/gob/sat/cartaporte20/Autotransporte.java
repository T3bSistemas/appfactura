
package mx.gob.sat.cartaporte20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Autotransporte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Autotransporte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdentificacionVehicular" type="{http://www.sat.gob.mx/CartaPorte20}IdentificacionVehicular" minOccurs="0"/&gt;
 *         &lt;element name="Seguros" type="{http://www.sat.gob.mx/CartaPorte20}Seguros" minOccurs="0"/&gt;
 *         &lt;element name="Remolques" type="{http://www.sat.gob.mx/CartaPorte20}Remolques" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PermSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumPermisoSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Autotransporte", propOrder = {
    "identificacionVehicular",
    "seguros",
    "remolques"
})
public class Autotransporte {

    @XmlElement(name = "IdentificacionVehicular")
    protected IdentificacionVehicular identificacionVehicular;
    @XmlElement(name = "Seguros")
    protected Seguros seguros;
    @XmlElement(name = "Remolques")
    protected Remolques remolques;
    @XmlAttribute(name = "PermSCT")
    protected String permSCT;
    @XmlAttribute(name = "NumPermisoSCT")
    protected String numPermisoSCT;

    /**
     * Obtiene el valor de la propiedad identificacionVehicular.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacionVehicular }
     *     
     */
    public IdentificacionVehicular getIdentificacionVehicular() {
        return identificacionVehicular;
    }

    /**
     * Define el valor de la propiedad identificacionVehicular.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacionVehicular }
     *     
     */
    public void setIdentificacionVehicular(IdentificacionVehicular value) {
        this.identificacionVehicular = value;
    }

    /**
     * Obtiene el valor de la propiedad seguros.
     * 
     * @return
     *     possible object is
     *     {@link Seguros }
     *     
     */
    public Seguros getSeguros() {
        return seguros;
    }

    /**
     * Define el valor de la propiedad seguros.
     * 
     * @param value
     *     allowed object is
     *     {@link Seguros }
     *     
     */
    public void setSeguros(Seguros value) {
        this.seguros = value;
    }

    /**
     * Obtiene el valor de la propiedad remolques.
     * 
     * @return
     *     possible object is
     *     {@link Remolques }
     *     
     */
    public Remolques getRemolques() {
        return remolques;
    }

    /**
     * Define el valor de la propiedad remolques.
     * 
     * @param value
     *     allowed object is
     *     {@link Remolques }
     *     
     */
    public void setRemolques(Remolques value) {
        this.remolques = value;
    }

    /**
     * Obtiene el valor de la propiedad permSCT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermSCT() {
        return permSCT;
    }

    /**
     * Define el valor de la propiedad permSCT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermSCT(String value) {
        this.permSCT = value;
    }

    /**
     * Obtiene el valor de la propiedad numPermisoSCT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPermisoSCT() {
        return numPermisoSCT;
    }

    /**
     * Define el valor de la propiedad numPermisoSCT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPermisoSCT(String value) {
        this.numPermisoSCT = value;
    }

}
