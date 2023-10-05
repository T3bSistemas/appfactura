
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CasaLey complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CasaLey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PROVEEDOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CENTRO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_ENTRADA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_DE_ENTRADA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROVEEDOR_SAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NO_REMISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DESCUENTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Detalles" type="{http://tempuri.org/}CasaLeyDetalles" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CasaLey", propOrder = {
    "proveedor",
    "centro",
    "numeroentrada",
    "fechadeentrada",
    "proveedorsap",
    "noremision",
    "descuento",
    "detalles"
})
public class CasaLey {

    @XmlElement(name = "PROVEEDOR")
    protected String proveedor;
    @XmlElement(name = "CENTRO")
    protected String centro;
    @XmlElement(name = "NUMERO_ENTRADA")
    protected String numeroentrada;
    @XmlElement(name = "FECHA_DE_ENTRADA")
    protected String fechadeentrada;
    @XmlElement(name = "PROVEEDOR_SAP")
    protected String proveedorsap;
    @XmlElement(name = "NO_REMISION")
    protected String noremision;
    @XmlElement(name = "DESCUENTO")
    protected String descuento;
    @XmlElement(name = "Detalles")
    protected CasaLeyDetalles detalles;

    /**
     * Obtiene el valor de la propiedad proveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVEEDOR() {
        return proveedor;
    }

    /**
     * Define el valor de la propiedad proveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVEEDOR(String value) {
        this.proveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad centro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCENTRO() {
        return centro;
    }

    /**
     * Define el valor de la propiedad centro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCENTRO(String value) {
        this.centro = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroentrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROENTRADA() {
        return numeroentrada;
    }

    /**
     * Define el valor de la propiedad numeroentrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROENTRADA(String value) {
        this.numeroentrada = value;
    }

    /**
     * Obtiene el valor de la propiedad fechadeentrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHADEENTRADA() {
        return fechadeentrada;
    }

    /**
     * Define el valor de la propiedad fechadeentrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHADEENTRADA(String value) {
        this.fechadeentrada = value;
    }

    /**
     * Obtiene el valor de la propiedad proveedorsap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVEEDORSAP() {
        return proveedorsap;
    }

    /**
     * Define el valor de la propiedad proveedorsap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVEEDORSAP(String value) {
        this.proveedorsap = value;
    }

    /**
     * Obtiene el valor de la propiedad noremision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOREMISION() {
        return noremision;
    }

    /**
     * Define el valor de la propiedad noremision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOREMISION(String value) {
        this.noremision = value;
    }

    /**
     * Obtiene el valor de la propiedad descuento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCUENTO() {
        return descuento;
    }

    /**
     * Define el valor de la propiedad descuento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCUENTO(String value) {
        this.descuento = value;
    }

    /**
     * Obtiene el valor de la propiedad detalles.
     * 
     * @return
     *     possible object is
     *     {@link CasaLeyDetalles }
     *     
     */
    public CasaLeyDetalles getDetalles() {
        return detalles;
    }

    /**
     * Define el valor de la propiedad detalles.
     * 
     * @param value
     *     allowed object is
     *     {@link CasaLeyDetalles }
     *     
     */
    public void setDetalles(CasaLeyDetalles value) {
        this.detalles = value;
    }

}
