
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CancelacionResponseOtroPac complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CancelacionResponseOtroPac"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArchivoSubido" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelacionResponseOtroPac", propOrder = {
    "archivoSubido",
    "descripcion"
})
public class CancelacionResponseOtroPac {

    @XmlElement(name = "ArchivoSubido")
    protected boolean archivoSubido;
    @XmlElement(name = "Descripcion")
    protected String descripcion;

    /**
     * Obtiene el valor de la propiedad archivoSubido.
     * 
     */
    public boolean isArchivoSubido() {
        return archivoSubido;
    }

    /**
     * Define el valor de la propiedad archivoSubido.
     * 
     */
    public void setArchivoSubido(boolean value) {
        this.archivoSubido = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

}
