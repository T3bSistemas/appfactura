
package mx.gob.sat.nomina12;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.gob.sat.nomina12 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Nomina_QNAME = new QName("http://www.sat.gob.mx/nomina12", "Nomina");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.gob.sat.nomina12
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Nomina }
     * 
     */
    public Nomina createNomina() {
        return new Nomina();
    }

    /**
     * Create an instance of {@link Emisor }
     * 
     */
    public Emisor createEmisor() {
        return new Emisor();
    }

    /**
     * Create an instance of {@link EntidadSNCF }
     * 
     */
    public EntidadSNCF createEntidadSNCF() {
        return new EntidadSNCF();
    }

    /**
     * Create an instance of {@link Receptor }
     * 
     */
    public Receptor createReceptor() {
        return new Receptor();
    }

    /**
     * Create an instance of {@link SubContratacion }
     * 
     */
    public SubContratacion createSubContratacion() {
        return new SubContratacion();
    }

    /**
     * Create an instance of {@link Percepciones }
     * 
     */
    public Percepciones createPercepciones() {
        return new Percepciones();
    }

    /**
     * Create an instance of {@link Percepcion }
     * 
     */
    public Percepcion createPercepcion() {
        return new Percepcion();
    }

    /**
     * Create an instance of {@link AccionesOTitulos }
     * 
     */
    public AccionesOTitulos createAccionesOTitulos() {
        return new AccionesOTitulos();
    }

    /**
     * Create an instance of {@link HorasExtra }
     * 
     */
    public HorasExtra createHorasExtra() {
        return new HorasExtra();
    }

    /**
     * Create an instance of {@link JubilacionPensionRetiro }
     * 
     */
    public JubilacionPensionRetiro createJubilacionPensionRetiro() {
        return new JubilacionPensionRetiro();
    }

    /**
     * Create an instance of {@link SeparacionIndemnizacion }
     * 
     */
    public SeparacionIndemnizacion createSeparacionIndemnizacion() {
        return new SeparacionIndemnizacion();
    }

    /**
     * Create an instance of {@link Deducciones }
     * 
     */
    public Deducciones createDeducciones() {
        return new Deducciones();
    }

    /**
     * Create an instance of {@link Deduccion }
     * 
     */
    public Deduccion createDeduccion() {
        return new Deduccion();
    }

    /**
     * Create an instance of {@link OtrosPagos }
     * 
     */
    public OtrosPagos createOtrosPagos() {
        return new OtrosPagos();
    }

    /**
     * Create an instance of {@link OtroPago }
     * 
     */
    public OtroPago createOtroPago() {
        return new OtroPago();
    }

    /**
     * Create an instance of {@link CompensacionSaldosAFavor }
     * 
     */
    public CompensacionSaldosAFavor createCompensacionSaldosAFavor() {
        return new CompensacionSaldosAFavor();
    }

    /**
     * Create an instance of {@link SubsidioAlEmpleo }
     * 
     */
    public SubsidioAlEmpleo createSubsidioAlEmpleo() {
        return new SubsidioAlEmpleo();
    }

    /**
     * Create an instance of {@link Incapacidades }
     * 
     */
    public Incapacidades createIncapacidades() {
        return new Incapacidades();
    }

    /**
     * Create an instance of {@link Incapacidad }
     * 
     */
    public Incapacidad createIncapacidad() {
        return new Incapacidad();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Nomina }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Nomina }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sat.gob.mx/nomina12", name = "Nomina")
    public JAXBElement<Nomina> createNomina(Nomina value) {
        return new JAXBElement<Nomina>(_Nomina_QNAME, Nomina.class, null, value);
    }

}
