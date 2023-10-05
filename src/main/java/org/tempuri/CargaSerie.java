
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
 *         &lt;element name="uploadSerie" type="{http://tempuri.org/}UploadSerieRequest" minOccurs="0"/&gt;
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
    "uploadSerie"
})
@XmlRootElement(name = "CargaSerie")
public class CargaSerie {

    protected UploadSerieRequest uploadSerie;

    /**
     * Obtiene el valor de la propiedad uploadSerie.
     * 
     * @return
     *     possible object is
     *     {@link UploadSerieRequest }
     *     
     */
    public UploadSerieRequest getUploadSerie() {
        return uploadSerie;
    }

    /**
     * Define el valor de la propiedad uploadSerie.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadSerieRequest }
     *     
     */
    public void setUploadSerie(UploadSerieRequest value) {
        this.uploadSerie = value;
    }

}
