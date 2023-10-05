
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CFDIRequest40ComplementoDePago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CFDIRequest40ComplementoDePago"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatosCFDI" type="{http://tempuri.org/}DatosCFDI40" minOccurs="0"/&gt;
 *         &lt;element name="CFDIRelacion40" type="{http://tempuri.org/}ArrayOfCFDISRelacionados40" minOccurs="0"/&gt;
 *         &lt;element name="ReceptorCFDI" type="{http://tempuri.org/}ReceptorCFDI40" minOccurs="0"/&gt;
 *         &lt;element name="ConceptosCFD" type="{http://tempuri.org/}ConceptosCFDI40" minOccurs="0"/&gt;
 *         &lt;element name="Addenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdBPPago" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Pago" type="{http://tempuri.org/}ComplementoPagos40" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFDIRequest40ComplementoDePago", propOrder = {
    "usuario",
    "contrasena",
    "datosCFDI",
    "cfdiRelacion40",
    "receptorCFDI",
    "conceptosCFD",
    "addenda",
    "idBPPago",
    "pago"
})
public class CFDIRequest40ComplementoDePago {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Contrasena")
    protected String contrasena;
    @XmlElement(name = "DatosCFDI")
    protected DatosCFDI40 datosCFDI;
    @XmlElement(name = "CFDIRelacion40")
    protected ArrayOfCFDISRelacionados40 cfdiRelacion40;
    @XmlElement(name = "ReceptorCFDI")
    protected ReceptorCFDI40 receptorCFDI;
    @XmlElement(name = "ConceptosCFD")
    protected ConceptosCFDI40 conceptosCFD;
    @XmlElement(name = "Addenda")
    protected String addenda;
    @XmlElement(name = "IdBPPago")
    protected int idBPPago;
    @XmlElement(name = "Pago")
    protected ComplementoPagos40 pago;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Define el valor de la propiedad contrasena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasena(String value) {
        this.contrasena = value;
    }

    /**
     * Obtiene el valor de la propiedad datosCFDI.
     * 
     * @return
     *     possible object is
     *     {@link DatosCFDI40 }
     *     
     */
    public DatosCFDI40 getDatosCFDI() {
        return datosCFDI;
    }

    /**
     * Define el valor de la propiedad datosCFDI.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosCFDI40 }
     *     
     */
    public void setDatosCFDI(DatosCFDI40 value) {
        this.datosCFDI = value;
    }

    /**
     * Obtiene el valor de la propiedad cfdiRelacion40.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCFDISRelacionados40 }
     *     
     */
    public ArrayOfCFDISRelacionados40 getCFDIRelacion40() {
        return cfdiRelacion40;
    }

    /**
     * Define el valor de la propiedad cfdiRelacion40.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCFDISRelacionados40 }
     *     
     */
    public void setCFDIRelacion40(ArrayOfCFDISRelacionados40 value) {
        this.cfdiRelacion40 = value;
    }

    /**
     * Obtiene el valor de la propiedad receptorCFDI.
     * 
     * @return
     *     possible object is
     *     {@link ReceptorCFDI40 }
     *     
     */
    public ReceptorCFDI40 getReceptorCFDI() {
        return receptorCFDI;
    }

    /**
     * Define el valor de la propiedad receptorCFDI.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceptorCFDI40 }
     *     
     */
    public void setReceptorCFDI(ReceptorCFDI40 value) {
        this.receptorCFDI = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptosCFD.
     * 
     * @return
     *     possible object is
     *     {@link ConceptosCFDI40 }
     *     
     */
    public ConceptosCFDI40 getConceptosCFD() {
        return conceptosCFD;
    }

    /**
     * Define el valor de la propiedad conceptosCFD.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptosCFDI40 }
     *     
     */
    public void setConceptosCFD(ConceptosCFDI40 value) {
        this.conceptosCFD = value;
    }

    /**
     * Obtiene el valor de la propiedad addenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddenda() {
        return addenda;
    }

    /**
     * Define el valor de la propiedad addenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddenda(String value) {
        this.addenda = value;
    }

    /**
     * Obtiene el valor de la propiedad idBPPago.
     * 
     */
    public int getIdBPPago() {
        return idBPPago;
    }

    /**
     * Define el valor de la propiedad idBPPago.
     * 
     */
    public void setIdBPPago(int value) {
        this.idBPPago = value;
    }

    /**
     * Obtiene el valor de la propiedad pago.
     * 
     * @return
     *     possible object is
     *     {@link ComplementoPagos40 }
     *     
     */
    public ComplementoPagos40 getPago() {
        return pago;
    }

    /**
     * Define el valor de la propiedad pago.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementoPagos40 }
     *     
     */
    public void setPago(ComplementoPagos40 value) {
        this.pago = value;
    }

}
