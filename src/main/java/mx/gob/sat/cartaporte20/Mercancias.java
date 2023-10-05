
package mx.gob.sat.cartaporte20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Mercancias complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Mercancias"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mercancia" type="{http://www.sat.gob.mx/CartaPorte20}Mercancia" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Autotransporte" type="{http://www.sat.gob.mx/CartaPorte20}Autotransporte" minOccurs="0"/&gt;
 *         &lt;element name="TransporteMaritimo" type="{http://www.sat.gob.mx/CartaPorte20}TransporteMaritimo" minOccurs="0"/&gt;
 *         &lt;element name="TransporteAereo" type="{http://www.sat.gob.mx/CartaPorte20}TransporteAereo" minOccurs="0"/&gt;
 *         &lt;element name="TransporteFerroviario" type="{http://www.sat.gob.mx/CartaPorte20}TransporteFerroviario" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PesoBrutoTotal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UnidadPeso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PesoNetoTotal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumTotalMercancias" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CargoPorTasacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mercancias", propOrder = {
    "mercancia",
    "autotransporte",
    "transporteMaritimo",
    "transporteAereo",
    "transporteFerroviario"
})
public class Mercancias {

    @XmlElement(name = "Mercancia")
    protected List<Mercancia> mercancia;
    @XmlElement(name = "Autotransporte")
    protected Autotransporte autotransporte;
    @XmlElement(name = "TransporteMaritimo")
    protected TransporteMaritimo transporteMaritimo;
    @XmlElement(name = "TransporteAereo")
    protected TransporteAereo transporteAereo;
    @XmlElement(name = "TransporteFerroviario")
    protected TransporteFerroviario transporteFerroviario;
    @XmlAttribute(name = "PesoBrutoTotal")
    protected String pesoBrutoTotal;
    @XmlAttribute(name = "UnidadPeso")
    protected String unidadPeso;
    @XmlAttribute(name = "PesoNetoTotal")
    protected String pesoNetoTotal;
    @XmlAttribute(name = "NumTotalMercancias")
    protected String numTotalMercancias;
    @XmlAttribute(name = "CargoPorTasacion")
    protected String cargoPorTasacion;

    /**
     * Gets the value of the mercancia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mercancia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMercancia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mercancia }
     * 
     * 
     */
    public List<Mercancia> getMercancia() {
        if (mercancia == null) {
            mercancia = new ArrayList<Mercancia>();
        }
        return this.mercancia;
    }

    /**
     * Obtiene el valor de la propiedad autotransporte.
     * 
     * @return
     *     possible object is
     *     {@link Autotransporte }
     *     
     */
    public Autotransporte getAutotransporte() {
        return autotransporte;
    }

    /**
     * Define el valor de la propiedad autotransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link Autotransporte }
     *     
     */
    public void setAutotransporte(Autotransporte value) {
        this.autotransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad transporteMaritimo.
     * 
     * @return
     *     possible object is
     *     {@link TransporteMaritimo }
     *     
     */
    public TransporteMaritimo getTransporteMaritimo() {
        return transporteMaritimo;
    }

    /**
     * Define el valor de la propiedad transporteMaritimo.
     * 
     * @param value
     *     allowed object is
     *     {@link TransporteMaritimo }
     *     
     */
    public void setTransporteMaritimo(TransporteMaritimo value) {
        this.transporteMaritimo = value;
    }

    /**
     * Obtiene el valor de la propiedad transporteAereo.
     * 
     * @return
     *     possible object is
     *     {@link TransporteAereo }
     *     
     */
    public TransporteAereo getTransporteAereo() {
        return transporteAereo;
    }

    /**
     * Define el valor de la propiedad transporteAereo.
     * 
     * @param value
     *     allowed object is
     *     {@link TransporteAereo }
     *     
     */
    public void setTransporteAereo(TransporteAereo value) {
        this.transporteAereo = value;
    }

    /**
     * Obtiene el valor de la propiedad transporteFerroviario.
     * 
     * @return
     *     possible object is
     *     {@link TransporteFerroviario }
     *     
     */
    public TransporteFerroviario getTransporteFerroviario() {
        return transporteFerroviario;
    }

    /**
     * Define el valor de la propiedad transporteFerroviario.
     * 
     * @param value
     *     allowed object is
     *     {@link TransporteFerroviario }
     *     
     */
    public void setTransporteFerroviario(TransporteFerroviario value) {
        this.transporteFerroviario = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoBrutoTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoBrutoTotal() {
        return pesoBrutoTotal;
    }

    /**
     * Define el valor de la propiedad pesoBrutoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoBrutoTotal(String value) {
        this.pesoBrutoTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadPeso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadPeso() {
        return unidadPeso;
    }

    /**
     * Define el valor de la propiedad unidadPeso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadPeso(String value) {
        this.unidadPeso = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoNetoTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoNetoTotal() {
        return pesoNetoTotal;
    }

    /**
     * Define el valor de la propiedad pesoNetoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoNetoTotal(String value) {
        this.pesoNetoTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad numTotalMercancias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTotalMercancias() {
        return numTotalMercancias;
    }

    /**
     * Define el valor de la propiedad numTotalMercancias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTotalMercancias(String value) {
        this.numTotalMercancias = value;
    }

    /**
     * Obtiene el valor de la propiedad cargoPorTasacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoPorTasacion() {
        return cargoPorTasacion;
    }

    /**
     * Define el valor de la propiedad cargoPorTasacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoPorTasacion(String value) {
        this.cargoPorTasacion = value;
    }

}
