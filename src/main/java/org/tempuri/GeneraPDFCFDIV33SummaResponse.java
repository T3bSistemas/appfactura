
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
 *         &lt;element name="GeneraPDFCFDIV33SummaResult" type="{http://tempuri.org/}PDFCFDIResponseSumma" minOccurs="0"/&gt;
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
    "generaPDFCFDIV33SummaResult"
})
@XmlRootElement(name = "GeneraPDFCFDIV33SummaResponse")
public class GeneraPDFCFDIV33SummaResponse {

    @XmlElement(name = "GeneraPDFCFDIV33SummaResult")
    protected PDFCFDIResponseSumma generaPDFCFDIV33SummaResult;

    /**
     * Obtiene el valor de la propiedad generaPDFCFDIV33SummaResult.
     * 
     * @return
     *     possible object is
     *     {@link PDFCFDIResponseSumma }
     *     
     */
    public PDFCFDIResponseSumma getGeneraPDFCFDIV33SummaResult() {
        return generaPDFCFDIV33SummaResult;
    }

    /**
     * Define el valor de la propiedad generaPDFCFDIV33SummaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFCFDIResponseSumma }
     *     
     */
    public void setGeneraPDFCFDIV33SummaResult(PDFCFDIResponseSumma value) {
        this.generaPDFCFDIV33SummaResult = value;
    }

}
