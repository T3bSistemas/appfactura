
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
 *         &lt;element name="certificadosRequest" type="{http://tempuri.org/}CertificadosRequest" minOccurs="0"/&gt;
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
    "certificadosRequest"
})
@XmlRootElement(name = "ObtenCertificados")
public class ObtenCertificados {

    protected CertificadosRequest certificadosRequest;

    /**
     * Obtiene el valor de la propiedad certificadosRequest.
     * 
     * @return
     *     possible object is
     *     {@link CertificadosRequest }
     *     
     */
    public CertificadosRequest getCertificadosRequest() {
        return certificadosRequest;
    }

    /**
     * Define el valor de la propiedad certificadosRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificadosRequest }
     *     
     */
    public void setCertificadosRequest(CertificadosRequest value) {
        this.certificadosRequest = value;
    }

}
