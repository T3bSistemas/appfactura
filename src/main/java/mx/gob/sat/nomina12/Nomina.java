
package mx.gob.sat.nomina12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Nomina complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Nomina"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Emisor" type="{http://www.sat.gob.mx/nomina12}Emisor" minOccurs="0"/&gt;
 *         &lt;element name="Receptor" type="{http://www.sat.gob.mx/nomina12}Receptor" minOccurs="0"/&gt;
 *         &lt;element name="Percepciones" type="{http://www.sat.gob.mx/nomina12}Percepciones" minOccurs="0"/&gt;
 *         &lt;element name="Deducciones" type="{http://www.sat.gob.mx/nomina12}Deducciones" minOccurs="0"/&gt;
 *         &lt;element name="OtrosPagos" type="{http://www.sat.gob.mx/nomina12}OtrosPagos" minOccurs="0"/&gt;
 *         &lt;element name="Incapacidades" type="{http://www.sat.gob.mx/nomina12}Incapacidades" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TipoNomina" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FechaPago" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="FechaInicialPago" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="FechaFinalPago" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="NumDiasPagados" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TotalPercepciones" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TotalDeducciones" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TotalOtrosPagos" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nomina12" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nomina", propOrder = {
    "emisor",
    "receptor",
    "percepciones",
    "deducciones",
    "otrosPagos",
    "incapacidades"
})
public class Nomina {

    @XmlElement(name = "Emisor")
    protected Emisor emisor;
    @XmlElement(name = "Receptor")
    protected Receptor receptor;
    @XmlElement(name = "Percepciones")
    protected Percepciones percepciones;
    @XmlElement(name = "Deducciones")
    protected Deducciones deducciones;
    @XmlElement(name = "OtrosPagos")
    protected OtrosPagos otrosPagos;
    @XmlElement(name = "Incapacidades")
    protected Incapacidades incapacidades;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "TipoNomina")
    protected String tipoNomina;
    @XmlAttribute(name = "FechaPago", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaPago;
    @XmlAttribute(name = "FechaInicialPago", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicialPago;
    @XmlAttribute(name = "FechaFinalPago", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFinalPago;
    @XmlAttribute(name = "NumDiasPagados")
    protected String numDiasPagados;
    @XmlAttribute(name = "TotalPercepciones")
    protected String totalPercepciones;
    @XmlAttribute(name = "TotalDeducciones")
    protected String totalDeducciones;
    @XmlAttribute(name = "TotalOtrosPagos")
    protected String totalOtrosPagos;
    @XmlAttribute(name = "nomina12")
    protected String nomina12;

    /**
     * Obtiene el valor de la propiedad emisor.
     * 
     * @return
     *     possible object is
     *     {@link Emisor }
     *     
     */
    public Emisor getEmisor() {
        return emisor;
    }

    /**
     * Define el valor de la propiedad emisor.
     * 
     * @param value
     *     allowed object is
     *     {@link Emisor }
     *     
     */
    public void setEmisor(Emisor value) {
        this.emisor = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link Receptor }
     *     
     */
    public Receptor getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link Receptor }
     *     
     */
    public void setReceptor(Receptor value) {
        this.receptor = value;
    }

    /**
     * Obtiene el valor de la propiedad percepciones.
     * 
     * @return
     *     possible object is
     *     {@link Percepciones }
     *     
     */
    public Percepciones getPercepciones() {
        return percepciones;
    }

    /**
     * Define el valor de la propiedad percepciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Percepciones }
     *     
     */
    public void setPercepciones(Percepciones value) {
        this.percepciones = value;
    }

    /**
     * Obtiene el valor de la propiedad deducciones.
     * 
     * @return
     *     possible object is
     *     {@link Deducciones }
     *     
     */
    public Deducciones getDeducciones() {
        return deducciones;
    }

    /**
     * Define el valor de la propiedad deducciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Deducciones }
     *     
     */
    public void setDeducciones(Deducciones value) {
        this.deducciones = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosPagos.
     * 
     * @return
     *     possible object is
     *     {@link OtrosPagos }
     *     
     */
    public OtrosPagos getOtrosPagos() {
        return otrosPagos;
    }

    /**
     * Define el valor de la propiedad otrosPagos.
     * 
     * @param value
     *     allowed object is
     *     {@link OtrosPagos }
     *     
     */
    public void setOtrosPagos(OtrosPagos value) {
        this.otrosPagos = value;
    }

    /**
     * Obtiene el valor de la propiedad incapacidades.
     * 
     * @return
     *     possible object is
     *     {@link Incapacidades }
     *     
     */
    public Incapacidades getIncapacidades() {
        return incapacidades;
    }

    /**
     * Define el valor de la propiedad incapacidades.
     * 
     * @param value
     *     allowed object is
     *     {@link Incapacidades }
     *     
     */
    public void setIncapacidades(Incapacidades value) {
        this.incapacidades = value;
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
     * Obtiene el valor de la propiedad tipoNomina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoNomina() {
        return tipoNomina;
    }

    /**
     * Define el valor de la propiedad tipoNomina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoNomina(String value) {
        this.tipoNomina = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPago.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaPago() {
        return fechaPago;
    }

    /**
     * Define el valor de la propiedad fechaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaPago(XMLGregorianCalendar value) {
        this.fechaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicialPago.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicialPago() {
        return fechaInicialPago;
    }

    /**
     * Define el valor de la propiedad fechaInicialPago.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicialPago(XMLGregorianCalendar value) {
        this.fechaInicialPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFinalPago.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFinalPago() {
        return fechaFinalPago;
    }

    /**
     * Define el valor de la propiedad fechaFinalPago.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFinalPago(XMLGregorianCalendar value) {
        this.fechaFinalPago = value;
    }

    /**
     * Obtiene el valor de la propiedad numDiasPagados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDiasPagados() {
        return numDiasPagados;
    }

    /**
     * Define el valor de la propiedad numDiasPagados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDiasPagados(String value) {
        this.numDiasPagados = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPercepciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPercepciones() {
        return totalPercepciones;
    }

    /**
     * Define el valor de la propiedad totalPercepciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPercepciones(String value) {
        this.totalPercepciones = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDeducciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDeducciones() {
        return totalDeducciones;
    }

    /**
     * Define el valor de la propiedad totalDeducciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDeducciones(String value) {
        this.totalDeducciones = value;
    }

    /**
     * Obtiene el valor de la propiedad totalOtrosPagos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalOtrosPagos() {
        return totalOtrosPagos;
    }

    /**
     * Define el valor de la propiedad totalOtrosPagos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalOtrosPagos(String value) {
        this.totalOtrosPagos = value;
    }

    /**
     * Obtiene el valor de la propiedad nomina12.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomina12() {
        return nomina12;
    }

    /**
     * Define el valor de la propiedad nomina12.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomina12(String value) {
        this.nomina12 = value;
    }

}
