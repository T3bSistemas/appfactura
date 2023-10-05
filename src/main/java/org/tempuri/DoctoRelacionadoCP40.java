
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DoctoRelacionadoCP40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DoctoRelacionadoCP40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MonedaDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquivalenciaDR" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="NumParcialidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ImpSaldoAnt" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ImpPagado" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ImpSaldoInsoluto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ObjetoImpDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalTraslados" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TotalRetenidos" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ImpuestosDR" type="{http://tempuri.org/}ImpuestosDR40" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoctoRelacionadoCP40", propOrder = {
    "idDocumento",
    "serie",
    "folio",
    "monedaDR",
    "equivalenciaDR",
    "numParcialidad",
    "impSaldoAnt",
    "impPagado",
    "impSaldoInsoluto",
    "objetoImpDR",
    "totalTraslados",
    "totalRetenidos",
    "impuestosDR"
})
public class DoctoRelacionadoCP40 {

    @XmlElement(name = "IdDocumento")
    protected String idDocumento;
    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "Folio")
    protected String folio;
    @XmlElement(name = "MonedaDR")
    protected String monedaDR;
    @XmlElement(name = "EquivalenciaDR")
    protected double equivalenciaDR;
    @XmlElement(name = "NumParcialidad")
    protected int numParcialidad;
    @XmlElement(name = "ImpSaldoAnt")
    protected double impSaldoAnt;
    @XmlElement(name = "ImpPagado")
    protected double impPagado;
    @XmlElement(name = "ImpSaldoInsoluto")
    protected double impSaldoInsoluto;
    @XmlElement(name = "ObjetoImpDR")
    protected String objetoImpDR;
    @XmlElement(name = "TotalTraslados")
    protected double totalTraslados;
    @XmlElement(name = "TotalRetenidos")
    protected double totalRetenidos;
    @XmlElement(name = "ImpuestosDR")
    protected ImpuestosDR40 impuestosDR;

    /**
     * Obtiene el valor de la propiedad idDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumento() {
        return idDocumento;
    }

    /**
     * Define el valor de la propiedad idDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumento(String value) {
        this.idDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaDR() {
        return monedaDR;
    }

    /**
     * Define el valor de la propiedad monedaDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaDR(String value) {
        this.monedaDR = value;
    }

    /**
     * Obtiene el valor de la propiedad equivalenciaDR.
     * 
     */
    public double getEquivalenciaDR() {
        return equivalenciaDR;
    }

    /**
     * Define el valor de la propiedad equivalenciaDR.
     * 
     */
    public void setEquivalenciaDR(double value) {
        this.equivalenciaDR = value;
    }

    /**
     * Obtiene el valor de la propiedad numParcialidad.
     * 
     */
    public int getNumParcialidad() {
        return numParcialidad;
    }

    /**
     * Define el valor de la propiedad numParcialidad.
     * 
     */
    public void setNumParcialidad(int value) {
        this.numParcialidad = value;
    }

    /**
     * Obtiene el valor de la propiedad impSaldoAnt.
     * 
     */
    public double getImpSaldoAnt() {
        return impSaldoAnt;
    }

    /**
     * Define el valor de la propiedad impSaldoAnt.
     * 
     */
    public void setImpSaldoAnt(double value) {
        this.impSaldoAnt = value;
    }

    /**
     * Obtiene el valor de la propiedad impPagado.
     * 
     */
    public double getImpPagado() {
        return impPagado;
    }

    /**
     * Define el valor de la propiedad impPagado.
     * 
     */
    public void setImpPagado(double value) {
        this.impPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad impSaldoInsoluto.
     * 
     */
    public double getImpSaldoInsoluto() {
        return impSaldoInsoluto;
    }

    /**
     * Define el valor de la propiedad impSaldoInsoluto.
     * 
     */
    public void setImpSaldoInsoluto(double value) {
        this.impSaldoInsoluto = value;
    }

    /**
     * Obtiene el valor de la propiedad objetoImpDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjetoImpDR() {
        return objetoImpDR;
    }

    /**
     * Define el valor de la propiedad objetoImpDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjetoImpDR(String value) {
        this.objetoImpDR = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTraslados.
     * 
     */
    public double getTotalTraslados() {
        return totalTraslados;
    }

    /**
     * Define el valor de la propiedad totalTraslados.
     * 
     */
    public void setTotalTraslados(double value) {
        this.totalTraslados = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRetenidos.
     * 
     */
    public double getTotalRetenidos() {
        return totalRetenidos;
    }

    /**
     * Define el valor de la propiedad totalRetenidos.
     * 
     */
    public void setTotalRetenidos(double value) {
        this.totalRetenidos = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestosDR.
     * 
     * @return
     *     possible object is
     *     {@link ImpuestosDR40 }
     *     
     */
    public ImpuestosDR40 getImpuestosDR() {
        return impuestosDR;
    }

    /**
     * Define el valor de la propiedad impuestosDR.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpuestosDR40 }
     *     
     */
    public void setImpuestosDR(ImpuestosDR40 value) {
        this.impuestosDR = value;
    }

}
