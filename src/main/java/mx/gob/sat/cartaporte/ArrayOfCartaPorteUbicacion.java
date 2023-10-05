
package mx.gob.sat.cartaporte;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ArrayOfCartaPorteUbicacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCartaPorteUbicacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ubicacion" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Origen" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="IDOrigen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="RFCRemitente" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NombreRemitente" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumRegIdTrib" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ResidenciaFiscal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumEstacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NombreEstacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NavegacionTrafico" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="FechaHoraSalida" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Destino" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="IDDestino" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="RFCDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NombreDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumRegIdTrib" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ResidenciaFiscal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumEstacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NombreEstacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NavegacionTrafico" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="FechaHoraProgLlegada" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
 *                 &lt;attribute name="TipoEstacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DistanciaRecorrida" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
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
@XmlType(name = "ArrayOfCartaPorteUbicacion", propOrder = {
    "ubicacion"
})
public class ArrayOfCartaPorteUbicacion {

    @XmlElement(name = "Ubicacion")
    protected List<ArrayOfCartaPorteUbicacion.Ubicacion> ubicacion;

    /**
     * Gets the value of the ubicacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ubicacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUbicacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCartaPorteUbicacion.Ubicacion }
     * 
     * 
     */
    public List<ArrayOfCartaPorteUbicacion.Ubicacion> getUbicacion() {
        if (ubicacion == null) {
            ubicacion = new ArrayList<ArrayOfCartaPorteUbicacion.Ubicacion>();
        }
        return this.ubicacion;
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
     *         &lt;element name="Origen" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="IDOrigen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="RFCRemitente" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NombreRemitente" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumRegIdTrib" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ResidenciaFiscal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumEstacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NombreEstacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NavegacionTrafico" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="FechaHoraSalida" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Destino" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="IDDestino" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="RFCDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NombreDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumRegIdTrib" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ResidenciaFiscal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumEstacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NombreEstacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NavegacionTrafico" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="FechaHoraProgLlegada" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
     *       &lt;attribute name="TipoEstacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DistanciaRecorrida" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "origen",
        "destino",
        "domicilio"
    })
    public static class Ubicacion {

        @XmlElement(name = "Origen")
        protected ArrayOfCartaPorteUbicacion.Ubicacion.Origen origen;
        @XmlElement(name = "Destino")
        protected ArrayOfCartaPorteUbicacion.Ubicacion.Destino destino;
        @XmlElement(name = "Domicilio")
        protected ArrayOfCartaPorteUbicacion.Ubicacion.Domicilio domicilio;
        @XmlAttribute(name = "TipoEstacion")
        protected String tipoEstacion;
        @XmlAttribute(name = "DistanciaRecorrida", required = true)
        protected BigDecimal distanciaRecorrida;

        /**
         * Obtiene el valor de la propiedad origen.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfCartaPorteUbicacion.Ubicacion.Origen }
         *     
         */
        public ArrayOfCartaPorteUbicacion.Ubicacion.Origen getOrigen() {
            return origen;
        }

        /**
         * Define el valor de la propiedad origen.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfCartaPorteUbicacion.Ubicacion.Origen }
         *     
         */
        public void setOrigen(ArrayOfCartaPorteUbicacion.Ubicacion.Origen value) {
            this.origen = value;
        }

        /**
         * Obtiene el valor de la propiedad destino.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfCartaPorteUbicacion.Ubicacion.Destino }
         *     
         */
        public ArrayOfCartaPorteUbicacion.Ubicacion.Destino getDestino() {
            return destino;
        }

        /**
         * Define el valor de la propiedad destino.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfCartaPorteUbicacion.Ubicacion.Destino }
         *     
         */
        public void setDestino(ArrayOfCartaPorteUbicacion.Ubicacion.Destino value) {
            this.destino = value;
        }

        /**
         * Obtiene el valor de la propiedad domicilio.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfCartaPorteUbicacion.Ubicacion.Domicilio }
         *     
         */
        public ArrayOfCartaPorteUbicacion.Ubicacion.Domicilio getDomicilio() {
            return domicilio;
        }

        /**
         * Define el valor de la propiedad domicilio.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfCartaPorteUbicacion.Ubicacion.Domicilio }
         *     
         */
        public void setDomicilio(ArrayOfCartaPorteUbicacion.Ubicacion.Domicilio value) {
            this.domicilio = value;
        }

        /**
         * Obtiene el valor de la propiedad tipoEstacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoEstacion() {
            return tipoEstacion;
        }

        /**
         * Define el valor de la propiedad tipoEstacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoEstacion(String value) {
            this.tipoEstacion = value;
        }

        /**
         * Obtiene el valor de la propiedad distanciaRecorrida.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDistanciaRecorrida() {
            return distanciaRecorrida;
        }

        /**
         * Define el valor de la propiedad distanciaRecorrida.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDistanciaRecorrida(BigDecimal value) {
            this.distanciaRecorrida = value;
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
         *       &lt;attribute name="IDDestino" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="RFCDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NombreDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumRegIdTrib" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ResidenciaFiscal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumEstacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NombreEstacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NavegacionTrafico" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="FechaHoraProgLlegada" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Destino {

            @XmlAttribute(name = "IDDestino")
            protected String idDestino;
            @XmlAttribute(name = "RFCDestinatario")
            protected String rfcDestinatario;
            @XmlAttribute(name = "NombreDestinatario")
            protected String nombreDestinatario;
            @XmlAttribute(name = "NumRegIdTrib")
            protected String numRegIdTrib;
            @XmlAttribute(name = "ResidenciaFiscal")
            protected String residenciaFiscal;
            @XmlAttribute(name = "NumEstacion")
            protected String numEstacion;
            @XmlAttribute(name = "NombreEstacion")
            protected String nombreEstacion;
            @XmlAttribute(name = "NavegacionTrafico")
            protected String navegacionTrafico;
            @XmlAttribute(name = "FechaHoraProgLlegada", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaHoraProgLlegada;

            /**
             * Obtiene el valor de la propiedad idDestino.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDDestino() {
                return idDestino;
            }

            /**
             * Define el valor de la propiedad idDestino.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDDestino(String value) {
                this.idDestino = value;
            }

            /**
             * Obtiene el valor de la propiedad rfcDestinatario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRFCDestinatario() {
                return rfcDestinatario;
            }

            /**
             * Define el valor de la propiedad rfcDestinatario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRFCDestinatario(String value) {
                this.rfcDestinatario = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreDestinatario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreDestinatario() {
                return nombreDestinatario;
            }

            /**
             * Define el valor de la propiedad nombreDestinatario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreDestinatario(String value) {
                this.nombreDestinatario = value;
            }

            /**
             * Obtiene el valor de la propiedad numRegIdTrib.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumRegIdTrib() {
                return numRegIdTrib;
            }

            /**
             * Define el valor de la propiedad numRegIdTrib.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumRegIdTrib(String value) {
                this.numRegIdTrib = value;
            }

            /**
             * Obtiene el valor de la propiedad residenciaFiscal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResidenciaFiscal() {
                return residenciaFiscal;
            }

            /**
             * Define el valor de la propiedad residenciaFiscal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResidenciaFiscal(String value) {
                this.residenciaFiscal = value;
            }

            /**
             * Obtiene el valor de la propiedad numEstacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumEstacion() {
                return numEstacion;
            }

            /**
             * Define el valor de la propiedad numEstacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumEstacion(String value) {
                this.numEstacion = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreEstacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreEstacion() {
                return nombreEstacion;
            }

            /**
             * Define el valor de la propiedad nombreEstacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreEstacion(String value) {
                this.nombreEstacion = value;
            }

            /**
             * Obtiene el valor de la propiedad navegacionTrafico.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNavegacionTrafico() {
                return navegacionTrafico;
            }

            /**
             * Define el valor de la propiedad navegacionTrafico.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNavegacionTrafico(String value) {
                this.navegacionTrafico = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaHoraProgLlegada.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaHoraProgLlegada() {
                return fechaHoraProgLlegada;
            }

            /**
             * Define el valor de la propiedad fechaHoraProgLlegada.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaHoraProgLlegada(XMLGregorianCalendar value) {
                this.fechaHoraProgLlegada = value;
            }

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


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="IDOrigen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="RFCRemitente" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NombreRemitente" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumRegIdTrib" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ResidenciaFiscal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumEstacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NombreEstacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NavegacionTrafico" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="FechaHoraSalida" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Origen {

            @XmlAttribute(name = "IDOrigen")
            protected String idOrigen;
            @XmlAttribute(name = "RFCRemitente")
            protected String rfcRemitente;
            @XmlAttribute(name = "NombreRemitente")
            protected String nombreRemitente;
            @XmlAttribute(name = "NumRegIdTrib")
            protected String numRegIdTrib;
            @XmlAttribute(name = "ResidenciaFiscal")
            protected String residenciaFiscal;
            @XmlAttribute(name = "NumEstacion")
            protected String numEstacion;
            @XmlAttribute(name = "NombreEstacion")
            protected String nombreEstacion;
            @XmlAttribute(name = "NavegacionTrafico")
            protected String navegacionTrafico;
            @XmlAttribute(name = "FechaHoraSalida", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fechaHoraSalida;

            /**
             * Obtiene el valor de la propiedad idOrigen.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDOrigen() {
                return idOrigen;
            }

            /**
             * Define el valor de la propiedad idOrigen.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDOrigen(String value) {
                this.idOrigen = value;
            }

            /**
             * Obtiene el valor de la propiedad rfcRemitente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRFCRemitente() {
                return rfcRemitente;
            }

            /**
             * Define el valor de la propiedad rfcRemitente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRFCRemitente(String value) {
                this.rfcRemitente = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreRemitente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreRemitente() {
                return nombreRemitente;
            }

            /**
             * Define el valor de la propiedad nombreRemitente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreRemitente(String value) {
                this.nombreRemitente = value;
            }

            /**
             * Obtiene el valor de la propiedad numRegIdTrib.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumRegIdTrib() {
                return numRegIdTrib;
            }

            /**
             * Define el valor de la propiedad numRegIdTrib.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumRegIdTrib(String value) {
                this.numRegIdTrib = value;
            }

            /**
             * Obtiene el valor de la propiedad residenciaFiscal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResidenciaFiscal() {
                return residenciaFiscal;
            }

            /**
             * Define el valor de la propiedad residenciaFiscal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResidenciaFiscal(String value) {
                this.residenciaFiscal = value;
            }

            /**
             * Obtiene el valor de la propiedad numEstacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumEstacion() {
                return numEstacion;
            }

            /**
             * Define el valor de la propiedad numEstacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumEstacion(String value) {
                this.numEstacion = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreEstacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreEstacion() {
                return nombreEstacion;
            }

            /**
             * Define el valor de la propiedad nombreEstacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreEstacion(String value) {
                this.nombreEstacion = value;
            }

            /**
             * Obtiene el valor de la propiedad navegacionTrafico.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNavegacionTrafico() {
                return navegacionTrafico;
            }

            /**
             * Define el valor de la propiedad navegacionTrafico.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNavegacionTrafico(String value) {
                this.navegacionTrafico = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaHoraSalida.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaHoraSalida() {
                return fechaHoraSalida;
            }

            /**
             * Define el valor de la propiedad fechaHoraSalida.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaHoraSalida(XMLGregorianCalendar value) {
                this.fechaHoraSalida = value;
            }

        }

    }

}
