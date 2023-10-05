
package mx.gob.sat.ine;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para INE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="INE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entidad" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Contabilidad" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="IdContabilidad" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ClaveEntidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Ambito" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="TipoProceso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TipoComite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IdContabilidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INE", propOrder = {
    "entidad"
})
public class INE {

    @XmlElement(name = "Entidad")
    protected List<INE.Entidad> entidad;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "TipoProceso")
    protected String tipoProceso;
    @XmlAttribute(name = "TipoComite")
    protected String tipoComite;
    @XmlAttribute(name = "IdContabilidad")
    protected String idContabilidad;

    /**
     * Gets the value of the entidad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entidad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntidad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INE.Entidad }
     * 
     * 
     */
    public List<INE.Entidad> getEntidad() {
        if (entidad == null) {
            entidad = new ArrayList<INE.Entidad>();
        }
        return this.entidad;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoProceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoProceso() {
        return tipoProceso;
    }

    /**
     * Define el valor de la propiedad tipoProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoProceso(String value) {
        this.tipoProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoComite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoComite() {
        return tipoComite;
    }

    /**
     * Define el valor de la propiedad tipoComite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoComite(String value) {
        this.tipoComite = value;
    }

    /**
     * Obtiene el valor de la propiedad idContabilidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdContabilidad() {
        return idContabilidad;
    }

    /**
     * Define el valor de la propiedad idContabilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdContabilidad(String value) {
        this.idContabilidad = value;
    }


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
     *         &lt;element name="Contabilidad" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="IdContabilidad" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ClaveEntidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Ambito" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contabilidad"
    })
    public static class Entidad {

        @XmlElement(name = "Contabilidad")
        protected List<INE.Entidad.Contabilidad> contabilidad;
        @XmlAttribute(name = "ClaveEntidad")
        protected String claveEntidad;
        @XmlAttribute(name = "Ambito")
        protected String ambito;

        /**
         * Gets the value of the contabilidad property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contabilidad property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContabilidad().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INE.Entidad.Contabilidad }
         * 
         * 
         */
        public List<INE.Entidad.Contabilidad> getContabilidad() {
            if (contabilidad == null) {
                contabilidad = new ArrayList<INE.Entidad.Contabilidad>();
            }
            return this.contabilidad;
        }

        /**
         * Obtiene el valor de la propiedad claveEntidad.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClaveEntidad() {
            return claveEntidad;
        }

        /**
         * Define el valor de la propiedad claveEntidad.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClaveEntidad(String value) {
            this.claveEntidad = value;
        }

        /**
         * Obtiene el valor de la propiedad ambito.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmbito() {
            return ambito;
        }

        /**
         * Define el valor de la propiedad ambito.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmbito(String value) {
            this.ambito = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="IdContabilidad" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Contabilidad {

            @XmlAttribute(name = "IdContabilidad", required = true)
            @XmlSchemaType(name = "unsignedInt")
            protected long idContabilidad;

            /**
             * Obtiene el valor de la propiedad idContabilidad.
             * 
             */
            public long getIdContabilidad() {
                return idContabilidad;
            }

            /**
             * Define el valor de la propiedad idContabilidad.
             * 
             */
            public void setIdContabilidad(long value) {
                this.idContabilidad = value;
            }

        }

    }

}
