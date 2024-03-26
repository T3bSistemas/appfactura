
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
 *         &lt;element name="PDFCFDIRequestComplemento" type="{http://tempuri.org/}PDFCFDIRequestComplemento" minOccurs="0"/&gt;
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
    "pdfcfdiRequestComplemento"
})
@XmlRootElement(name = "GeneraPDFComplemento")
public class GeneraPDFComplemento {

    @XmlElement(name = "PDFCFDIRequestComplemento")
    protected PDFCFDIRequestComplemento pdfcfdiRequestComplemento;

    /**
     * Obtiene el valor de la propiedad pdfcfdiRequestComplemento.
     * 
     * @return
     *     possible object is
     *     {@link PDFCFDIRequestComplemento }
     *     
     */
    public PDFCFDIRequestComplemento getPDFCFDIRequestComplemento() {
        return pdfcfdiRequestComplemento;
    }

    /**
     * Define el valor de la propiedad pdfcfdiRequestComplemento.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFCFDIRequestComplemento }
     *     
     */
    public void setPDFCFDIRequestComplemento(PDFCFDIRequestComplemento value) {
        this.pdfcfdiRequestComplemento = value;
    }

}
