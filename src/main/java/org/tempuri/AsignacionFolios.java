
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
 *         &lt;element name="Asigna" type="{http://tempuri.org/}AsignaFolios" minOccurs="0"/&gt;
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
    "asigna"
})
@XmlRootElement(name = "AsignacionFolios")
public class AsignacionFolios {

    @XmlElement(name = "Asigna")
    protected AsignaFolios2 asigna;

    /**
     * Obtiene el valor de la propiedad asigna.
     * 
     * @return
     *     possible object is
     *     {@link AsignaFolios2 }
     *     
     */
    public AsignaFolios2 getAsigna() {
        return asigna;
    }

    /**
     * Define el valor de la propiedad asigna.
     * 
     * @param value
     *     allowed object is
     *     {@link AsignaFolios2 }
     *     
     */
    public void setAsigna(AsignaFolios2 value) {
        this.asigna = value;
    }

}
