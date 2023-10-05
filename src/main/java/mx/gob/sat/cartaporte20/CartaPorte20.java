
package mx.gob.sat.cartaporte20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CartaPorte20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CartaPorte20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ubicaciones" type="{http://www.sat.gob.mx/CartaPorte20}Ubicaciones" minOccurs="0"/&gt;
 *         &lt;element name="Mercancias" type="{http://www.sat.gob.mx/CartaPorte20}Mercancias" minOccurs="0"/&gt;
 *         &lt;element name="FiguraTransporte" type="{http://www.sat.gob.mx/CartaPorte20}FiguraTransporte" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TranspInternac" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EntradaSalidaMerc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PaisOrigenDestino" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ViaEntradaSalida" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TotalDistRec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CartaPorte20", propOrder = {
    "ubicaciones",
    "mercancias",
    "figuraTransporte"
})
public class CartaPorte20 {

    @XmlElement(name = "Ubicaciones")
    protected Ubicaciones ubicaciones;
    @XmlElement(name = "Mercancias")
    protected Mercancias mercancias;
    @XmlElement(name = "FiguraTransporte")
    protected FiguraTransporte figuraTransporte;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "TranspInternac")
    protected String transpInternac;
    @XmlAttribute(name = "EntradaSalidaMerc")
    protected String entradaSalidaMerc;
    @XmlAttribute(name = "PaisOrigenDestino")
    protected String paisOrigenDestino;
    @XmlAttribute(name = "ViaEntradaSalida")
    protected String viaEntradaSalida;
    @XmlAttribute(name = "TotalDistRec")
    protected String totalDistRec;

    /**
     * Obtiene el valor de la propiedad ubicaciones.
     * 
     * @return
     *     possible object is
     *     {@link Ubicaciones }
     *     
     */
    public Ubicaciones getUbicaciones() {
        return ubicaciones;
    }

    /**
     * Define el valor de la propiedad ubicaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Ubicaciones }
     *     
     */
    public void setUbicaciones(Ubicaciones value) {
        this.ubicaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad mercancias.
     * 
     * @return
     *     possible object is
     *     {@link Mercancias }
     *     
     */
    public Mercancias getMercancias() {
        return mercancias;
    }

    /**
     * Define el valor de la propiedad mercancias.
     * 
     * @param value
     *     allowed object is
     *     {@link Mercancias }
     *     
     */
    public void setMercancias(Mercancias value) {
        this.mercancias = value;
    }

    /**
     * Obtiene el valor de la propiedad figuraTransporte.
     * 
     * @return
     *     possible object is
     *     {@link FiguraTransporte }
     *     
     */
    public FiguraTransporte getFiguraTransporte() {
        return figuraTransporte;
    }

    /**
     * Define el valor de la propiedad figuraTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link FiguraTransporte }
     *     
     */
    public void setFiguraTransporte(FiguraTransporte value) {
        this.figuraTransporte = value;
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
     * Obtiene el valor de la propiedad transpInternac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranspInternac() {
        return transpInternac;
    }

    /**
     * Define el valor de la propiedad transpInternac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranspInternac(String value) {
        this.transpInternac = value;
    }

    /**
     * Obtiene el valor de la propiedad entradaSalidaMerc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntradaSalidaMerc() {
        return entradaSalidaMerc;
    }

    /**
     * Define el valor de la propiedad entradaSalidaMerc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntradaSalidaMerc(String value) {
        this.entradaSalidaMerc = value;
    }

    /**
     * Obtiene el valor de la propiedad paisOrigenDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisOrigenDestino() {
        return paisOrigenDestino;
    }

    /**
     * Define el valor de la propiedad paisOrigenDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisOrigenDestino(String value) {
        this.paisOrigenDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad viaEntradaSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaEntradaSalida() {
        return viaEntradaSalida;
    }

    /**
     * Define el valor de la propiedad viaEntradaSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaEntradaSalida(String value) {
        this.viaEntradaSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDistRec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDistRec() {
        return totalDistRec;
    }

    /**
     * Define el valor de la propiedad totalDistRec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDistRec(String value) {
        this.totalDistRec = value;
    }

}
