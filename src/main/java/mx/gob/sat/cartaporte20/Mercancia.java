
package mx.gob.sat.cartaporte20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Mercancia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Mercancia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pedimentos" type="{http://www.sat.gob.mx/CartaPorte20}Pedimentos" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GuiasIdentificacion" type="{http://www.sat.gob.mx/CartaPorte20}GuiasIdentificacion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CantidadTransporta" type="{http://www.sat.gob.mx/CartaPorte20}CantidadTransporta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DetalleMercancia" type="{http://www.sat.gob.mx/CartaPorte20}DetalleMercancia" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BienesTransp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ClaveSTCC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ClaveUnidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Unidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Dimensiones" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MaterialPeligroso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CveMaterialPeligroso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Embalaje" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DescripEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PesoEnKg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ValorMercancia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FraccionArancelaria" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UUIDComercioExt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mercancia", propOrder = {
    "pedimentos",
    "guiasIdentificacion",
    "cantidadTransporta",
    "detalleMercancia"
})
public class Mercancia {

    @XmlElement(name = "Pedimentos")
    protected List<Pedimentos> pedimentos;
    @XmlElement(name = "GuiasIdentificacion")
    protected List<GuiasIdentificacion> guiasIdentificacion;
    @XmlElement(name = "CantidadTransporta")
    protected List<CantidadTransporta> cantidadTransporta;
    @XmlElement(name = "DetalleMercancia")
    protected DetalleMercancia detalleMercancia;
    @XmlAttribute(name = "BienesTransp")
    protected String bienesTransp;
    @XmlAttribute(name = "ClaveSTCC")
    protected String claveSTCC;
    @XmlAttribute(name = "Descripcion")
    protected String descripcion;
    @XmlAttribute(name = "Cantidad")
    protected String cantidad;
    @XmlAttribute(name = "ClaveUnidad")
    protected String claveUnidad;
    @XmlAttribute(name = "Unidad")
    protected String unidad;
    @XmlAttribute(name = "Dimensiones")
    protected String dimensiones;
    @XmlAttribute(name = "MaterialPeligroso")
    protected String materialPeligroso;
    @XmlAttribute(name = "CveMaterialPeligroso")
    protected String cveMaterialPeligroso;
    @XmlAttribute(name = "Embalaje")
    protected String embalaje;
    @XmlAttribute(name = "DescripEmbalaje")
    protected String descripEmbalaje;
    @XmlAttribute(name = "PesoEnKg")
    protected String pesoEnKg;
    @XmlAttribute(name = "ValorMercancia")
    protected String valorMercancia;
    @XmlAttribute(name = "Moneda")
    protected String moneda;
    @XmlAttribute(name = "FraccionArancelaria")
    protected String fraccionArancelaria;
    @XmlAttribute(name = "UUIDComercioExt")
    protected String uuidComercioExt;

    /**
     * Gets the value of the pedimentos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pedimentos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPedimentos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pedimentos }
     * 
     * 
     */
    public List<Pedimentos> getPedimentos() {
        if (pedimentos == null) {
            pedimentos = new ArrayList<Pedimentos>();
        }
        return this.pedimentos;
    }

    /**
     * Gets the value of the guiasIdentificacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guiasIdentificacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuiasIdentificacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuiasIdentificacion }
     * 
     * 
     */
    public List<GuiasIdentificacion> getGuiasIdentificacion() {
        if (guiasIdentificacion == null) {
            guiasIdentificacion = new ArrayList<GuiasIdentificacion>();
        }
        return this.guiasIdentificacion;
    }

    /**
     * Gets the value of the cantidadTransporta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cantidadTransporta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCantidadTransporta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CantidadTransporta }
     * 
     * 
     */
    public List<CantidadTransporta> getCantidadTransporta() {
        if (cantidadTransporta == null) {
            cantidadTransporta = new ArrayList<CantidadTransporta>();
        }
        return this.cantidadTransporta;
    }

    /**
     * Obtiene el valor de la propiedad detalleMercancia.
     * 
     * @return
     *     possible object is
     *     {@link DetalleMercancia }
     *     
     */
    public DetalleMercancia getDetalleMercancia() {
        return detalleMercancia;
    }

    /**
     * Define el valor de la propiedad detalleMercancia.
     * 
     * @param value
     *     allowed object is
     *     {@link DetalleMercancia }
     *     
     */
    public void setDetalleMercancia(DetalleMercancia value) {
        this.detalleMercancia = value;
    }

    /**
     * Obtiene el valor de la propiedad bienesTransp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBienesTransp() {
        return bienesTransp;
    }

    /**
     * Define el valor de la propiedad bienesTransp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBienesTransp(String value) {
        this.bienesTransp = value;
    }

    /**
     * Obtiene el valor de la propiedad claveSTCC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveSTCC() {
        return claveSTCC;
    }

    /**
     * Define el valor de la propiedad claveSTCC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveSTCC(String value) {
        this.claveSTCC = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidad(String value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad claveUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveUnidad() {
        return claveUnidad;
    }

    /**
     * Define el valor de la propiedad claveUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveUnidad(String value) {
        this.claveUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad unidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * Define el valor de la propiedad unidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidad(String value) {
        this.unidad = value;
    }

    /**
     * Obtiene el valor de la propiedad dimensiones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensiones() {
        return dimensiones;
    }

    /**
     * Define el valor de la propiedad dimensiones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensiones(String value) {
        this.dimensiones = value;
    }

    /**
     * Obtiene el valor de la propiedad materialPeligroso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialPeligroso() {
        return materialPeligroso;
    }

    /**
     * Define el valor de la propiedad materialPeligroso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialPeligroso(String value) {
        this.materialPeligroso = value;
    }

    /**
     * Obtiene el valor de la propiedad cveMaterialPeligroso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveMaterialPeligroso() {
        return cveMaterialPeligroso;
    }

    /**
     * Define el valor de la propiedad cveMaterialPeligroso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveMaterialPeligroso(String value) {
        this.cveMaterialPeligroso = value;
    }

    /**
     * Obtiene el valor de la propiedad embalaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbalaje() {
        return embalaje;
    }

    /**
     * Define el valor de la propiedad embalaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbalaje(String value) {
        this.embalaje = value;
    }

    /**
     * Obtiene el valor de la propiedad descripEmbalaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripEmbalaje() {
        return descripEmbalaje;
    }

    /**
     * Define el valor de la propiedad descripEmbalaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripEmbalaje(String value) {
        this.descripEmbalaje = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoEnKg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoEnKg() {
        return pesoEnKg;
    }

    /**
     * Define el valor de la propiedad pesoEnKg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoEnKg(String value) {
        this.pesoEnKg = value;
    }

    /**
     * Obtiene el valor de la propiedad valorMercancia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorMercancia() {
        return valorMercancia;
    }

    /**
     * Define el valor de la propiedad valorMercancia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorMercancia(String value) {
        this.valorMercancia = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad fraccionArancelaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraccionArancelaria() {
        return fraccionArancelaria;
    }

    /**
     * Define el valor de la propiedad fraccionArancelaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraccionArancelaria(String value) {
        this.fraccionArancelaria = value;
    }

    /**
     * Obtiene el valor de la propiedad uuidComercioExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUIDComercioExt() {
        return uuidComercioExt;
    }

    /**
     * Define el valor de la propiedad uuidComercioExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUIDComercioExt(String value) {
        this.uuidComercioExt = value;
    }

}
