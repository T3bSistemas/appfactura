
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
 *         &lt;element name="comerciorequest" type="{http://tempuri.org/}TimbradoPlusComercioExteriorRequest" minOccurs="0"/&gt;
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
    "comerciorequest"
})
@XmlRootElement(name = "TimbraCFDIComercioExteriorplus11")
public class TimbraCFDIComercioExteriorplus11 {

    protected TimbradoPlusComercioExteriorRequest comerciorequest;

    /**
     * Obtiene el valor de la propiedad comerciorequest.
     * 
     * @return
     *     possible object is
     *     {@link TimbradoPlusComercioExteriorRequest }
     *     
     */
    public TimbradoPlusComercioExteriorRequest getComerciorequest() {
        return comerciorequest;
    }

    /**
     * Define el valor de la propiedad comerciorequest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimbradoPlusComercioExteriorRequest }
     *     
     */
    public void setComerciorequest(TimbradoPlusComercioExteriorRequest value) {
        this.comerciorequest = value;
    }

}
