
package mx.gob.sat.vehiculousado;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VehiculoUsado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VehiculoUsado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InformacionAduaneraVehiculos" type="{http://www.sat.gob.mx/vehiculousado}InformacionAduaneraVehiculos" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="montoAdquisicion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="montoEnajenacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="claveVehicular" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="marca" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="modelo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="numeroMotor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="numeroSerie" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NIV" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehiculoUsado", propOrder = {
    "informacionAduaneraVehiculos"
})
public class VehiculoUsado {

    @XmlElement(name = "InformacionAduaneraVehiculos")
    protected List<InformacionAduaneraVehiculos> informacionAduaneraVehiculos;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "montoAdquisicion")
    protected String montoAdquisicion;
    @XmlAttribute(name = "montoEnajenacion")
    protected String montoEnajenacion;
    @XmlAttribute(name = "claveVehicular")
    protected String claveVehicular;
    @XmlAttribute(name = "marca")
    protected String marca;
    @XmlAttribute(name = "tipo")
    protected String tipo;
    @XmlAttribute(name = "modelo")
    protected String modelo;
    @XmlAttribute(name = "numeroMotor")
    protected String numeroMotor;
    @XmlAttribute(name = "numeroSerie")
    protected String numeroSerie;
    @XmlAttribute(name = "NIV")
    protected String niv;
    @XmlAttribute(name = "valor")
    protected String valor;

    /**
     * Gets the value of the informacionAduaneraVehiculos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informacionAduaneraVehiculos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformacionAduaneraVehiculos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformacionAduaneraVehiculos }
     * 
     * 
     */
    public List<InformacionAduaneraVehiculos> getInformacionAduaneraVehiculos() {
        if (informacionAduaneraVehiculos == null) {
            informacionAduaneraVehiculos = new ArrayList<InformacionAduaneraVehiculos>();
        }
        return this.informacionAduaneraVehiculos;
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
     * Obtiene el valor de la propiedad montoAdquisicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoAdquisicion() {
        return montoAdquisicion;
    }

    /**
     * Define el valor de la propiedad montoAdquisicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoAdquisicion(String value) {
        this.montoAdquisicion = value;
    }

    /**
     * Obtiene el valor de la propiedad montoEnajenacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoEnajenacion() {
        return montoEnajenacion;
    }

    /**
     * Define el valor de la propiedad montoEnajenacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoEnajenacion(String value) {
        this.montoEnajenacion = value;
    }

    /**
     * Obtiene el valor de la propiedad claveVehicular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveVehicular() {
        return claveVehicular;
    }

    /**
     * Define el valor de la propiedad claveVehicular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveVehicular(String value) {
        this.claveVehicular = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroMotor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroMotor() {
        return numeroMotor;
    }

    /**
     * Define el valor de la propiedad numeroMotor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroMotor(String value) {
        this.numeroMotor = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroSerie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * Define el valor de la propiedad numeroSerie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSerie(String value) {
        this.numeroSerie = value;
    }

    /**
     * Obtiene el valor de la propiedad niv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIV() {
        return niv;
    }

    /**
     * Define el valor de la propiedad niv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIV(String value) {
        this.niv = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor(String value) {
        this.valor = value;
    }

}
