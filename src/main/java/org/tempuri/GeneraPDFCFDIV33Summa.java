
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="pdfrequest" type="{http://tempuri.org/}PDFCFDIRquest" minOccurs="0"/&gt;
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
    "pdfrequest"
})
@XmlRootElement(name = "GeneraPDFCFDIV33Summa")
public class GeneraPDFCFDIV33Summa {

    protected PDFCFDIRquest pdfrequest;

    /**
     * Obtiene el valor de la propiedad pdfrequest.
     * 
     * @return
     *     possible object is
     *     {@link PDFCFDIRquest }
     *     
     */
    public PDFCFDIRquest getPdfrequest() {
        return pdfrequest;
    }

    /**
     * Define el valor de la propiedad pdfrequest.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFCFDIRquest }
     *     
     */
    public void setPdfrequest(PDFCFDIRquest value) {
        this.pdfrequest = value;
    }

}
