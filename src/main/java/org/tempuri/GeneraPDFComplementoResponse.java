
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
 *         &lt;element name="GeneraPDFComplementoResult" type="{http://tempuri.org/}PDFCFDIResponse" minOccurs="0"/&gt;
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
    "generaPDFComplementoResult"
})
@XmlRootElement(name = "GeneraPDFComplementoResponse")
public class GeneraPDFComplementoResponse {

    @XmlElement(name = "GeneraPDFComplementoResult")
    protected PDFCFDIResponse generaPDFComplementoResult;

    /**
     * Obtiene el valor de la propiedad generaPDFComplementoResult.
     * 
     * @return
     *     possible object is
     *     {@link PDFCFDIResponse }
     *     
     */
    public PDFCFDIResponse getGeneraPDFComplementoResult() {
        return generaPDFComplementoResult;
    }

    /**
     * Define el valor de la propiedad generaPDFComplementoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFCFDIResponse }
     *     
     */
    public void setGeneraPDFComplementoResult(PDFCFDIResponse value) {
        this.generaPDFComplementoResult = value;
    }

}
