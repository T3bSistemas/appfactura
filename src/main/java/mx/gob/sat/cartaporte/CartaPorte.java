
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


/**
 * <p>Clase Java para CartaPorte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CartaPorte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ubicaciones" type="{http://www.sat.gob.mx/CartaPorte}ArrayOfCartaPorteUbicacion" minOccurs="0"/&gt;
 *         &lt;element name="Mercancias" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Mercancia" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CantidadTransporta" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Cantidad" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                                     &lt;attribute name="IDOrigen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="IDDestino" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="CvesTransporte" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="DetalleMercancia" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="UnidadPeso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="PesoBruto" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                                     &lt;attribute name="PesoNeto" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                                     &lt;attribute name="PesoTara" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                                     &lt;attribute name="NumPiezas" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="BienesTransp" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="ClaveSTCC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Cantidad" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="ClaveUnidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Unidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Dimensiones" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="MaterialPeligroso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="CveMaterialPeligroso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Embalaje" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="DescripEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="PesoEnKg" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="ValorMercancia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="FraccionArancelaria" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="UUIDComercioExt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AutotransporteFederal" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="IdentificacionVehicular" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="ConfigVehicular" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="PlacaVM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="AnioModeloVM" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Remolques" type="{http://www.sat.gob.mx/CartaPorte}ArrayOfCartaPorteMercanciasAutotransporteFederalRemolque" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="PermSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumPermisoSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TransporteMaritimo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Contenedor" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="MatriculaContenedor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="TipoContenedor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="NumPrecinto" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="PermSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumPermisoSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="TipoEmbarcacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Matricula" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumeroOMI" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="AnioEmbarcacion" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" /&gt;
 *                           &lt;attribute name="NombreEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NacionalidadEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="UnidadesDeArqBruto" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="TipoCarga" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumCertITC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Eslora" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="Manga" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="Calado" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="LineaNaviera" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NombreAgenteNaviero" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumAutorizacionNaviero" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumViaje" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumConocEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TransporteAereo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="PermSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumPermisoSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="MatriculaAeronave" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumeroGuia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="LugarContrato" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="RFCTransportista" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="CodigoTransportista" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumRegIdTribTranspor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ResidenciaFiscalTranspor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NombreTransportista" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="RFCEmbarcador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumRegIdTribEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ResidenciaFiscalEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NombreEmbarcador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TransporteFerroviario" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DerechosDePaso" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="TipoDerechoDePaso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="KilometrajePagado" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Carro" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Contenedor" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="TipoContenedor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="PesoContenedorVacio" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                                               &lt;attribute name="PesoNetoMercancia" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="TipoCarro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="MatriculaCarro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="GuiaCarro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="ToneladasNetasCarro" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="TipoDeServicio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Concesionario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="PesoBrutoTotal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="UnidadPeso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PesoNetoTotal" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="NumTotalMercancias" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CargoPorTasacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FiguraTransporte" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Operadores" type="{http://www.sat.gob.mx/CartaPorte}ArrayOfCartaPorteFiguraTransporteOperadoresOperador" minOccurs="0"/&gt;
 *                   &lt;element name="Propietario" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Domicilio" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Calle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="NumeroExterior" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="NumeroInterior" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Colonia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Localidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="RFCPropietario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NombrePropietario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumRegIdTribPropietario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ResidenciaFiscalPropietario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Arrendatario" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Domicilio" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Calle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="NumeroExterior" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="NumeroInterior" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Colonia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Localidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="RFCArrendatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NombreArrendatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumRegIdTribArrendatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ResidenciaFiscalArrendatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Notificado" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Domicilio" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Calle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="NumeroExterior" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="NumeroInterior" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Colonia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Localidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="RFCNotificado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NombreNotificado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="NumRegIdTribNotificado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ResidenciaFiscalNotificado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="CveTransporte" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TranspInternac" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EntradaSalidaMerc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ViaEntradaSalida" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TotalDistRec" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CartaPorte", propOrder = {
    "ubicaciones",
    "mercancias",
    "figuraTransporte"
})
public class CartaPorte {

    @XmlElement(name = "Ubicaciones")
    protected ArrayOfCartaPorteUbicacion ubicaciones;
    @XmlElement(name = "Mercancias")
    protected CartaPorte.Mercancias mercancias;
    @XmlElement(name = "FiguraTransporte")
    protected CartaPorte.FiguraTransporte figuraTransporte;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "TranspInternac")
    protected String transpInternac;
    @XmlAttribute(name = "EntradaSalidaMerc")
    protected String entradaSalidaMerc;
    @XmlAttribute(name = "ViaEntradaSalida")
    protected String viaEntradaSalida;
    @XmlAttribute(name = "TotalDistRec")
    protected String totalDistRec;

    /**
     * Obtiene el valor de la propiedad ubicaciones.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCartaPorteUbicacion }
     *     
     */
    public ArrayOfCartaPorteUbicacion getUbicaciones() {
        return ubicaciones;
    }

    /**
     * Define el valor de la propiedad ubicaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCartaPorteUbicacion }
     *     
     */
    public void setUbicaciones(ArrayOfCartaPorteUbicacion value) {
        this.ubicaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad mercancias.
     * 
     * @return
     *     possible object is
     *     {@link CartaPorte.Mercancias }
     *     
     */
    public CartaPorte.Mercancias getMercancias() {
        return mercancias;
    }

    /**
     * Define el valor de la propiedad mercancias.
     * 
     * @param value
     *     allowed object is
     *     {@link CartaPorte.Mercancias }
     *     
     */
    public void setMercancias(CartaPorte.Mercancias value) {
        this.mercancias = value;
    }

    /**
     * Obtiene el valor de la propiedad figuraTransporte.
     * 
     * @return
     *     possible object is
     *     {@link CartaPorte.FiguraTransporte }
     *     
     */
    public CartaPorte.FiguraTransporte getFiguraTransporte() {
        return figuraTransporte;
    }

    /**
     * Define el valor de la propiedad figuraTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link CartaPorte.FiguraTransporte }
     *     
     */
    public void setFiguraTransporte(CartaPorte.FiguraTransporte value) {
        this.figuraTransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad transpInternac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranspInternac() {
        return transpInternac;
    }

    /**
     * Define el valor de la propiedad transpInternac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranspInternac(String value) {
        this.transpInternac = value;
    }

    /**
     * Obtiene el valor de la propiedad entradaSalidaMerc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntradaSalidaMerc() {
        return entradaSalidaMerc;
    }

    /**
     * Define el valor de la propiedad entradaSalidaMerc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntradaSalidaMerc(String value) {
        this.entradaSalidaMerc = value;
    }

    /**
     * Obtiene el valor de la propiedad viaEntradaSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaEntradaSalida() {
        return viaEntradaSalida;
    }

    /**
     * Define el valor de la propiedad viaEntradaSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaEntradaSalida(String value) {
        this.viaEntradaSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDistRec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDistRec() {
        return totalDistRec;
    }

    /**
     * Define el valor de la propiedad totalDistRec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDistRec(String value) {
        this.totalDistRec = value;
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
     *         &lt;element name="Operadores" type="{http://www.sat.gob.mx/CartaPorte}ArrayOfCartaPorteFiguraTransporteOperadoresOperador" minOccurs="0"/&gt;
     *         &lt;element name="Propietario" maxOccurs="unbounded" minOccurs="0"&gt;
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
     *                 &lt;attribute name="RFCPropietario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NombrePropietario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumRegIdTribPropietario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ResidenciaFiscalPropietario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Arrendatario" maxOccurs="unbounded" minOccurs="0"&gt;
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
     *                 &lt;attribute name="RFCArrendatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NombreArrendatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumRegIdTribArrendatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ResidenciaFiscalArrendatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Notificado" maxOccurs="unbounded" minOccurs="0"&gt;
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
     *                 &lt;attribute name="RFCNotificado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NombreNotificado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumRegIdTribNotificado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ResidenciaFiscalNotificado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="CveTransporte" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "operadores",
        "propietario",
        "arrendatario",
        "notificado"
    })
    public static class FiguraTransporte {

        @XmlElement(name = "Operadores")
        protected ArrayOfCartaPorteFiguraTransporteOperadoresOperador operadores;
        @XmlElement(name = "Propietario")
        protected List<CartaPorte.FiguraTransporte.Propietario> propietario;
        @XmlElement(name = "Arrendatario")
        protected List<CartaPorte.FiguraTransporte.Arrendatario> arrendatario;
        @XmlElement(name = "Notificado")
        protected List<CartaPorte.FiguraTransporte.Notificado> notificado;
        @XmlAttribute(name = "CveTransporte")
        protected String cveTransporte;

        /**
         * Obtiene el valor de la propiedad operadores.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfCartaPorteFiguraTransporteOperadoresOperador }
         *     
         */
        public ArrayOfCartaPorteFiguraTransporteOperadoresOperador getOperadores() {
            return operadores;
        }

        /**
         * Define el valor de la propiedad operadores.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfCartaPorteFiguraTransporteOperadoresOperador }
         *     
         */
        public void setOperadores(ArrayOfCartaPorteFiguraTransporteOperadoresOperador value) {
            this.operadores = value;
        }

        /**
         * Gets the value of the propietario property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the propietario property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPropietario().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CartaPorte.FiguraTransporte.Propietario }
         * 
         * 
         */
        public List<CartaPorte.FiguraTransporte.Propietario> getPropietario() {
            if (propietario == null) {
                propietario = new ArrayList<CartaPorte.FiguraTransporte.Propietario>();
            }
            return this.propietario;
        }

        /**
         * Gets the value of the arrendatario property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the arrendatario property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArrendatario().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CartaPorte.FiguraTransporte.Arrendatario }
         * 
         * 
         */
        public List<CartaPorte.FiguraTransporte.Arrendatario> getArrendatario() {
            if (arrendatario == null) {
                arrendatario = new ArrayList<CartaPorte.FiguraTransporte.Arrendatario>();
            }
            return this.arrendatario;
        }

        /**
         * Gets the value of the notificado property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the notificado property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNotificado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CartaPorte.FiguraTransporte.Notificado }
         * 
         * 
         */
        public List<CartaPorte.FiguraTransporte.Notificado> getNotificado() {
            if (notificado == null) {
                notificado = new ArrayList<CartaPorte.FiguraTransporte.Notificado>();
            }
            return this.notificado;
        }

        /**
         * Obtiene el valor de la propiedad cveTransporte.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCveTransporte() {
            return cveTransporte;
        }

        /**
         * Define el valor de la propiedad cveTransporte.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCveTransporte(String value) {
            this.cveTransporte = value;
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
         *       &lt;attribute name="RFCArrendatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NombreArrendatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumRegIdTribArrendatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ResidenciaFiscalArrendatario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        public static class Arrendatario {

            @XmlElement(name = "Domicilio")
            protected CartaPorte.FiguraTransporte.Arrendatario.Domicilio domicilio;
            @XmlAttribute(name = "RFCArrendatario")
            protected String rfcArrendatario;
            @XmlAttribute(name = "NombreArrendatario")
            protected String nombreArrendatario;
            @XmlAttribute(name = "NumRegIdTribArrendatario")
            protected String numRegIdTribArrendatario;
            @XmlAttribute(name = "ResidenciaFiscalArrendatario")
            protected String residenciaFiscalArrendatario;

            /**
             * Obtiene el valor de la propiedad domicilio.
             * 
             * @return
             *     possible object is
             *     {@link CartaPorte.FiguraTransporte.Arrendatario.Domicilio }
             *     
             */
            public CartaPorte.FiguraTransporte.Arrendatario.Domicilio getDomicilio() {
                return domicilio;
            }

            /**
             * Define el valor de la propiedad domicilio.
             * 
             * @param value
             *     allowed object is
             *     {@link CartaPorte.FiguraTransporte.Arrendatario.Domicilio }
             *     
             */
            public void setDomicilio(CartaPorte.FiguraTransporte.Arrendatario.Domicilio value) {
                this.domicilio = value;
            }

            /**
             * Obtiene el valor de la propiedad rfcArrendatario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRFCArrendatario() {
                return rfcArrendatario;
            }

            /**
             * Define el valor de la propiedad rfcArrendatario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRFCArrendatario(String value) {
                this.rfcArrendatario = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreArrendatario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreArrendatario() {
                return nombreArrendatario;
            }

            /**
             * Define el valor de la propiedad nombreArrendatario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreArrendatario(String value) {
                this.nombreArrendatario = value;
            }

            /**
             * Obtiene el valor de la propiedad numRegIdTribArrendatario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumRegIdTribArrendatario() {
                return numRegIdTribArrendatario;
            }

            /**
             * Define el valor de la propiedad numRegIdTribArrendatario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumRegIdTribArrendatario(String value) {
                this.numRegIdTribArrendatario = value;
            }

            /**
             * Obtiene el valor de la propiedad residenciaFiscalArrendatario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResidenciaFiscalArrendatario() {
                return residenciaFiscalArrendatario;
            }

            /**
             * Define el valor de la propiedad residenciaFiscalArrendatario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResidenciaFiscalArrendatario(String value) {
                this.residenciaFiscalArrendatario = value;
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
         *       &lt;attribute name="RFCNotificado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NombreNotificado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumRegIdTribNotificado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ResidenciaFiscalNotificado" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        public static class Notificado {

            @XmlElement(name = "Domicilio")
            protected CartaPorte.FiguraTransporte.Notificado.Domicilio domicilio;
            @XmlAttribute(name = "RFCNotificado")
            protected String rfcNotificado;
            @XmlAttribute(name = "NombreNotificado")
            protected String nombreNotificado;
            @XmlAttribute(name = "NumRegIdTribNotificado")
            protected String numRegIdTribNotificado;
            @XmlAttribute(name = "ResidenciaFiscalNotificado")
            protected String residenciaFiscalNotificado;

            /**
             * Obtiene el valor de la propiedad domicilio.
             * 
             * @return
             *     possible object is
             *     {@link CartaPorte.FiguraTransporte.Notificado.Domicilio }
             *     
             */
            public CartaPorte.FiguraTransporte.Notificado.Domicilio getDomicilio() {
                return domicilio;
            }

            /**
             * Define el valor de la propiedad domicilio.
             * 
             * @param value
             *     allowed object is
             *     {@link CartaPorte.FiguraTransporte.Notificado.Domicilio }
             *     
             */
            public void setDomicilio(CartaPorte.FiguraTransporte.Notificado.Domicilio value) {
                this.domicilio = value;
            }

            /**
             * Obtiene el valor de la propiedad rfcNotificado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRFCNotificado() {
                return rfcNotificado;
            }

            /**
             * Define el valor de la propiedad rfcNotificado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRFCNotificado(String value) {
                this.rfcNotificado = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreNotificado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreNotificado() {
                return nombreNotificado;
            }

            /**
             * Define el valor de la propiedad nombreNotificado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreNotificado(String value) {
                this.nombreNotificado = value;
            }

            /**
             * Obtiene el valor de la propiedad numRegIdTribNotificado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumRegIdTribNotificado() {
                return numRegIdTribNotificado;
            }

            /**
             * Define el valor de la propiedad numRegIdTribNotificado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumRegIdTribNotificado(String value) {
                this.numRegIdTribNotificado = value;
            }

            /**
             * Obtiene el valor de la propiedad residenciaFiscalNotificado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResidenciaFiscalNotificado() {
                return residenciaFiscalNotificado;
            }

            /**
             * Define el valor de la propiedad residenciaFiscalNotificado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResidenciaFiscalNotificado(String value) {
                this.residenciaFiscalNotificado = value;
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
         *       &lt;attribute name="RFCPropietario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NombrePropietario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumRegIdTribPropietario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ResidenciaFiscalPropietario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        public static class Propietario {

            @XmlElement(name = "Domicilio")
            protected CartaPorte.FiguraTransporte.Propietario.Domicilio domicilio;
            @XmlAttribute(name = "RFCPropietario")
            protected String rfcPropietario;
            @XmlAttribute(name = "NombrePropietario")
            protected String nombrePropietario;
            @XmlAttribute(name = "NumRegIdTribPropietario")
            protected String numRegIdTribPropietario;
            @XmlAttribute(name = "ResidenciaFiscalPropietario")
            protected String residenciaFiscalPropietario;

            /**
             * Obtiene el valor de la propiedad domicilio.
             * 
             * @return
             *     possible object is
             *     {@link CartaPorte.FiguraTransporte.Propietario.Domicilio }
             *     
             */
            public CartaPorte.FiguraTransporte.Propietario.Domicilio getDomicilio() {
                return domicilio;
            }

            /**
             * Define el valor de la propiedad domicilio.
             * 
             * @param value
             *     allowed object is
             *     {@link CartaPorte.FiguraTransporte.Propietario.Domicilio }
             *     
             */
            public void setDomicilio(CartaPorte.FiguraTransporte.Propietario.Domicilio value) {
                this.domicilio = value;
            }

            /**
             * Obtiene el valor de la propiedad rfcPropietario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRFCPropietario() {
                return rfcPropietario;
            }

            /**
             * Define el valor de la propiedad rfcPropietario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRFCPropietario(String value) {
                this.rfcPropietario = value;
            }

            /**
             * Obtiene el valor de la propiedad nombrePropietario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombrePropietario() {
                return nombrePropietario;
            }

            /**
             * Define el valor de la propiedad nombrePropietario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombrePropietario(String value) {
                this.nombrePropietario = value;
            }

            /**
             * Obtiene el valor de la propiedad numRegIdTribPropietario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumRegIdTribPropietario() {
                return numRegIdTribPropietario;
            }

            /**
             * Define el valor de la propiedad numRegIdTribPropietario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumRegIdTribPropietario(String value) {
                this.numRegIdTribPropietario = value;
            }

            /**
             * Obtiene el valor de la propiedad residenciaFiscalPropietario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResidenciaFiscalPropietario() {
                return residenciaFiscalPropietario;
            }

            /**
             * Define el valor de la propiedad residenciaFiscalPropietario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResidenciaFiscalPropietario(String value) {
                this.residenciaFiscalPropietario = value;
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
     *         &lt;element name="Mercancia" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CantidadTransporta" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Cantidad" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                           &lt;attribute name="IDOrigen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="IDDestino" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="CvesTransporte" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="DetalleMercancia" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="UnidadPeso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="PesoBruto" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                           &lt;attribute name="PesoNeto" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                           &lt;attribute name="PesoTara" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                           &lt;attribute name="NumPiezas" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="BienesTransp" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="ClaveSTCC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Cantidad" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="ClaveUnidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Unidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Dimensiones" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="MaterialPeligroso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="CveMaterialPeligroso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Embalaje" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="DescripEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="PesoEnKg" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="ValorMercancia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="FraccionArancelaria" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="UUIDComercioExt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AutotransporteFederal" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IdentificacionVehicular" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="ConfigVehicular" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="PlacaVM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="AnioModeloVM" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Remolques" type="{http://www.sat.gob.mx/CartaPorte}ArrayOfCartaPorteMercanciasAutotransporteFederalRemolque" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="PermSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumPermisoSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TransporteMaritimo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Contenedor" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="MatriculaContenedor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="TipoContenedor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="NumPrecinto" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="PermSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumPermisoSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="TipoEmbarcacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Matricula" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumeroOMI" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="AnioEmbarcacion" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" /&gt;
     *                 &lt;attribute name="NombreEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NacionalidadEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="UnidadesDeArqBruto" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="TipoCarga" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumCertITC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Eslora" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="Manga" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="Calado" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="LineaNaviera" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NombreAgenteNaviero" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumAutorizacionNaviero" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumViaje" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumConocEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TransporteAereo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="PermSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumPermisoSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="MatriculaAeronave" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumeroGuia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="LugarContrato" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="RFCTransportista" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="CodigoTransportista" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumRegIdTribTranspor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ResidenciaFiscalTranspor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NombreTransportista" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="RFCEmbarcador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumRegIdTribEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ResidenciaFiscalEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NombreEmbarcador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TransporteFerroviario" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DerechosDePaso" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="TipoDerechoDePaso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="KilometrajePagado" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Carro" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Contenedor" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="TipoContenedor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="PesoContenedorVacio" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                                     &lt;attribute name="PesoNetoMercancia" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="TipoCarro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="MatriculaCarro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="GuiaCarro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="ToneladasNetasCarro" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="TipoDeServicio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NumPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Concesionario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="PesoBrutoTotal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="UnidadPeso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PesoNetoTotal" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="NumTotalMercancias" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CargoPorTasacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mercancia",
        "autotransporteFederal",
        "transporteMaritimo",
        "transporteAereo",
        "transporteFerroviario"
    })
    public static class Mercancias {

        @XmlElement(name = "Mercancia")
        protected List<CartaPorte.Mercancias.Mercancia> mercancia;
        @XmlElement(name = "AutotransporteFederal")
        protected CartaPorte.Mercancias.AutotransporteFederal autotransporteFederal;
        @XmlElement(name = "TransporteMaritimo")
        protected CartaPorte.Mercancias.TransporteMaritimo transporteMaritimo;
        @XmlElement(name = "TransporteAereo")
        protected CartaPorte.Mercancias.TransporteAereo transporteAereo;
        @XmlElement(name = "TransporteFerroviario")
        protected CartaPorte.Mercancias.TransporteFerroviario transporteFerroviario;
        @XmlAttribute(name = "PesoBrutoTotal")
        protected String pesoBrutoTotal;
        @XmlAttribute(name = "UnidadPeso")
        protected String unidadPeso;
        @XmlAttribute(name = "PesoNetoTotal", required = true)
        protected BigDecimal pesoNetoTotal;
        @XmlAttribute(name = "NumTotalMercancias")
        protected String numTotalMercancias;
        @XmlAttribute(name = "CargoPorTasacion")
        protected String cargoPorTasacion;

        /**
         * Gets the value of the mercancia property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mercancia property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMercancia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CartaPorte.Mercancias.Mercancia }
         * 
         * 
         */
        public List<CartaPorte.Mercancias.Mercancia> getMercancia() {
            if (mercancia == null) {
                mercancia = new ArrayList<CartaPorte.Mercancias.Mercancia>();
            }
            return this.mercancia;
        }

        /**
         * Obtiene el valor de la propiedad autotransporteFederal.
         * 
         * @return
         *     possible object is
         *     {@link CartaPorte.Mercancias.AutotransporteFederal }
         *     
         */
        public CartaPorte.Mercancias.AutotransporteFederal getAutotransporteFederal() {
            return autotransporteFederal;
        }

        /**
         * Define el valor de la propiedad autotransporteFederal.
         * 
         * @param value
         *     allowed object is
         *     {@link CartaPorte.Mercancias.AutotransporteFederal }
         *     
         */
        public void setAutotransporteFederal(CartaPorte.Mercancias.AutotransporteFederal value) {
            this.autotransporteFederal = value;
        }

        /**
         * Obtiene el valor de la propiedad transporteMaritimo.
         * 
         * @return
         *     possible object is
         *     {@link CartaPorte.Mercancias.TransporteMaritimo }
         *     
         */
        public CartaPorte.Mercancias.TransporteMaritimo getTransporteMaritimo() {
            return transporteMaritimo;
        }

        /**
         * Define el valor de la propiedad transporteMaritimo.
         * 
         * @param value
         *     allowed object is
         *     {@link CartaPorte.Mercancias.TransporteMaritimo }
         *     
         */
        public void setTransporteMaritimo(CartaPorte.Mercancias.TransporteMaritimo value) {
            this.transporteMaritimo = value;
        }

        /**
         * Obtiene el valor de la propiedad transporteAereo.
         * 
         * @return
         *     possible object is
         *     {@link CartaPorte.Mercancias.TransporteAereo }
         *     
         */
        public CartaPorte.Mercancias.TransporteAereo getTransporteAereo() {
            return transporteAereo;
        }

        /**
         * Define el valor de la propiedad transporteAereo.
         * 
         * @param value
         *     allowed object is
         *     {@link CartaPorte.Mercancias.TransporteAereo }
         *     
         */
        public void setTransporteAereo(CartaPorte.Mercancias.TransporteAereo value) {
            this.transporteAereo = value;
        }

        /**
         * Obtiene el valor de la propiedad transporteFerroviario.
         * 
         * @return
         *     possible object is
         *     {@link CartaPorte.Mercancias.TransporteFerroviario }
         *     
         */
        public CartaPorte.Mercancias.TransporteFerroviario getTransporteFerroviario() {
            return transporteFerroviario;
        }

        /**
         * Define el valor de la propiedad transporteFerroviario.
         * 
         * @param value
         *     allowed object is
         *     {@link CartaPorte.Mercancias.TransporteFerroviario }
         *     
         */
        public void setTransporteFerroviario(CartaPorte.Mercancias.TransporteFerroviario value) {
            this.transporteFerroviario = value;
        }

        /**
         * Obtiene el valor de la propiedad pesoBrutoTotal.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPesoBrutoTotal() {
            return pesoBrutoTotal;
        }

        /**
         * Define el valor de la propiedad pesoBrutoTotal.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPesoBrutoTotal(String value) {
            this.pesoBrutoTotal = value;
        }

        /**
         * Obtiene el valor de la propiedad unidadPeso.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnidadPeso() {
            return unidadPeso;
        }

        /**
         * Define el valor de la propiedad unidadPeso.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnidadPeso(String value) {
            this.unidadPeso = value;
        }

        /**
         * Obtiene el valor de la propiedad pesoNetoTotal.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPesoNetoTotal() {
            return pesoNetoTotal;
        }

        /**
         * Define el valor de la propiedad pesoNetoTotal.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPesoNetoTotal(BigDecimal value) {
            this.pesoNetoTotal = value;
        }

        /**
         * Obtiene el valor de la propiedad numTotalMercancias.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumTotalMercancias() {
            return numTotalMercancias;
        }

        /**
         * Define el valor de la propiedad numTotalMercancias.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumTotalMercancias(String value) {
            this.numTotalMercancias = value;
        }

        /**
         * Obtiene el valor de la propiedad cargoPorTasacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCargoPorTasacion() {
            return cargoPorTasacion;
        }

        /**
         * Define el valor de la propiedad cargoPorTasacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCargoPorTasacion(String value) {
            this.cargoPorTasacion = value;
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
         *         &lt;element name="IdentificacionVehicular" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="ConfigVehicular" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="PlacaVM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="AnioModeloVM" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Remolques" type="{http://www.sat.gob.mx/CartaPorte}ArrayOfCartaPorteMercanciasAutotransporteFederalRemolque" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="PermSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumPermisoSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "identificacionVehicular",
            "remolques"
        })
        public static class AutotransporteFederal {

            @XmlElement(name = "IdentificacionVehicular")
            protected CartaPorte.Mercancias.AutotransporteFederal.IdentificacionVehicular identificacionVehicular;
            @XmlElement(name = "Remolques")
            protected ArrayOfCartaPorteMercanciasAutotransporteFederalRemolque remolques;
            @XmlAttribute(name = "PermSCT")
            protected String permSCT;
            @XmlAttribute(name = "NumPermisoSCT")
            protected String numPermisoSCT;
            @XmlAttribute(name = "NombreAseg")
            protected String nombreAseg;
            @XmlAttribute(name = "NumPolizaSeguro")
            protected String numPolizaSeguro;

            /**
             * Obtiene el valor de la propiedad identificacionVehicular.
             * 
             * @return
             *     possible object is
             *     {@link CartaPorte.Mercancias.AutotransporteFederal.IdentificacionVehicular }
             *     
             */
            public CartaPorte.Mercancias.AutotransporteFederal.IdentificacionVehicular getIdentificacionVehicular() {
                return identificacionVehicular;
            }

            /**
             * Define el valor de la propiedad identificacionVehicular.
             * 
             * @param value
             *     allowed object is
             *     {@link CartaPorte.Mercancias.AutotransporteFederal.IdentificacionVehicular }
             *     
             */
            public void setIdentificacionVehicular(CartaPorte.Mercancias.AutotransporteFederal.IdentificacionVehicular value) {
                this.identificacionVehicular = value;
            }

            /**
             * Obtiene el valor de la propiedad remolques.
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfCartaPorteMercanciasAutotransporteFederalRemolque }
             *     
             */
            public ArrayOfCartaPorteMercanciasAutotransporteFederalRemolque getRemolques() {
                return remolques;
            }

            /**
             * Define el valor de la propiedad remolques.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfCartaPorteMercanciasAutotransporteFederalRemolque }
             *     
             */
            public void setRemolques(ArrayOfCartaPorteMercanciasAutotransporteFederalRemolque value) {
                this.remolques = value;
            }

            /**
             * Obtiene el valor de la propiedad permSCT.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPermSCT() {
                return permSCT;
            }

            /**
             * Define el valor de la propiedad permSCT.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPermSCT(String value) {
                this.permSCT = value;
            }

            /**
             * Obtiene el valor de la propiedad numPermisoSCT.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumPermisoSCT() {
                return numPermisoSCT;
            }

            /**
             * Define el valor de la propiedad numPermisoSCT.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumPermisoSCT(String value) {
                this.numPermisoSCT = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreAseg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreAseg() {
                return nombreAseg;
            }

            /**
             * Define el valor de la propiedad nombreAseg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreAseg(String value) {
                this.nombreAseg = value;
            }

            /**
             * Obtiene el valor de la propiedad numPolizaSeguro.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumPolizaSeguro() {
                return numPolizaSeguro;
            }

            /**
             * Define el valor de la propiedad numPolizaSeguro.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumPolizaSeguro(String value) {
                this.numPolizaSeguro = value;
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
             *       &lt;attribute name="ConfigVehicular" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="PlacaVM" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="AnioModeloVM" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class IdentificacionVehicular {

                @XmlAttribute(name = "ConfigVehicular")
                protected String configVehicular;
                @XmlAttribute(name = "PlacaVM")
                protected String placaVM;
                @XmlAttribute(name = "AnioModeloVM", required = true)
                @XmlSchemaType(name = "unsignedShort")
                protected int anioModeloVM;

                /**
                 * Obtiene el valor de la propiedad configVehicular.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConfigVehicular() {
                    return configVehicular;
                }

                /**
                 * Define el valor de la propiedad configVehicular.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConfigVehicular(String value) {
                    this.configVehicular = value;
                }

                /**
                 * Obtiene el valor de la propiedad placaVM.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlacaVM() {
                    return placaVM;
                }

                /**
                 * Define el valor de la propiedad placaVM.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlacaVM(String value) {
                    this.placaVM = value;
                }

                /**
                 * Obtiene el valor de la propiedad anioModeloVM.
                 * 
                 */
                public int getAnioModeloVM() {
                    return anioModeloVM;
                }

                /**
                 * Define el valor de la propiedad anioModeloVM.
                 * 
                 */
                public void setAnioModeloVM(int value) {
                    this.anioModeloVM = value;
                }

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
         *       &lt;sequence&gt;
         *         &lt;element name="CantidadTransporta" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Cantidad" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *                 &lt;attribute name="IDOrigen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="IDDestino" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="CvesTransporte" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="DetalleMercancia" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="UnidadPeso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="PesoBruto" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *                 &lt;attribute name="PesoNeto" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *                 &lt;attribute name="PesoTara" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *                 &lt;attribute name="NumPiezas" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="BienesTransp" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="ClaveSTCC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Cantidad" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="ClaveUnidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Unidad" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Dimensiones" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="MaterialPeligroso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="CveMaterialPeligroso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Embalaje" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="DescripEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="PesoEnKg" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="ValorMercancia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="FraccionArancelaria" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="UUIDComercioExt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cantidadTransporta",
            "detalleMercancia"
        })
        public static class Mercancia {

            @XmlElement(name = "CantidadTransporta")
            protected List<CartaPorte.Mercancias.Mercancia.CantidadTransporta> cantidadTransporta;
            @XmlElement(name = "DetalleMercancia")
            protected CartaPorte.Mercancias.Mercancia.DetalleMercancia detalleMercancia;
            @XmlAttribute(name = "BienesTransp", required = true)
            protected BigDecimal bienesTransp;
            @XmlAttribute(name = "ClaveSTCC")
            protected String claveSTCC;
            @XmlAttribute(name = "Descripcion")
            protected String descripcion;
            @XmlAttribute(name = "Cantidad", required = true)
            protected BigDecimal cantidad;
            @XmlAttribute(name = "ClaveUnidad")
            protected String claveUnidad;
            @XmlAttribute(name = "Unidad")
            protected String unidad;
            @XmlAttribute(name = "Dimensiones")
            protected String dimensiones;
            @XmlAttribute(name = "MaterialPeligroso")
            protected String materialPeligroso;
            @XmlAttribute(name = "CveMaterialPeligroso")
            protected String cveMaterialPeligroso;
            @XmlAttribute(name = "Embalaje")
            protected String embalaje;
            @XmlAttribute(name = "DescripEmbalaje")
            protected String descripEmbalaje;
            @XmlAttribute(name = "PesoEnKg", required = true)
            protected BigDecimal pesoEnKg;
            @XmlAttribute(name = "ValorMercancia")
            protected String valorMercancia;
            @XmlAttribute(name = "Moneda")
            protected String moneda;
            @XmlAttribute(name = "FraccionArancelaria")
            protected String fraccionArancelaria;
            @XmlAttribute(name = "UUIDComercioExt")
            protected String uuidComercioExt;

            /**
             * Gets the value of the cantidadTransporta property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cantidadTransporta property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCantidadTransporta().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CartaPorte.Mercancias.Mercancia.CantidadTransporta }
             * 
             * 
             */
            public List<CartaPorte.Mercancias.Mercancia.CantidadTransporta> getCantidadTransporta() {
                if (cantidadTransporta == null) {
                    cantidadTransporta = new ArrayList<CartaPorte.Mercancias.Mercancia.CantidadTransporta>();
                }
                return this.cantidadTransporta;
            }

            /**
             * Obtiene el valor de la propiedad detalleMercancia.
             * 
             * @return
             *     possible object is
             *     {@link CartaPorte.Mercancias.Mercancia.DetalleMercancia }
             *     
             */
            public CartaPorte.Mercancias.Mercancia.DetalleMercancia getDetalleMercancia() {
                return detalleMercancia;
            }

            /**
             * Define el valor de la propiedad detalleMercancia.
             * 
             * @param value
             *     allowed object is
             *     {@link CartaPorte.Mercancias.Mercancia.DetalleMercancia }
             *     
             */
            public void setDetalleMercancia(CartaPorte.Mercancias.Mercancia.DetalleMercancia value) {
                this.detalleMercancia = value;
            }

            /**
             * Obtiene el valor de la propiedad bienesTransp.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBienesTransp() {
                return bienesTransp;
            }

            /**
             * Define el valor de la propiedad bienesTransp.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBienesTransp(BigDecimal value) {
                this.bienesTransp = value;
            }

            /**
             * Obtiene el valor de la propiedad claveSTCC.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaveSTCC() {
                return claveSTCC;
            }

            /**
             * Define el valor de la propiedad claveSTCC.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaveSTCC(String value) {
                this.claveSTCC = value;
            }

            /**
             * Obtiene el valor de la propiedad descripcion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripcion() {
                return descripcion;
            }

            /**
             * Define el valor de la propiedad descripcion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescripcion(String value) {
                this.descripcion = value;
            }

            /**
             * Obtiene el valor de la propiedad cantidad.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCantidad() {
                return cantidad;
            }

            /**
             * Define el valor de la propiedad cantidad.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCantidad(BigDecimal value) {
                this.cantidad = value;
            }

            /**
             * Obtiene el valor de la propiedad claveUnidad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaveUnidad() {
                return claveUnidad;
            }

            /**
             * Define el valor de la propiedad claveUnidad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaveUnidad(String value) {
                this.claveUnidad = value;
            }

            /**
             * Obtiene el valor de la propiedad unidad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnidad() {
                return unidad;
            }

            /**
             * Define el valor de la propiedad unidad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnidad(String value) {
                this.unidad = value;
            }

            /**
             * Obtiene el valor de la propiedad dimensiones.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDimensiones() {
                return dimensiones;
            }

            /**
             * Define el valor de la propiedad dimensiones.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDimensiones(String value) {
                this.dimensiones = value;
            }

            /**
             * Obtiene el valor de la propiedad materialPeligroso.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaterialPeligroso() {
                return materialPeligroso;
            }

            /**
             * Define el valor de la propiedad materialPeligroso.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaterialPeligroso(String value) {
                this.materialPeligroso = value;
            }

            /**
             * Obtiene el valor de la propiedad cveMaterialPeligroso.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCveMaterialPeligroso() {
                return cveMaterialPeligroso;
            }

            /**
             * Define el valor de la propiedad cveMaterialPeligroso.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCveMaterialPeligroso(String value) {
                this.cveMaterialPeligroso = value;
            }

            /**
             * Obtiene el valor de la propiedad embalaje.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmbalaje() {
                return embalaje;
            }

            /**
             * Define el valor de la propiedad embalaje.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmbalaje(String value) {
                this.embalaje = value;
            }

            /**
             * Obtiene el valor de la propiedad descripEmbalaje.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripEmbalaje() {
                return descripEmbalaje;
            }

            /**
             * Define el valor de la propiedad descripEmbalaje.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescripEmbalaje(String value) {
                this.descripEmbalaje = value;
            }

            /**
             * Obtiene el valor de la propiedad pesoEnKg.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPesoEnKg() {
                return pesoEnKg;
            }

            /**
             * Define el valor de la propiedad pesoEnKg.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPesoEnKg(BigDecimal value) {
                this.pesoEnKg = value;
            }

            /**
             * Obtiene el valor de la propiedad valorMercancia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValorMercancia() {
                return valorMercancia;
            }

            /**
             * Define el valor de la propiedad valorMercancia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValorMercancia(String value) {
                this.valorMercancia = value;
            }

            /**
             * Obtiene el valor de la propiedad moneda.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMoneda() {
                return moneda;
            }

            /**
             * Define el valor de la propiedad moneda.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMoneda(String value) {
                this.moneda = value;
            }

            /**
             * Obtiene el valor de la propiedad fraccionArancelaria.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFraccionArancelaria() {
                return fraccionArancelaria;
            }

            /**
             * Define el valor de la propiedad fraccionArancelaria.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFraccionArancelaria(String value) {
                this.fraccionArancelaria = value;
            }

            /**
             * Obtiene el valor de la propiedad uuidComercioExt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUUIDComercioExt() {
                return uuidComercioExt;
            }

            /**
             * Define el valor de la propiedad uuidComercioExt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUUIDComercioExt(String value) {
                this.uuidComercioExt = value;
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
             *       &lt;attribute name="Cantidad" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
             *       &lt;attribute name="IDOrigen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="IDDestino" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="CvesTransporte" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CantidadTransporta {

                @XmlAttribute(name = "Cantidad", required = true)
                protected BigDecimal cantidad;
                @XmlAttribute(name = "IDOrigen")
                protected String idOrigen;
                @XmlAttribute(name = "IDDestino")
                protected String idDestino;
                @XmlAttribute(name = "CvesTransporte")
                protected String cvesTransporte;

                /**
                 * Obtiene el valor de la propiedad cantidad.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCantidad() {
                    return cantidad;
                }

                /**
                 * Define el valor de la propiedad cantidad.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setCantidad(BigDecimal value) {
                    this.cantidad = value;
                }

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
                 * Obtiene el valor de la propiedad cvesTransporte.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCvesTransporte() {
                    return cvesTransporte;
                }

                /**
                 * Define el valor de la propiedad cvesTransporte.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCvesTransporte(String value) {
                    this.cvesTransporte = value;
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
             *       &lt;attribute name="UnidadPeso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="PesoBruto" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
             *       &lt;attribute name="PesoNeto" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
             *       &lt;attribute name="PesoTara" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
             *       &lt;attribute name="NumPiezas" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DetalleMercancia {

                @XmlAttribute(name = "UnidadPeso")
                protected String unidadPeso;
                @XmlAttribute(name = "PesoBruto", required = true)
                protected BigDecimal pesoBruto;
                @XmlAttribute(name = "PesoNeto", required = true)
                protected BigDecimal pesoNeto;
                @XmlAttribute(name = "PesoTara", required = true)
                protected BigDecimal pesoTara;
                @XmlAttribute(name = "NumPiezas")
                protected String numPiezas;

                /**
                 * Obtiene el valor de la propiedad unidadPeso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnidadPeso() {
                    return unidadPeso;
                }

                /**
                 * Define el valor de la propiedad unidadPeso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnidadPeso(String value) {
                    this.unidadPeso = value;
                }

                /**
                 * Obtiene el valor de la propiedad pesoBruto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPesoBruto() {
                    return pesoBruto;
                }

                /**
                 * Define el valor de la propiedad pesoBruto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPesoBruto(BigDecimal value) {
                    this.pesoBruto = value;
                }

                /**
                 * Obtiene el valor de la propiedad pesoNeto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPesoNeto() {
                    return pesoNeto;
                }

                /**
                 * Define el valor de la propiedad pesoNeto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPesoNeto(BigDecimal value) {
                    this.pesoNeto = value;
                }

                /**
                 * Obtiene el valor de la propiedad pesoTara.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPesoTara() {
                    return pesoTara;
                }

                /**
                 * Define el valor de la propiedad pesoTara.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPesoTara(BigDecimal value) {
                    this.pesoTara = value;
                }

                /**
                 * Obtiene el valor de la propiedad numPiezas.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumPiezas() {
                    return numPiezas;
                }

                /**
                 * Define el valor de la propiedad numPiezas.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumPiezas(String value) {
                    this.numPiezas = value;
                }

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
         *       &lt;attribute name="PermSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumPermisoSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="MatriculaAeronave" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumeroGuia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="LugarContrato" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="RFCTransportista" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="CodigoTransportista" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumRegIdTribTranspor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ResidenciaFiscalTranspor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NombreTransportista" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="RFCEmbarcador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumRegIdTribEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ResidenciaFiscalEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NombreEmbarcador" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TransporteAereo {

            @XmlAttribute(name = "PermSCT")
            protected String permSCT;
            @XmlAttribute(name = "NumPermisoSCT")
            protected String numPermisoSCT;
            @XmlAttribute(name = "MatriculaAeronave")
            protected String matriculaAeronave;
            @XmlAttribute(name = "NombreAseg")
            protected String nombreAseg;
            @XmlAttribute(name = "NumPolizaSeguro")
            protected String numPolizaSeguro;
            @XmlAttribute(name = "NumeroGuia")
            protected String numeroGuia;
            @XmlAttribute(name = "LugarContrato")
            protected String lugarContrato;
            @XmlAttribute(name = "RFCTransportista")
            protected String rfcTransportista;
            @XmlAttribute(name = "CodigoTransportista")
            protected String codigoTransportista;
            @XmlAttribute(name = "NumRegIdTribTranspor")
            protected String numRegIdTribTranspor;
            @XmlAttribute(name = "ResidenciaFiscalTranspor")
            protected String residenciaFiscalTranspor;
            @XmlAttribute(name = "NombreTransportista")
            protected String nombreTransportista;
            @XmlAttribute(name = "RFCEmbarcador")
            protected String rfcEmbarcador;
            @XmlAttribute(name = "NumRegIdTribEmbarc")
            protected String numRegIdTribEmbarc;
            @XmlAttribute(name = "ResidenciaFiscalEmbarc")
            protected String residenciaFiscalEmbarc;
            @XmlAttribute(name = "NombreEmbarcador")
            protected String nombreEmbarcador;

            /**
             * Obtiene el valor de la propiedad permSCT.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPermSCT() {
                return permSCT;
            }

            /**
             * Define el valor de la propiedad permSCT.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPermSCT(String value) {
                this.permSCT = value;
            }

            /**
             * Obtiene el valor de la propiedad numPermisoSCT.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumPermisoSCT() {
                return numPermisoSCT;
            }

            /**
             * Define el valor de la propiedad numPermisoSCT.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumPermisoSCT(String value) {
                this.numPermisoSCT = value;
            }

            /**
             * Obtiene el valor de la propiedad matriculaAeronave.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMatriculaAeronave() {
                return matriculaAeronave;
            }

            /**
             * Define el valor de la propiedad matriculaAeronave.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMatriculaAeronave(String value) {
                this.matriculaAeronave = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreAseg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreAseg() {
                return nombreAseg;
            }

            /**
             * Define el valor de la propiedad nombreAseg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreAseg(String value) {
                this.nombreAseg = value;
            }

            /**
             * Obtiene el valor de la propiedad numPolizaSeguro.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumPolizaSeguro() {
                return numPolizaSeguro;
            }

            /**
             * Define el valor de la propiedad numPolizaSeguro.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumPolizaSeguro(String value) {
                this.numPolizaSeguro = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroGuia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroGuia() {
                return numeroGuia;
            }

            /**
             * Define el valor de la propiedad numeroGuia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroGuia(String value) {
                this.numeroGuia = value;
            }

            /**
             * Obtiene el valor de la propiedad lugarContrato.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLugarContrato() {
                return lugarContrato;
            }

            /**
             * Define el valor de la propiedad lugarContrato.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLugarContrato(String value) {
                this.lugarContrato = value;
            }

            /**
             * Obtiene el valor de la propiedad rfcTransportista.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRFCTransportista() {
                return rfcTransportista;
            }

            /**
             * Define el valor de la propiedad rfcTransportista.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRFCTransportista(String value) {
                this.rfcTransportista = value;
            }

            /**
             * Obtiene el valor de la propiedad codigoTransportista.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoTransportista() {
                return codigoTransportista;
            }

            /**
             * Define el valor de la propiedad codigoTransportista.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoTransportista(String value) {
                this.codigoTransportista = value;
            }

            /**
             * Obtiene el valor de la propiedad numRegIdTribTranspor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumRegIdTribTranspor() {
                return numRegIdTribTranspor;
            }

            /**
             * Define el valor de la propiedad numRegIdTribTranspor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumRegIdTribTranspor(String value) {
                this.numRegIdTribTranspor = value;
            }

            /**
             * Obtiene el valor de la propiedad residenciaFiscalTranspor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResidenciaFiscalTranspor() {
                return residenciaFiscalTranspor;
            }

            /**
             * Define el valor de la propiedad residenciaFiscalTranspor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResidenciaFiscalTranspor(String value) {
                this.residenciaFiscalTranspor = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreTransportista.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreTransportista() {
                return nombreTransportista;
            }

            /**
             * Define el valor de la propiedad nombreTransportista.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreTransportista(String value) {
                this.nombreTransportista = value;
            }

            /**
             * Obtiene el valor de la propiedad rfcEmbarcador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRFCEmbarcador() {
                return rfcEmbarcador;
            }

            /**
             * Define el valor de la propiedad rfcEmbarcador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRFCEmbarcador(String value) {
                this.rfcEmbarcador = value;
            }

            /**
             * Obtiene el valor de la propiedad numRegIdTribEmbarc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumRegIdTribEmbarc() {
                return numRegIdTribEmbarc;
            }

            /**
             * Define el valor de la propiedad numRegIdTribEmbarc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumRegIdTribEmbarc(String value) {
                this.numRegIdTribEmbarc = value;
            }

            /**
             * Obtiene el valor de la propiedad residenciaFiscalEmbarc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResidenciaFiscalEmbarc() {
                return residenciaFiscalEmbarc;
            }

            /**
             * Define el valor de la propiedad residenciaFiscalEmbarc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResidenciaFiscalEmbarc(String value) {
                this.residenciaFiscalEmbarc = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreEmbarcador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreEmbarcador() {
                return nombreEmbarcador;
            }

            /**
             * Define el valor de la propiedad nombreEmbarcador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreEmbarcador(String value) {
                this.nombreEmbarcador = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="DerechosDePaso" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="TipoDerechoDePaso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="KilometrajePagado" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Carro" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Contenedor" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="TipoContenedor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="PesoContenedorVacio" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *                           &lt;attribute name="PesoNetoMercancia" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="TipoCarro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="MatriculaCarro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="GuiaCarro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="ToneladasNetasCarro" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="TipoDeServicio" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Concesionario" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "derechosDePaso",
            "carro"
        })
        public static class TransporteFerroviario {

            @XmlElement(name = "DerechosDePaso")
            protected List<CartaPorte.Mercancias.TransporteFerroviario.DerechosDePaso> derechosDePaso;
            @XmlElement(name = "Carro")
            protected List<CartaPorte.Mercancias.TransporteFerroviario.Carro> carro;
            @XmlAttribute(name = "TipoDeServicio")
            protected String tipoDeServicio;
            @XmlAttribute(name = "NombreAseg")
            protected String nombreAseg;
            @XmlAttribute(name = "NumPolizaSeguro")
            protected String numPolizaSeguro;
            @XmlAttribute(name = "Concesionario")
            protected String concesionario;

            /**
             * Gets the value of the derechosDePaso property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the derechosDePaso property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDerechosDePaso().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CartaPorte.Mercancias.TransporteFerroviario.DerechosDePaso }
             * 
             * 
             */
            public List<CartaPorte.Mercancias.TransporteFerroviario.DerechosDePaso> getDerechosDePaso() {
                if (derechosDePaso == null) {
                    derechosDePaso = new ArrayList<CartaPorte.Mercancias.TransporteFerroviario.DerechosDePaso>();
                }
                return this.derechosDePaso;
            }

            /**
             * Gets the value of the carro property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the carro property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCarro().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CartaPorte.Mercancias.TransporteFerroviario.Carro }
             * 
             * 
             */
            public List<CartaPorte.Mercancias.TransporteFerroviario.Carro> getCarro() {
                if (carro == null) {
                    carro = new ArrayList<CartaPorte.Mercancias.TransporteFerroviario.Carro>();
                }
                return this.carro;
            }

            /**
             * Obtiene el valor de la propiedad tipoDeServicio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoDeServicio() {
                return tipoDeServicio;
            }

            /**
             * Define el valor de la propiedad tipoDeServicio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoDeServicio(String value) {
                this.tipoDeServicio = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreAseg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreAseg() {
                return nombreAseg;
            }

            /**
             * Define el valor de la propiedad nombreAseg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreAseg(String value) {
                this.nombreAseg = value;
            }

            /**
             * Obtiene el valor de la propiedad numPolizaSeguro.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumPolizaSeguro() {
                return numPolizaSeguro;
            }

            /**
             * Define el valor de la propiedad numPolizaSeguro.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumPolizaSeguro(String value) {
                this.numPolizaSeguro = value;
            }

            /**
             * Obtiene el valor de la propiedad concesionario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConcesionario() {
                return concesionario;
            }

            /**
             * Define el valor de la propiedad concesionario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConcesionario(String value) {
                this.concesionario = value;
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
             *         &lt;element name="Contenedor" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="TipoContenedor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="PesoContenedorVacio" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
             *                 &lt;attribute name="PesoNetoMercancia" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="TipoCarro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="MatriculaCarro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="GuiaCarro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="ToneladasNetasCarro" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "contenedor"
            })
            public static class Carro {

                @XmlElement(name = "Contenedor")
                protected List<CartaPorte.Mercancias.TransporteFerroviario.Carro.Contenedor> contenedor;
                @XmlAttribute(name = "TipoCarro")
                protected String tipoCarro;
                @XmlAttribute(name = "MatriculaCarro")
                protected String matriculaCarro;
                @XmlAttribute(name = "GuiaCarro")
                protected String guiaCarro;
                @XmlAttribute(name = "ToneladasNetasCarro", required = true)
                protected BigDecimal toneladasNetasCarro;

                /**
                 * Gets the value of the contenedor property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the contenedor property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContenedor().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CartaPorte.Mercancias.TransporteFerroviario.Carro.Contenedor }
                 * 
                 * 
                 */
                public List<CartaPorte.Mercancias.TransporteFerroviario.Carro.Contenedor> getContenedor() {
                    if (contenedor == null) {
                        contenedor = new ArrayList<CartaPorte.Mercancias.TransporteFerroviario.Carro.Contenedor>();
                    }
                    return this.contenedor;
                }

                /**
                 * Obtiene el valor de la propiedad tipoCarro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipoCarro() {
                    return tipoCarro;
                }

                /**
                 * Define el valor de la propiedad tipoCarro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipoCarro(String value) {
                    this.tipoCarro = value;
                }

                /**
                 * Obtiene el valor de la propiedad matriculaCarro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMatriculaCarro() {
                    return matriculaCarro;
                }

                /**
                 * Define el valor de la propiedad matriculaCarro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMatriculaCarro(String value) {
                    this.matriculaCarro = value;
                }

                /**
                 * Obtiene el valor de la propiedad guiaCarro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGuiaCarro() {
                    return guiaCarro;
                }

                /**
                 * Define el valor de la propiedad guiaCarro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGuiaCarro(String value) {
                    this.guiaCarro = value;
                }

                /**
                 * Obtiene el valor de la propiedad toneladasNetasCarro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getToneladasNetasCarro() {
                    return toneladasNetasCarro;
                }

                /**
                 * Define el valor de la propiedad toneladasNetasCarro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setToneladasNetasCarro(BigDecimal value) {
                    this.toneladasNetasCarro = value;
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
                 *       &lt;attribute name="TipoContenedor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="PesoContenedorVacio" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
                 *       &lt;attribute name="PesoNetoMercancia" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Contenedor {

                    @XmlAttribute(name = "TipoContenedor")
                    protected String tipoContenedor;
                    @XmlAttribute(name = "PesoContenedorVacio", required = true)
                    protected BigDecimal pesoContenedorVacio;
                    @XmlAttribute(name = "PesoNetoMercancia", required = true)
                    protected BigDecimal pesoNetoMercancia;

                    /**
                     * Obtiene el valor de la propiedad tipoContenedor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTipoContenedor() {
                        return tipoContenedor;
                    }

                    /**
                     * Define el valor de la propiedad tipoContenedor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTipoContenedor(String value) {
                        this.tipoContenedor = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad pesoContenedorVacio.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getPesoContenedorVacio() {
                        return pesoContenedorVacio;
                    }

                    /**
                     * Define el valor de la propiedad pesoContenedorVacio.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setPesoContenedorVacio(BigDecimal value) {
                        this.pesoContenedorVacio = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad pesoNetoMercancia.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getPesoNetoMercancia() {
                        return pesoNetoMercancia;
                    }

                    /**
                     * Define el valor de la propiedad pesoNetoMercancia.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setPesoNetoMercancia(BigDecimal value) {
                        this.pesoNetoMercancia = value;
                    }

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
             *       &lt;attribute name="TipoDerechoDePaso" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="KilometrajePagado" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DerechosDePaso {

                @XmlAttribute(name = "TipoDerechoDePaso")
                protected String tipoDerechoDePaso;
                @XmlAttribute(name = "KilometrajePagado", required = true)
                protected BigDecimal kilometrajePagado;

                /**
                 * Obtiene el valor de la propiedad tipoDerechoDePaso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipoDerechoDePaso() {
                    return tipoDerechoDePaso;
                }

                /**
                 * Define el valor de la propiedad tipoDerechoDePaso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipoDerechoDePaso(String value) {
                    this.tipoDerechoDePaso = value;
                }

                /**
                 * Obtiene el valor de la propiedad kilometrajePagado.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getKilometrajePagado() {
                    return kilometrajePagado;
                }

                /**
                 * Define el valor de la propiedad kilometrajePagado.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setKilometrajePagado(BigDecimal value) {
                    this.kilometrajePagado = value;
                }

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
         *       &lt;sequence&gt;
         *         &lt;element name="Contenedor" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="MatriculaContenedor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="TipoContenedor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="NumPrecinto" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="PermSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumPermisoSCT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="TipoEmbarcacion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Matricula" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumeroOMI" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="AnioEmbarcacion" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" /&gt;
         *       &lt;attribute name="NombreEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NacionalidadEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="UnidadesDeArqBruto" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="TipoCarga" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumCertITC" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Eslora" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="Manga" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="Calado" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="LineaNaviera" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NombreAgenteNaviero" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumAutorizacionNaviero" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumViaje" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NumConocEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "contenedor"
        })
        public static class TransporteMaritimo {

            @XmlElement(name = "Contenedor")
            protected List<CartaPorte.Mercancias.TransporteMaritimo.Contenedor> contenedor;
            @XmlAttribute(name = "PermSCT")
            protected String permSCT;
            @XmlAttribute(name = "NumPermisoSCT")
            protected String numPermisoSCT;
            @XmlAttribute(name = "NombreAseg")
            protected String nombreAseg;
            @XmlAttribute(name = "NumPolizaSeguro")
            protected String numPolizaSeguro;
            @XmlAttribute(name = "TipoEmbarcacion")
            protected String tipoEmbarcacion;
            @XmlAttribute(name = "Matricula")
            protected String matricula;
            @XmlAttribute(name = "NumeroOMI")
            protected String numeroOMI;
            @XmlAttribute(name = "AnioEmbarcacion", required = true)
            @XmlSchemaType(name = "unsignedShort")
            protected int anioEmbarcacion;
            @XmlAttribute(name = "NombreEmbarc")
            protected String nombreEmbarc;
            @XmlAttribute(name = "NacionalidadEmbarc")
            protected String nacionalidadEmbarc;
            @XmlAttribute(name = "UnidadesDeArqBruto", required = true)
            protected BigDecimal unidadesDeArqBruto;
            @XmlAttribute(name = "TipoCarga")
            protected String tipoCarga;
            @XmlAttribute(name = "NumCertITC")
            protected String numCertITC;
            @XmlAttribute(name = "Eslora", required = true)
            protected BigDecimal eslora;
            @XmlAttribute(name = "Manga", required = true)
            protected BigDecimal manga;
            @XmlAttribute(name = "Calado", required = true)
            protected BigDecimal calado;
            @XmlAttribute(name = "LineaNaviera")
            protected String lineaNaviera;
            @XmlAttribute(name = "NombreAgenteNaviero")
            protected String nombreAgenteNaviero;
            @XmlAttribute(name = "NumAutorizacionNaviero")
            protected String numAutorizacionNaviero;
            @XmlAttribute(name = "NumViaje")
            protected String numViaje;
            @XmlAttribute(name = "NumConocEmbarc")
            protected String numConocEmbarc;

            /**
             * Gets the value of the contenedor property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contenedor property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContenedor().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CartaPorte.Mercancias.TransporteMaritimo.Contenedor }
             * 
             * 
             */
            public List<CartaPorte.Mercancias.TransporteMaritimo.Contenedor> getContenedor() {
                if (contenedor == null) {
                    contenedor = new ArrayList<CartaPorte.Mercancias.TransporteMaritimo.Contenedor>();
                }
                return this.contenedor;
            }

            /**
             * Obtiene el valor de la propiedad permSCT.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPermSCT() {
                return permSCT;
            }

            /**
             * Define el valor de la propiedad permSCT.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPermSCT(String value) {
                this.permSCT = value;
            }

            /**
             * Obtiene el valor de la propiedad numPermisoSCT.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumPermisoSCT() {
                return numPermisoSCT;
            }

            /**
             * Define el valor de la propiedad numPermisoSCT.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumPermisoSCT(String value) {
                this.numPermisoSCT = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreAseg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreAseg() {
                return nombreAseg;
            }

            /**
             * Define el valor de la propiedad nombreAseg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreAseg(String value) {
                this.nombreAseg = value;
            }

            /**
             * Obtiene el valor de la propiedad numPolizaSeguro.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumPolizaSeguro() {
                return numPolizaSeguro;
            }

            /**
             * Define el valor de la propiedad numPolizaSeguro.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumPolizaSeguro(String value) {
                this.numPolizaSeguro = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoEmbarcacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoEmbarcacion() {
                return tipoEmbarcacion;
            }

            /**
             * Define el valor de la propiedad tipoEmbarcacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoEmbarcacion(String value) {
                this.tipoEmbarcacion = value;
            }

            /**
             * Obtiene el valor de la propiedad matricula.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMatricula() {
                return matricula;
            }

            /**
             * Define el valor de la propiedad matricula.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMatricula(String value) {
                this.matricula = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroOMI.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroOMI() {
                return numeroOMI;
            }

            /**
             * Define el valor de la propiedad numeroOMI.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroOMI(String value) {
                this.numeroOMI = value;
            }

            /**
             * Obtiene el valor de la propiedad anioEmbarcacion.
             * 
             */
            public int getAnioEmbarcacion() {
                return anioEmbarcacion;
            }

            /**
             * Define el valor de la propiedad anioEmbarcacion.
             * 
             */
            public void setAnioEmbarcacion(int value) {
                this.anioEmbarcacion = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreEmbarc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreEmbarc() {
                return nombreEmbarc;
            }

            /**
             * Define el valor de la propiedad nombreEmbarc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreEmbarc(String value) {
                this.nombreEmbarc = value;
            }

            /**
             * Obtiene el valor de la propiedad nacionalidadEmbarc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNacionalidadEmbarc() {
                return nacionalidadEmbarc;
            }

            /**
             * Define el valor de la propiedad nacionalidadEmbarc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNacionalidadEmbarc(String value) {
                this.nacionalidadEmbarc = value;
            }

            /**
             * Obtiene el valor de la propiedad unidadesDeArqBruto.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnidadesDeArqBruto() {
                return unidadesDeArqBruto;
            }

            /**
             * Define el valor de la propiedad unidadesDeArqBruto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnidadesDeArqBruto(BigDecimal value) {
                this.unidadesDeArqBruto = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoCarga.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoCarga() {
                return tipoCarga;
            }

            /**
             * Define el valor de la propiedad tipoCarga.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoCarga(String value) {
                this.tipoCarga = value;
            }

            /**
             * Obtiene el valor de la propiedad numCertITC.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumCertITC() {
                return numCertITC;
            }

            /**
             * Define el valor de la propiedad numCertITC.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumCertITC(String value) {
                this.numCertITC = value;
            }

            /**
             * Obtiene el valor de la propiedad eslora.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getEslora() {
                return eslora;
            }

            /**
             * Define el valor de la propiedad eslora.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setEslora(BigDecimal value) {
                this.eslora = value;
            }

            /**
             * Obtiene el valor de la propiedad manga.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getManga() {
                return manga;
            }

            /**
             * Define el valor de la propiedad manga.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setManga(BigDecimal value) {
                this.manga = value;
            }

            /**
             * Obtiene el valor de la propiedad calado.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCalado() {
                return calado;
            }

            /**
             * Define el valor de la propiedad calado.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCalado(BigDecimal value) {
                this.calado = value;
            }

            /**
             * Obtiene el valor de la propiedad lineaNaviera.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLineaNaviera() {
                return lineaNaviera;
            }

            /**
             * Define el valor de la propiedad lineaNaviera.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLineaNaviera(String value) {
                this.lineaNaviera = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreAgenteNaviero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreAgenteNaviero() {
                return nombreAgenteNaviero;
            }

            /**
             * Define el valor de la propiedad nombreAgenteNaviero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreAgenteNaviero(String value) {
                this.nombreAgenteNaviero = value;
            }

            /**
             * Obtiene el valor de la propiedad numAutorizacionNaviero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumAutorizacionNaviero() {
                return numAutorizacionNaviero;
            }

            /**
             * Define el valor de la propiedad numAutorizacionNaviero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumAutorizacionNaviero(String value) {
                this.numAutorizacionNaviero = value;
            }

            /**
             * Obtiene el valor de la propiedad numViaje.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumViaje() {
                return numViaje;
            }

            /**
             * Define el valor de la propiedad numViaje.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumViaje(String value) {
                this.numViaje = value;
            }

            /**
             * Obtiene el valor de la propiedad numConocEmbarc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumConocEmbarc() {
                return numConocEmbarc;
            }

            /**
             * Define el valor de la propiedad numConocEmbarc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumConocEmbarc(String value) {
                this.numConocEmbarc = value;
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
             *       &lt;attribute name="MatriculaContenedor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="TipoContenedor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="NumPrecinto" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Contenedor {

                @XmlAttribute(name = "MatriculaContenedor")
                protected String matriculaContenedor;
                @XmlAttribute(name = "TipoContenedor")
                protected String tipoContenedor;
                @XmlAttribute(name = "NumPrecinto")
                protected String numPrecinto;

                /**
                 * Obtiene el valor de la propiedad matriculaContenedor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMatriculaContenedor() {
                    return matriculaContenedor;
                }

                /**
                 * Define el valor de la propiedad matriculaContenedor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMatriculaContenedor(String value) {
                    this.matriculaContenedor = value;
                }

                /**
                 * Obtiene el valor de la propiedad tipoContenedor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipoContenedor() {
                    return tipoContenedor;
                }

                /**
                 * Define el valor de la propiedad tipoContenedor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipoContenedor(String value) {
                    this.tipoContenedor = value;
                }

                /**
                 * Obtiene el valor de la propiedad numPrecinto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumPrecinto() {
                    return numPrecinto;
                }

                /**
                 * Define el valor de la propiedad numPrecinto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumPrecinto(String value) {
                    this.numPrecinto = value;
                }

            }

        }

    }

}
