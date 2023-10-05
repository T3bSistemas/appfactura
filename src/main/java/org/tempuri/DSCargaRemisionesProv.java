
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DSCargaRemisionesProv complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DSCargaRemisionesProv"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dscargaRemisionesProv" type="{http://tempuri.org/}ArrayOfDSCargaRemisionProv" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSCargaRemisionesProv", propOrder = {
    "dscargaRemisionesProv"
})
public class DSCargaRemisionesProv {

    protected ArrayOfDSCargaRemisionProv dscargaRemisionesProv;

    /**
     * Obtiene el valor de la propiedad dscargaRemisionesProv.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDSCargaRemisionProv }
     *     
     */
    public ArrayOfDSCargaRemisionProv getDscargaRemisionesProv() {
        return dscargaRemisionesProv;
    }

    /**
     * Define el valor de la propiedad dscargaRemisionesProv.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDSCargaRemisionProv }
     *     
     */
    public void setDscargaRemisionesProv(ArrayOfDSCargaRemisionProv value) {
        this.dscargaRemisionesProv = value;
    }

}
