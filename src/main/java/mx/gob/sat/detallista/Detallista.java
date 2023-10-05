
package mx.gob.sat.detallista;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para detallista complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detallista"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestForPaymentIdentification" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="entityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="specialInstruction" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="orderIdentification" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="referenceIdentification" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ReferenceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdditionalInformation" type="{http://www.sat.gob.mx/detallista}ArrayOfDetallistaReferenceIdentification" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryNote" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="referenceIdentification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ReferenceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="buyer" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="contactInformation" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="personOrDepartmentName" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="seller" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="alternatePartyIdentification" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="shipTo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nameAndAddress" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                               &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                               &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                               &lt;element name="streetAddressOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;/choice&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InvoiceCreator" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="alternatePartyIdentification" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="nameAndAddress" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="streetAddressOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Customs" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="currency" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="currencyFunction" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="rateOfChange" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="currencyISOCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="paymentTerms" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="netPayment" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="paymentTimePeriod" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="timePeriodDue" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="timePeriod" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="netPaymentTermsType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="discountPayment" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="discountType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="paymentTermsEvent" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PaymentTermsRelationTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="shipmentDetail" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="allowanceCharge" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="specialServicesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="monetaryAmountOrPercentage" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="rate" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="base" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="allowanceChargeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="settlementType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lineItem" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tradeItemIdentification" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="gtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="alternateTradeItemIdentification" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="tradeItemDescriptionInformation" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="longText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="invoicedQuantity" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
 *                           &lt;attribute name="unitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="aditionalQuantity" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
 *                           &lt;attribute name="QuantityType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="grossPrice" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="netPrice" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AdditionalInformation" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="referenceIdentification" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Customs" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="alternatePartyIdentification" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ReferenceDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                             &lt;element name="nameAndAddress" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LogisticUnits" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="serialShippingContainerCode" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="palletInformation" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="palletQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="description" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="transport" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="methodOfPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="extendedAttributes" type="{http://www.sat.gob.mx/detallista}ArrayOfDetallistaLineItemLotNumber" minOccurs="0"/&gt;
 *                   &lt;element name="allowanceCharge" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="specialServicesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="monetaryAmountOrPercentage" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="percentagePerUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="ratePerUnit" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="amountPerUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="allowanceChargeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="settlementType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="tradeItemTaxInformation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="taxTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="tradeItemTaxAmount" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="taxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="taxCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="totalLineAmount" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="grossAmount" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="netAmount" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="totalAmount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TotalAllowanceCharge" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="specialServicesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="allowanceOrChargeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="contentVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="documentStructureVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="documentStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detallista", propOrder = {
    "requestForPaymentIdentification",
    "specialInstruction",
    "orderIdentification",
    "additionalInformation",
    "deliveryNote",
    "buyer",
    "seller",
    "shipTo",
    "invoiceCreator",
    "customs",
    "currency",
    "paymentTerms",
    "shipmentDetail",
    "allowanceCharge",
    "lineItem",
    "totalAmount",
    "totalAllowanceCharge"
})
public class Detallista {

    protected Detallista.RequestForPaymentIdentification requestForPaymentIdentification;
    protected List<Detallista.SpecialInstruction> specialInstruction;
    protected Detallista.OrderIdentification orderIdentification;
    @XmlElement(name = "AdditionalInformation")
    protected ArrayOfDetallistaReferenceIdentification additionalInformation;
    @XmlElement(name = "DeliveryNote")
    protected Detallista.DeliveryNote deliveryNote;
    protected Detallista.Buyer buyer;
    protected Detallista.Seller seller;
    protected Detallista.ShipTo shipTo;
    @XmlElement(name = "InvoiceCreator")
    protected Detallista.InvoiceCreator invoiceCreator;
    @XmlElement(name = "Customs")
    protected List<Detallista.Customs> customs;
    protected List<Detallista.Currency> currency;
    protected Detallista.PaymentTerms paymentTerms;
    protected Object shipmentDetail;
    protected List<Detallista.AllowanceCharge> allowanceCharge;
    protected List<Detallista.LineItem> lineItem;
    protected Detallista.TotalAmount totalAmount;
    @XmlElement(name = "TotalAllowanceCharge")
    protected List<Detallista.TotalAllowanceCharge> totalAllowanceCharge;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "contentVersion")
    protected String contentVersion;
    @XmlAttribute(name = "documentStructureVersion")
    protected String documentStructureVersion;
    @XmlAttribute(name = "documentStatus")
    protected String documentStatus;

    /**
     * Obtiene el valor de la propiedad requestForPaymentIdentification.
     * 
     * @return
     *     possible object is
     *     {@link Detallista.RequestForPaymentIdentification }
     *     
     */
    public Detallista.RequestForPaymentIdentification getRequestForPaymentIdentification() {
        return requestForPaymentIdentification;
    }

    /**
     * Define el valor de la propiedad requestForPaymentIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link Detallista.RequestForPaymentIdentification }
     *     
     */
    public void setRequestForPaymentIdentification(Detallista.RequestForPaymentIdentification value) {
        this.requestForPaymentIdentification = value;
    }

    /**
     * Gets the value of the specialInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Detallista.SpecialInstruction }
     * 
     * 
     */
    public List<Detallista.SpecialInstruction> getSpecialInstruction() {
        if (specialInstruction == null) {
            specialInstruction = new ArrayList<Detallista.SpecialInstruction>();
        }
        return this.specialInstruction;
    }

    /**
     * Obtiene el valor de la propiedad orderIdentification.
     * 
     * @return
     *     possible object is
     *     {@link Detallista.OrderIdentification }
     *     
     */
    public Detallista.OrderIdentification getOrderIdentification() {
        return orderIdentification;
    }

    /**
     * Define el valor de la propiedad orderIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link Detallista.OrderIdentification }
     *     
     */
    public void setOrderIdentification(Detallista.OrderIdentification value) {
        this.orderIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalInformation.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDetallistaReferenceIdentification }
     *     
     */
    public ArrayOfDetallistaReferenceIdentification getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Define el valor de la propiedad additionalInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDetallistaReferenceIdentification }
     *     
     */
    public void setAdditionalInformation(ArrayOfDetallistaReferenceIdentification value) {
        this.additionalInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveryNote.
     * 
     * @return
     *     possible object is
     *     {@link Detallista.DeliveryNote }
     *     
     */
    public Detallista.DeliveryNote getDeliveryNote() {
        return deliveryNote;
    }

    /**
     * Define el valor de la propiedad deliveryNote.
     * 
     * @param value
     *     allowed object is
     *     {@link Detallista.DeliveryNote }
     *     
     */
    public void setDeliveryNote(Detallista.DeliveryNote value) {
        this.deliveryNote = value;
    }

    /**
     * Obtiene el valor de la propiedad buyer.
     * 
     * @return
     *     possible object is
     *     {@link Detallista.Buyer }
     *     
     */
    public Detallista.Buyer getBuyer() {
        return buyer;
    }

    /**
     * Define el valor de la propiedad buyer.
     * 
     * @param value
     *     allowed object is
     *     {@link Detallista.Buyer }
     *     
     */
    public void setBuyer(Detallista.Buyer value) {
        this.buyer = value;
    }

    /**
     * Obtiene el valor de la propiedad seller.
     * 
     * @return
     *     possible object is
     *     {@link Detallista.Seller }
     *     
     */
    public Detallista.Seller getSeller() {
        return seller;
    }

    /**
     * Define el valor de la propiedad seller.
     * 
     * @param value
     *     allowed object is
     *     {@link Detallista.Seller }
     *     
     */
    public void setSeller(Detallista.Seller value) {
        this.seller = value;
    }

    /**
     * Obtiene el valor de la propiedad shipTo.
     * 
     * @return
     *     possible object is
     *     {@link Detallista.ShipTo }
     *     
     */
    public Detallista.ShipTo getShipTo() {
        return shipTo;
    }

    /**
     * Define el valor de la propiedad shipTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Detallista.ShipTo }
     *     
     */
    public void setShipTo(Detallista.ShipTo value) {
        this.shipTo = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceCreator.
     * 
     * @return
     *     possible object is
     *     {@link Detallista.InvoiceCreator }
     *     
     */
    public Detallista.InvoiceCreator getInvoiceCreator() {
        return invoiceCreator;
    }

    /**
     * Define el valor de la propiedad invoiceCreator.
     * 
     * @param value
     *     allowed object is
     *     {@link Detallista.InvoiceCreator }
     *     
     */
    public void setInvoiceCreator(Detallista.InvoiceCreator value) {
        this.invoiceCreator = value;
    }

    /**
     * Gets the value of the customs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustoms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Detallista.Customs }
     * 
     * 
     */
    public List<Detallista.Customs> getCustoms() {
        if (customs == null) {
            customs = new ArrayList<Detallista.Customs>();
        }
        return this.customs;
    }

    /**
     * Gets the value of the currency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Detallista.Currency }
     * 
     * 
     */
    public List<Detallista.Currency> getCurrency() {
        if (currency == null) {
            currency = new ArrayList<Detallista.Currency>();
        }
        return this.currency;
    }

    /**
     * Obtiene el valor de la propiedad paymentTerms.
     * 
     * @return
     *     possible object is
     *     {@link Detallista.PaymentTerms }
     *     
     */
    public Detallista.PaymentTerms getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Define el valor de la propiedad paymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link Detallista.PaymentTerms }
     *     
     */
    public void setPaymentTerms(Detallista.PaymentTerms value) {
        this.paymentTerms = value;
    }

    /**
     * Obtiene el valor de la propiedad shipmentDetail.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShipmentDetail() {
        return shipmentDetail;
    }

    /**
     * Define el valor de la propiedad shipmentDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShipmentDetail(Object value) {
        this.shipmentDetail = value;
    }

    /**
     * Gets the value of the allowanceCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowanceCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowanceCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Detallista.AllowanceCharge }
     * 
     * 
     */
    public List<Detallista.AllowanceCharge> getAllowanceCharge() {
        if (allowanceCharge == null) {
            allowanceCharge = new ArrayList<Detallista.AllowanceCharge>();
        }
        return this.allowanceCharge;
    }

    /**
     * Gets the value of the lineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Detallista.LineItem }
     * 
     * 
     */
    public List<Detallista.LineItem> getLineItem() {
        if (lineItem == null) {
            lineItem = new ArrayList<Detallista.LineItem>();
        }
        return this.lineItem;
    }

    /**
     * Obtiene el valor de la propiedad totalAmount.
     * 
     * @return
     *     possible object is
     *     {@link Detallista.TotalAmount }
     *     
     */
    public Detallista.TotalAmount getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Detallista.TotalAmount }
     *     
     */
    public void setTotalAmount(Detallista.TotalAmount value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the totalAllowanceCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalAllowanceCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalAllowanceCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Detallista.TotalAllowanceCharge }
     * 
     * 
     */
    public List<Detallista.TotalAllowanceCharge> getTotalAllowanceCharge() {
        if (totalAllowanceCharge == null) {
            totalAllowanceCharge = new ArrayList<Detallista.TotalAllowanceCharge>();
        }
        return this.totalAllowanceCharge;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad contentVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentVersion() {
        return contentVersion;
    }

    /**
     * Define el valor de la propiedad contentVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentVersion(String value) {
        this.contentVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad documentStructureVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentStructureVersion() {
        return documentStructureVersion;
    }

    /**
     * Define el valor de la propiedad documentStructureVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentStructureVersion(String value) {
        this.documentStructureVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad documentStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentStatus() {
        return documentStatus;
    }

    /**
     * Define el valor de la propiedad documentStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentStatus(String value) {
        this.documentStatus = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="specialServicesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="monetaryAmountOrPercentage" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="rate" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="base" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="allowanceChargeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="settlementType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "specialServicesType",
        "monetaryAmountOrPercentage"
    })
    public static class AllowanceCharge {

        protected String specialServicesType;
        protected Detallista.AllowanceCharge.MonetaryAmountOrPercentage monetaryAmountOrPercentage;
        @XmlAttribute(name = "allowanceChargeType")
        protected String allowanceChargeType;
        @XmlAttribute(name = "settlementType")
        protected String settlementType;
        @XmlAttribute(name = "sequenceNumber")
        protected String sequenceNumber;

        /**
         * Obtiene el valor de la propiedad specialServicesType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecialServicesType() {
            return specialServicesType;
        }

        /**
         * Define el valor de la propiedad specialServicesType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecialServicesType(String value) {
            this.specialServicesType = value;
        }

        /**
         * Obtiene el valor de la propiedad monetaryAmountOrPercentage.
         * 
         * @return
         *     possible object is
         *     {@link Detallista.AllowanceCharge.MonetaryAmountOrPercentage }
         *     
         */
        public Detallista.AllowanceCharge.MonetaryAmountOrPercentage getMonetaryAmountOrPercentage() {
            return monetaryAmountOrPercentage;
        }

        /**
         * Define el valor de la propiedad monetaryAmountOrPercentage.
         * 
         * @param value
         *     allowed object is
         *     {@link Detallista.AllowanceCharge.MonetaryAmountOrPercentage }
         *     
         */
        public void setMonetaryAmountOrPercentage(Detallista.AllowanceCharge.MonetaryAmountOrPercentage value) {
            this.monetaryAmountOrPercentage = value;
        }

        /**
         * Obtiene el valor de la propiedad allowanceChargeType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllowanceChargeType() {
            return allowanceChargeType;
        }

        /**
         * Define el valor de la propiedad allowanceChargeType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllowanceChargeType(String value) {
            this.allowanceChargeType = value;
        }

        /**
         * Obtiene el valor de la propiedad settlementType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSettlementType() {
            return settlementType;
        }

        /**
         * Define el valor de la propiedad settlementType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSettlementType(String value) {
            this.settlementType = value;
        }

        /**
         * Obtiene el valor de la propiedad sequenceNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSequenceNumber() {
            return sequenceNumber;
        }

        /**
         * Define el valor de la propiedad sequenceNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSequenceNumber(String value) {
            this.sequenceNumber = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="rate" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="base" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "rate"
        })
        public static class MonetaryAmountOrPercentage {

            protected Detallista.AllowanceCharge.MonetaryAmountOrPercentage.Rate rate;

            /**
             * Obtiene el valor de la propiedad rate.
             * 
             * @return
             *     possible object is
             *     {@link Detallista.AllowanceCharge.MonetaryAmountOrPercentage.Rate }
             *     
             */
            public Detallista.AllowanceCharge.MonetaryAmountOrPercentage.Rate getRate() {
                return rate;
            }

            /**
             * Define el valor de la propiedad rate.
             * 
             * @param value
             *     allowed object is
             *     {@link Detallista.AllowanceCharge.MonetaryAmountOrPercentage.Rate }
             *     
             */
            public void setRate(Detallista.AllowanceCharge.MonetaryAmountOrPercentage.Rate value) {
                this.rate = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="base" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "percentage"
            })
            public static class Rate {

                @XmlElement(required = true)
                protected BigDecimal percentage;
                @XmlAttribute(name = "base")
                protected String base;

                /**
                 * Obtiene el valor de la propiedad percentage.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPercentage() {
                    return percentage;
                }

                /**
                 * Define el valor de la propiedad percentage.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPercentage(BigDecimal value) {
                    this.percentage = value;
                }

                /**
                 * Obtiene el valor de la propiedad base.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBase() {
                    return base;
                }

                /**
                 * Define el valor de la propiedad base.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBase(String value) {
                    this.base = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="contactInformation" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="personOrDepartmentName" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gln",
        "contactInformation"
    })
    public static class Buyer {

        protected String gln;
        protected Detallista.Buyer.ContactInformation contactInformation;

        /**
         * Obtiene el valor de la propiedad gln.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGln() {
            return gln;
        }

        /**
         * Define el valor de la propiedad gln.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGln(String value) {
            this.gln = value;
        }

        /**
         * Obtiene el valor de la propiedad contactInformation.
         * 
         * @return
         *     possible object is
         *     {@link Detallista.Buyer.ContactInformation }
         *     
         */
        public Detallista.Buyer.ContactInformation getContactInformation() {
            return contactInformation;
        }

        /**
         * Define el valor de la propiedad contactInformation.
         * 
         * @param value
         *     allowed object is
         *     {@link Detallista.Buyer.ContactInformation }
         *     
         */
        public void setContactInformation(Detallista.Buyer.ContactInformation value) {
            this.contactInformation = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="personOrDepartmentName" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "personOrDepartmentName"
        })
        public static class ContactInformation {

            protected Detallista.Buyer.ContactInformation.PersonOrDepartmentName personOrDepartmentName;

            /**
             * Obtiene el valor de la propiedad personOrDepartmentName.
             * 
             * @return
             *     possible object is
             *     {@link Detallista.Buyer.ContactInformation.PersonOrDepartmentName }
             *     
             */
            public Detallista.Buyer.ContactInformation.PersonOrDepartmentName getPersonOrDepartmentName() {
                return personOrDepartmentName;
            }

            /**
             * Define el valor de la propiedad personOrDepartmentName.
             * 
             * @param value
             *     allowed object is
             *     {@link Detallista.Buyer.ContactInformation.PersonOrDepartmentName }
             *     
             */
            public void setPersonOrDepartmentName(Detallista.Buyer.ContactInformation.PersonOrDepartmentName value) {
                this.personOrDepartmentName = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "text"
            })
            public static class PersonOrDepartmentName {

                protected String text;

                /**
                 * Obtiene el valor de la propiedad text.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getText() {
                    return text;
                }

                /**
                 * Define el valor de la propiedad text.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setText(String value) {
                    this.text = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="currencyFunction" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="rateOfChange" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="currencyISOCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "currencyFunction",
        "rateOfChange"
    })
    public static class Currency {

        protected List<String> currencyFunction;
        @XmlElement(required = true)
        protected BigDecimal rateOfChange;
        @XmlAttribute(name = "currencyISOCode")
        protected String currencyISOCode;

        /**
         * Gets the value of the currencyFunction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the currencyFunction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCurrencyFunction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCurrencyFunction() {
            if (currencyFunction == null) {
                currencyFunction = new ArrayList<String>();
            }
            return this.currencyFunction;
        }

        /**
         * Obtiene el valor de la propiedad rateOfChange.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRateOfChange() {
            return rateOfChange;
        }

        /**
         * Define el valor de la propiedad rateOfChange.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRateOfChange(BigDecimal value) {
            this.rateOfChange = value;
        }

        /**
         * Obtiene el valor de la propiedad currencyISOCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyISOCode() {
            return currencyISOCode;
        }

        /**
         * Define el valor de la propiedad currencyISOCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyISOCode(String value) {
            this.currencyISOCode = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gln"
    })
    public static class Customs {

        protected String gln;

        /**
         * Obtiene el valor de la propiedad gln.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGln() {
            return gln;
        }

        /**
         * Define el valor de la propiedad gln.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGln(String value) {
            this.gln = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="referenceIdentification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ReferenceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "referenceIdentification",
        "referenceDate"
    })
    public static class DeliveryNote {

        protected List<String> referenceIdentification;
        @XmlElement(name = "ReferenceDate")
        protected String referenceDate;

        /**
         * Gets the value of the referenceIdentification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the referenceIdentification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReferenceIdentification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getReferenceIdentification() {
            if (referenceIdentification == null) {
                referenceIdentification = new ArrayList<String>();
            }
            return this.referenceIdentification;
        }

        /**
         * Obtiene el valor de la propiedad referenceDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceDate() {
            return referenceDate;
        }

        /**
         * Define el valor de la propiedad referenceDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceDate(String value) {
            this.referenceDate = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="alternatePartyIdentification" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="nameAndAddress" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="streetAddressOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gln",
        "alternatePartyIdentification",
        "nameAndAddress"
    })
    public static class InvoiceCreator {

        protected String gln;
        protected Detallista.InvoiceCreator.AlternatePartyIdentification alternatePartyIdentification;
        protected Detallista.InvoiceCreator.NameAndAddress nameAndAddress;

        /**
         * Obtiene el valor de la propiedad gln.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGln() {
            return gln;
        }

        /**
         * Define el valor de la propiedad gln.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGln(String value) {
            this.gln = value;
        }

        /**
         * Obtiene el valor de la propiedad alternatePartyIdentification.
         * 
         * @return
         *     possible object is
         *     {@link Detallista.InvoiceCreator.AlternatePartyIdentification }
         *     
         */
        public Detallista.InvoiceCreator.AlternatePartyIdentification getAlternatePartyIdentification() {
            return alternatePartyIdentification;
        }

        /**
         * Define el valor de la propiedad alternatePartyIdentification.
         * 
         * @param value
         *     allowed object is
         *     {@link Detallista.InvoiceCreator.AlternatePartyIdentification }
         *     
         */
        public void setAlternatePartyIdentification(Detallista.InvoiceCreator.AlternatePartyIdentification value) {
            this.alternatePartyIdentification = value;
        }

        /**
         * Obtiene el valor de la propiedad nameAndAddress.
         * 
         * @return
         *     possible object is
         *     {@link Detallista.InvoiceCreator.NameAndAddress }
         *     
         */
        public Detallista.InvoiceCreator.NameAndAddress getNameAndAddress() {
            return nameAndAddress;
        }

        /**
         * Define el valor de la propiedad nameAndAddress.
         * 
         * @param value
         *     allowed object is
         *     {@link Detallista.InvoiceCreator.NameAndAddress }
         *     
         */
        public void setNameAndAddress(Detallista.InvoiceCreator.NameAndAddress value) {
            this.nameAndAddress = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class AlternatePartyIdentification {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "type")
            protected String type;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Define el valor de la propiedad type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="streetAddressOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "streetAddressOne",
            "city",
            "postalCode"
        })
        public static class NameAndAddress {

            protected String name;
            protected String streetAddressOne;
            protected String city;
            protected String postalCode;

            /**
             * Obtiene el valor de la propiedad name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Define el valor de la propiedad name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Obtiene el valor de la propiedad streetAddressOne.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStreetAddressOne() {
                return streetAddressOne;
            }

            /**
             * Define el valor de la propiedad streetAddressOne.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStreetAddressOne(String value) {
                this.streetAddressOne = value;
            }

            /**
             * Obtiene el valor de la propiedad city.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCity() {
                return city;
            }

            /**
             * Define el valor de la propiedad city.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCity(String value) {
                this.city = value;
            }

            /**
             * Obtiene el valor de la propiedad postalCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostalCode() {
                return postalCode;
            }

            /**
             * Define el valor de la propiedad postalCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostalCode(String value) {
                this.postalCode = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="tradeItemIdentification" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="gtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="alternateTradeItemIdentification" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="tradeItemDescriptionInformation" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="longText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="invoicedQuantity" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
     *                 &lt;attribute name="unitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="aditionalQuantity" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
     *                 &lt;attribute name="QuantityType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="grossPrice" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="netPrice" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AdditionalInformation" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="referenceIdentification" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Customs" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="alternatePartyIdentification" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ReferenceDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                   &lt;element name="nameAndAddress" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LogisticUnits" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="serialShippingContainerCode" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="palletInformation" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="palletQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="description" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="transport" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="methodOfPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="extendedAttributes" type="{http://www.sat.gob.mx/detallista}ArrayOfDetallistaLineItemLotNumber" minOccurs="0"/&gt;
     *         &lt;element name="allowanceCharge" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="specialServicesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="monetaryAmountOrPercentage" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="percentagePerUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="ratePerUnit" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="amountPerUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="allowanceChargeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="settlementType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="tradeItemTaxInformation" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="taxTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="tradeItemTaxAmount" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="taxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="taxCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="totalLineAmount" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="grossAmount" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="netAmount" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tradeItemIdentification",
        "alternateTradeItemIdentification",
        "tradeItemDescriptionInformation",
        "invoicedQuantity",
        "aditionalQuantity",
        "grossPrice",
        "netPrice",
        "additionalInformation",
        "customs",
        "logisticUnits",
        "palletInformation",
        "extendedAttributes",
        "allowanceCharge",
        "tradeItemTaxInformation",
        "totalLineAmount"
    })
    public static class LineItem {

        protected Detallista.LineItem.TradeItemIdentification tradeItemIdentification;
        protected List<Detallista.LineItem.AlternateTradeItemIdentification> alternateTradeItemIdentification;
        protected Detallista.LineItem.TradeItemDescriptionInformation tradeItemDescriptionInformation;
        protected Detallista.LineItem.InvoicedQuantity invoicedQuantity;
        protected List<Detallista.LineItem.AditionalQuantity> aditionalQuantity;
        protected Detallista.LineItem.GrossPrice grossPrice;
        protected Detallista.LineItem.NetPrice netPrice;
        @XmlElement(name = "AdditionalInformation")
        protected Detallista.LineItem.AdditionalInformation additionalInformation;
        @XmlElement(name = "Customs")
        protected List<Detallista.LineItem.Customs> customs;
        @XmlElement(name = "LogisticUnits")
        protected Detallista.LineItem.LogisticUnits logisticUnits;
        protected Detallista.LineItem.PalletInformation palletInformation;
        protected ArrayOfDetallistaLineItemLotNumber extendedAttributes;
        protected List<Detallista.LineItem.AllowanceCharge> allowanceCharge;
        protected List<Detallista.LineItem.TradeItemTaxInformation> tradeItemTaxInformation;
        protected Detallista.LineItem.TotalLineAmount totalLineAmount;
        @XmlAttribute(name = "type")
        protected String type;
        @XmlAttribute(name = "number", required = true)
        protected int number;

        /**
         * Obtiene el valor de la propiedad tradeItemIdentification.
         * 
         * @return
         *     possible object is
         *     {@link Detallista.LineItem.TradeItemIdentification }
         *     
         */
        public Detallista.LineItem.TradeItemIdentification getTradeItemIdentification() {
            return tradeItemIdentification;
        }

        /**
         * Define el valor de la propiedad tradeItemIdentification.
         * 
         * @param value
         *     allowed object is
         *     {@link Detallista.LineItem.TradeItemIdentification }
         *     
         */
        public void setTradeItemIdentification(Detallista.LineItem.TradeItemIdentification value) {
            this.tradeItemIdentification = value;
        }

        /**
         * Gets the value of the alternateTradeItemIdentification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alternateTradeItemIdentification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlternateTradeItemIdentification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Detallista.LineItem.AlternateTradeItemIdentification }
         * 
         * 
         */
        public List<Detallista.LineItem.AlternateTradeItemIdentification> getAlternateTradeItemIdentification() {
            if (alternateTradeItemIdentification == null) {
                alternateTradeItemIdentification = new ArrayList<Detallista.LineItem.AlternateTradeItemIdentification>();
            }
            return this.alternateTradeItemIdentification;
        }

        /**
         * Obtiene el valor de la propiedad tradeItemDescriptionInformation.
         * 
         * @return
         *     possible object is
         *     {@link Detallista.LineItem.TradeItemDescriptionInformation }
         *     
         */
        public Detallista.LineItem.TradeItemDescriptionInformation getTradeItemDescriptionInformation() {
            return tradeItemDescriptionInformation;
        }

        /**
         * Define el valor de la propiedad tradeItemDescriptionInformation.
         * 
         * @param value
         *     allowed object is
         *     {@link Detallista.LineItem.TradeItemDescriptionInformation }
         *     
         */
        public void setTradeItemDescriptionInformation(Detallista.LineItem.TradeItemDescriptionInformation value) {
            this.tradeItemDescriptionInformation = value;
        }

        /**
         * Obtiene el valor de la propiedad invoicedQuantity.
         * 
         * @return
         *     possible object is
         *     {@link Detallista.LineItem.InvoicedQuantity }
         *     
         */
        public Detallista.LineItem.InvoicedQuantity getInvoicedQuantity() {
            return invoicedQuantity;
        }

        /**
         * Define el valor de la propiedad invoicedQuantity.
         * 
         * @param value
         *     allowed object is
         *     {@link Detallista.LineItem.InvoicedQuantity }
         *     
         */
        public void setInvoicedQuantity(Detallista.LineItem.InvoicedQuantity value) {
            this.invoicedQuantity = value;
        }

        /**
         * Gets the value of the aditionalQuantity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aditionalQuantity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAditionalQuantity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Detallista.LineItem.AditionalQuantity }
         * 
         * 
         */
        public List<Detallista.LineItem.AditionalQuantity> getAditionalQuantity() {
            if (aditionalQuantity == null) {
                aditionalQuantity = new ArrayList<Detallista.LineItem.AditionalQuantity>();
            }
            return this.aditionalQuantity;
        }

        /**
         * Obtiene el valor de la propiedad grossPrice.
         * 
         * @return
         *     possible object is
         *     {@link Detallista.LineItem.GrossPrice }
         *     
         */
        public Detallista.LineItem.GrossPrice getGrossPrice() {
            return grossPrice;
        }

        /**
         * Define el valor de la propiedad grossPrice.
         * 
         * @param value
         *     allowed object is
         *     {@link Detallista.LineItem.GrossPrice }
         *     
         */
        public void setGrossPrice(Detallista.LineItem.GrossPrice value) {
            this.grossPrice = value;
        }

        /**
         * Obtiene el valor de la propiedad netPrice.
         * 
         * @return
         *     possible object is
         *     {@link Detallista.LineItem.NetPrice }
         *     
         */
        public Detallista.LineItem.NetPrice getNetPrice() {
            return netPrice;
        }

        /**
         * Define el valor de la propiedad netPrice.
         * 
         * @param value
         *     allowed object is
         *     {@link Detallista.LineItem.NetPrice }
         *     
         */
        public void setNetPrice(Detallista.LineItem.NetPrice value) {
            this.netPrice = value;
        }

        /**
         * Obtiene el valor de la propiedad additionalInformation.
         * 
         * @return
         *     possible object is
         *     {@link Detallista.LineItem.AdditionalInformation }
         *     
         */
        public Detallista.LineItem.AdditionalInformation getAdditionalInformation() {
            return additionalInformation;
        }

        /**
         * Define el valor de la propiedad additionalInformation.
         * 
         * @param value
         *     allowed object is
         *     {@link Detallista.LineItem.AdditionalInformation }
         *     
         */
        public void setAdditionalInformation(Detallista.LineItem.AdditionalInformation value) {
            this.additionalInformation = value;
        }

        /**
         * Gets the value of the customs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustoms().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Detallista.LineItem.Customs }
         * 
         * 
         */
        public List<Detallista.LineItem.Customs> getCustoms() {
            if (customs == null) {
                customs = new ArrayList<Detallista.LineItem.Customs>();
            }
            return this.customs;
        }

        /**
         * Obtiene el valor de la propiedad logisticUnits.
         * 
         * @return
         *     possible object is
         *     {@link Detallista.LineItem.LogisticUnits }
         *     
         */
        public Detallista.LineItem.LogisticUnits getLogisticUnits() {
            return logisticUnits;
        }

        /**
         * Define el valor de la propiedad logisticUnits.
         * 
         * @param value
         *     allowed object is
         *     {@link Detallista.LineItem.LogisticUnits }
         *     
         */
        public void setLogisticUnits(Detallista.LineItem.LogisticUnits value) {
            this.logisticUnits = value;
        }

        /**
         * Obtiene el valor de la propiedad palletInformation.
         * 
         * @return
         *     possible object is
         *     {@link Detallista.LineItem.PalletInformation }
         *     
         */
        public Detallista.LineItem.PalletInformation getPalletInformation() {
            return palletInformation;
        }

        /**
         * Define el valor de la propiedad palletInformation.
         * 
         * @param value
         *     allowed object is
         *     {@link Detallista.LineItem.PalletInformation }
         *     
         */
        public void setPalletInformation(Detallista.LineItem.PalletInformation value) {
            this.palletInformation = value;
        }

        /**
         * Obtiene el valor de la propiedad extendedAttributes.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfDetallistaLineItemLotNumber }
         *     
         */
        public ArrayOfDetallistaLineItemLotNumber getExtendedAttributes() {
            return extendedAttributes;
        }

        /**
         * Define el valor de la propiedad extendedAttributes.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfDetallistaLineItemLotNumber }
         *     
         */
        public void setExtendedAttributes(ArrayOfDetallistaLineItemLotNumber value) {
            this.extendedAttributes = value;
        }

        /**
         * Gets the value of the allowanceCharge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the allowanceCharge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAllowanceCharge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Detallista.LineItem.AllowanceCharge }
         * 
         * 
         */
        public List<Detallista.LineItem.AllowanceCharge> getAllowanceCharge() {
            if (allowanceCharge == null) {
                allowanceCharge = new ArrayList<Detallista.LineItem.AllowanceCharge>();
            }
            return this.allowanceCharge;
        }

        /**
         * Gets the value of the tradeItemTaxInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tradeItemTaxInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTradeItemTaxInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Detallista.LineItem.TradeItemTaxInformation }
         * 
         * 
         */
        public List<Detallista.LineItem.TradeItemTaxInformation> getTradeItemTaxInformation() {
            if (tradeItemTaxInformation == null) {
                tradeItemTaxInformation = new ArrayList<Detallista.LineItem.TradeItemTaxInformation>();
            }
            return this.tradeItemTaxInformation;
        }

        /**
         * Obtiene el valor de la propiedad totalLineAmount.
         * 
         * @return
         *     possible object is
         *     {@link Detallista.LineItem.TotalLineAmount }
         *     
         */
        public Detallista.LineItem.TotalLineAmount getTotalLineAmount() {
            return totalLineAmount;
        }

        /**
         * Define el valor de la propiedad totalLineAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link Detallista.LineItem.TotalLineAmount }
         *     
         */
        public void setTotalLineAmount(Detallista.LineItem.TotalLineAmount value) {
            this.totalLineAmount = value;
        }

        /**
         * Obtiene el valor de la propiedad type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Define el valor de la propiedad type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Obtiene el valor de la propiedad number.
         * 
         */
        public int getNumber() {
            return number;
        }

        /**
         * Define el valor de la propiedad number.
         * 
         */
        public void setNumber(int value) {
            this.number = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="referenceIdentification" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "referenceIdentification"
        })
        public static class AdditionalInformation {

            protected Detallista.LineItem.AdditionalInformation.ReferenceIdentification referenceIdentification;

            /**
             * Obtiene el valor de la propiedad referenceIdentification.
             * 
             * @return
             *     possible object is
             *     {@link Detallista.LineItem.AdditionalInformation.ReferenceIdentification }
             *     
             */
            public Detallista.LineItem.AdditionalInformation.ReferenceIdentification getReferenceIdentification() {
                return referenceIdentification;
            }

            /**
             * Define el valor de la propiedad referenceIdentification.
             * 
             * @param value
             *     allowed object is
             *     {@link Detallista.LineItem.AdditionalInformation.ReferenceIdentification }
             *     
             */
            public void setReferenceIdentification(Detallista.LineItem.AdditionalInformation.ReferenceIdentification value) {
                this.referenceIdentification = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ReferenceIdentification {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "type")
                protected String type;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad type.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Define el valor de la propiedad type.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
         *       &lt;attribute name="QuantityType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class AditionalQuantity {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "QuantityType")
            protected String quantityType;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
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

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="specialServicesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="monetaryAmountOrPercentage" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="percentagePerUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="ratePerUnit" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="amountPerUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="allowanceChargeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="settlementType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "specialServicesType",
            "monetaryAmountOrPercentage"
        })
        public static class AllowanceCharge {

            protected String specialServicesType;
            protected Detallista.LineItem.AllowanceCharge.MonetaryAmountOrPercentage monetaryAmountOrPercentage;
            @XmlAttribute(name = "allowanceChargeType")
            protected String allowanceChargeType;
            @XmlAttribute(name = "settlementType")
            protected String settlementType;
            @XmlAttribute(name = "sequenceNumber")
            protected String sequenceNumber;

            /**
             * Obtiene el valor de la propiedad specialServicesType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpecialServicesType() {
                return specialServicesType;
            }

            /**
             * Define el valor de la propiedad specialServicesType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpecialServicesType(String value) {
                this.specialServicesType = value;
            }

            /**
             * Obtiene el valor de la propiedad monetaryAmountOrPercentage.
             * 
             * @return
             *     possible object is
             *     {@link Detallista.LineItem.AllowanceCharge.MonetaryAmountOrPercentage }
             *     
             */
            public Detallista.LineItem.AllowanceCharge.MonetaryAmountOrPercentage getMonetaryAmountOrPercentage() {
                return monetaryAmountOrPercentage;
            }

            /**
             * Define el valor de la propiedad monetaryAmountOrPercentage.
             * 
             * @param value
             *     allowed object is
             *     {@link Detallista.LineItem.AllowanceCharge.MonetaryAmountOrPercentage }
             *     
             */
            public void setMonetaryAmountOrPercentage(Detallista.LineItem.AllowanceCharge.MonetaryAmountOrPercentage value) {
                this.monetaryAmountOrPercentage = value;
            }

            /**
             * Obtiene el valor de la propiedad allowanceChargeType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAllowanceChargeType() {
                return allowanceChargeType;
            }

            /**
             * Define el valor de la propiedad allowanceChargeType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAllowanceChargeType(String value) {
                this.allowanceChargeType = value;
            }

            /**
             * Obtiene el valor de la propiedad settlementType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSettlementType() {
                return settlementType;
            }

            /**
             * Define el valor de la propiedad settlementType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSettlementType(String value) {
                this.settlementType = value;
            }

            /**
             * Obtiene el valor de la propiedad sequenceNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSequenceNumber() {
                return sequenceNumber;
            }

            /**
             * Define el valor de la propiedad sequenceNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSequenceNumber(String value) {
                this.sequenceNumber = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="percentagePerUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="ratePerUnit" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="amountPerUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "percentagePerUnit",
                "ratePerUnit"
            })
            public static class MonetaryAmountOrPercentage {

                protected String percentagePerUnit;
                protected Detallista.LineItem.AllowanceCharge.MonetaryAmountOrPercentage.RatePerUnit ratePerUnit;

                /**
                 * Obtiene el valor de la propiedad percentagePerUnit.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPercentagePerUnit() {
                    return percentagePerUnit;
                }

                /**
                 * Define el valor de la propiedad percentagePerUnit.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPercentagePerUnit(String value) {
                    this.percentagePerUnit = value;
                }

                /**
                 * Obtiene el valor de la propiedad ratePerUnit.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Detallista.LineItem.AllowanceCharge.MonetaryAmountOrPercentage.RatePerUnit }
                 *     
                 */
                public Detallista.LineItem.AllowanceCharge.MonetaryAmountOrPercentage.RatePerUnit getRatePerUnit() {
                    return ratePerUnit;
                }

                /**
                 * Define el valor de la propiedad ratePerUnit.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Detallista.LineItem.AllowanceCharge.MonetaryAmountOrPercentage.RatePerUnit }
                 *     
                 */
                public void setRatePerUnit(Detallista.LineItem.AllowanceCharge.MonetaryAmountOrPercentage.RatePerUnit value) {
                    this.ratePerUnit = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="amountPerUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "amountPerUnit"
                })
                public static class RatePerUnit {

                    protected String amountPerUnit;

                    /**
                     * Obtiene el valor de la propiedad amountPerUnit.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAmountPerUnit() {
                        return amountPerUnit;
                    }

                    /**
                     * Define el valor de la propiedad amountPerUnit.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAmountPerUnit(String value) {
                        this.amountPerUnit = value;
                    }

                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class AlternateTradeItemIdentification {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "type")
            protected String type;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Define el valor de la propiedad type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="alternatePartyIdentification" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ReferenceDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *         &lt;element name="nameAndAddress" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "gln",
            "alternatePartyIdentification",
            "referenceDate",
            "nameAndAddress"
        })
        public static class Customs {

            protected String gln;
            protected Detallista.LineItem.Customs.AlternatePartyIdentification alternatePartyIdentification;
            @XmlElement(name = "ReferenceDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar referenceDate;
            protected Detallista.LineItem.Customs.NameAndAddress nameAndAddress;

            /**
             * Obtiene el valor de la propiedad gln.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGln() {
                return gln;
            }

            /**
             * Define el valor de la propiedad gln.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGln(String value) {
                this.gln = value;
            }

            /**
             * Obtiene el valor de la propiedad alternatePartyIdentification.
             * 
             * @return
             *     possible object is
             *     {@link Detallista.LineItem.Customs.AlternatePartyIdentification }
             *     
             */
            public Detallista.LineItem.Customs.AlternatePartyIdentification getAlternatePartyIdentification() {
                return alternatePartyIdentification;
            }

            /**
             * Define el valor de la propiedad alternatePartyIdentification.
             * 
             * @param value
             *     allowed object is
             *     {@link Detallista.LineItem.Customs.AlternatePartyIdentification }
             *     
             */
            public void setAlternatePartyIdentification(Detallista.LineItem.Customs.AlternatePartyIdentification value) {
                this.alternatePartyIdentification = value;
            }

            /**
             * Obtiene el valor de la propiedad referenceDate.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getReferenceDate() {
                return referenceDate;
            }

            /**
             * Define el valor de la propiedad referenceDate.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setReferenceDate(XMLGregorianCalendar value) {
                this.referenceDate = value;
            }

            /**
             * Obtiene el valor de la propiedad nameAndAddress.
             * 
             * @return
             *     possible object is
             *     {@link Detallista.LineItem.Customs.NameAndAddress }
             *     
             */
            public Detallista.LineItem.Customs.NameAndAddress getNameAndAddress() {
                return nameAndAddress;
            }

            /**
             * Define el valor de la propiedad nameAndAddress.
             * 
             * @param value
             *     allowed object is
             *     {@link Detallista.LineItem.Customs.NameAndAddress }
             *     
             */
            public void setNameAndAddress(Detallista.LineItem.Customs.NameAndAddress value) {
                this.nameAndAddress = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class AlternatePartyIdentification {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "type")
                protected String type;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad type.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Define el valor de la propiedad type.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name"
            })
            public static class NameAndAddress {

                protected String name;

                /**
                 * Obtiene el valor de la propiedad name.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Define el valor de la propiedad name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "amount"
        })
        public static class GrossPrice {

            @XmlElement(name = "Amount", required = true)
            protected BigDecimal amount;

            /**
             * Obtiene el valor de la propiedad amount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * Define el valor de la propiedad amount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
         *       &lt;attribute name="unitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class InvoicedQuantity {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "unitOfMeasure")
            protected String unitOfMeasure;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
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

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="serialShippingContainerCode" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "serialShippingContainerCode"
        })
        public static class LogisticUnits {

            protected Detallista.LineItem.LogisticUnits.SerialShippingContainerCode serialShippingContainerCode;

            /**
             * Obtiene el valor de la propiedad serialShippingContainerCode.
             * 
             * @return
             *     possible object is
             *     {@link Detallista.LineItem.LogisticUnits.SerialShippingContainerCode }
             *     
             */
            public Detallista.LineItem.LogisticUnits.SerialShippingContainerCode getSerialShippingContainerCode() {
                return serialShippingContainerCode;
            }

            /**
             * Define el valor de la propiedad serialShippingContainerCode.
             * 
             * @param value
             *     allowed object is
             *     {@link Detallista.LineItem.LogisticUnits.SerialShippingContainerCode }
             *     
             */
            public void setSerialShippingContainerCode(Detallista.LineItem.LogisticUnits.SerialShippingContainerCode value) {
                this.serialShippingContainerCode = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class SerialShippingContainerCode {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "type")
                protected String type;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad type.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Define el valor de la propiedad type.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "amount"
        })
        public static class NetPrice {

            @XmlElement(name = "Amount", required = true)
            protected BigDecimal amount;

            /**
             * Obtiene el valor de la propiedad amount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * Define el valor de la propiedad amount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="palletQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="description" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="transport" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="methodOfPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "palletQuantity",
            "description",
            "transport"
        })
        public static class PalletInformation {

            protected String palletQuantity;
            protected Detallista.LineItem.PalletInformation.Description description;
            protected Detallista.LineItem.PalletInformation.Transport transport;

            /**
             * Obtiene el valor de la propiedad palletQuantity.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPalletQuantity() {
                return palletQuantity;
            }

            /**
             * Define el valor de la propiedad palletQuantity.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPalletQuantity(String value) {
                this.palletQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad description.
             * 
             * @return
             *     possible object is
             *     {@link Detallista.LineItem.PalletInformation.Description }
             *     
             */
            public Detallista.LineItem.PalletInformation.Description getDescription() {
                return description;
            }

            /**
             * Define el valor de la propiedad description.
             * 
             * @param value
             *     allowed object is
             *     {@link Detallista.LineItem.PalletInformation.Description }
             *     
             */
            public void setDescription(Detallista.LineItem.PalletInformation.Description value) {
                this.description = value;
            }

            /**
             * Obtiene el valor de la propiedad transport.
             * 
             * @return
             *     possible object is
             *     {@link Detallista.LineItem.PalletInformation.Transport }
             *     
             */
            public Detallista.LineItem.PalletInformation.Transport getTransport() {
                return transport;
            }

            /**
             * Define el valor de la propiedad transport.
             * 
             * @param value
             *     allowed object is
             *     {@link Detallista.LineItem.PalletInformation.Transport }
             *     
             */
            public void setTransport(Detallista.LineItem.PalletInformation.Transport value) {
                this.transport = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Description {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "type")
                protected String type;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad type.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Define el valor de la propiedad type.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="methodOfPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "methodOfPayment"
            })
            public static class Transport {

                protected String methodOfPayment;

                /**
                 * Obtiene el valor de la propiedad methodOfPayment.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMethodOfPayment() {
                    return methodOfPayment;
                }

                /**
                 * Define el valor de la propiedad methodOfPayment.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMethodOfPayment(String value) {
                    this.methodOfPayment = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="grossAmount" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="netAmount" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "grossAmount",
            "netAmount"
        })
        public static class TotalLineAmount {

            protected Detallista.LineItem.TotalLineAmount.GrossAmount grossAmount;
            protected Detallista.LineItem.TotalLineAmount.NetAmount netAmount;

            /**
             * Obtiene el valor de la propiedad grossAmount.
             * 
             * @return
             *     possible object is
             *     {@link Detallista.LineItem.TotalLineAmount.GrossAmount }
             *     
             */
            public Detallista.LineItem.TotalLineAmount.GrossAmount getGrossAmount() {
                return grossAmount;
            }

            /**
             * Define el valor de la propiedad grossAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link Detallista.LineItem.TotalLineAmount.GrossAmount }
             *     
             */
            public void setGrossAmount(Detallista.LineItem.TotalLineAmount.GrossAmount value) {
                this.grossAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad netAmount.
             * 
             * @return
             *     possible object is
             *     {@link Detallista.LineItem.TotalLineAmount.NetAmount }
             *     
             */
            public Detallista.LineItem.TotalLineAmount.NetAmount getNetAmount() {
                return netAmount;
            }

            /**
             * Define el valor de la propiedad netAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link Detallista.LineItem.TotalLineAmount.NetAmount }
             *     
             */
            public void setNetAmount(Detallista.LineItem.TotalLineAmount.NetAmount value) {
                this.netAmount = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "amount"
            })
            public static class GrossAmount {

                @XmlElement(name = "Amount", required = true)
                protected BigDecimal amount;

                /**
                 * Obtiene el valor de la propiedad amount.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmount() {
                    return amount;
                }

                /**
                 * Define el valor de la propiedad amount.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmount(BigDecimal value) {
                    this.amount = value;
                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "amount"
            })
            public static class NetAmount {

                @XmlElement(name = "Amount", required = true)
                protected BigDecimal amount;

                /**
                 * Obtiene el valor de la propiedad amount.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmount() {
                    return amount;
                }

                /**
                 * Define el valor de la propiedad amount.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmount(BigDecimal value) {
                    this.amount = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="longText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "longText"
        })
        public static class TradeItemDescriptionInformation {

            protected String longText;
            @XmlAttribute(name = "language")
            protected String language;

            /**
             * Obtiene el valor de la propiedad longText.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLongText() {
                return longText;
            }

            /**
             * Define el valor de la propiedad longText.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLongText(String value) {
                this.longText = value;
            }

            /**
             * Obtiene el valor de la propiedad language.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLanguage() {
                return language;
            }

            /**
             * Define el valor de la propiedad language.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLanguage(String value) {
                this.language = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="gtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "gtin"
        })
        public static class TradeItemIdentification {

            protected String gtin;

            /**
             * Obtiene el valor de la propiedad gtin.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGtin() {
                return gtin;
            }

            /**
             * Define el valor de la propiedad gtin.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGtin(String value) {
                this.gtin = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="taxTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="tradeItemTaxAmount" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="taxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="taxCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "taxTypeDescription",
            "referenceNumber",
            "tradeItemTaxAmount",
            "taxCategory"
        })
        public static class TradeItemTaxInformation {

            protected String taxTypeDescription;
            protected String referenceNumber;
            protected Detallista.LineItem.TradeItemTaxInformation.TradeItemTaxAmount tradeItemTaxAmount;
            protected String taxCategory;

            /**
             * Obtiene el valor de la propiedad taxTypeDescription.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxTypeDescription() {
                return taxTypeDescription;
            }

            /**
             * Define el valor de la propiedad taxTypeDescription.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxTypeDescription(String value) {
                this.taxTypeDescription = value;
            }

            /**
             * Obtiene el valor de la propiedad referenceNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReferenceNumber() {
                return referenceNumber;
            }

            /**
             * Define el valor de la propiedad referenceNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReferenceNumber(String value) {
                this.referenceNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad tradeItemTaxAmount.
             * 
             * @return
             *     possible object is
             *     {@link Detallista.LineItem.TradeItemTaxInformation.TradeItemTaxAmount }
             *     
             */
            public Detallista.LineItem.TradeItemTaxInformation.TradeItemTaxAmount getTradeItemTaxAmount() {
                return tradeItemTaxAmount;
            }

            /**
             * Define el valor de la propiedad tradeItemTaxAmount.
             * 
             * @param value
             *     allowed object is
             *     {@link Detallista.LineItem.TradeItemTaxInformation.TradeItemTaxAmount }
             *     
             */
            public void setTradeItemTaxAmount(Detallista.LineItem.TradeItemTaxInformation.TradeItemTaxAmount value) {
                this.tradeItemTaxAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad taxCategory.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxCategory() {
                return taxCategory;
            }

            /**
             * Define el valor de la propiedad taxCategory.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxCategory(String value) {
                this.taxCategory = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="taxPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "taxPercentage",
                "taxAmount"
            })
            public static class TradeItemTaxAmount {

                @XmlElement(required = true)
                protected BigDecimal taxPercentage;
                @XmlElement(required = true)
                protected BigDecimal taxAmount;

                /**
                 * Obtiene el valor de la propiedad taxPercentage.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTaxPercentage() {
                    return taxPercentage;
                }

                /**
                 * Define el valor de la propiedad taxPercentage.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTaxPercentage(BigDecimal value) {
                    this.taxPercentage = value;
                }

                /**
                 * Obtiene el valor de la propiedad taxAmount.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTaxAmount() {
                    return taxAmount;
                }

                /**
                 * Define el valor de la propiedad taxAmount.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTaxAmount(BigDecimal value) {
                    this.taxAmount = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="referenceIdentification" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ReferenceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "referenceIdentification",
        "referenceDate"
    })
    public static class OrderIdentification {

        protected List<Detallista.OrderIdentification.ReferenceIdentification> referenceIdentification;
        @XmlElement(name = "ReferenceDate")
        protected String referenceDate;

        /**
         * Gets the value of the referenceIdentification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the referenceIdentification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReferenceIdentification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Detallista.OrderIdentification.ReferenceIdentification }
         * 
         * 
         */
        public List<Detallista.OrderIdentification.ReferenceIdentification> getReferenceIdentification() {
            if (referenceIdentification == null) {
                referenceIdentification = new ArrayList<Detallista.OrderIdentification.ReferenceIdentification>();
            }
            return this.referenceIdentification;
        }

        /**
         * Obtiene el valor de la propiedad referenceDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceDate() {
            return referenceDate;
        }

        /**
         * Define el valor de la propiedad referenceDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceDate(String value) {
            this.referenceDate = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ReferenceIdentification {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "type")
            protected String type;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Define el valor de la propiedad type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="netPayment" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="paymentTimePeriod" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="timePeriodDue" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="timePeriod" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="netPaymentTermsType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="discountPayment" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="discountType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="paymentTermsEvent" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PaymentTermsRelationTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "netPayment",
        "discountPayment"
    })
    public static class PaymentTerms {

        protected Detallista.PaymentTerms.NetPayment netPayment;
        protected Detallista.PaymentTerms.DiscountPayment discountPayment;
        @XmlAttribute(name = "paymentTermsEvent")
        protected String paymentTermsEvent;
        @XmlAttribute(name = "PaymentTermsRelationTime")
        protected String paymentTermsRelationTime;

        /**
         * Obtiene el valor de la propiedad netPayment.
         * 
         * @return
         *     possible object is
         *     {@link Detallista.PaymentTerms.NetPayment }
         *     
         */
        public Detallista.PaymentTerms.NetPayment getNetPayment() {
            return netPayment;
        }

        /**
         * Define el valor de la propiedad netPayment.
         * 
         * @param value
         *     allowed object is
         *     {@link Detallista.PaymentTerms.NetPayment }
         *     
         */
        public void setNetPayment(Detallista.PaymentTerms.NetPayment value) {
            this.netPayment = value;
        }

        /**
         * Obtiene el valor de la propiedad discountPayment.
         * 
         * @return
         *     possible object is
         *     {@link Detallista.PaymentTerms.DiscountPayment }
         *     
         */
        public Detallista.PaymentTerms.DiscountPayment getDiscountPayment() {
            return discountPayment;
        }

        /**
         * Define el valor de la propiedad discountPayment.
         * 
         * @param value
         *     allowed object is
         *     {@link Detallista.PaymentTerms.DiscountPayment }
         *     
         */
        public void setDiscountPayment(Detallista.PaymentTerms.DiscountPayment value) {
            this.discountPayment = value;
        }

        /**
         * Obtiene el valor de la propiedad paymentTermsEvent.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentTermsEvent() {
            return paymentTermsEvent;
        }

        /**
         * Define el valor de la propiedad paymentTermsEvent.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentTermsEvent(String value) {
            this.paymentTermsEvent = value;
        }

        /**
         * Obtiene el valor de la propiedad paymentTermsRelationTime.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentTermsRelationTime() {
            return paymentTermsRelationTime;
        }

        /**
         * Define el valor de la propiedad paymentTermsRelationTime.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentTermsRelationTime(String value) {
            this.paymentTermsRelationTime = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="discountType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "percentage"
        })
        public static class DiscountPayment {

            protected String percentage;
            @XmlAttribute(name = "discountType")
            protected String discountType;

            /**
             * Obtiene el valor de la propiedad percentage.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPercentage() {
                return percentage;
            }

            /**
             * Define el valor de la propiedad percentage.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPercentage(String value) {
                this.percentage = value;
            }

            /**
             * Obtiene el valor de la propiedad discountType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDiscountType() {
                return discountType;
            }

            /**
             * Define el valor de la propiedad discountType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDiscountType(String value) {
                this.discountType = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="paymentTimePeriod" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="timePeriodDue" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="timePeriod" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="netPaymentTermsType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "paymentTimePeriod"
        })
        public static class NetPayment {

            protected Detallista.PaymentTerms.NetPayment.PaymentTimePeriod paymentTimePeriod;
            @XmlAttribute(name = "netPaymentTermsType")
            protected String netPaymentTermsType;

            /**
             * Obtiene el valor de la propiedad paymentTimePeriod.
             * 
             * @return
             *     possible object is
             *     {@link Detallista.PaymentTerms.NetPayment.PaymentTimePeriod }
             *     
             */
            public Detallista.PaymentTerms.NetPayment.PaymentTimePeriod getPaymentTimePeriod() {
                return paymentTimePeriod;
            }

            /**
             * Define el valor de la propiedad paymentTimePeriod.
             * 
             * @param value
             *     allowed object is
             *     {@link Detallista.PaymentTerms.NetPayment.PaymentTimePeriod }
             *     
             */
            public void setPaymentTimePeriod(Detallista.PaymentTerms.NetPayment.PaymentTimePeriod value) {
                this.paymentTimePeriod = value;
            }

            /**
             * Obtiene el valor de la propiedad netPaymentTermsType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNetPaymentTermsType() {
                return netPaymentTermsType;
            }

            /**
             * Define el valor de la propiedad netPaymentTermsType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNetPaymentTermsType(String value) {
                this.netPaymentTermsType = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="timePeriodDue" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attribute name="timePeriod" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "timePeriodDue"
            })
            public static class PaymentTimePeriod {

                protected Detallista.PaymentTerms.NetPayment.PaymentTimePeriod.TimePeriodDue timePeriodDue;

                /**
                 * Obtiene el valor de la propiedad timePeriodDue.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Detallista.PaymentTerms.NetPayment.PaymentTimePeriod.TimePeriodDue }
                 *     
                 */
                public Detallista.PaymentTerms.NetPayment.PaymentTimePeriod.TimePeriodDue getTimePeriodDue() {
                    return timePeriodDue;
                }

                /**
                 * Define el valor de la propiedad timePeriodDue.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Detallista.PaymentTerms.NetPayment.PaymentTimePeriod.TimePeriodDue }
                 *     
                 */
                public void setTimePeriodDue(Detallista.PaymentTerms.NetPayment.PaymentTimePeriod.TimePeriodDue value) {
                    this.timePeriodDue = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attribute name="timePeriod" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class TimePeriodDue {

                    protected String value;
                    @XmlAttribute(name = "timePeriod")
                    protected String timePeriod;

                    /**
                     * Obtiene el valor de la propiedad value.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Define el valor de la propiedad value.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad timePeriod.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTimePeriod() {
                        return timePeriod;
                    }

                    /**
                     * Define el valor de la propiedad timePeriod.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTimePeriod(String value) {
                        this.timePeriod = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="entityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entityType"
    })
    public static class RequestForPaymentIdentification {

        protected String entityType;

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

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="alternatePartyIdentification" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gln",
        "alternatePartyIdentification"
    })
    public static class Seller {

        protected String gln;
        protected Detallista.Seller.AlternatePartyIdentification alternatePartyIdentification;

        /**
         * Obtiene el valor de la propiedad gln.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGln() {
            return gln;
        }

        /**
         * Define el valor de la propiedad gln.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGln(String value) {
            this.gln = value;
        }

        /**
         * Obtiene el valor de la propiedad alternatePartyIdentification.
         * 
         * @return
         *     possible object is
         *     {@link Detallista.Seller.AlternatePartyIdentification }
         *     
         */
        public Detallista.Seller.AlternatePartyIdentification getAlternatePartyIdentification() {
            return alternatePartyIdentification;
        }

        /**
         * Define el valor de la propiedad alternatePartyIdentification.
         * 
         * @param value
         *     allowed object is
         *     {@link Detallista.Seller.AlternatePartyIdentification }
         *     
         */
        public void setAlternatePartyIdentification(Detallista.Seller.AlternatePartyIdentification value) {
            this.alternatePartyIdentification = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class AlternatePartyIdentification {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "type")
            protected String type;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Define el valor de la propiedad type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="nameAndAddress" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                     &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                     &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                     &lt;element name="streetAddressOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;/choice&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gln",
        "nameAndAddress"
    })
    public static class ShipTo {

        protected String gln;
        protected Detallista.ShipTo.NameAndAddress nameAndAddress;

        /**
         * Obtiene el valor de la propiedad gln.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGln() {
            return gln;
        }

        /**
         * Define el valor de la propiedad gln.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGln(String value) {
            this.gln = value;
        }

        /**
         * Obtiene el valor de la propiedad nameAndAddress.
         * 
         * @return
         *     possible object is
         *     {@link Detallista.ShipTo.NameAndAddress }
         *     
         */
        public Detallista.ShipTo.NameAndAddress getNameAndAddress() {
            return nameAndAddress;
        }

        /**
         * Define el valor de la propiedad nameAndAddress.
         * 
         * @param value
         *     allowed object is
         *     {@link Detallista.ShipTo.NameAndAddress }
         *     
         */
        public void setNameAndAddress(Detallista.ShipTo.NameAndAddress value) {
            this.nameAndAddress = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *           &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *           &lt;element name="streetAddressOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;/choice&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cityOrNameOrPostalCode"
        })
        public static class NameAndAddress {

            @XmlElementRefs({
                @XmlElementRef(name = "city", namespace = "http://www.sat.gob.mx/detallista", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "name", namespace = "http://www.sat.gob.mx/detallista", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "postalCode", namespace = "http://www.sat.gob.mx/detallista", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "streetAddressOne", namespace = "http://www.sat.gob.mx/detallista", type = JAXBElement.class, required = false)
            })
            protected List<JAXBElement<String>> cityOrNameOrPostalCode;

            /**
             * Gets the value of the cityOrNameOrPostalCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cityOrNameOrPostalCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCityOrNameOrPostalCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * 
             * 
             */
            public List<JAXBElement<String>> getCityOrNameOrPostalCode() {
                if (cityOrNameOrPostalCode == null) {
                    cityOrNameOrPostalCode = new ArrayList<JAXBElement<String>>();
                }
                return this.cityOrNameOrPostalCode;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "text"
    })
    public static class SpecialInstruction {

        protected List<String> text;
        @XmlAttribute(name = "code")
        protected String code;

        /**
         * Gets the value of the text property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the text property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getText() {
            if (text == null) {
                text = new ArrayList<String>();
            }
            return this.text;
        }

        /**
         * Obtiene el valor de la propiedad code.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Define el valor de la propiedad code.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="specialServicesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="allowanceOrChargeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "specialServicesType",
        "amount"
    })
    public static class TotalAllowanceCharge {

        protected String specialServicesType;
        @XmlElement(name = "Amount", required = true)
        protected BigDecimal amount;
        @XmlAttribute(name = "allowanceOrChargeType")
        protected String allowanceOrChargeType;

        /**
         * Obtiene el valor de la propiedad specialServicesType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecialServicesType() {
            return specialServicesType;
        }

        /**
         * Define el valor de la propiedad specialServicesType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecialServicesType(String value) {
            this.specialServicesType = value;
        }

        /**
         * Obtiene el valor de la propiedad amount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Define el valor de la propiedad amount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Obtiene el valor de la propiedad allowanceOrChargeType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllowanceOrChargeType() {
            return allowanceOrChargeType;
        }

        /**
         * Define el valor de la propiedad allowanceOrChargeType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllowanceOrChargeType(String value) {
            this.allowanceOrChargeType = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "amount"
    })
    public static class TotalAmount {

        @XmlElement(name = "Amount", required = true)
        protected BigDecimal amount;

        /**
         * Obtiene el valor de la propiedad amount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Define el valor de la propiedad amount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

    }

}
