
package mx.gob.sat.cartaporte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfCartaPorteMercanciasAutotransporteFederalRemolque complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCartaPorteMercanciasAutotransporteFederalRemolque"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Remolque" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="SubTipoRem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Placa" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ArrayOfCartaPorteMercanciasAutotransporteFederalRemolque", propOrder = {
    "remolque"
})
public class ArrayOfCartaPorteMercanciasAutotransporteFederalRemolque {

    @XmlElement(name = "Remolque")
    protected List<ArrayOfCartaPorteMercanciasAutotransporteFederalRemolque.Remolque> remolque;

    /**
     * Gets the value of the remolque property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remolque property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemolque().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCartaPorteMercanciasAutotransporteFederalRemolque.Remolque }
     * 
     * 
     */
    public List<ArrayOfCartaPorteMercanciasAutotransporteFederalRemolque.Remolque> getRemolque() {
        if (remolque == null) {
            remolque = new ArrayList<ArrayOfCartaPorteMercanciasAutotransporteFederalRemolque.Remolque>();
        }
        return this.remolque;
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
     *       &lt;attribute name="SubTipoRem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Placa" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Remolque {

        @XmlAttribute(name = "SubTipoRem")
        protected String subTipoRem;
        @XmlAttribute(name = "Placa")
        protected String placa;

        /**
         * Obtiene el valor de la propiedad subTipoRem.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubTipoRem() {
            return subTipoRem;
        }

        /**
         * Define el valor de la propiedad subTipoRem.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubTipoRem(String value) {
            this.subTipoRem = value;
        }

        /**
         * Obtiene el valor de la propiedad placa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaca() {
            return placa;
        }

        /**
         * Define el valor de la propiedad placa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaca(String value) {
            this.placa = value;
        }

    }

}
