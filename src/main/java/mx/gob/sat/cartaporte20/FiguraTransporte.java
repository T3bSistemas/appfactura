
package mx.gob.sat.cartaporte20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FiguraTransporte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FiguraTransporte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TiposFigura" type="{http://www.sat.gob.mx/CartaPorte20}TiposFigura" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiguraTransporte", propOrder = {
    "tiposFigura"
})
public class FiguraTransporte {

    @XmlElement(name = "TiposFigura")
    protected List<TiposFigura> tiposFigura;

    /**
     * Gets the value of the tiposFigura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiposFigura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiposFigura().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TiposFigura }
     * 
     * 
     */
    public List<TiposFigura> getTiposFigura() {
        if (tiposFigura == null) {
            tiposFigura = new ArrayList<TiposFigura>();
        }
        return this.tiposFigura;
    }

}
