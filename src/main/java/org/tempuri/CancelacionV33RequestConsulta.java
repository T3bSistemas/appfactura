
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CancelacionV33RequestConsulta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CancelacionV33RequestConsulta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consulta" type="{http://tempuri.org/}Consulta" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelacionV33RequestConsulta", propOrder = {
    "consulta"
})
public class CancelacionV33RequestConsulta {

    protected Consulta consulta;

    /**
     * Obtiene el valor de la propiedad consulta.
     * 
     * @return
     *     possible object is
     *     {@link Consulta }
     *     
     */
    public Consulta getConsulta() {
        return consulta;
    }

    /**
     * Define el valor de la propiedad consulta.
     * 
     * @param value
     *     allowed object is
     *     {@link Consulta }
     *     
     */
    public void setConsulta(Consulta value) {
        this.consulta = value;
    }

}
