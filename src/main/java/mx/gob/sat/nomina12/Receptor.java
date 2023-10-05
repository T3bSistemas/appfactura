
package mx.gob.sat.nomina12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Receptor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Receptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubContratacion" type="{http://www.sat.gob.mx/nomina12}SubContratacion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Curp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumSeguridadSocial" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FechaInicioRelLaboral" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="Antigüedad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TipoContrato" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Sindicalizado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TipoJornada" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TipoRegimen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumEmpleado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Puesto" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RiesgoPuesto" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PeriodicidadPago" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Banco" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CuentaBancaria" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SalarioBaseCotApor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SalarioDiarioIntegrado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ClaveEntFed" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Receptor", propOrder = {
    "subContratacion"
})
public class Receptor {

    @XmlElement(name = "SubContratacion")
    protected List<SubContratacion> subContratacion;
    @XmlAttribute(name = "Curp")
    protected String curp;
    @XmlAttribute(name = "NumSeguridadSocial")
    protected String numSeguridadSocial;
    @XmlAttribute(name = "FechaInicioRelLaboral", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicioRelLaboral;
    @XmlAttribute(name = "Antig\u00fcedad")
    protected String antigüedad;
    @XmlAttribute(name = "TipoContrato")
    protected String tipoContrato;
    @XmlAttribute(name = "Sindicalizado")
    protected String sindicalizado;
    @XmlAttribute(name = "TipoJornada")
    protected String tipoJornada;
    @XmlAttribute(name = "TipoRegimen")
    protected String tipoRegimen;
    @XmlAttribute(name = "NumEmpleado")
    protected String numEmpleado;
    @XmlAttribute(name = "Departamento")
    protected String departamento;
    @XmlAttribute(name = "Puesto")
    protected String puesto;
    @XmlAttribute(name = "RiesgoPuesto")
    protected String riesgoPuesto;
    @XmlAttribute(name = "PeriodicidadPago")
    protected String periodicidadPago;
    @XmlAttribute(name = "Banco")
    protected String banco;
    @XmlAttribute(name = "CuentaBancaria")
    protected String cuentaBancaria;
    @XmlAttribute(name = "SalarioBaseCotApor")
    protected String salarioBaseCotApor;
    @XmlAttribute(name = "SalarioDiarioIntegrado")
    protected String salarioDiarioIntegrado;
    @XmlAttribute(name = "ClaveEntFed")
    protected String claveEntFed;

    /**
     * Gets the value of the subContratacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subContratacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubContratacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubContratacion }
     * 
     * 
     */
    public List<SubContratacion> getSubContratacion() {
        if (subContratacion == null) {
            subContratacion = new ArrayList<SubContratacion>();
        }
        return this.subContratacion;
    }

    /**
     * Obtiene el valor de la propiedad curp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurp() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurp(String value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad numSeguridadSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    /**
     * Define el valor de la propiedad numSeguridadSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSeguridadSocial(String value) {
        this.numSeguridadSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioRelLaboral.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicioRelLaboral() {
        return fechaInicioRelLaboral;
    }

    /**
     * Define el valor de la propiedad fechaInicioRelLaboral.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicioRelLaboral(XMLGregorianCalendar value) {
        this.fechaInicioRelLaboral = value;
    }

    /**
     * Obtiene el valor de la propiedad antigüedad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntigüedad() {
        return antigüedad;
    }

    /**
     * Define el valor de la propiedad antigüedad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntigüedad(String value) {
        this.antigüedad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoContrato() {
        return tipoContrato;
    }

    /**
     * Define el valor de la propiedad tipoContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoContrato(String value) {
        this.tipoContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad sindicalizado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSindicalizado() {
        return sindicalizado;
    }

    /**
     * Define el valor de la propiedad sindicalizado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSindicalizado(String value) {
        this.sindicalizado = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoJornada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoJornada() {
        return tipoJornada;
    }

    /**
     * Define el valor de la propiedad tipoJornada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoJornada(String value) {
        this.tipoJornada = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRegimen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRegimen() {
        return tipoRegimen;
    }

    /**
     * Define el valor de la propiedad tipoRegimen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRegimen(String value) {
        this.tipoRegimen = value;
    }

    /**
     * Obtiene el valor de la propiedad numEmpleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * Define el valor de la propiedad numEmpleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumEmpleado(String value) {
        this.numEmpleado = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamento(String value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad puesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Define el valor de la propiedad puesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuesto(String value) {
        this.puesto = value;
    }

    /**
     * Obtiene el valor de la propiedad riesgoPuesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiesgoPuesto() {
        return riesgoPuesto;
    }

    /**
     * Define el valor de la propiedad riesgoPuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiesgoPuesto(String value) {
        this.riesgoPuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad periodicidadPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicidadPago() {
        return periodicidadPago;
    }

    /**
     * Define el valor de la propiedad periodicidadPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicidadPago(String value) {
        this.periodicidadPago = value;
    }

    /**
     * Obtiene el valor de la propiedad banco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanco() {
        return banco;
    }

    /**
     * Define el valor de la propiedad banco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanco(String value) {
        this.banco = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaBancaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    /**
     * Define el valor de la propiedad cuentaBancaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaBancaria(String value) {
        this.cuentaBancaria = value;
    }

    /**
     * Obtiene el valor de la propiedad salarioBaseCotApor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalarioBaseCotApor() {
        return salarioBaseCotApor;
    }

    /**
     * Define el valor de la propiedad salarioBaseCotApor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalarioBaseCotApor(String value) {
        this.salarioBaseCotApor = value;
    }

    /**
     * Obtiene el valor de la propiedad salarioDiarioIntegrado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalarioDiarioIntegrado() {
        return salarioDiarioIntegrado;
    }

    /**
     * Define el valor de la propiedad salarioDiarioIntegrado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalarioDiarioIntegrado(String value) {
        this.salarioDiarioIntegrado = value;
    }

    /**
     * Obtiene el valor de la propiedad claveEntFed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveEntFed() {
        return claveEntFed;
    }

    /**
     * Define el valor de la propiedad claveEntFed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveEntFed(String value) {
        this.claveEntFed = value;
    }

}
