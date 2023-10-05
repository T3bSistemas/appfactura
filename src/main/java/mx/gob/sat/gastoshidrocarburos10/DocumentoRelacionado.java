
package mx.gob.sat.gastoshidrocarburos10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para DocumentoRelacionado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DocumentoRelacionado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="OrigenErogacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FolioFiscalVinculado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RFCProveedor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MontoTotalIVA" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MontoRetencionISR" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MontoRetencionIVA" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MontoRetencionOtrosImpuestos" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NumeroPedimentoVinculado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ClavePedimentoVinculado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ClavePagoPedimentoVinculado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MontoIVAPedimento" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OtrosImpuestosPagadosPedimento" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FechaFolioFiscalVinculado" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="Mes" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MontoTotalErogaciones" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoRelacionado")
public class DocumentoRelacionado {

    @XmlAttribute(name = "OrigenErogacion")
    protected String origenErogacion;
    @XmlAttribute(name = "FolioFiscalVinculado")
    protected String folioFiscalVinculado;
    @XmlAttribute(name = "RFCProveedor")
    protected String rfcProveedor;
    @XmlAttribute(name = "MontoTotalIVA")
    protected String montoTotalIVA;
    @XmlAttribute(name = "MontoRetencionISR")
    protected String montoRetencionISR;
    @XmlAttribute(name = "MontoRetencionIVA")
    protected String montoRetencionIVA;
    @XmlAttribute(name = "MontoRetencionOtrosImpuestos")
    protected String montoRetencionOtrosImpuestos;
    @XmlAttribute(name = "NumeroPedimentoVinculado")
    protected String numeroPedimentoVinculado;
    @XmlAttribute(name = "ClavePedimentoVinculado")
    protected String clavePedimentoVinculado;
    @XmlAttribute(name = "ClavePagoPedimentoVinculado")
    protected String clavePagoPedimentoVinculado;
    @XmlAttribute(name = "MontoIVAPedimento")
    protected String montoIVAPedimento;
    @XmlAttribute(name = "OtrosImpuestosPagadosPedimento")
    protected String otrosImpuestosPagadosPedimento;
    @XmlAttribute(name = "FechaFolioFiscalVinculado", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFolioFiscalVinculado;
    @XmlAttribute(name = "Mes")
    protected String mes;
    @XmlAttribute(name = "MontoTotalErogaciones")
    protected String montoTotalErogaciones;

    /**
     * Obtiene el valor de la propiedad origenErogacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigenErogacion() {
        return origenErogacion;
    }

    /**
     * Define el valor de la propiedad origenErogacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigenErogacion(String value) {
        this.origenErogacion = value;
    }

    /**
     * Obtiene el valor de la propiedad folioFiscalVinculado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioFiscalVinculado() {
        return folioFiscalVinculado;
    }

    /**
     * Define el valor de la propiedad folioFiscalVinculado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioFiscalVinculado(String value) {
        this.folioFiscalVinculado = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCProveedor() {
        return rfcProveedor;
    }

    /**
     * Define el valor de la propiedad rfcProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCProveedor(String value) {
        this.rfcProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalIVA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoTotalIVA() {
        return montoTotalIVA;
    }

    /**
     * Define el valor de la propiedad montoTotalIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoTotalIVA(String value) {
        this.montoTotalIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad montoRetencionISR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoRetencionISR() {
        return montoRetencionISR;
    }

    /**
     * Define el valor de la propiedad montoRetencionISR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoRetencionISR(String value) {
        this.montoRetencionISR = value;
    }

    /**
     * Obtiene el valor de la propiedad montoRetencionIVA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoRetencionIVA() {
        return montoRetencionIVA;
    }

    /**
     * Define el valor de la propiedad montoRetencionIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoRetencionIVA(String value) {
        this.montoRetencionIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad montoRetencionOtrosImpuestos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoRetencionOtrosImpuestos() {
        return montoRetencionOtrosImpuestos;
    }

    /**
     * Define el valor de la propiedad montoRetencionOtrosImpuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoRetencionOtrosImpuestos(String value) {
        this.montoRetencionOtrosImpuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPedimentoVinculado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPedimentoVinculado() {
        return numeroPedimentoVinculado;
    }

    /**
     * Define el valor de la propiedad numeroPedimentoVinculado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPedimentoVinculado(String value) {
        this.numeroPedimentoVinculado = value;
    }

    /**
     * Obtiene el valor de la propiedad clavePedimentoVinculado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClavePedimentoVinculado() {
        return clavePedimentoVinculado;
    }

    /**
     * Define el valor de la propiedad clavePedimentoVinculado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClavePedimentoVinculado(String value) {
        this.clavePedimentoVinculado = value;
    }

    /**
     * Obtiene el valor de la propiedad clavePagoPedimentoVinculado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClavePagoPedimentoVinculado() {
        return clavePagoPedimentoVinculado;
    }

    /**
     * Define el valor de la propiedad clavePagoPedimentoVinculado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClavePagoPedimentoVinculado(String value) {
        this.clavePagoPedimentoVinculado = value;
    }

    /**
     * Obtiene el valor de la propiedad montoIVAPedimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoIVAPedimento() {
        return montoIVAPedimento;
    }

    /**
     * Define el valor de la propiedad montoIVAPedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoIVAPedimento(String value) {
        this.montoIVAPedimento = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosImpuestosPagadosPedimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtrosImpuestosPagadosPedimento() {
        return otrosImpuestosPagadosPedimento;
    }

    /**
     * Define el valor de la propiedad otrosImpuestosPagadosPedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtrosImpuestosPagadosPedimento(String value) {
        this.otrosImpuestosPagadosPedimento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFolioFiscalVinculado.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFolioFiscalVinculado() {
        return fechaFolioFiscalVinculado;
    }

    /**
     * Define el valor de la propiedad fechaFolioFiscalVinculado.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFolioFiscalVinculado(XMLGregorianCalendar value) {
        this.fechaFolioFiscalVinculado = value;
    }

    /**
     * Obtiene el valor de la propiedad mes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMes() {
        return mes;
    }

    /**
     * Define el valor de la propiedad mes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMes(String value) {
        this.mes = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalErogaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoTotalErogaciones() {
        return montoTotalErogaciones;
    }

    /**
     * Define el valor de la propiedad montoTotalErogaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoTotalErogaciones(String value) {
        this.montoTotalErogaciones = value;
    }

}
