
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para EmpleadoCFDI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EmpleadoCFDI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Curp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contacto1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contacto2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefono1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefono2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoCliente2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumSeguridadSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaInicioRelLaboral" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Antiguedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sindicalizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoJornada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoRegimen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumEmpleado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Puesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RiesgoPuesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PeriodicidadPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Banco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CuentaBancaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalarioBaseCotApor" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="SalarioDiarioIntegrado" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ClaveEntFed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubContratacion" type="{http://tempuri.org/}ArrayOfSubContratacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpleadoCFDI", propOrder = {
    "rfc",
    "nombre",
    "curp",
    "noCliente",
    "email",
    "contacto1",
    "contacto2",
    "telefono1",
    "telefono2",
    "noCliente2",
    "numSeguridadSocial",
    "fechaInicioRelLaboral",
    "antiguedad",
    "tipoContrato",
    "sindicalizado",
    "tipoJornada",
    "tipoRegimen",
    "numEmpleado",
    "departamento",
    "puesto",
    "riesgoPuesto",
    "periodicidadPago",
    "banco",
    "cuentaBancaria",
    "salarioBaseCotApor",
    "salarioDiarioIntegrado",
    "claveEntFed",
    "subContratacion"
})
public class EmpleadoCFDI {

    @XmlElement(name = "RFC")
    protected String rfc;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "Curp")
    protected String curp;
    @XmlElement(name = "NoCliente")
    protected String noCliente;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Contacto1")
    protected String contacto1;
    @XmlElement(name = "Contacto2")
    protected String contacto2;
    @XmlElement(name = "Telefono1")
    protected String telefono1;
    @XmlElement(name = "Telefono2")
    protected String telefono2;
    @XmlElement(name = "NoCliente2")
    protected String noCliente2;
    @XmlElement(name = "NumSeguridadSocial")
    protected String numSeguridadSocial;
    @XmlElement(name = "FechaInicioRelLaboral", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicioRelLaboral;
    @XmlElement(name = "Antiguedad")
    protected String antiguedad;
    @XmlElement(name = "TipoContrato")
    protected String tipoContrato;
    @XmlElement(name = "Sindicalizado")
    protected String sindicalizado;
    @XmlElement(name = "TipoJornada")
    protected String tipoJornada;
    @XmlElement(name = "TipoRegimen")
    protected String tipoRegimen;
    @XmlElement(name = "NumEmpleado")
    protected String numEmpleado;
    @XmlElement(name = "Departamento")
    protected String departamento;
    @XmlElement(name = "Puesto")
    protected String puesto;
    @XmlElement(name = "RiesgoPuesto")
    protected String riesgoPuesto;
    @XmlElement(name = "PeriodicidadPago")
    protected String periodicidadPago;
    @XmlElement(name = "Banco")
    protected String banco;
    @XmlElement(name = "CuentaBancaria")
    protected String cuentaBancaria;
    @XmlElement(name = "SalarioBaseCotApor")
    protected double salarioBaseCotApor;
    @XmlElement(name = "SalarioDiarioIntegrado")
    protected double salarioDiarioIntegrado;
    @XmlElement(name = "ClaveEntFed")
    protected String claveEntFed;
    @XmlElement(name = "SubContratacion")
    protected ArrayOfSubContratacion subContratacion;

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFC() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFC(String value) {
        this.rfc = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
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
     * Obtiene el valor de la propiedad noCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCliente() {
        return noCliente;
    }

    /**
     * Define el valor de la propiedad noCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCliente(String value) {
        this.noCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad contacto1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacto1() {
        return contacto1;
    }

    /**
     * Define el valor de la propiedad contacto1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacto1(String value) {
        this.contacto1 = value;
    }

    /**
     * Obtiene el valor de la propiedad contacto2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacto2() {
        return contacto2;
    }

    /**
     * Define el valor de la propiedad contacto2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacto2(String value) {
        this.contacto2 = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono1() {
        return telefono1;
    }

    /**
     * Define el valor de la propiedad telefono1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono1(String value) {
        this.telefono1 = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono2() {
        return telefono2;
    }

    /**
     * Define el valor de la propiedad telefono2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono2(String value) {
        this.telefono2 = value;
    }

    /**
     * Obtiene el valor de la propiedad noCliente2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCliente2() {
        return noCliente2;
    }

    /**
     * Define el valor de la propiedad noCliente2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCliente2(String value) {
        this.noCliente2 = value;
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
     * Obtiene el valor de la propiedad antiguedad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntiguedad() {
        return antiguedad;
    }

    /**
     * Define el valor de la propiedad antiguedad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntiguedad(String value) {
        this.antiguedad = value;
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
     */
    public double getSalarioBaseCotApor() {
        return salarioBaseCotApor;
    }

    /**
     * Define el valor de la propiedad salarioBaseCotApor.
     * 
     */
    public void setSalarioBaseCotApor(double value) {
        this.salarioBaseCotApor = value;
    }

    /**
     * Obtiene el valor de la propiedad salarioDiarioIntegrado.
     * 
     */
    public double getSalarioDiarioIntegrado() {
        return salarioDiarioIntegrado;
    }

    /**
     * Define el valor de la propiedad salarioDiarioIntegrado.
     * 
     */
    public void setSalarioDiarioIntegrado(double value) {
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

    /**
     * Obtiene el valor de la propiedad subContratacion.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubContratacion }
     *     
     */
    public ArrayOfSubContratacion getSubContratacion() {
        return subContratacion;
    }

    /**
     * Define el valor de la propiedad subContratacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubContratacion }
     *     
     */
    public void setSubContratacion(ArrayOfSubContratacion value) {
        this.subContratacion = value;
    }

}
