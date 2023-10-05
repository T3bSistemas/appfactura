
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import mx.gob.sat.aerolineas.Aerolineas;
import mx.gob.sat.cartaporte.CartaPorte;
import mx.gob.sat.cartaporte20.CartaPorte20;
import mx.gob.sat.detallista.Detallista;
import mx.gob.sat.divisas.Divisas;
import mx.gob.sat.donat.Donatarias;
import mx.gob.sat.gastoshidrocarburos10.GastosHidrocarburos;
import mx.gob.sat.iedu.InstEducativas;
import mx.gob.sat.ine.INE;
import mx.gob.sat.notariospublicos.NotariosPublicos;
import mx.gob.sat.servicioparcialconstruccion.Parcialesconstruccion;
import mx.gob.sat.valesdedespensa.MonederoElectronico;
import mx.gob.sat.vehiculousado.VehiculoUsado;


/**
 * <p>Clase Java para ComplementosCFDI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComplementosCFDI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LeyendasFiscales" type="{http://tempuri.org/}ArrayOfLeyenda" minOccurs="0"/&gt;
 *         &lt;element name="INE" type="{http://www.sat.gob.mx/ine}INE" minOccurs="0"/&gt;
 *         &lt;element name="Aerolineas" type="{http://www.sat.gob.mx/aerolineas}Aerolineas" minOccurs="0"/&gt;
 *         &lt;element name="ImpuestosLocales" type="{http://tempuri.org/}OtrosImpuestos" minOccurs="0"/&gt;
 *         &lt;element name="NotarioPublicos" type="{http://www.sat.gob.mx/notariospublicos}NotariosPublicos" minOccurs="0"/&gt;
 *         &lt;element name="Educativo" type="{http://www.sat.gob.mx/iedu}InstEducativas" minOccurs="0"/&gt;
 *         &lt;element name="Servicios_Parciales_de_Construccion" type="{http://www.sat.gob.mx/servicioparcialconstruccion}Parcialesconstruccion" minOccurs="0"/&gt;
 *         &lt;element name="Donatarias" type="{http://www.sat.gob.mx/donat}Donatarias" minOccurs="0"/&gt;
 *         &lt;element name="Divisas" type="{http://www.sat.gob.mx/divisas}Divisas" minOccurs="0"/&gt;
 *         &lt;element name="VehiculoUsado" type="{http://www.sat.gob.mx/vehiculousado}VehiculoUsado" minOccurs="0"/&gt;
 *         &lt;element name="Combustibles" type="{http://tempuri.org/}Combustibles" minOccurs="0"/&gt;
 *         &lt;element name="Monedero" type="{http://www.sat.gob.mx/valesdedespensa}MonederoElectronico" minOccurs="0"/&gt;
 *         &lt;element name="Hidrocarburos" type="{http://www.sat.gob.mx/GastosHidrocarburos10}GastosHidrocarburos" minOccurs="0"/&gt;
 *         &lt;element name="Detallista" type="{http://www.sat.gob.mx/detallista}detallista" minOccurs="0"/&gt;
 *         &lt;element name="CartaPorte" type="{http://www.sat.gob.mx/CartaPorte}CartaPorte" minOccurs="0"/&gt;
 *         &lt;element name="CartaPorte20" type="{http://www.sat.gob.mx/CartaPorte20}CartaPorte20" minOccurs="0"/&gt;
 *         &lt;element name="ConsumoCombustibles" type="{http://tempuri.org/}ConsumoCombustibles" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplementosCFDI", propOrder = {
    "leyendasFiscales",
    "ine",
    "aerolineas",
    "impuestosLocales",
    "notarioPublicos",
    "educativo",
    "serviciosParcialesDeConstruccion",
    "donatarias",
    "divisas",
    "vehiculoUsado",
    "combustibles",
    "monedero",
    "hidrocarburos",
    "detallista",
    "cartaPorte",
    "cartaPorte20",
    "consumoCombustibles"
})
public class ComplementosCFDI {

    @XmlElement(name = "LeyendasFiscales")
    protected ArrayOfLeyenda leyendasFiscales;
    @XmlElement(name = "INE")
    protected INE ine;
    @XmlElement(name = "Aerolineas")
    protected Aerolineas aerolineas;
    @XmlElement(name = "ImpuestosLocales")
    protected OtrosImpuestos impuestosLocales;
    @XmlElement(name = "NotarioPublicos")
    protected NotariosPublicos notarioPublicos;
    @XmlElement(name = "Educativo")
    protected InstEducativas educativo;
    @XmlElement(name = "Servicios_Parciales_de_Construccion")
    protected Parcialesconstruccion serviciosParcialesDeConstruccion;
    @XmlElement(name = "Donatarias")
    protected Donatarias donatarias;
    @XmlElement(name = "Divisas")
    protected Divisas divisas;
    @XmlElement(name = "VehiculoUsado")
    protected VehiculoUsado vehiculoUsado;
    @XmlElement(name = "Combustibles")
    protected Combustibles combustibles;
    @XmlElement(name = "Monedero")
    protected MonederoElectronico monedero;
    @XmlElement(name = "Hidrocarburos")
    protected GastosHidrocarburos hidrocarburos;
    @XmlElement(name = "Detallista")
    protected Detallista detallista;
    @XmlElement(name = "CartaPorte")
    protected CartaPorte cartaPorte;
    @XmlElement(name = "CartaPorte20")
    protected CartaPorte20 cartaPorte20;
    @XmlElement(name = "ConsumoCombustibles")
    protected ConsumoCombustibles consumoCombustibles;

    /**
     * Obtiene el valor de la propiedad leyendasFiscales.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLeyenda }
     *     
     */
    public ArrayOfLeyenda getLeyendasFiscales() {
        return leyendasFiscales;
    }

    /**
     * Define el valor de la propiedad leyendasFiscales.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLeyenda }
     *     
     */
    public void setLeyendasFiscales(ArrayOfLeyenda value) {
        this.leyendasFiscales = value;
    }

    /**
     * Obtiene el valor de la propiedad ine.
     * 
     * @return
     *     possible object is
     *     {@link INE }
     *     
     */
    public INE getINE() {
        return ine;
    }

    /**
     * Define el valor de la propiedad ine.
     * 
     * @param value
     *     allowed object is
     *     {@link INE }
     *     
     */
    public void setINE(INE value) {
        this.ine = value;
    }

    /**
     * Obtiene el valor de la propiedad aerolineas.
     * 
     * @return
     *     possible object is
     *     {@link Aerolineas }
     *     
     */
    public Aerolineas getAerolineas() {
        return aerolineas;
    }

    /**
     * Define el valor de la propiedad aerolineas.
     * 
     * @param value
     *     allowed object is
     *     {@link Aerolineas }
     *     
     */
    public void setAerolineas(Aerolineas value) {
        this.aerolineas = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestosLocales.
     * 
     * @return
     *     possible object is
     *     {@link OtrosImpuestos }
     *     
     */
    public OtrosImpuestos getImpuestosLocales() {
        return impuestosLocales;
    }

    /**
     * Define el valor de la propiedad impuestosLocales.
     * 
     * @param value
     *     allowed object is
     *     {@link OtrosImpuestos }
     *     
     */
    public void setImpuestosLocales(OtrosImpuestos value) {
        this.impuestosLocales = value;
    }

    /**
     * Obtiene el valor de la propiedad notarioPublicos.
     * 
     * @return
     *     possible object is
     *     {@link NotariosPublicos }
     *     
     */
    public NotariosPublicos getNotarioPublicos() {
        return notarioPublicos;
    }

    /**
     * Define el valor de la propiedad notarioPublicos.
     * 
     * @param value
     *     allowed object is
     *     {@link NotariosPublicos }
     *     
     */
    public void setNotarioPublicos(NotariosPublicos value) {
        this.notarioPublicos = value;
    }

    /**
     * Obtiene el valor de la propiedad educativo.
     * 
     * @return
     *     possible object is
     *     {@link InstEducativas }
     *     
     */
    public InstEducativas getEducativo() {
        return educativo;
    }

    /**
     * Define el valor de la propiedad educativo.
     * 
     * @param value
     *     allowed object is
     *     {@link InstEducativas }
     *     
     */
    public void setEducativo(InstEducativas value) {
        this.educativo = value;
    }

    /**
     * Obtiene el valor de la propiedad serviciosParcialesDeConstruccion.
     * 
     * @return
     *     possible object is
     *     {@link Parcialesconstruccion }
     *     
     */
    public Parcialesconstruccion getServiciosParcialesDeConstruccion() {
        return serviciosParcialesDeConstruccion;
    }

    /**
     * Define el valor de la propiedad serviciosParcialesDeConstruccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Parcialesconstruccion }
     *     
     */
    public void setServiciosParcialesDeConstruccion(Parcialesconstruccion value) {
        this.serviciosParcialesDeConstruccion = value;
    }

    /**
     * Obtiene el valor de la propiedad donatarias.
     * 
     * @return
     *     possible object is
     *     {@link Donatarias }
     *     
     */
    public Donatarias getDonatarias() {
        return donatarias;
    }

    /**
     * Define el valor de la propiedad donatarias.
     * 
     * @param value
     *     allowed object is
     *     {@link Donatarias }
     *     
     */
    public void setDonatarias(Donatarias value) {
        this.donatarias = value;
    }

    /**
     * Obtiene el valor de la propiedad divisas.
     * 
     * @return
     *     possible object is
     *     {@link Divisas }
     *     
     */
    public Divisas getDivisas() {
        return divisas;
    }

    /**
     * Define el valor de la propiedad divisas.
     * 
     * @param value
     *     allowed object is
     *     {@link Divisas }
     *     
     */
    public void setDivisas(Divisas value) {
        this.divisas = value;
    }

    /**
     * Obtiene el valor de la propiedad vehiculoUsado.
     * 
     * @return
     *     possible object is
     *     {@link VehiculoUsado }
     *     
     */
    public VehiculoUsado getVehiculoUsado() {
        return vehiculoUsado;
    }

    /**
     * Define el valor de la propiedad vehiculoUsado.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiculoUsado }
     *     
     */
    public void setVehiculoUsado(VehiculoUsado value) {
        this.vehiculoUsado = value;
    }

    /**
     * Obtiene el valor de la propiedad combustibles.
     * 
     * @return
     *     possible object is
     *     {@link Combustibles }
     *     
     */
    public Combustibles getCombustibles() {
        return combustibles;
    }

    /**
     * Define el valor de la propiedad combustibles.
     * 
     * @param value
     *     allowed object is
     *     {@link Combustibles }
     *     
     */
    public void setCombustibles(Combustibles value) {
        this.combustibles = value;
    }

    /**
     * Obtiene el valor de la propiedad monedero.
     * 
     * @return
     *     possible object is
     *     {@link MonederoElectronico }
     *     
     */
    public MonederoElectronico getMonedero() {
        return monedero;
    }

    /**
     * Define el valor de la propiedad monedero.
     * 
     * @param value
     *     allowed object is
     *     {@link MonederoElectronico }
     *     
     */
    public void setMonedero(MonederoElectronico value) {
        this.monedero = value;
    }

    /**
     * Obtiene el valor de la propiedad hidrocarburos.
     * 
     * @return
     *     possible object is
     *     {@link GastosHidrocarburos }
     *     
     */
    public GastosHidrocarburos getHidrocarburos() {
        return hidrocarburos;
    }

    /**
     * Define el valor de la propiedad hidrocarburos.
     * 
     * @param value
     *     allowed object is
     *     {@link GastosHidrocarburos }
     *     
     */
    public void setHidrocarburos(GastosHidrocarburos value) {
        this.hidrocarburos = value;
    }

    /**
     * Obtiene el valor de la propiedad detallista.
     * 
     * @return
     *     possible object is
     *     {@link Detallista }
     *     
     */
    public Detallista getDetallista() {
        return detallista;
    }

    /**
     * Define el valor de la propiedad detallista.
     * 
     * @param value
     *     allowed object is
     *     {@link Detallista }
     *     
     */
    public void setDetallista(Detallista value) {
        this.detallista = value;
    }

    /**
     * Obtiene el valor de la propiedad cartaPorte.
     * 
     * @return
     *     possible object is
     *     {@link CartaPorte }
     *     
     */
    public CartaPorte getCartaPorte() {
        return cartaPorte;
    }

    /**
     * Define el valor de la propiedad cartaPorte.
     * 
     * @param value
     *     allowed object is
     *     {@link CartaPorte }
     *     
     */
    public void setCartaPorte(CartaPorte value) {
        this.cartaPorte = value;
    }

    /**
     * Obtiene el valor de la propiedad cartaPorte20.
     * 
     * @return
     *     possible object is
     *     {@link CartaPorte20 }
     *     
     */
    public CartaPorte20 getCartaPorte20() {
        return cartaPorte20;
    }

    /**
     * Define el valor de la propiedad cartaPorte20.
     * 
     * @param value
     *     allowed object is
     *     {@link CartaPorte20 }
     *     
     */
    public void setCartaPorte20(CartaPorte20 value) {
        this.cartaPorte20 = value;
    }

    /**
     * Obtiene el valor de la propiedad consumoCombustibles.
     * 
     * @return
     *     possible object is
     *     {@link ConsumoCombustibles }
     *     
     */
    public ConsumoCombustibles getConsumoCombustibles() {
        return consumoCombustibles;
    }

    /**
     * Define el valor de la propiedad consumoCombustibles.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumoCombustibles }
     *     
     */
    public void setConsumoCombustibles(ConsumoCombustibles value) {
        this.consumoCombustibles = value;
    }

}
