
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubsidioAlEmpleo33 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubsidioAlEmpleo33"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubsidioCausado" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsidioAlEmpleo33", propOrder = {
    "subsidioCausado"
})
public class SubsidioAlEmpleo33 {

    @XmlElement(name = "SubsidioCausado")
    protected double subsidioCausado;

    /**
     * Obtiene el valor de la propiedad subsidioCausado.
     * 
     */
    public double getSubsidioCausado() {
        return subsidioCausado;
    }

    /**
     * Define el valor de la propiedad subsidioCausado.
     * 
     */
    public void setSubsidioCausado(double value) {
        this.subsidioCausado = value;
    }

}
