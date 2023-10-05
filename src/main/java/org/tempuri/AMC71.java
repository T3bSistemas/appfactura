
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AMC7_1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AMC7_1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uniqueCreatorIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specialInstruction_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specialInstruction_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderIdentification_referenceIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderIdentification_referenceIdentification_ReferenceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyer_gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyer_contactInformation_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seller_gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seller_alternatePartyIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipTo_gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipTo_nameAndAddress_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipTo_nameAndAddress_streetAddressOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipTo_nameAndAddress_city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipTo_nameAndAddress_postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currency_currencyISOCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currency_currencyFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currency_rateOfChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentTerms_value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="allowanceCharge_specialServicesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="allowanceCharge_percentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalAmount_Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalAllowanceCharge_Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="baseAmount_Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tax_taxPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tax_taxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payableAmount_Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddInf" type="{http://tempuri.org/}AMC7_1_AdditionalInformations" minOccurs="0"/&gt;
 *         &lt;element name="LineItems" type="{http://tempuri.org/}AMC7_1_LineItems" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMC7_1", propOrder = {
    "deliveryDate",
    "entityType",
    "uniqueCreatorIdentification",
    "specialInstructionCode",
    "specialInstructionText",
    "orderIdentificationReferenceIdentification",
    "orderIdentificationReferenceIdentificationReferenceDate",
    "buyerGln",
    "buyerContactInformationText",
    "sellerGln",
    "sellerAlternatePartyIdentification",
    "shipToGln",
    "shipToNameAndAddressName",
    "shipToNameAndAddressStreetAddressOne",
    "shipToNameAndAddressCity",
    "shipToNameAndAddressPostalCode",
    "currencyCurrencyISOCode",
    "currencyCurrencyFunction",
    "currencyRateOfChange",
    "paymentTermsValue",
    "allowanceChargeSpecialServicesType",
    "allowanceChargePercentage",
    "totalAmountAmount",
    "totalAllowanceChargeAmount",
    "baseAmountAmount",
    "taxTaxPercentage",
    "taxTaxAmount",
    "payableAmountAmount",
    "addInf",
    "lineItems"
})
@XmlSeeAlso({
    Coppel.class
})
public class AMC71 {

    @XmlElement(name = "DeliveryDate")
    protected String deliveryDate;
    protected String entityType;
    protected String uniqueCreatorIdentification;
    @XmlElement(name = "specialInstruction_code")
    protected String specialInstructionCode;
    @XmlElement(name = "specialInstruction_text")
    protected String specialInstructionText;
    @XmlElement(name = "orderIdentification_referenceIdentification")
    protected String orderIdentificationReferenceIdentification;
    @XmlElement(name = "orderIdentification_referenceIdentification_ReferenceDate")
    protected String orderIdentificationReferenceIdentificationReferenceDate;
    @XmlElement(name = "buyer_gln")
    protected String buyerGln;
    @XmlElement(name = "buyer_contactInformation_text")
    protected String buyerContactInformationText;
    @XmlElement(name = "seller_gln")
    protected String sellerGln;
    @XmlElement(name = "seller_alternatePartyIdentification")
    protected String sellerAlternatePartyIdentification;
    @XmlElement(name = "shipTo_gln")
    protected String shipToGln;
    @XmlElement(name = "shipTo_nameAndAddress_name")
    protected String shipToNameAndAddressName;
    @XmlElement(name = "shipTo_nameAndAddress_streetAddressOne")
    protected String shipToNameAndAddressStreetAddressOne;
    @XmlElement(name = "shipTo_nameAndAddress_city")
    protected String shipToNameAndAddressCity;
    @XmlElement(name = "shipTo_nameAndAddress_postalCode")
    protected String shipToNameAndAddressPostalCode;
    @XmlElement(name = "currency_currencyISOCode")
    protected String currencyCurrencyISOCode;
    @XmlElement(name = "currency_currencyFunction")
    protected String currencyCurrencyFunction;
    @XmlElement(name = "currency_rateOfChange")
    protected String currencyRateOfChange;
    @XmlElement(name = "paymentTerms_value")
    protected String paymentTermsValue;
    @XmlElement(name = "allowanceCharge_specialServicesType")
    protected String allowanceChargeSpecialServicesType;
    @XmlElement(name = "allowanceCharge_percentage")
    protected String allowanceChargePercentage;
    @XmlElement(name = "totalAmount_Amount")
    protected String totalAmountAmount;
    @XmlElement(name = "TotalAllowanceCharge_Amount")
    protected String totalAllowanceChargeAmount;
    @XmlElement(name = "baseAmount_Amount")
    protected String baseAmountAmount;
    @XmlElement(name = "tax_taxPercentage")
    protected String taxTaxPercentage;
    @XmlElement(name = "tax_taxAmount")
    protected String taxTaxAmount;
    @XmlElement(name = "payableAmount_Amount")
    protected String payableAmountAmount;
    @XmlElement(name = "AddInf")
    protected AMC71AdditionalInformations addInf;
    @XmlElement(name = "LineItems")
    protected AMC71LineItems lineItems;

    /**
     * Obtiene el valor de la propiedad deliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Define el valor de la propiedad deliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDate(String value) {
        this.deliveryDate = value;
    }

    /**
     * Obtiene el valor de la propiedad entityType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Define el valor de la propiedad entityType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Obtiene el valor de la propiedad uniqueCreatorIdentification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueCreatorIdentification() {
        return uniqueCreatorIdentification;
    }

    /**
     * Define el valor de la propiedad uniqueCreatorIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueCreatorIdentification(String value) {
        this.uniqueCreatorIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad specialInstructionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInstructionCode() {
        return specialInstructionCode;
    }

    /**
     * Define el valor de la propiedad specialInstructionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInstructionCode(String value) {
        this.specialInstructionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad specialInstructionText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInstructionText() {
        return specialInstructionText;
    }

    /**
     * Define el valor de la propiedad specialInstructionText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInstructionText(String value) {
        this.specialInstructionText = value;
    }

    /**
     * Obtiene el valor de la propiedad orderIdentificationReferenceIdentification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderIdentificationReferenceIdentification() {
        return orderIdentificationReferenceIdentification;
    }

    /**
     * Define el valor de la propiedad orderIdentificationReferenceIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderIdentificationReferenceIdentification(String value) {
        this.orderIdentificationReferenceIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad orderIdentificationReferenceIdentificationReferenceDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderIdentificationReferenceIdentificationReferenceDate() {
        return orderIdentificationReferenceIdentificationReferenceDate;
    }

    /**
     * Define el valor de la propiedad orderIdentificationReferenceIdentificationReferenceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderIdentificationReferenceIdentificationReferenceDate(String value) {
        this.orderIdentificationReferenceIdentificationReferenceDate = value;
    }

    /**
     * Obtiene el valor de la propiedad buyerGln.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerGln() {
        return buyerGln;
    }

    /**
     * Define el valor de la propiedad buyerGln.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerGln(String value) {
        this.buyerGln = value;
    }

    /**
     * Obtiene el valor de la propiedad buyerContactInformationText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerContactInformationText() {
        return buyerContactInformationText;
    }

    /**
     * Define el valor de la propiedad buyerContactInformationText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerContactInformationText(String value) {
        this.buyerContactInformationText = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerGln.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerGln() {
        return sellerGln;
    }

    /**
     * Define el valor de la propiedad sellerGln.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerGln(String value) {
        this.sellerGln = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerAlternatePartyIdentification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerAlternatePartyIdentification() {
        return sellerAlternatePartyIdentification;
    }

    /**
     * Define el valor de la propiedad sellerAlternatePartyIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerAlternatePartyIdentification(String value) {
        this.sellerAlternatePartyIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToGln.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToGln() {
        return shipToGln;
    }

    /**
     * Define el valor de la propiedad shipToGln.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToGln(String value) {
        this.shipToGln = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToNameAndAddressName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToNameAndAddressName() {
        return shipToNameAndAddressName;
    }

    /**
     * Define el valor de la propiedad shipToNameAndAddressName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToNameAndAddressName(String value) {
        this.shipToNameAndAddressName = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToNameAndAddressStreetAddressOne.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToNameAndAddressStreetAddressOne() {
        return shipToNameAndAddressStreetAddressOne;
    }

    /**
     * Define el valor de la propiedad shipToNameAndAddressStreetAddressOne.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToNameAndAddressStreetAddressOne(String value) {
        this.shipToNameAndAddressStreetAddressOne = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToNameAndAddressCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToNameAndAddressCity() {
        return shipToNameAndAddressCity;
    }

    /**
     * Define el valor de la propiedad shipToNameAndAddressCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToNameAndAddressCity(String value) {
        this.shipToNameAndAddressCity = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToNameAndAddressPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToNameAndAddressPostalCode() {
        return shipToNameAndAddressPostalCode;
    }

    /**
     * Define el valor de la propiedad shipToNameAndAddressPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToNameAndAddressPostalCode(String value) {
        this.shipToNameAndAddressPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyCurrencyISOCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCurrencyISOCode() {
        return currencyCurrencyISOCode;
    }

    /**
     * Define el valor de la propiedad currencyCurrencyISOCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCurrencyISOCode(String value) {
        this.currencyCurrencyISOCode = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyCurrencyFunction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCurrencyFunction() {
        return currencyCurrencyFunction;
    }

    /**
     * Define el valor de la propiedad currencyCurrencyFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCurrencyFunction(String value) {
        this.currencyCurrencyFunction = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyRateOfChange.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyRateOfChange() {
        return currencyRateOfChange;
    }

    /**
     * Define el valor de la propiedad currencyRateOfChange.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyRateOfChange(String value) {
        this.currencyRateOfChange = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentTermsValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTermsValue() {
        return paymentTermsValue;
    }

    /**
     * Define el valor de la propiedad paymentTermsValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTermsValue(String value) {
        this.paymentTermsValue = value;
    }

    /**
     * Obtiene el valor de la propiedad allowanceChargeSpecialServicesType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowanceChargeSpecialServicesType() {
        return allowanceChargeSpecialServicesType;
    }

    /**
     * Define el valor de la propiedad allowanceChargeSpecialServicesType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowanceChargeSpecialServicesType(String value) {
        this.allowanceChargeSpecialServicesType = value;
    }

    /**
     * Obtiene el valor de la propiedad allowanceChargePercentage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowanceChargePercentage() {
        return allowanceChargePercentage;
    }

    /**
     * Define el valor de la propiedad allowanceChargePercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowanceChargePercentage(String value) {
        this.allowanceChargePercentage = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAmountAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmountAmount() {
        return totalAmountAmount;
    }

    /**
     * Define el valor de la propiedad totalAmountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAmountAmount(String value) {
        this.totalAmountAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAllowanceChargeAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAllowanceChargeAmount() {
        return totalAllowanceChargeAmount;
    }

    /**
     * Define el valor de la propiedad totalAllowanceChargeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAllowanceChargeAmount(String value) {
        this.totalAllowanceChargeAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad baseAmountAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseAmountAmount() {
        return baseAmountAmount;
    }

    /**
     * Define el valor de la propiedad baseAmountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseAmountAmount(String value) {
        this.baseAmountAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad taxTaxPercentage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTaxPercentage() {
        return taxTaxPercentage;
    }

    /**
     * Define el valor de la propiedad taxTaxPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTaxPercentage(String value) {
        this.taxTaxPercentage = value;
    }

    /**
     * Obtiene el valor de la propiedad taxTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTaxAmount() {
        return taxTaxAmount;
    }

    /**
     * Define el valor de la propiedad taxTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTaxAmount(String value) {
        this.taxTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad payableAmountAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayableAmountAmount() {
        return payableAmountAmount;
    }

    /**
     * Define el valor de la propiedad payableAmountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayableAmountAmount(String value) {
        this.payableAmountAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad addInf.
     * 
     * @return
     *     possible object is
     *     {@link AMC71AdditionalInformations }
     *     
     */
    public AMC71AdditionalInformations getAddInf() {
        return addInf;
    }

    /**
     * Define el valor de la propiedad addInf.
     * 
     * @param value
     *     allowed object is
     *     {@link AMC71AdditionalInformations }
     *     
     */
    public void setAddInf(AMC71AdditionalInformations value) {
        this.addInf = value;
    }

    /**
     * Obtiene el valor de la propiedad lineItems.
     * 
     * @return
     *     possible object is
     *     {@link AMC71LineItems }
     *     
     */
    public AMC71LineItems getLineItems() {
        return lineItems;
    }

    /**
     * Define el valor de la propiedad lineItems.
     * 
     * @param value
     *     allowed object is
     *     {@link AMC71LineItems }
     *     
     */
    public void setLineItems(AMC71LineItems value) {
        this.lineItems = value;
    }

}
