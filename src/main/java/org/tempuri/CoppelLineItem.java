
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Coppel_LineItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Coppel_LineItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}AMC7_1_LineItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="modeloInformation_longText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="allowanceCharge_specialServicesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="allowanceCharge_percentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coppel_LineItem", propOrder = {
    "modeloInformationLongText",
    "allowanceChargeSpecialServicesType",
    "allowanceChargePercentage"
})
public class CoppelLineItem
    extends AMC71LineItem
{

    @XmlElement(name = "modeloInformation_longText")
    protected String modeloInformationLongText;
    @XmlElement(name = "allowanceCharge_specialServicesType")
    protected String allowanceChargeSpecialServicesType;
    @XmlElement(name = "allowanceCharge_percentage")
    protected String allowanceChargePercentage;

    /**
     * Obtiene el valor de la propiedad modeloInformationLongText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeloInformationLongText() {
        return modeloInformationLongText;
    }

    /**
     * Define el valor de la propiedad modeloInformationLongText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeloInformationLongText(String value) {
        this.modeloInformationLongText = value;
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

}
