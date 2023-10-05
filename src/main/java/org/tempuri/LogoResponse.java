
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LogoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LogoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LogoCorrecto" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Respuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogoResponse", propOrder = {
    "logoCorrecto",
    "respuesta"
})
public class LogoResponse {

    @XmlElement(name = "LogoCorrecto")
    protected boolean logoCorrecto;
    @XmlElement(name = "Respuesta")
    protected String respuesta;

    /**
     * Obtiene el valor de la propiedad logoCorrecto.
     * 
     */
    public boolean isLogoCorrecto() {
        return logoCorrecto;
    }

    /**
     * Define el valor de la propiedad logoCorrecto.
     * 
     */
    public void setLogoCorrecto(boolean value) {
        this.logoCorrecto = value;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespuesta(String value) {
        this.respuesta = value;
    }

}
