
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CatalogoDeCuentas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CatalogoDeCuentas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tempuri.org/}GeneralesConta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cuentas" type="{http://tempuri.org/}ArrayOfCuentaCatalogo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogoDeCuentas", propOrder = {
    "cuentas"
})
public class CatalogoDeCuentas
    extends GeneralesConta
{

    @XmlElement(name = "Cuentas")
    protected ArrayOfCuentaCatalogo cuentas;

    /**
     * Obtiene el valor de la propiedad cuentas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCuentaCatalogo }
     *     
     */
    public ArrayOfCuentaCatalogo getCuentas() {
        return cuentas;
    }

    /**
     * Define el valor de la propiedad cuentas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCuentaCatalogo }
     *     
     */
    public void setCuentas(ArrayOfCuentaCatalogo value) {
        this.cuentas = value;
    }

}
