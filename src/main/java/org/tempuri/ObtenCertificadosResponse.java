
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
 *         &lt;element name="ObtenCertificadosResult" type="{http://tempuri.org/}CertificadosResponse" minOccurs="0"/&gt;
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
    "obtenCertificadosResult"
})
@XmlRootElement(name = "ObtenCertificadosResponse")
public class ObtenCertificadosResponse {

    @XmlElement(name = "ObtenCertificadosResult")
    protected CertificadosResponse obtenCertificadosResult;

    /**
     * Obtiene el valor de la propiedad obtenCertificadosResult.
     * 
     * @return
     *     possible object is
     *     {@link CertificadosResponse }
     *     
     */
    public CertificadosResponse getObtenCertificadosResult() {
        return obtenCertificadosResult;
    }

    /**
     * Define el valor de la propiedad obtenCertificadosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificadosResponse }
     *     
     */
    public void setObtenCertificadosResult(CertificadosResponse value) {
        this.obtenCertificadosResult = value;
    }

}
