
package mx.gob.sat.cartaporte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfCartaPorteFiguraTransporteOperadoresOperador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCartaPorteFiguraTransporteOperadoresOperador"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Operador" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Domicilio" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Calle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumeroExterior" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumeroInterior" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Colonia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Localidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="RFCOperador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="NumLicencia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="NombreOperador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="NumRegIdTribOperador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ResidenciaFiscalOperador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCartaPorteFiguraTransporteOperadoresOperador", propOrder = {
    "operador"
})
public class ArrayOfCartaPorteFiguraTransporteOperadoresOperador {

    @XmlElement(name = "Operador")
    protected List<ArrayOfCartaPorteFiguraTransporteOperadoresOperador.Operador> operador;

    /**
     * Gets the value of the operador property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operador property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperador().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCartaPorteFiguraTransporteOperadoresOperador.Operador }
     * 
     * 
     */
    public List<ArrayOfCartaPorteFiguraTransporteOperadoresOperador.Operador> getOperador() {
        if (operador == null) {
            operador = new ArrayList<ArrayOfCartaPorteFiguraTransporteOperadoresOperador.Operador>();
        }
        return this.operador;
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
     *         &lt;element name="Domicilio" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Calle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumeroExterior" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumeroInterior" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Colonia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Localidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="RFCOperador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="NumLicencia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="NombreOperador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="NumRegIdTribOperador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ResidenciaFiscalOperador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "domicilio"
    })
    public static class Operador {

        @XmlElement(name = "Domicilio")
        protected ArrayOfCartaPorteFiguraTransporteOperadoresOperador.Operador.Domicilio domicilio;
        @XmlAttribute(name = "RFCOperador")
        protected String rfcOperador;
        @XmlAttribute(name = "NumLicencia")
        protected String numLicencia;
        @XmlAttribute(name = "NombreOperador")
        protected String nombreOperador;
        @XmlAttribute(name = "NumRegIdTribOperador")
        protected String numRegIdTribOperador;
        @XmlAttribute(name = "ResidenciaFiscalOperador")
        protected String residenciaFiscalOperador;

        /**
         * Obtiene el valor de la propiedad domicilio.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfCartaPorteFiguraTransporteOperadoresOperador.Operador.Domicilio }
         *     
         */
        public ArrayOfCartaPorteFiguraTransporteOperadoresOperador.Operador.Domicilio getDomicilio() {
            return domicilio;
        }

        /**
         * Define el valor de la propiedad domicilio.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfCartaPorteFiguraTransporteOperadoresOperador.Operador.Domicilio }
         *     
         */
        public void setDomicilio(ArrayOfCartaPorteFiguraTransporteOperadoresOperador.Operador.Domicilio value) {
            this.domicilio = value;
        }

        /**
         * Obtiene el valor de la propiedad rfcOperador.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRFCOperador() {
            return rfcOperador;
        }

        /**
         * Define el valor de la propiedad rfcOperador.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRFCOperador(String value) {
            this.rfcOperador = value;
        }

        /**
         * Obtiene el valor de la propiedad numLicencia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumLicencia() {
            return numLicencia;
        }

        /**
         * Define el valor de la propiedad numLicencia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumLicencia(String value) {
            this.numLicencia = value;
        }

        /**
         * Obtiene el valor de la propiedad nombreOperador.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombreOperador() {
            return nombreOperador;
        }

        /**
         * Define el valor de la propiedad nombreOperador.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombreOperador(String value) {
            this.nombreOperador = value;
        }

        /**
         * Obtiene el valor de la propiedad numRegIdTribOperador.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumRegIdTribOperador() {
            return numRegIdTribOperador;
        }

        /**
         * Define el valor de la propiedad numRegIdTribOperador.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumRegIdTribOperador(String value) {
            this.numRegIdTribOperador = value;
        }

        /**
         * Obtiene el valor de la propiedad residenciaFiscalOperador.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResidenciaFiscalOperador() {
            return residenciaFiscalOperador;
        }

        /**
         * Define el valor de la propiedad residenciaFiscalOperador.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResidenciaFiscalOperador(String value) {
            this.residenciaFiscalOperador = value;
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
         *       &lt;attribute name="Calle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumeroExterior" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumeroInterior" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Colonia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Localidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Domicilio {

            @XmlAttribute(name = "Calle")
            protected String calle;
            @XmlAttribute(name = "NumeroExterior")
            protected String numeroExterior;
            @XmlAttribute(name = "NumeroInterior")
            protected String numeroInterior;
            @XmlAttribute(name = "Colonia")
            protected String colonia;
            @XmlAttribute(name = "Localidad")
            protected String localidad;
            @XmlAttribute(name = "Referencia")
            protected String referencia;
            @XmlAttribute(name = "Municipio")
            protected String municipio;
            @XmlAttribute(name = "Estado")
            protected String estado;
            @XmlAttribute(name = "Pais")
            protected String pais;
            @XmlAttribute(name = "CodigoPostal")
            protected String codigoPostal;

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
             * Obtiene el valor de la propiedad numeroExterior.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroExterior() {
                return numeroExterior;
            }

            /**
             * Define el valor de la propiedad numeroExterior.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroExterior(String value) {
                this.numeroExterior = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroInterior.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroInterior() {
                return numeroInterior;
            }

            /**
             * Define el valor de la propiedad numeroInterior.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroInterior(String value) {
                this.numeroInterior = value;
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
             * Obtiene el valor de la propiedad localidad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocalidad() {
                return localidad;
            }

            /**
             * Define el valor de la propiedad localidad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocalidad(String value) {
                this.localidad = value;
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
             * Obtiene el valor de la propiedad municipio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMunicipio() {
                return municipio;
            }

            /**
             * Define el valor de la propiedad municipio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMunicipio(String value) {
                this.municipio = value;
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
             * Obtiene el valor de la propiedad codigoPostal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoPostal() {
                return codigoPostal;
            }

            /**
             * Define el valor de la propiedad codigoPostal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoPostal(String value) {
                this.codigoPostal = value;
            }

        }

    }

}
