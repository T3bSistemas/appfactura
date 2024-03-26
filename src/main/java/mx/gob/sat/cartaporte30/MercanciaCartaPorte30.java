
package mx.gob.sat.cartaporte30;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MercanciaCartaPorte30 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MercanciaCartaPorte30"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuiasIdentificacion" type="{http://www.sat.gob.mx/CartaPorte30}GuiasIdentificacionCartaPorte30" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CantidadTransporta" type="{http://www.sat.gob.mx/CartaPorte30}CantidadTransportaCartaPorte30" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DetalleMercancia" type="{http://www.sat.gob.mx/CartaPorte30}DetalleMercanciaCartaPorte30" minOccurs="0"/&gt;
 *         &lt;element name="DocumentacionAduanera" type="{http://www.sat.gob.mx/CartaPorte30}DocumentacionAduanera" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *       &lt;attribute name="SectorCOFEPRIS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NombreIngredienteActivo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NomQuimico" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DenominacionGenericaProd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DenominacionDistintivaProd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Fabricante" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FechaCaducidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LoteMedicamento" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FormaFarmaceutica" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CondicionesEspTransp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RegistroSanitarioFolioAutorizacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PermisoImportacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FolioImpoVUCEM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumCAS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RazonSocialEmpImp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumRegSanPlagCOFEPRIS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DatosFabricante" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DatosFormulador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DatosMaquilador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UsoAutorizado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TipoMateria" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DescripcionMateria" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MercanciaCartaPorte30", propOrder = {
    "guiasIdentificacion",
    "cantidadTransporta",
    "detalleMercancia",
    "documentacionAduanera"
})
public class MercanciaCartaPorte30 {

    @XmlElement(name = "GuiasIdentificacion")
    protected List<GuiasIdentificacionCartaPorte30> guiasIdentificacion;
    @XmlElement(name = "CantidadTransporta")
    protected List<CantidadTransportaCartaPorte30> cantidadTransporta;
    @XmlElement(name = "DetalleMercancia")
    protected DetalleMercanciaCartaPorte30 detalleMercancia;
    @XmlElement(name = "DocumentacionAduanera")
    protected List<DocumentacionAduanera> documentacionAduanera;
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
    @XmlAttribute(name = "SectorCOFEPRIS")
    protected String sectorCOFEPRIS;
    @XmlAttribute(name = "NombreIngredienteActivo")
    protected String nombreIngredienteActivo;
    @XmlAttribute(name = "NomQuimico")
    protected String nomQuimico;
    @XmlAttribute(name = "DenominacionGenericaProd")
    protected String denominacionGenericaProd;
    @XmlAttribute(name = "DenominacionDistintivaProd")
    protected String denominacionDistintivaProd;
    @XmlAttribute(name = "Fabricante")
    protected String fabricante;
    @XmlAttribute(name = "FechaCaducidad")
    protected String fechaCaducidad;
    @XmlAttribute(name = "LoteMedicamento")
    protected String loteMedicamento;
    @XmlAttribute(name = "FormaFarmaceutica")
    protected String formaFarmaceutica;
    @XmlAttribute(name = "CondicionesEspTransp")
    protected String condicionesEspTransp;
    @XmlAttribute(name = "RegistroSanitarioFolioAutorizacion")
    protected String registroSanitarioFolioAutorizacion;
    @XmlAttribute(name = "PermisoImportacion")
    protected String permisoImportacion;
    @XmlAttribute(name = "FolioImpoVUCEM")
    protected String folioImpoVUCEM;
    @XmlAttribute(name = "NumCAS")
    protected String numCAS;
    @XmlAttribute(name = "RazonSocialEmpImp")
    protected String razonSocialEmpImp;
    @XmlAttribute(name = "NumRegSanPlagCOFEPRIS")
    protected String numRegSanPlagCOFEPRIS;
    @XmlAttribute(name = "DatosFabricante")
    protected String datosFabricante;
    @XmlAttribute(name = "DatosFormulador")
    protected String datosFormulador;
    @XmlAttribute(name = "DatosMaquilador")
    protected String datosMaquilador;
    @XmlAttribute(name = "UsoAutorizado")
    protected String usoAutorizado;
    @XmlAttribute(name = "TipoMateria")
    protected String tipoMateria;
    @XmlAttribute(name = "DescripcionMateria")
    protected String descripcionMateria;

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
     * {@link GuiasIdentificacionCartaPorte30 }
     * 
     * 
     */
    public List<GuiasIdentificacionCartaPorte30> getGuiasIdentificacion() {
        if (guiasIdentificacion == null) {
            guiasIdentificacion = new ArrayList<GuiasIdentificacionCartaPorte30>();
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
     * {@link CantidadTransportaCartaPorte30 }
     * 
     * 
     */
    public List<CantidadTransportaCartaPorte30> getCantidadTransporta() {
        if (cantidadTransporta == null) {
            cantidadTransporta = new ArrayList<CantidadTransportaCartaPorte30>();
        }
        return this.cantidadTransporta;
    }

    /**
     * Obtiene el valor de la propiedad detalleMercancia.
     * 
     * @return
     *     possible object is
     *     {@link DetalleMercanciaCartaPorte30 }
     *     
     */
    public DetalleMercanciaCartaPorte30 getDetalleMercancia() {
        return detalleMercancia;
    }

    /**
     * Define el valor de la propiedad detalleMercancia.
     * 
     * @param value
     *     allowed object is
     *     {@link DetalleMercanciaCartaPorte30 }
     *     
     */
    public void setDetalleMercancia(DetalleMercanciaCartaPorte30 value) {
        this.detalleMercancia = value;
    }

    /**
     * Gets the value of the documentacionAduanera property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentacionAduanera property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentacionAduanera().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentacionAduanera }
     * 
     * 
     */
    public List<DocumentacionAduanera> getDocumentacionAduanera() {
        if (documentacionAduanera == null) {
            documentacionAduanera = new ArrayList<DocumentacionAduanera>();
        }
        return this.documentacionAduanera;
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

    /**
     * Obtiene el valor de la propiedad sectorCOFEPRIS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorCOFEPRIS() {
        return sectorCOFEPRIS;
    }

    /**
     * Define el valor de la propiedad sectorCOFEPRIS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorCOFEPRIS(String value) {
        this.sectorCOFEPRIS = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreIngredienteActivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreIngredienteActivo() {
        return nombreIngredienteActivo;
    }

    /**
     * Define el valor de la propiedad nombreIngredienteActivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreIngredienteActivo(String value) {
        this.nombreIngredienteActivo = value;
    }

    /**
     * Obtiene el valor de la propiedad nomQuimico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomQuimico() {
        return nomQuimico;
    }

    /**
     * Define el valor de la propiedad nomQuimico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomQuimico(String value) {
        this.nomQuimico = value;
    }

    /**
     * Obtiene el valor de la propiedad denominacionGenericaProd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominacionGenericaProd() {
        return denominacionGenericaProd;
    }

    /**
     * Define el valor de la propiedad denominacionGenericaProd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominacionGenericaProd(String value) {
        this.denominacionGenericaProd = value;
    }

    /**
     * Obtiene el valor de la propiedad denominacionDistintivaProd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominacionDistintivaProd() {
        return denominacionDistintivaProd;
    }

    /**
     * Define el valor de la propiedad denominacionDistintivaProd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominacionDistintivaProd(String value) {
        this.denominacionDistintivaProd = value;
    }

    /**
     * Obtiene el valor de la propiedad fabricante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Define el valor de la propiedad fabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFabricante(String value) {
        this.fabricante = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCaducidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * Define el valor de la propiedad fechaCaducidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCaducidad(String value) {
        this.fechaCaducidad = value;
    }

    /**
     * Obtiene el valor de la propiedad loteMedicamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoteMedicamento() {
        return loteMedicamento;
    }

    /**
     * Define el valor de la propiedad loteMedicamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoteMedicamento(String value) {
        this.loteMedicamento = value;
    }

    /**
     * Obtiene el valor de la propiedad formaFarmaceutica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    /**
     * Define el valor de la propiedad formaFarmaceutica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaFarmaceutica(String value) {
        this.formaFarmaceutica = value;
    }

    /**
     * Obtiene el valor de la propiedad condicionesEspTransp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionesEspTransp() {
        return condicionesEspTransp;
    }

    /**
     * Define el valor de la propiedad condicionesEspTransp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionesEspTransp(String value) {
        this.condicionesEspTransp = value;
    }

    /**
     * Obtiene el valor de la propiedad registroSanitarioFolioAutorizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroSanitarioFolioAutorizacion() {
        return registroSanitarioFolioAutorizacion;
    }

    /**
     * Define el valor de la propiedad registroSanitarioFolioAutorizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroSanitarioFolioAutorizacion(String value) {
        this.registroSanitarioFolioAutorizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad permisoImportacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermisoImportacion() {
        return permisoImportacion;
    }

    /**
     * Define el valor de la propiedad permisoImportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermisoImportacion(String value) {
        this.permisoImportacion = value;
    }

    /**
     * Obtiene el valor de la propiedad folioImpoVUCEM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioImpoVUCEM() {
        return folioImpoVUCEM;
    }

    /**
     * Define el valor de la propiedad folioImpoVUCEM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioImpoVUCEM(String value) {
        this.folioImpoVUCEM = value;
    }

    /**
     * Obtiene el valor de la propiedad numCAS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCAS() {
        return numCAS;
    }

    /**
     * Define el valor de la propiedad numCAS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCAS(String value) {
        this.numCAS = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocialEmpImp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocialEmpImp() {
        return razonSocialEmpImp;
    }

    /**
     * Define el valor de la propiedad razonSocialEmpImp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocialEmpImp(String value) {
        this.razonSocialEmpImp = value;
    }

    /**
     * Obtiene el valor de la propiedad numRegSanPlagCOFEPRIS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRegSanPlagCOFEPRIS() {
        return numRegSanPlagCOFEPRIS;
    }

    /**
     * Define el valor de la propiedad numRegSanPlagCOFEPRIS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRegSanPlagCOFEPRIS(String value) {
        this.numRegSanPlagCOFEPRIS = value;
    }

    /**
     * Obtiene el valor de la propiedad datosFabricante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosFabricante() {
        return datosFabricante;
    }

    /**
     * Define el valor de la propiedad datosFabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosFabricante(String value) {
        this.datosFabricante = value;
    }

    /**
     * Obtiene el valor de la propiedad datosFormulador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosFormulador() {
        return datosFormulador;
    }

    /**
     * Define el valor de la propiedad datosFormulador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosFormulador(String value) {
        this.datosFormulador = value;
    }

    /**
     * Obtiene el valor de la propiedad datosMaquilador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosMaquilador() {
        return datosMaquilador;
    }

    /**
     * Define el valor de la propiedad datosMaquilador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosMaquilador(String value) {
        this.datosMaquilador = value;
    }

    /**
     * Obtiene el valor de la propiedad usoAutorizado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsoAutorizado() {
        return usoAutorizado;
    }

    /**
     * Define el valor de la propiedad usoAutorizado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsoAutorizado(String value) {
        this.usoAutorizado = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoMateria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMateria() {
        return tipoMateria;
    }

    /**
     * Define el valor de la propiedad tipoMateria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMateria(String value) {
        this.tipoMateria = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionMateria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMateria() {
        return descripcionMateria;
    }

    /**
     * Define el valor de la propiedad descripcionMateria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMateria(String value) {
        this.descripcionMateria = value;
    }

}
