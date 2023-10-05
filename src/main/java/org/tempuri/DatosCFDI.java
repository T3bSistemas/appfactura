
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosCFDI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosCFDI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}DatosCFDITimbradoPlus"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatosAdicionales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MensajePDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaExpedicionBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemisionBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessLocationBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuslodescripBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefTypeBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FiscalYearBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetPriceBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemperatureBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddendaBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CostcoBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RFCIBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RAZONIBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REGIMENIBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaPedimentoBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlantaBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingConditionBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrganizationBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DecimalesOfficeMax" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosCFDI", propOrder = {
    "datosAdicionales",
    "mensajePDF",
    "emailMensaje",
    "fechaExpedicionBP",
    "remisionBP",
    "businessLocationBP",
    "buslodescripBP",
    "companyBP",
    "refTypeBP",
    "fiscalYearBP",
    "streetPriceBP",
    "temperatureBP",
    "addendaBP",
    "costcoBP",
    "rfciber",
    "razoniber",
    "regimeniber",
    "fechaPedimentoBP",
    "plantaBP",
    "shippingConditionBP",
    "salesOrganizationBP",
    "transaccion",
    "decimalesOfficeMax"
})
public class DatosCFDI
    extends DatosCFDITimbradoPlus
{

    @XmlElement(name = "DatosAdicionales")
    protected String datosAdicionales;
    @XmlElement(name = "MensajePDF")
    protected String mensajePDF;
    @XmlElement(name = "EmailMensaje")
    protected String emailMensaje;
    @XmlElement(name = "FechaExpedicionBP")
    protected String fechaExpedicionBP;
    @XmlElement(name = "RemisionBP")
    protected String remisionBP;
    @XmlElement(name = "BusinessLocationBP")
    protected String businessLocationBP;
    @XmlElement(name = "BuslodescripBP")
    protected String buslodescripBP;
    @XmlElement(name = "CompanyBP")
    protected String companyBP;
    @XmlElement(name = "RefTypeBP")
    protected String refTypeBP;
    @XmlElement(name = "FiscalYearBP")
    protected String fiscalYearBP;
    @XmlElement(name = "StreetPriceBP")
    protected String streetPriceBP;
    @XmlElement(name = "TemperatureBP")
    protected String temperatureBP;
    @XmlElement(name = "AddendaBP")
    protected String addendaBP;
    @XmlElement(name = "CostcoBP")
    protected String costcoBP;
    @XmlElement(name = "RFCIBER")
    protected String rfciber;
    @XmlElement(name = "RAZONIBER")
    protected String razoniber;
    @XmlElement(name = "REGIMENIBER")
    protected String regimeniber;
    @XmlElement(name = "FechaPedimentoBP")
    protected String fechaPedimentoBP;
    @XmlElement(name = "PlantaBP")
    protected String plantaBP;
    @XmlElement(name = "ShippingConditionBP")
    protected String shippingConditionBP;
    @XmlElement(name = "SalesOrganizationBP")
    protected String salesOrganizationBP;
    @XmlElement(name = "Transaccion")
    protected String transaccion;
    @XmlElement(name = "DecimalesOfficeMax")
    protected boolean decimalesOfficeMax;

    /**
     * Obtiene el valor de la propiedad datosAdicionales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosAdicionales() {
        return datosAdicionales;
    }

    /**
     * Define el valor de la propiedad datosAdicionales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosAdicionales(String value) {
        this.datosAdicionales = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajePDF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajePDF() {
        return mensajePDF;
    }

    /**
     * Define el valor de la propiedad mensajePDF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajePDF(String value) {
        this.mensajePDF = value;
    }

    /**
     * Obtiene el valor de la propiedad emailMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailMensaje() {
        return emailMensaje;
    }

    /**
     * Define el valor de la propiedad emailMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailMensaje(String value) {
        this.emailMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpedicionBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicionBP() {
        return fechaExpedicionBP;
    }

    /**
     * Define el valor de la propiedad fechaExpedicionBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicionBP(String value) {
        this.fechaExpedicionBP = value;
    }

    /**
     * Obtiene el valor de la propiedad remisionBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemisionBP() {
        return remisionBP;
    }

    /**
     * Define el valor de la propiedad remisionBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemisionBP(String value) {
        this.remisionBP = value;
    }

    /**
     * Obtiene el valor de la propiedad businessLocationBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessLocationBP() {
        return businessLocationBP;
    }

    /**
     * Define el valor de la propiedad businessLocationBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessLocationBP(String value) {
        this.businessLocationBP = value;
    }

    /**
     * Obtiene el valor de la propiedad buslodescripBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuslodescripBP() {
        return buslodescripBP;
    }

    /**
     * Define el valor de la propiedad buslodescripBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuslodescripBP(String value) {
        this.buslodescripBP = value;
    }

    /**
     * Obtiene el valor de la propiedad companyBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyBP() {
        return companyBP;
    }

    /**
     * Define el valor de la propiedad companyBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyBP(String value) {
        this.companyBP = value;
    }

    /**
     * Obtiene el valor de la propiedad refTypeBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefTypeBP() {
        return refTypeBP;
    }

    /**
     * Define el valor de la propiedad refTypeBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefTypeBP(String value) {
        this.refTypeBP = value;
    }

    /**
     * Obtiene el valor de la propiedad fiscalYearBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalYearBP() {
        return fiscalYearBP;
    }

    /**
     * Define el valor de la propiedad fiscalYearBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalYearBP(String value) {
        this.fiscalYearBP = value;
    }

    /**
     * Obtiene el valor de la propiedad streetPriceBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetPriceBP() {
        return streetPriceBP;
    }

    /**
     * Define el valor de la propiedad streetPriceBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetPriceBP(String value) {
        this.streetPriceBP = value;
    }

    /**
     * Obtiene el valor de la propiedad temperatureBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperatureBP() {
        return temperatureBP;
    }

    /**
     * Define el valor de la propiedad temperatureBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperatureBP(String value) {
        this.temperatureBP = value;
    }

    /**
     * Obtiene el valor de la propiedad addendaBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddendaBP() {
        return addendaBP;
    }

    /**
     * Define el valor de la propiedad addendaBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddendaBP(String value) {
        this.addendaBP = value;
    }

    /**
     * Obtiene el valor de la propiedad costcoBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostcoBP() {
        return costcoBP;
    }

    /**
     * Define el valor de la propiedad costcoBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostcoBP(String value) {
        this.costcoBP = value;
    }

    /**
     * Obtiene el valor de la propiedad rfciber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCIBER() {
        return rfciber;
    }

    /**
     * Define el valor de la propiedad rfciber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCIBER(String value) {
        this.rfciber = value;
    }

    /**
     * Obtiene el valor de la propiedad razoniber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAZONIBER() {
        return razoniber;
    }

    /**
     * Define el valor de la propiedad razoniber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAZONIBER(String value) {
        this.razoniber = value;
    }

    /**
     * Obtiene el valor de la propiedad regimeniber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGIMENIBER() {
        return regimeniber;
    }

    /**
     * Define el valor de la propiedad regimeniber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGIMENIBER(String value) {
        this.regimeniber = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPedimentoBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPedimentoBP() {
        return fechaPedimentoBP;
    }

    /**
     * Define el valor de la propiedad fechaPedimentoBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPedimentoBP(String value) {
        this.fechaPedimentoBP = value;
    }

    /**
     * Obtiene el valor de la propiedad plantaBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantaBP() {
        return plantaBP;
    }

    /**
     * Define el valor de la propiedad plantaBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantaBP(String value) {
        this.plantaBP = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingConditionBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingConditionBP() {
        return shippingConditionBP;
    }

    /**
     * Define el valor de la propiedad shippingConditionBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingConditionBP(String value) {
        this.shippingConditionBP = value;
    }

    /**
     * Obtiene el valor de la propiedad salesOrganizationBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrganizationBP() {
        return salesOrganizationBP;
    }

    /**
     * Define el valor de la propiedad salesOrganizationBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrganizationBP(String value) {
        this.salesOrganizationBP = value;
    }

    /**
     * Obtiene el valor de la propiedad transaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransaccion() {
        return transaccion;
    }

    /**
     * Define el valor de la propiedad transaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransaccion(String value) {
        this.transaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad decimalesOfficeMax.
     * 
     */
    public boolean isDecimalesOfficeMax() {
        return decimalesOfficeMax;
    }

    /**
     * Define el valor de la propiedad decimalesOfficeMax.
     * 
     */
    public void setDecimalesOfficeMax(boolean value) {
        this.decimalesOfficeMax = value;
    }

}
