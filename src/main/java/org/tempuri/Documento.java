
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Documento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Documento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdDoc" type="{http://tempuri.org/}IdDoc" minOccurs="0"/&gt;
 *         &lt;element name="ExEmisor" type="{http://tempuri.org/}ExEmisor" minOccurs="0"/&gt;
 *         &lt;element name="ExReceptor" type="{http://tempuri.org/}ExReceptor" minOccurs="0"/&gt;
 *         &lt;element name="Totales" type="{http://tempuri.org/}Totales" minOccurs="0"/&gt;
 *         &lt;element name="DetallesDoc" type="{http://tempuri.org/}DetallesDoc" minOccurs="0"/&gt;
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Documento", propOrder = {
    "idDocumento",
    "idDoc",
    "exEmisor",
    "exReceptor",
    "totales",
    "detallesDoc",
    "timeStamp"
})
public class Documento {

    @XmlElement(name = "IDDocumento")
    protected String idDocumento;
    @XmlElement(name = "IdDoc")
    protected IdDoc idDoc;
    @XmlElement(name = "ExEmisor")
    protected ExEmisor exEmisor;
    @XmlElement(name = "ExReceptor")
    protected ExReceptor exReceptor;
    @XmlElement(name = "Totales")
    protected Totales totales;
    @XmlElement(name = "DetallesDoc")
    protected DetallesDoc detallesDoc;
    @XmlElement(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Obtiene el valor de la propiedad idDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDDocumento() {
        return idDocumento;
    }

    /**
     * Define el valor de la propiedad idDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDDocumento(String value) {
        this.idDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad idDoc.
     * 
     * @return
     *     possible object is
     *     {@link IdDoc }
     *     
     */
    public IdDoc getIdDoc() {
        return idDoc;
    }

    /**
     * Define el valor de la propiedad idDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link IdDoc }
     *     
     */
    public void setIdDoc(IdDoc value) {
        this.idDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad exEmisor.
     * 
     * @return
     *     possible object is
     *     {@link ExEmisor }
     *     
     */
    public ExEmisor getExEmisor() {
        return exEmisor;
    }

    /**
     * Define el valor de la propiedad exEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link ExEmisor }
     *     
     */
    public void setExEmisor(ExEmisor value) {
        this.exEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad exReceptor.
     * 
     * @return
     *     possible object is
     *     {@link ExReceptor }
     *     
     */
    public ExReceptor getExReceptor() {
        return exReceptor;
    }

    /**
     * Define el valor de la propiedad exReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link ExReceptor }
     *     
     */
    public void setExReceptor(ExReceptor value) {
        this.exReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad totales.
     * 
     * @return
     *     possible object is
     *     {@link Totales }
     *     
     */
    public Totales getTotales() {
        return totales;
    }

    /**
     * Define el valor de la propiedad totales.
     * 
     * @param value
     *     allowed object is
     *     {@link Totales }
     *     
     */
    public void setTotales(Totales value) {
        this.totales = value;
    }

    /**
     * Obtiene el valor de la propiedad detallesDoc.
     * 
     * @return
     *     possible object is
     *     {@link DetallesDoc }
     *     
     */
    public DetallesDoc getDetallesDoc() {
        return detallesDoc;
    }

    /**
     * Define el valor de la propiedad detallesDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link DetallesDoc }
     *     
     */
    public void setDetallesDoc(DetallesDoc value) {
        this.detallesDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad timeStamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Define el valor de la propiedad timeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

}
