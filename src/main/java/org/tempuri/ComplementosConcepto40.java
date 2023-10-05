
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import mx.gob.sat.iedu.InstEducativas;
import mx.gob.sat.ventavehiculos.VentaVehiculos;


/**
 * <p>Clase Java para ComplementosConcepto40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComplementosConcepto40"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VentadeVehiculos" type="{http://www.sat.gob.mx/ventavehiculos}VentaVehiculos" minOccurs="0"/&gt;
 *         &lt;element name="iedu" type="{http://www.sat.gob.mx/iedu}InstEducativas" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplementosConcepto40", propOrder = {
    "ventadeVehiculos",
    "iedu"
})
public class ComplementosConcepto40 {

    @XmlElement(name = "VentadeVehiculos")
    protected VentaVehiculos ventadeVehiculos;
    protected InstEducativas iedu;

    /**
     * Obtiene el valor de la propiedad ventadeVehiculos.
     * 
     * @return
     *     possible object is
     *     {@link VentaVehiculos }
     *     
     */
    public VentaVehiculos getVentadeVehiculos() {
        return ventadeVehiculos;
    }

    /**
     * Define el valor de la propiedad ventadeVehiculos.
     * 
     * @param value
     *     allowed object is
     *     {@link VentaVehiculos }
     *     
     */
    public void setVentadeVehiculos(VentaVehiculos value) {
        this.ventadeVehiculos = value;
    }

    /**
     * Obtiene el valor de la propiedad iedu.
     * 
     * @return
     *     possible object is
     *     {@link InstEducativas }
     *     
     */
    public InstEducativas getIedu() {
        return iedu;
    }

    /**
     * Define el valor de la propiedad iedu.
     * 
     * @param value
     *     allowed object is
     *     {@link InstEducativas }
     *     
     */
    public void setIedu(InstEducativas value) {
        this.iedu = value;
    }

}
