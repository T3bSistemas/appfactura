
package mx.gob.sat.cartaporte30;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TiposFiguraCartaPorte30 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TiposFiguraCartaPorte30"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartesTransporte" type="{http://www.sat.gob.mx/CartaPorte30}PartesTransporteCartaPorte30" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Domicilio" type="{http://www.sat.gob.mx/CartaPorte30}DomicilioCartaPorte30" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TipoFigura" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RFCFigura" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumLicencia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NombreFigura" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumRegIdTribFigura" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ResidenciaFiscalFigura" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TiposFiguraCartaPorte30", propOrder = {
    "partesTransporte",
    "domicilio"
})
public class TiposFiguraCartaPorte30 {

    @XmlElement(name = "PartesTransporte")
    protected List<PartesTransporteCartaPorte30> partesTransporte;
    @XmlElement(name = "Domicilio")
    protected DomicilioCartaPorte30 domicilio;
    @XmlAttribute(name = "TipoFigura")
    protected String tipoFigura;
    @XmlAttribute(name = "RFCFigura")
    protected String rfcFigura;
    @XmlAttribute(name = "NumLicencia")
    protected String numLicencia;
    @XmlAttribute(name = "NombreFigura")
    protected String nombreFigura;
    @XmlAttribute(name = "NumRegIdTribFigura")
    protected String numRegIdTribFigura;
    @XmlAttribute(name = "ResidenciaFiscalFigura")
    protected String residenciaFiscalFigura;

    /**
     * Gets the value of the partesTransporte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partesTransporte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartesTransporte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartesTransporteCartaPorte30 }
     * 
     * 
     */
    public List<PartesTransporteCartaPorte30> getPartesTransporte() {
        if (partesTransporte == null) {
            partesTransporte = new ArrayList<PartesTransporteCartaPorte30>();
        }
        return this.partesTransporte;
    }

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link DomicilioCartaPorte30 }
     *     
     */
    public DomicilioCartaPorte30 getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link DomicilioCartaPorte30 }
     *     
     */
    public void setDomicilio(DomicilioCartaPorte30 value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFigura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFigura() {
        return tipoFigura;
    }

    /**
     * Define el valor de la propiedad tipoFigura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFigura(String value) {
        this.tipoFigura = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcFigura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCFigura() {
        return rfcFigura;
    }

    /**
     * Define el valor de la propiedad rfcFigura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCFigura(String value) {
        this.rfcFigura = value;
    }

    /**
     * Obtiene el valor de la propiedad numLicencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumLicencia() {
        return numLicencia;
    }

    /**
     * Define el valor de la propiedad numLicencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumLicencia(String value) {
        this.numLicencia = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreFigura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreFigura() {
        return nombreFigura;
    }

    /**
     * Define el valor de la propiedad nombreFigura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreFigura(String value) {
        this.nombreFigura = value;
    }

    /**
     * Obtiene el valor de la propiedad numRegIdTribFigura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRegIdTribFigura() {
        return numRegIdTribFigura;
    }

    /**
     * Define el valor de la propiedad numRegIdTribFigura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRegIdTribFigura(String value) {
        this.numRegIdTribFigura = value;
    }

    /**
     * Obtiene el valor de la propiedad residenciaFiscalFigura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenciaFiscalFigura() {
        return residenciaFiscalFigura;
    }

    /**
     * Define el valor de la propiedad residenciaFiscalFigura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenciaFiscalFigura(String value) {
        this.residenciaFiscalFigura = value;
    }

}
