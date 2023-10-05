
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AuxiliarCuentas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AuxiliarCuentas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}GeneralesAuxiliares"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cuentas" type="{http://tempuri.org/}ArrayOfCuentasAux" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuxiliarCuentas", propOrder = {
    "cuentas"
})
public class AuxiliarCuentas
    extends GeneralesAuxiliares
{

    @XmlElement(name = "Cuentas")
    protected ArrayOfCuentasAux cuentas;

    /**
     * Obtiene el valor de la propiedad cuentas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCuentasAux }
     *     
     */
    public ArrayOfCuentasAux getCuentas() {
        return cuentas;
    }

    /**
     * Define el valor de la propiedad cuentas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCuentasAux }
     *     
     */
    public void setCuentas(ArrayOfCuentasAux value) {
        this.cuentas = value;
    }

}
