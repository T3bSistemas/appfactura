
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClienteEmisor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClienteEmisor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="opt" type="{http://tempuri.org/}Opciones" minOccurs="0"/&gt;
 *         &lt;element name="Rol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegimenFiscal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FacAtrAdquirente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdMatriz" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="decimales" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Fecha72hrs" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumInt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Colonia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Delegacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="s_Calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="s_NumExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="s_NumInt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="s_Colonia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="s_Ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="s_Delegacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="s_Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="s_Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="s_CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="s_Referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TBNEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mensajePDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumCert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Certificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DC_LlavePrivada" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="DC_PwdLlavePrivada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DC_Certificado" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="DC_CertificadoTimbrado" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="logo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="CURP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrigenRecurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MontoRecursoPropio" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RegistroPatronal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RfcPatronOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClienteEmisor", propOrder = {
    "id",
    "opt",
    "rol",
    "rfc",
    "razonSocial",
    "email",
    "url",
    "telefono",
    "regimenFiscal",
    "facAtrAdquirente",
    "idMatriz",
    "decimales",
    "fecha72Hrs",
    "calle",
    "numExt",
    "numInt",
    "colonia",
    "ciudad",
    "referencia",
    "delegacion",
    "estado",
    "pais",
    "cp",
    "sCalle",
    "sNumExt",
    "sNumInt",
    "sColonia",
    "sCiudad",
    "sDelegacion",
    "sEstado",
    "sPais",
    "scp",
    "sReferencia",
    "tbnEmisor",
    "mensajePDF",
    "numCert",
    "certificado",
    "dcLlavePrivada",
    "dcPwdLlavePrivada",
    "dcCertificado",
    "dcCertificadoTimbrado",
    "logo",
    "curp",
    "origenRecurso",
    "montoRecursoPropio",
    "registroPatronal",
    "rfcPatronOrigen"
})
public class ClienteEmisor {

    @XmlElement(name = "Id")
    protected int id;
    protected Opciones opt;
    @XmlElement(name = "Rol")
    protected String rol;
    @XmlElement(name = "RFC")
    protected String rfc;
    @XmlElement(name = "RazonSocial")
    protected String razonSocial;
    @XmlElement(name = "Email")
    protected String email;
    protected String url;
    protected String telefono;
    @XmlElement(name = "RegimenFiscal")
    protected String regimenFiscal;
    @XmlElement(name = "FacAtrAdquirente")
    protected String facAtrAdquirente;
    @XmlElement(name = "IdMatriz")
    protected int idMatriz;
    protected int decimales;
    @XmlElement(name = "Fecha72hrs")
    protected int fecha72Hrs;
    @XmlElement(name = "Calle")
    protected String calle;
    @XmlElement(name = "NumExt")
    protected String numExt;
    @XmlElement(name = "NumInt")
    protected String numInt;
    @XmlElement(name = "Colonia")
    protected String colonia;
    @XmlElement(name = "Ciudad")
    protected String ciudad;
    @XmlElement(name = "Referencia")
    protected String referencia;
    @XmlElement(name = "Delegacion")
    protected String delegacion;
    @XmlElement(name = "Estado")
    protected String estado;
    @XmlElement(name = "Pais")
    protected String pais;
    @XmlElement(name = "CP")
    protected String cp;
    @XmlElement(name = "s_Calle")
    protected String sCalle;
    @XmlElement(name = "s_NumExt")
    protected String sNumExt;
    @XmlElement(name = "s_NumInt")
    protected String sNumInt;
    @XmlElement(name = "s_Colonia")
    protected String sColonia;
    @XmlElement(name = "s_Ciudad")
    protected String sCiudad;
    @XmlElement(name = "s_Delegacion")
    protected String sDelegacion;
    @XmlElement(name = "s_Estado")
    protected String sEstado;
    @XmlElement(name = "s_Pais")
    protected String sPais;
    @XmlElement(name = "s_CP")
    protected String scp;
    @XmlElement(name = "s_Referencia")
    protected String sReferencia;
    @XmlElement(name = "TBNEmisor")
    protected String tbnEmisor;
    protected String mensajePDF;
    @XmlElement(name = "NumCert")
    protected String numCert;
    @XmlElement(name = "Certificado")
    protected String certificado;
    @XmlElement(name = "DC_LlavePrivada")
    protected byte[] dcLlavePrivada;
    @XmlElement(name = "DC_PwdLlavePrivada")
    protected String dcPwdLlavePrivada;
    @XmlElement(name = "DC_Certificado")
    protected byte[] dcCertificado;
    @XmlElement(name = "DC_CertificadoTimbrado")
    protected byte[] dcCertificadoTimbrado;
    protected byte[] logo;
    @XmlElement(name = "CURP")
    protected String curp;
    @XmlElement(name = "OrigenRecurso")
    protected String origenRecurso;
    @XmlElement(name = "MontoRecursoPropio")
    protected double montoRecursoPropio;
    @XmlElement(name = "RegistroPatronal")
    protected String registroPatronal;
    @XmlElement(name = "RfcPatronOrigen")
    protected String rfcPatronOrigen;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad opt.
     * 
     * @return
     *     possible object is
     *     {@link Opciones }
     *     
     */
    public Opciones getOpt() {
        return opt;
    }

    /**
     * Define el valor de la propiedad opt.
     * 
     * @param value
     *     allowed object is
     *     {@link Opciones }
     *     
     */
    public void setOpt(Opciones value) {
        this.opt = value;
    }

    /**
     * Obtiene el valor de la propiedad rol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRol() {
        return rol;
    }

    /**
     * Define el valor de la propiedad rol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRol(String value) {
        this.rol = value;
    }

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFC() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFC(String value) {
        this.rfc = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad regimenFiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimenFiscal() {
        return regimenFiscal;
    }

    /**
     * Define el valor de la propiedad regimenFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimenFiscal(String value) {
        this.regimenFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad facAtrAdquirente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacAtrAdquirente() {
        return facAtrAdquirente;
    }

    /**
     * Define el valor de la propiedad facAtrAdquirente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacAtrAdquirente(String value) {
        this.facAtrAdquirente = value;
    }

    /**
     * Obtiene el valor de la propiedad idMatriz.
     * 
     */
    public int getIdMatriz() {
        return idMatriz;
    }

    /**
     * Define el valor de la propiedad idMatriz.
     * 
     */
    public void setIdMatriz(int value) {
        this.idMatriz = value;
    }

    /**
     * Obtiene el valor de la propiedad decimales.
     * 
     */
    public int getDecimales() {
        return decimales;
    }

    /**
     * Define el valor de la propiedad decimales.
     * 
     */
    public void setDecimales(int value) {
        this.decimales = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha72Hrs.
     * 
     */
    public int getFecha72Hrs() {
        return fecha72Hrs;
    }

    /**
     * Define el valor de la propiedad fecha72Hrs.
     * 
     */
    public void setFecha72Hrs(int value) {
        this.fecha72Hrs = value;
    }

    /**
     * Obtiene el valor de la propiedad calle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Define el valor de la propiedad calle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalle(String value) {
        this.calle = value;
    }

    /**
     * Obtiene el valor de la propiedad numExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumExt() {
        return numExt;
    }

    /**
     * Define el valor de la propiedad numExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumExt(String value) {
        this.numExt = value;
    }

    /**
     * Obtiene el valor de la propiedad numInt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumInt() {
        return numInt;
    }

    /**
     * Define el valor de la propiedad numInt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumInt(String value) {
        this.numInt = value;
    }

    /**
     * Obtiene el valor de la propiedad colonia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Define el valor de la propiedad colonia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColonia(String value) {
        this.colonia = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad delegacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegacion() {
        return delegacion;
    }

    /**
     * Define el valor de la propiedad delegacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegacion(String value) {
        this.delegacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad cp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCP() {
        return cp;
    }

    /**
     * Define el valor de la propiedad cp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCP(String value) {
        this.cp = value;
    }

    /**
     * Obtiene el valor de la propiedad sCalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCalle() {
        return sCalle;
    }

    /**
     * Define el valor de la propiedad sCalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCalle(String value) {
        this.sCalle = value;
    }

    /**
     * Obtiene el valor de la propiedad sNumExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNumExt() {
        return sNumExt;
    }

    /**
     * Define el valor de la propiedad sNumExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNumExt(String value) {
        this.sNumExt = value;
    }

    /**
     * Obtiene el valor de la propiedad sNumInt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNumInt() {
        return sNumInt;
    }

    /**
     * Define el valor de la propiedad sNumInt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNumInt(String value) {
        this.sNumInt = value;
    }

    /**
     * Obtiene el valor de la propiedad sColonia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSColonia() {
        return sColonia;
    }

    /**
     * Define el valor de la propiedad sColonia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSColonia(String value) {
        this.sColonia = value;
    }

    /**
     * Obtiene el valor de la propiedad sCiudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCiudad() {
        return sCiudad;
    }

    /**
     * Define el valor de la propiedad sCiudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCiudad(String value) {
        this.sCiudad = value;
    }

    /**
     * Obtiene el valor de la propiedad sDelegacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDelegacion() {
        return sDelegacion;
    }

    /**
     * Define el valor de la propiedad sDelegacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDelegacion(String value) {
        this.sDelegacion = value;
    }

    /**
     * Obtiene el valor de la propiedad sEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEstado() {
        return sEstado;
    }

    /**
     * Define el valor de la propiedad sEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEstado(String value) {
        this.sEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad sPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPais() {
        return sPais;
    }

    /**
     * Define el valor de la propiedad sPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPais(String value) {
        this.sPais = value;
    }

    /**
     * Obtiene el valor de la propiedad scp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCP() {
        return scp;
    }

    /**
     * Define el valor de la propiedad scp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCP(String value) {
        this.scp = value;
    }

    /**
     * Obtiene el valor de la propiedad sReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSReferencia() {
        return sReferencia;
    }

    /**
     * Define el valor de la propiedad sReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSReferencia(String value) {
        this.sReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad tbnEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTBNEmisor() {
        return tbnEmisor;
    }

    /**
     * Define el valor de la propiedad tbnEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTBNEmisor(String value) {
        this.tbnEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajePDF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajePDF() {
        return mensajePDF;
    }

    /**
     * Define el valor de la propiedad mensajePDF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajePDF(String value) {
        this.mensajePDF = value;
    }

    /**
     * Obtiene el valor de la propiedad numCert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCert() {
        return numCert;
    }

    /**
     * Define el valor de la propiedad numCert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCert(String value) {
        this.numCert = value;
    }

    /**
     * Obtiene el valor de la propiedad certificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificado() {
        return certificado;
    }

    /**
     * Define el valor de la propiedad certificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificado(String value) {
        this.certificado = value;
    }

    /**
     * Obtiene el valor de la propiedad dcLlavePrivada.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDCLlavePrivada() {
        return dcLlavePrivada;
    }

    /**
     * Define el valor de la propiedad dcLlavePrivada.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDCLlavePrivada(byte[] value) {
        this.dcLlavePrivada = value;
    }

    /**
     * Obtiene el valor de la propiedad dcPwdLlavePrivada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCPwdLlavePrivada() {
        return dcPwdLlavePrivada;
    }

    /**
     * Define el valor de la propiedad dcPwdLlavePrivada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCPwdLlavePrivada(String value) {
        this.dcPwdLlavePrivada = value;
    }

    /**
     * Obtiene el valor de la propiedad dcCertificado.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDCCertificado() {
        return dcCertificado;
    }

    /**
     * Define el valor de la propiedad dcCertificado.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDCCertificado(byte[] value) {
        this.dcCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad dcCertificadoTimbrado.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDCCertificadoTimbrado() {
        return dcCertificadoTimbrado;
    }

    /**
     * Define el valor de la propiedad dcCertificadoTimbrado.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDCCertificadoTimbrado(byte[] value) {
        this.dcCertificadoTimbrado = value;
    }

    /**
     * Obtiene el valor de la propiedad logo.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLogo() {
        return logo;
    }

    /**
     * Define el valor de la propiedad logo.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLogo(byte[] value) {
        this.logo = value;
    }

    /**
     * Obtiene el valor de la propiedad curp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURP() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURP(String value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad origenRecurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigenRecurso() {
        return origenRecurso;
    }

    /**
     * Define el valor de la propiedad origenRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigenRecurso(String value) {
        this.origenRecurso = value;
    }

    /**
     * Obtiene el valor de la propiedad montoRecursoPropio.
     * 
     */
    public double getMontoRecursoPropio() {
        return montoRecursoPropio;
    }

    /**
     * Define el valor de la propiedad montoRecursoPropio.
     * 
     */
    public void setMontoRecursoPropio(double value) {
        this.montoRecursoPropio = value;
    }

    /**
     * Obtiene el valor de la propiedad registroPatronal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroPatronal() {
        return registroPatronal;
    }

    /**
     * Define el valor de la propiedad registroPatronal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroPatronal(String value) {
        this.registroPatronal = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcPatronOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcPatronOrigen() {
        return rfcPatronOrigen;
    }

    /**
     * Define el valor de la propiedad rfcPatronOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcPatronOrigen(String value) {
        this.rfcPatronOrigen = value;
    }

}
