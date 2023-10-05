
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ComplementosRetenciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComplementosRetenciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enajenaciondeAcciones" type="{http://tempuri.org/}EnajenacionDeAcciones" minOccurs="0"/&gt;
 *         &lt;element name="dividendos" type="{http://tempuri.org/}Dividendos" minOccurs="0"/&gt;
 *         &lt;element name="intereses" type="{http://tempuri.org/}Intereses" minOccurs="0"/&gt;
 *         &lt;element name="ArrendamientoenFideicomiso" type="{http://tempuri.org/}ArrendamientoEnFideicomiso" minOccurs="0"/&gt;
 *         &lt;element name="PagosaExtranjeros" type="{http://tempuri.org/}PagosAExtranjeros" minOccurs="0"/&gt;
 *         &lt;element name="premios" type="{http://tempuri.org/}Premios" minOccurs="0"/&gt;
 *         &lt;element name="fideicomisoNoEmpresarial" type="{http://tempuri.org/}FideicomisoNoEmpresarial" minOccurs="0"/&gt;
 *         &lt;element name="planesdeRetiro" type="{http://tempuri.org/}PlanesDeRetiro" minOccurs="0"/&gt;
 *         &lt;element name="interesesHipotecarios" type="{http://tempuri.org/}InteresesHipotecarios" minOccurs="0"/&gt;
 *         &lt;element name="operacionesDerivados" type="{http://tempuri.org/}OperacionesConDerivados" minOccurs="0"/&gt;
 *         &lt;element name="sectorFinanciero" type="{http://tempuri.org/}SectorFinanciero" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplementosRetenciones", propOrder = {
    "enajenaciondeAcciones",
    "dividendos",
    "intereses",
    "arrendamientoenFideicomiso",
    "pagosaExtranjeros",
    "premios",
    "fideicomisoNoEmpresarial",
    "planesdeRetiro",
    "interesesHipotecarios",
    "operacionesDerivados",
    "sectorFinanciero"
})
public class ComplementosRetenciones {

    protected EnajenacionDeAcciones enajenaciondeAcciones;
    protected Dividendos dividendos;
    protected Intereses intereses;
    @XmlElement(name = "ArrendamientoenFideicomiso")
    protected ArrendamientoEnFideicomiso arrendamientoenFideicomiso;
    @XmlElement(name = "PagosaExtranjeros")
    protected PagosAExtranjeros pagosaExtranjeros;
    protected Premios premios;
    protected FideicomisoNoEmpresarial fideicomisoNoEmpresarial;
    protected PlanesDeRetiro planesdeRetiro;
    protected InteresesHipotecarios interesesHipotecarios;
    protected OperacionesConDerivados operacionesDerivados;
    protected SectorFinanciero sectorFinanciero;

    /**
     * Obtiene el valor de la propiedad enajenaciondeAcciones.
     * 
     * @return
     *     possible object is
     *     {@link EnajenacionDeAcciones }
     *     
     */
    public EnajenacionDeAcciones getEnajenaciondeAcciones() {
        return enajenaciondeAcciones;
    }

    /**
     * Define el valor de la propiedad enajenaciondeAcciones.
     * 
     * @param value
     *     allowed object is
     *     {@link EnajenacionDeAcciones }
     *     
     */
    public void setEnajenaciondeAcciones(EnajenacionDeAcciones value) {
        this.enajenaciondeAcciones = value;
    }

    /**
     * Obtiene el valor de la propiedad dividendos.
     * 
     * @return
     *     possible object is
     *     {@link Dividendos }
     *     
     */
    public Dividendos getDividendos() {
        return dividendos;
    }

    /**
     * Define el valor de la propiedad dividendos.
     * 
     * @param value
     *     allowed object is
     *     {@link Dividendos }
     *     
     */
    public void setDividendos(Dividendos value) {
        this.dividendos = value;
    }

    /**
     * Obtiene el valor de la propiedad intereses.
     * 
     * @return
     *     possible object is
     *     {@link Intereses }
     *     
     */
    public Intereses getIntereses() {
        return intereses;
    }

    /**
     * Define el valor de la propiedad intereses.
     * 
     * @param value
     *     allowed object is
     *     {@link Intereses }
     *     
     */
    public void setIntereses(Intereses value) {
        this.intereses = value;
    }

    /**
     * Obtiene el valor de la propiedad arrendamientoenFideicomiso.
     * 
     * @return
     *     possible object is
     *     {@link ArrendamientoEnFideicomiso }
     *     
     */
    public ArrendamientoEnFideicomiso getArrendamientoenFideicomiso() {
        return arrendamientoenFideicomiso;
    }

    /**
     * Define el valor de la propiedad arrendamientoenFideicomiso.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrendamientoEnFideicomiso }
     *     
     */
    public void setArrendamientoenFideicomiso(ArrendamientoEnFideicomiso value) {
        this.arrendamientoenFideicomiso = value;
    }

    /**
     * Obtiene el valor de la propiedad pagosaExtranjeros.
     * 
     * @return
     *     possible object is
     *     {@link PagosAExtranjeros }
     *     
     */
    public PagosAExtranjeros getPagosaExtranjeros() {
        return pagosaExtranjeros;
    }

    /**
     * Define el valor de la propiedad pagosaExtranjeros.
     * 
     * @param value
     *     allowed object is
     *     {@link PagosAExtranjeros }
     *     
     */
    public void setPagosaExtranjeros(PagosAExtranjeros value) {
        this.pagosaExtranjeros = value;
    }

    /**
     * Obtiene el valor de la propiedad premios.
     * 
     * @return
     *     possible object is
     *     {@link Premios }
     *     
     */
    public Premios getPremios() {
        return premios;
    }

    /**
     * Define el valor de la propiedad premios.
     * 
     * @param value
     *     allowed object is
     *     {@link Premios }
     *     
     */
    public void setPremios(Premios value) {
        this.premios = value;
    }

    /**
     * Obtiene el valor de la propiedad fideicomisoNoEmpresarial.
     * 
     * @return
     *     possible object is
     *     {@link FideicomisoNoEmpresarial }
     *     
     */
    public FideicomisoNoEmpresarial getFideicomisoNoEmpresarial() {
        return fideicomisoNoEmpresarial;
    }

    /**
     * Define el valor de la propiedad fideicomisoNoEmpresarial.
     * 
     * @param value
     *     allowed object is
     *     {@link FideicomisoNoEmpresarial }
     *     
     */
    public void setFideicomisoNoEmpresarial(FideicomisoNoEmpresarial value) {
        this.fideicomisoNoEmpresarial = value;
    }

    /**
     * Obtiene el valor de la propiedad planesdeRetiro.
     * 
     * @return
     *     possible object is
     *     {@link PlanesDeRetiro }
     *     
     */
    public PlanesDeRetiro getPlanesdeRetiro() {
        return planesdeRetiro;
    }

    /**
     * Define el valor de la propiedad planesdeRetiro.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanesDeRetiro }
     *     
     */
    public void setPlanesdeRetiro(PlanesDeRetiro value) {
        this.planesdeRetiro = value;
    }

    /**
     * Obtiene el valor de la propiedad interesesHipotecarios.
     * 
     * @return
     *     possible object is
     *     {@link InteresesHipotecarios }
     *     
     */
    public InteresesHipotecarios getInteresesHipotecarios() {
        return interesesHipotecarios;
    }

    /**
     * Define el valor de la propiedad interesesHipotecarios.
     * 
     * @param value
     *     allowed object is
     *     {@link InteresesHipotecarios }
     *     
     */
    public void setInteresesHipotecarios(InteresesHipotecarios value) {
        this.interesesHipotecarios = value;
    }

    /**
     * Obtiene el valor de la propiedad operacionesDerivados.
     * 
     * @return
     *     possible object is
     *     {@link OperacionesConDerivados }
     *     
     */
    public OperacionesConDerivados getOperacionesDerivados() {
        return operacionesDerivados;
    }

    /**
     * Define el valor de la propiedad operacionesDerivados.
     * 
     * @param value
     *     allowed object is
     *     {@link OperacionesConDerivados }
     *     
     */
    public void setOperacionesDerivados(OperacionesConDerivados value) {
        this.operacionesDerivados = value;
    }

    /**
     * Obtiene el valor de la propiedad sectorFinanciero.
     * 
     * @return
     *     possible object is
     *     {@link SectorFinanciero }
     *     
     */
    public SectorFinanciero getSectorFinanciero() {
        return sectorFinanciero;
    }

    /**
     * Define el valor de la propiedad sectorFinanciero.
     * 
     * @param value
     *     allowed object is
     *     {@link SectorFinanciero }
     *     
     */
    public void setSectorFinanciero(SectorFinanciero value) {
        this.sectorFinanciero = value;
    }

}
