
package mx.gob.sat.cartaporte30;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ContenedorCartaPorte30 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContenedorCartaPorte30"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TipoContenedor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MatriculaContenedor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PesoContenedorVacio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PesoNetoMercancia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumPrecinto" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IdCCPRelacionado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PlacaVMCCP" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FechaCertificacionCCP" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContenedorCartaPorte30")
public class ContenedorCartaPorte30 {

    @XmlAttribute(name = "TipoContenedor")
    protected String tipoContenedor;
    @XmlAttribute(name = "MatriculaContenedor")
    protected String matriculaContenedor;
    @XmlAttribute(name = "PesoContenedorVacio")
    protected String pesoContenedorVacio;
    @XmlAttribute(name = "PesoNetoMercancia")
    protected String pesoNetoMercancia;
    @XmlAttribute(name = "NumPrecinto")
    protected String numPrecinto;
    @XmlAttribute(name = "IdCCPRelacionado")
    protected String idCCPRelacionado;
    @XmlAttribute(name = "PlacaVMCCP")
    protected String placaVMCCP;
    @XmlAttribute(name = "FechaCertificacionCCP")
    protected String fechaCertificacionCCP;

    /**
     * Obtiene el valor de la propiedad tipoContenedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoContenedor() {
        return tipoContenedor;
    }

    /**
     * Define el valor de la propiedad tipoContenedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoContenedor(String value) {
        this.tipoContenedor = value;
    }

    /**
     * Obtiene el valor de la propiedad matriculaContenedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaContenedor() {
        return matriculaContenedor;
    }

    /**
     * Define el valor de la propiedad matriculaContenedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaContenedor(String value) {
        this.matriculaContenedor = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoContenedorVacio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoContenedorVacio() {
        return pesoContenedorVacio;
    }

    /**
     * Define el valor de la propiedad pesoContenedorVacio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoContenedorVacio(String value) {
        this.pesoContenedorVacio = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoNetoMercancia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoNetoMercancia() {
        return pesoNetoMercancia;
    }

    /**
     * Define el valor de la propiedad pesoNetoMercancia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoNetoMercancia(String value) {
        this.pesoNetoMercancia = value;
    }

    /**
     * Obtiene el valor de la propiedad numPrecinto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPrecinto() {
        return numPrecinto;
    }

    /**
     * Define el valor de la propiedad numPrecinto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPrecinto(String value) {
        this.numPrecinto = value;
    }

    /**
     * Obtiene el valor de la propiedad idCCPRelacionado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCCPRelacionado() {
        return idCCPRelacionado;
    }

    /**
     * Define el valor de la propiedad idCCPRelacionado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCCPRelacionado(String value) {
        this.idCCPRelacionado = value;
    }

    /**
     * Obtiene el valor de la propiedad placaVMCCP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacaVMCCP() {
        return placaVMCCP;
    }

    /**
     * Define el valor de la propiedad placaVMCCP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacaVMCCP(String value) {
        this.placaVMCCP = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCertificacionCCP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCertificacionCCP() {
        return fechaCertificacionCCP;
    }

    /**
     * Define el valor de la propiedad fechaCertificacionCCP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCertificacionCCP(String value) {
        this.fechaCertificacionCCP = value;
    }

}
