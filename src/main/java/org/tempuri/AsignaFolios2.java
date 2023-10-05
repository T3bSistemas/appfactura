
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AsignaFolios complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AsignaFolios"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://tempuri.org/}Usuario" minOccurs="0"/&gt;
 *         &lt;element name="Datosasignacion" type="{http://tempuri.org/}Datosasignacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsignaFolios", propOrder = {
    "usuario",
    "datosasignacion"
})
public class AsignaFolios2 {

    @XmlElement(name = "Usuario")
    protected Usuario usuario;
    @XmlElement(name = "Datosasignacion")
    protected Datosasignacion datosasignacion;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad datosasignacion.
     * 
     * @return
     *     possible object is
     *     {@link Datosasignacion }
     *     
     */
    public Datosasignacion getDatosasignacion() {
        return datosasignacion;
    }

    /**
     * Define el valor de la propiedad datosasignacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Datosasignacion }
     *     
     */
    public void setDatosasignacion(Datosasignacion value) {
        this.datosasignacion = value;
    }

}
