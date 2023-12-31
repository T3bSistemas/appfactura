
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TimbradoPlusNominaRequest33 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TimbradoPlusNominaRequest33"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Datosnomina" type="{http://tempuri.org/}DatosNominaTimbrado33" minOccurs="0"/&gt;
 *         &lt;element name="Emisornomina" type="{http://tempuri.org/}EmisorNominaTimbrado33" minOccurs="0"/&gt;
 *         &lt;element name="CFDIRelacion" type="{http://tempuri.org/}CFDISRelacionados" minOccurs="0"/&gt;
 *         &lt;element name="empleado" type="{http://tempuri.org/}EmpleadoTimbrado33" minOccurs="0"/&gt;
 *         &lt;element name="concepto" type="{http://tempuri.org/}ConceptoNomina33" minOccurs="0"/&gt;
 *         &lt;element name="Percepciones" type="{http://tempuri.org/}Percepciones33" minOccurs="0"/&gt;
 *         &lt;element name="Deducciones" type="{http://tempuri.org/}Deducciones33" minOccurs="0"/&gt;
 *         &lt;element name="OtroPago" type="{http://tempuri.org/}OtrosPagos33" minOccurs="0"/&gt;
 *         &lt;element name="Incapacidades" type="{http://tempuri.org/}Incapacidades33" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimbradoPlusNominaRequest33", propOrder = {
    "usuario",
    "contrasena",
    "datosnomina",
    "emisornomina",
    "cfdiRelacion",
    "empleado",
    "concepto",
    "percepciones",
    "deducciones",
    "otroPago",
    "incapacidades"
})
public class TimbradoPlusNominaRequest33 {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Contrasena")
    protected String contrasena;
    @XmlElement(name = "Datosnomina")
    protected DatosNominaTimbrado33 datosnomina;
    @XmlElement(name = "Emisornomina")
    protected EmisorNominaTimbrado33 emisornomina;
    @XmlElement(name = "CFDIRelacion")
    protected CFDISRelacionados cfdiRelacion;
    protected EmpleadoTimbrado33 empleado;
    protected ConceptoNomina33 concepto;
    @XmlElement(name = "Percepciones")
    protected Percepciones33 percepciones;
    @XmlElement(name = "Deducciones")
    protected Deducciones33 deducciones;
    @XmlElement(name = "OtroPago")
    protected OtrosPagos33 otroPago;
    @XmlElement(name = "Incapacidades")
    protected Incapacidades33 incapacidades;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Define el valor de la propiedad contrasena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasena(String value) {
        this.contrasena = value;
    }

    /**
     * Obtiene el valor de la propiedad datosnomina.
     * 
     * @return
     *     possible object is
     *     {@link DatosNominaTimbrado33 }
     *     
     */
    public DatosNominaTimbrado33 getDatosnomina() {
        return datosnomina;
    }

    /**
     * Define el valor de la propiedad datosnomina.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosNominaTimbrado33 }
     *     
     */
    public void setDatosnomina(DatosNominaTimbrado33 value) {
        this.datosnomina = value;
    }

    /**
     * Obtiene el valor de la propiedad emisornomina.
     * 
     * @return
     *     possible object is
     *     {@link EmisorNominaTimbrado33 }
     *     
     */
    public EmisorNominaTimbrado33 getEmisornomina() {
        return emisornomina;
    }

    /**
     * Define el valor de la propiedad emisornomina.
     * 
     * @param value
     *     allowed object is
     *     {@link EmisorNominaTimbrado33 }
     *     
     */
    public void setEmisornomina(EmisorNominaTimbrado33 value) {
        this.emisornomina = value;
    }

    /**
     * Obtiene el valor de la propiedad cfdiRelacion.
     * 
     * @return
     *     possible object is
     *     {@link CFDISRelacionados }
     *     
     */
    public CFDISRelacionados getCFDIRelacion() {
        return cfdiRelacion;
    }

    /**
     * Define el valor de la propiedad cfdiRelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link CFDISRelacionados }
     *     
     */
    public void setCFDIRelacion(CFDISRelacionados value) {
        this.cfdiRelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad empleado.
     * 
     * @return
     *     possible object is
     *     {@link EmpleadoTimbrado33 }
     *     
     */
    public EmpleadoTimbrado33 getEmpleado() {
        return empleado;
    }

    /**
     * Define el valor de la propiedad empleado.
     * 
     * @param value
     *     allowed object is
     *     {@link EmpleadoTimbrado33 }
     *     
     */
    public void setEmpleado(EmpleadoTimbrado33 value) {
        this.empleado = value;
    }

    /**
     * Obtiene el valor de la propiedad concepto.
     * 
     * @return
     *     possible object is
     *     {@link ConceptoNomina33 }
     *     
     */
    public ConceptoNomina33 getConcepto() {
        return concepto;
    }

    /**
     * Define el valor de la propiedad concepto.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptoNomina33 }
     *     
     */
    public void setConcepto(ConceptoNomina33 value) {
        this.concepto = value;
    }

    /**
     * Obtiene el valor de la propiedad percepciones.
     * 
     * @return
     *     possible object is
     *     {@link Percepciones33 }
     *     
     */
    public Percepciones33 getPercepciones() {
        return percepciones;
    }

    /**
     * Define el valor de la propiedad percepciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Percepciones33 }
     *     
     */
    public void setPercepciones(Percepciones33 value) {
        this.percepciones = value;
    }

    /**
     * Obtiene el valor de la propiedad deducciones.
     * 
     * @return
     *     possible object is
     *     {@link Deducciones33 }
     *     
     */
    public Deducciones33 getDeducciones() {
        return deducciones;
    }

    /**
     * Define el valor de la propiedad deducciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Deducciones33 }
     *     
     */
    public void setDeducciones(Deducciones33 value) {
        this.deducciones = value;
    }

    /**
     * Obtiene el valor de la propiedad otroPago.
     * 
     * @return
     *     possible object is
     *     {@link OtrosPagos33 }
     *     
     */
    public OtrosPagos33 getOtroPago() {
        return otroPago;
    }

    /**
     * Define el valor de la propiedad otroPago.
     * 
     * @param value
     *     allowed object is
     *     {@link OtrosPagos33 }
     *     
     */
    public void setOtroPago(OtrosPagos33 value) {
        this.otroPago = value;
    }

    /**
     * Obtiene el valor de la propiedad incapacidades.
     * 
     * @return
     *     possible object is
     *     {@link Incapacidades33 }
     *     
     */
    public Incapacidades33 getIncapacidades() {
        return incapacidades;
    }

    /**
     * Define el valor de la propiedad incapacidades.
     * 
     * @param value
     *     allowed object is
     *     {@link Incapacidades33 }
     *     
     */
    public void setIncapacidades(Incapacidades33 value) {
        this.incapacidades = value;
    }

}
