
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GeneraPDFCFDIV33OfficeMaxResult" type="{http://tempuri.org/}PDFCFDIResponseOM" minOccurs="0"/&gt;
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
    "generaPDFCFDIV33OfficeMaxResult"
})
@XmlRootElement(name = "GeneraPDFCFDIV33OfficeMaxResponse")
public class GeneraPDFCFDIV33OfficeMaxResponse {

    @XmlElement(name = "GeneraPDFCFDIV33OfficeMaxResult")
    protected PDFCFDIResponseOM generaPDFCFDIV33OfficeMaxResult;

    /**
     * Obtiene el valor de la propiedad generaPDFCFDIV33OfficeMaxResult.
     * 
     * @return
     *     possible object is
     *     {@link PDFCFDIResponseOM }
     *     
     */
    public PDFCFDIResponseOM getGeneraPDFCFDIV33OfficeMaxResult() {
        return generaPDFCFDIV33OfficeMaxResult;
    }

    /**
     * Define el valor de la propiedad generaPDFCFDIV33OfficeMaxResult.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFCFDIResponseOM }
     *     
     */
    public void setGeneraPDFCFDIV33OfficeMaxResult(PDFCFDIResponseOM value) {
        this.generaPDFCFDIV33OfficeMaxResult = value;
    }

}
