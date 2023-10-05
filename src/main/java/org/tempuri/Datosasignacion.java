
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Datosasignacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Datosasignacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UsuariosCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cantidadfolio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fechaexpiracion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Datosasignacion", propOrder = {
    "usuariosCliente",
    "cantidadfolio",
    "fechaexpiracion"
})
public class Datosasignacion {

    @XmlElement(name = "UsuariosCliente")
    protected String usuariosCliente;
    @XmlElement(name = "Cantidadfolio")
    protected int cantidadfolio;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaexpiracion;

    /**
     * Obtiene el valor de la propiedad usuariosCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuariosCliente() {
        return usuariosCliente;
    }

    /**
     * Define el valor de la propiedad usuariosCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuariosCliente(String value) {
        this.usuariosCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadfolio.
     * 
     */
    public int getCantidadfolio() {
        return cantidadfolio;
    }

    /**
     * Define el valor de la propiedad cantidadfolio.
     * 
     */
    public void setCantidadfolio(int value) {
        this.cantidadfolio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaexpiracion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaexpiracion() {
        return fechaexpiracion;
    }

    /**
     * Define el valor de la propiedad fechaexpiracion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaexpiracion(XMLGregorianCalendar value) {
        this.fechaexpiracion = value;
    }

}
