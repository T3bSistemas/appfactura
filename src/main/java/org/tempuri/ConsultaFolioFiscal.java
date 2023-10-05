
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
 *         &lt;element name="Consulta" type="{http://tempuri.org/}ConsultaFolioFiscalRequest" minOccurs="0"/&gt;
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
    "consulta"
})
@XmlRootElement(name = "ConsultaFolioFiscal")
public class ConsultaFolioFiscal {

    @XmlElement(name = "Consulta")
    protected ConsultaFolioFiscalRequest consulta;

    /**
     * Obtiene el valor de la propiedad consulta.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaFolioFiscalRequest }
     *     
     */
    public ConsultaFolioFiscalRequest getConsulta() {
        return consulta;
    }

    /**
     * Define el valor de la propiedad consulta.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaFolioFiscalRequest }
     *     
     */
    public void setConsulta(ConsultaFolioFiscalRequest value) {
        this.consulta = value;
    }

}
