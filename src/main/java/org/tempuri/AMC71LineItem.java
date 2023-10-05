
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AMC7_1_LineItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AMC7_1_LineItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeItemIdentification_gtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alternateTradeItemIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemDescriptionInformation_longText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoicedQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aditionalQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuantityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grossPrice_Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="netPrice_Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalInformation_referenceIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemTaxInformation_taxTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemTaxInformation_tradeItemTaxAmount_taxPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeItemTaxInformation_tradeItemTaxAmount_taxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalLineAmount_grossAmount_Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalLineAmount_netAmount_Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMC7_1_LineItem", propOrder = {
    "tradeItemIdentificationGtin",
    "alternateTradeItemIdentification",
    "tradeItemDescriptionInformationLongText",
    "unitOfMeasure",
    "invoicedQuantity",
    "aditionalQuantity",
    "quantityType",
    "grossPriceAmount",
    "netPriceAmount",
    "additionalInformationReferenceIdentification",
    "tradeItemTaxInformationTaxTypeDescription",
    "tradeItemTaxInformationTradeItemTaxAmountTaxPercentage",
    "tradeItemTaxInformationTradeItemTaxAmountTaxAmount",
    "totalLineAmountGrossAmountAmount",
    "totalLineAmountNetAmountAmount"
})
@XmlSeeAlso({
    CoppelLineItem.class
})
public class AMC71LineItem {

    @XmlElement(name = "tradeItemIdentification_gtin")
    protected String tradeItemIdentificationGtin;
    protected String alternateTradeItemIdentification;
    @XmlElement(name = "tradeItemDescriptionInformation_longText")
    protected String tradeItemDescriptionInformationLongText;
    protected String unitOfMeasure;
    protected String invoicedQuantity;
    protected String aditionalQuantity;
    @XmlElement(name = "QuantityType")
    protected String quantityType;
    @XmlElement(name = "grossPrice_Amount")
    protected String grossPriceAmount;
    @XmlElement(name = "netPrice_Amount")
    protected String netPriceAmount;
    @XmlElement(name = "AdditionalInformation_referenceIdentification")
    protected String additionalInformationReferenceIdentification;
    @XmlElement(name = "tradeItemTaxInformation_taxTypeDescription")
    protected String tradeItemTaxInformationTaxTypeDescription;
    @XmlElement(name = "tradeItemTaxInformation_tradeItemTaxAmount_taxPercentage")
    protected String tradeItemTaxInformationTradeItemTaxAmountTaxPercentage;
    @XmlElement(name = "tradeItemTaxInformation_tradeItemTaxAmount_taxAmount")
    protected String tradeItemTaxInformationTradeItemTaxAmountTaxAmount;
    @XmlElement(name = "totalLineAmount_grossAmount_Amount")
    protected String totalLineAmountGrossAmountAmount;
    @XmlElement(name = "totalLineAmount_netAmount_Amount")
    protected String totalLineAmountNetAmountAmount;

    /**
     * Obtiene el valor de la propiedad tradeItemIdentificationGtin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeItemIdentificationGtin() {
        return tradeItemIdentificationGtin;
    }

    /**
     * Define el valor de la propiedad tradeItemIdentificationGtin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeItemIdentificationGtin(String value) {
        this.tradeItemIdentificationGtin = value;
    }

    /**
     * Obtiene el valor de la propiedad alternateTradeItemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTradeItemIdentification() {
        return alternateTradeItemIdentification;
    }

    /**
     * Define el valor de la propiedad alternateTradeItemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTradeItemIdentification(String value) {
        this.alternateTradeItemIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad tradeItemDescriptionInformationLongText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeItemDescriptionInformationLongText() {
        return tradeItemDescriptionInformationLongText;
    }

    /**
     * Define el valor de la propiedad tradeItemDescriptionInformationLongText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeItemDescriptionInformationLongText(String value) {
        this.tradeItemDescriptionInformationLongText = value;
    }

    /**
     * Obtiene el valor de la propiedad unitOfMeasure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Define el valor de la propiedad unitOfMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad invoicedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicedQuantity() {
        return invoicedQuantity;
    }

    /**
     * Define el valor de la propiedad invoicedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicedQuantity(String value) {
        this.invoicedQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad aditionalQuantity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAditionalQuantity() {
        return aditionalQuantity;
    }

    /**
     * Define el valor de la propiedad aditionalQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAditionalQuantity(String value) {
        this.aditionalQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad quantityType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityType() {
        return quantityType;
    }

    /**
     * Define el valor de la propiedad quantityType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityType(String value) {
        this.quantityType = value;
    }

    /**
     * Obtiene el valor de la propiedad grossPriceAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossPriceAmount() {
        return grossPriceAmount;
    }

    /**
     * Define el valor de la propiedad grossPriceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossPriceAmount(String value) {
        this.grossPriceAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad netPriceAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetPriceAmount() {
        return netPriceAmount;
    }

    /**
     * Define el valor de la propiedad netPriceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetPriceAmount(String value) {
        this.netPriceAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalInformationReferenceIdentification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformationReferenceIdentification() {
        return additionalInformationReferenceIdentification;
    }

    /**
     * Define el valor de la propiedad additionalInformationReferenceIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInformationReferenceIdentification(String value) {
        this.additionalInformationReferenceIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad tradeItemTaxInformationTaxTypeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeItemTaxInformationTaxTypeDescription() {
        return tradeItemTaxInformationTaxTypeDescription;
    }

    /**
     * Define el valor de la propiedad tradeItemTaxInformationTaxTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeItemTaxInformationTaxTypeDescription(String value) {
        this.tradeItemTaxInformationTaxTypeDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad tradeItemTaxInformationTradeItemTaxAmountTaxPercentage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeItemTaxInformationTradeItemTaxAmountTaxPercentage() {
        return tradeItemTaxInformationTradeItemTaxAmountTaxPercentage;
    }

    /**
     * Define el valor de la propiedad tradeItemTaxInformationTradeItemTaxAmountTaxPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeItemTaxInformationTradeItemTaxAmountTaxPercentage(String value) {
        this.tradeItemTaxInformationTradeItemTaxAmountTaxPercentage = value;
    }

    /**
     * Obtiene el valor de la propiedad tradeItemTaxInformationTradeItemTaxAmountTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeItemTaxInformationTradeItemTaxAmountTaxAmount() {
        return tradeItemTaxInformationTradeItemTaxAmountTaxAmount;
    }

    /**
     * Define el valor de la propiedad tradeItemTaxInformationTradeItemTaxAmountTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeItemTaxInformationTradeItemTaxAmountTaxAmount(String value) {
        this.tradeItemTaxInformationTradeItemTaxAmountTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalLineAmountGrossAmountAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalLineAmountGrossAmountAmount() {
        return totalLineAmountGrossAmountAmount;
    }

    /**
     * Define el valor de la propiedad totalLineAmountGrossAmountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalLineAmountGrossAmountAmount(String value) {
        this.totalLineAmountGrossAmountAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalLineAmountNetAmountAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalLineAmountNetAmountAmount() {
        return totalLineAmountNetAmountAmount;
    }

    /**
     * Define el valor de la propiedad totalLineAmountNetAmountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalLineAmountNetAmountAmount(String value) {
        this.totalLineAmountNetAmountAmount = value;
    }

}
