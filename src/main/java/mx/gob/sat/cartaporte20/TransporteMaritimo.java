
package mx.gob.sat.cartaporte20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransporteMaritimo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransporteMaritimo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Contenedor" type="{http://www.sat.gob.mx/CartaPorte20}Contenedor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PermSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumPermisoSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TipoEmbarcacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Matricula" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumeroOMI" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AnioEmbarcacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NombreEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NacionalidadEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UnidadesDeArqBruto" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TipoCarga" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumCertITC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Eslora" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Manga" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Calado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LineaNaviera" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NombreAgenteNaviero" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumAutorizacionNaviero" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumViaje" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumConocEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransporteMaritimo", propOrder = {
    "contenedor"
})
public class TransporteMaritimo {

    @XmlElement(name = "Contenedor")
    protected List<Contenedor> contenedor;
    @XmlAttribute(name = "PermSCT")
    protected String permSCT;
    @XmlAttribute(name = "NumPermisoSCT")
    protected String numPermisoSCT;
    @XmlAttribute(name = "NombreAseg")
    protected String nombreAseg;
    @XmlAttribute(name = "NumPolizaSeguro")
    protected String numPolizaSeguro;
    @XmlAttribute(name = "TipoEmbarcacion")
    protected String tipoEmbarcacion;
    @XmlAttribute(name = "Matricula")
    protected String matricula;
    @XmlAttribute(name = "NumeroOMI")
    protected String numeroOMI;
    @XmlAttribute(name = "AnioEmbarcacion")
    protected String anioEmbarcacion;
    @XmlAttribute(name = "NombreEmbarc")
    protected String nombreEmbarc;
    @XmlAttribute(name = "NacionalidadEmbarc")
    protected String nacionalidadEmbarc;
    @XmlAttribute(name = "UnidadesDeArqBruto")
    protected String unidadesDeArqBruto;
    @XmlAttribute(name = "TipoCarga")
    protected String tipoCarga;
    @XmlAttribute(name = "NumCertITC")
    protected String numCertITC;
    @XmlAttribute(name = "Eslora")
    protected String eslora;
    @XmlAttribute(name = "Manga")
    protected String manga;
    @XmlAttribute(name = "Calado")
    protected String calado;
    @XmlAttribute(name = "LineaNaviera")
    protected String lineaNaviera;
    @XmlAttribute(name = "NombreAgenteNaviero")
    protected String nombreAgenteNaviero;
    @XmlAttribute(name = "NumAutorizacionNaviero")
    protected String numAutorizacionNaviero;
    @XmlAttribute(name = "NumViaje")
    protected String numViaje;
    @XmlAttribute(name = "NumConocEmbarc")
    protected String numConocEmbarc;

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

    /**
     * Obtiene el valor de la propiedad tipoEmbarcacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    /**
     * Define el valor de la propiedad tipoEmbarcacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEmbarcacion(String value) {
        this.tipoEmbarcacion = value;
    }

    /**
     * Obtiene el valor de la propiedad matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define el valor de la propiedad matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroOMI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroOMI() {
        return numeroOMI;
    }

    /**
     * Define el valor de la propiedad numeroOMI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroOMI(String value) {
        this.numeroOMI = value;
    }

    /**
     * Obtiene el valor de la propiedad anioEmbarcacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnioEmbarcacion() {
        return anioEmbarcacion;
    }

    /**
     * Define el valor de la propiedad anioEmbarcacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnioEmbarcacion(String value) {
        this.anioEmbarcacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEmbarc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmbarc() {
        return nombreEmbarc;
    }

    /**
     * Define el valor de la propiedad nombreEmbarc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmbarc(String value) {
        this.nombreEmbarc = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadEmbarc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidadEmbarc() {
        return nacionalidadEmbarc;
    }

    /**
     * Define el valor de la propiedad nacionalidadEmbarc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidadEmbarc(String value) {
        this.nacionalidadEmbarc = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadesDeArqBruto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadesDeArqBruto() {
        return unidadesDeArqBruto;
    }

    /**
     * Define el valor de la propiedad unidadesDeArqBruto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadesDeArqBruto(String value) {
        this.unidadesDeArqBruto = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCarga() {
        return tipoCarga;
    }

    /**
     * Define el valor de la propiedad tipoCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCarga(String value) {
        this.tipoCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad numCertITC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCertITC() {
        return numCertITC;
    }

    /**
     * Define el valor de la propiedad numCertITC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCertITC(String value) {
        this.numCertITC = value;
    }

    /**
     * Obtiene el valor de la propiedad eslora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEslora() {
        return eslora;
    }

    /**
     * Define el valor de la propiedad eslora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEslora(String value) {
        this.eslora = value;
    }

    /**
     * Obtiene el valor de la propiedad manga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManga() {
        return manga;
    }

    /**
     * Define el valor de la propiedad manga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManga(String value) {
        this.manga = value;
    }

    /**
     * Obtiene el valor de la propiedad calado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalado() {
        return calado;
    }

    /**
     * Define el valor de la propiedad calado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalado(String value) {
        this.calado = value;
    }

    /**
     * Obtiene el valor de la propiedad lineaNaviera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineaNaviera() {
        return lineaNaviera;
    }

    /**
     * Define el valor de la propiedad lineaNaviera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineaNaviera(String value) {
        this.lineaNaviera = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAgenteNaviero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAgenteNaviero() {
        return nombreAgenteNaviero;
    }

    /**
     * Define el valor de la propiedad nombreAgenteNaviero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAgenteNaviero(String value) {
        this.nombreAgenteNaviero = value;
    }

    /**
     * Obtiene el valor de la propiedad numAutorizacionNaviero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumAutorizacionNaviero() {
        return numAutorizacionNaviero;
    }

    /**
     * Define el valor de la propiedad numAutorizacionNaviero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumAutorizacionNaviero(String value) {
        this.numAutorizacionNaviero = value;
    }

    /**
     * Obtiene el valor de la propiedad numViaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumViaje() {
        return numViaje;
    }

    /**
     * Define el valor de la propiedad numViaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumViaje(String value) {
        this.numViaje = value;
    }

    /**
     * Obtiene el valor de la propiedad numConocEmbarc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumConocEmbarc() {
        return numConocEmbarc;
    }

    /**
     * Define el valor de la propiedad numConocEmbarc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumConocEmbarc(String value) {
        this.numConocEmbarc = value;
    }

}
