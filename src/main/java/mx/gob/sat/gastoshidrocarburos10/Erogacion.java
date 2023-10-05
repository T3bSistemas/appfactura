
package mx.gob.sat.gastoshidrocarburos10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Erogacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Erogacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentoRelacionado" type="{http://www.sat.gob.mx/GastosHidrocarburos10}DocumentoRelacionado" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Actividades" type="{http://www.sat.gob.mx/GastosHidrocarburos10}Actividades" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CentroCostos" type="{http://www.sat.gob.mx/GastosHidrocarburos10}CentroCostos" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TipoErogacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MontocuErogacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Porcentaje" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Erogacion", propOrder = {
    "documentoRelacionado",
    "actividades",
    "centroCostos"
})
public class Erogacion {

    @XmlElement(name = "DocumentoRelacionado")
    protected List<DocumentoRelacionado> documentoRelacionado;
    @XmlElement(name = "Actividades")
    protected List<Actividades> actividades;
    @XmlElement(name = "CentroCostos")
    protected List<CentroCostos> centroCostos;
    @XmlAttribute(name = "TipoErogacion")
    protected String tipoErogacion;
    @XmlAttribute(name = "MontocuErogacion")
    protected String montocuErogacion;
    @XmlAttribute(name = "Porcentaje", required = true)
    protected double porcentaje;

    /**
     * Gets the value of the documentoRelacionado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoRelacionado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoRelacionado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoRelacionado }
     * 
     * 
     */
    public List<DocumentoRelacionado> getDocumentoRelacionado() {
        if (documentoRelacionado == null) {
            documentoRelacionado = new ArrayList<DocumentoRelacionado>();
        }
        return this.documentoRelacionado;
    }

    /**
     * Gets the value of the actividades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actividades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActividades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Actividades }
     * 
     * 
     */
    public List<Actividades> getActividades() {
        if (actividades == null) {
            actividades = new ArrayList<Actividades>();
        }
        return this.actividades;
    }

    /**
     * Gets the value of the centroCostos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the centroCostos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCentroCostos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CentroCostos }
     * 
     * 
     */
    public List<CentroCostos> getCentroCostos() {
        if (centroCostos == null) {
            centroCostos = new ArrayList<CentroCostos>();
        }
        return this.centroCostos;
    }

    /**
     * Obtiene el valor de la propiedad tipoErogacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoErogacion() {
        return tipoErogacion;
    }

    /**
     * Define el valor de la propiedad tipoErogacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoErogacion(String value) {
        this.tipoErogacion = value;
    }

    /**
     * Obtiene el valor de la propiedad montocuErogacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontocuErogacion() {
        return montocuErogacion;
    }

    /**
     * Define el valor de la propiedad montocuErogacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontocuErogacion(String value) {
        this.montocuErogacion = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentaje.
     * 
     */
    public double getPorcentaje() {
        return porcentaje;
    }

    /**
     * Define el valor de la propiedad porcentaje.
     * 
     */
    public void setPorcentaje(double value) {
        this.porcentaje = value;
    }

}
