
package mx.gob.sat.cartaporte30;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransporteAereoCartaPorte30 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransporteAereoCartaPorte30"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="PermSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumPermisoSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MatriculaAeronave" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumeroGuia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LugarContrato" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CodigoTransportista" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RFCEmbarcador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumRegIdTribEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ResidenciaFiscalEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NombreEmbarcador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransporteAereoCartaPorte30")
public class TransporteAereoCartaPorte30 {

    @XmlAttribute(name = "PermSCT")
    protected String permSCT;
    @XmlAttribute(name = "NumPermisoSCT")
    protected String numPermisoSCT;
    @XmlAttribute(name = "MatriculaAeronave")
    protected String matriculaAeronave;
    @XmlAttribute(name = "NombreAseg")
    protected String nombreAseg;
    @XmlAttribute(name = "NumPolizaSeguro")
    protected String numPolizaSeguro;
    @XmlAttribute(name = "NumeroGuia")
    protected String numeroGuia;
    @XmlAttribute(name = "LugarContrato")
    protected String lugarContrato;
    @XmlAttribute(name = "CodigoTransportista")
    protected String codigoTransportista;
    @XmlAttribute(name = "RFCEmbarcador")
    protected String rfcEmbarcador;
    @XmlAttribute(name = "NumRegIdTribEmbarc")
    protected String numRegIdTribEmbarc;
    @XmlAttribute(name = "ResidenciaFiscalEmbarc")
    protected String residenciaFiscalEmbarc;
    @XmlAttribute(name = "NombreEmbarcador")
    protected String nombreEmbarcador;

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
     * Obtiene el valor de la propiedad matriculaAeronave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaAeronave() {
        return matriculaAeronave;
    }

    /**
     * Define el valor de la propiedad matriculaAeronave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaAeronave(String value) {
        this.matriculaAeronave = value;
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
     * Obtiene el valor de la propiedad numeroGuia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuia() {
        return numeroGuia;
    }

    /**
     * Define el valor de la propiedad numeroGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuia(String value) {
        this.numeroGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarContrato() {
        return lugarContrato;
    }

    /**
     * Define el valor de la propiedad lugarContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarContrato(String value) {
        this.lugarContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTransportista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTransportista() {
        return codigoTransportista;
    }

    /**
     * Define el valor de la propiedad codigoTransportista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTransportista(String value) {
        this.codigoTransportista = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcEmbarcador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCEmbarcador() {
        return rfcEmbarcador;
    }

    /**
     * Define el valor de la propiedad rfcEmbarcador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCEmbarcador(String value) {
        this.rfcEmbarcador = value;
    }

    /**
     * Obtiene el valor de la propiedad numRegIdTribEmbarc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRegIdTribEmbarc() {
        return numRegIdTribEmbarc;
    }

    /**
     * Define el valor de la propiedad numRegIdTribEmbarc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRegIdTribEmbarc(String value) {
        this.numRegIdTribEmbarc = value;
    }

    /**
     * Obtiene el valor de la propiedad residenciaFiscalEmbarc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenciaFiscalEmbarc() {
        return residenciaFiscalEmbarc;
    }

    /**
     * Define el valor de la propiedad residenciaFiscalEmbarc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenciaFiscalEmbarc(String value) {
        this.residenciaFiscalEmbarc = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEmbarcador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmbarcador() {
        return nombreEmbarcador;
    }

    /**
     * Define el valor de la propiedad nombreEmbarcador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmbarcador(String value) {
        this.nombreEmbarcador = value;
    }

}
