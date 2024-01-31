
package mx.gob.sat.cartaporte30;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CartaPorte30 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CartaPorte30"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ubicaciones" type="{http://www.sat.gob.mx/CartaPorte30}UbicacionesCartaPorte30" minOccurs="0"/&gt;
 *         &lt;element name="Mercancias" type="{http://www.sat.gob.mx/CartaPorte30}MercanciasCartaPorte30" minOccurs="0"/&gt;
 *         &lt;element name="FiguraTransporte" type="{http://www.sat.gob.mx/CartaPorte30}FiguraTransporteCartaPorte30" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TranspInternac" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EntradaSalidaMerc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PaisOrigenDestino" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ViaEntradaSalida" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TotalDistRec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IdCCP" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RegimenAduanero" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RegistroISTMO" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UbicacionPoloOrigen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UbicacionPoloDestino" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CartaPorte30", propOrder = {
    "ubicaciones",
    "mercancias",
    "figuraTransporte"
})
public class CartaPorte30 {

    @XmlElement(name = "Ubicaciones")
    protected UbicacionesCartaPorte30 ubicaciones;
    @XmlElement(name = "Mercancias")
    protected MercanciasCartaPorte30 mercancias;
    @XmlElement(name = "FiguraTransporte")
    protected FiguraTransporteCartaPorte30 figuraTransporte;
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
    @XmlAttribute(name = "IdCCP")
    protected String idCCP;
    @XmlAttribute(name = "RegimenAduanero")
    protected String regimenAduanero;
    @XmlAttribute(name = "RegistroISTMO")
    protected String registroISTMO;
    @XmlAttribute(name = "UbicacionPoloOrigen")
    protected String ubicacionPoloOrigen;
    @XmlAttribute(name = "UbicacionPoloDestino")
    protected String ubicacionPoloDestino;

    /**
     * Obtiene el valor de la propiedad ubicaciones.
     * 
     * @return
     *     possible object is
     *     {@link UbicacionesCartaPorte30 }
     *     
     */
    public UbicacionesCartaPorte30 getUbicaciones() {
        return ubicaciones;
    }

    /**
     * Define el valor de la propiedad ubicaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link UbicacionesCartaPorte30 }
     *     
     */
    public void setUbicaciones(UbicacionesCartaPorte30 value) {
        this.ubicaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad mercancias.
     * 
     * @return
     *     possible object is
     *     {@link MercanciasCartaPorte30 }
     *     
     */
    public MercanciasCartaPorte30 getMercancias() {
        return mercancias;
    }

    /**
     * Define el valor de la propiedad mercancias.
     * 
     * @param value
     *     allowed object is
     *     {@link MercanciasCartaPorte30 }
     *     
     */
    public void setMercancias(MercanciasCartaPorte30 value) {
        this.mercancias = value;
    }

    /**
     * Obtiene el valor de la propiedad figuraTransporte.
     * 
     * @return
     *     possible object is
     *     {@link FiguraTransporteCartaPorte30 }
     *     
     */
    public FiguraTransporteCartaPorte30 getFiguraTransporte() {
        return figuraTransporte;
    }

    /**
     * Define el valor de la propiedad figuraTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link FiguraTransporteCartaPorte30 }
     *     
     */
    public void setFiguraTransporte(FiguraTransporteCartaPorte30 value) {
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

    /**
     * Obtiene el valor de la propiedad idCCP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCCP() {
        return idCCP;
    }

    /**
     * Define el valor de la propiedad idCCP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCCP(String value) {
        this.idCCP = value;
    }

    /**
     * Obtiene el valor de la propiedad regimenAduanero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimenAduanero() {
        return regimenAduanero;
    }

    /**
     * Define el valor de la propiedad regimenAduanero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimenAduanero(String value) {
        this.regimenAduanero = value;
    }

    /**
     * Obtiene el valor de la propiedad registroISTMO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroISTMO() {
        return registroISTMO;
    }

    /**
     * Define el valor de la propiedad registroISTMO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroISTMO(String value) {
        this.registroISTMO = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacionPoloOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbicacionPoloOrigen() {
        return ubicacionPoloOrigen;
    }

    /**
     * Define el valor de la propiedad ubicacionPoloOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbicacionPoloOrigen(String value) {
        this.ubicacionPoloOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacionPoloDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbicacionPoloDestino() {
        return ubicacionPoloDestino;
    }

    /**
     * Define el valor de la propiedad ubicacionPoloDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbicacionPoloDestino(String value) {
        this.ubicacionPoloDestino = value;
    }

}
