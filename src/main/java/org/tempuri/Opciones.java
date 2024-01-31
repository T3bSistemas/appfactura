
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Opciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Opciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tickets" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PlantillaExtendida" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AutoComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Constancias" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Hidrosina" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CFDv32" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RellenaAddendaWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PostpagoDist" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FolioCliente" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IAVE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="GrupoSoni" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReinsertaAddendaWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EmailPersonalizado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExtGeneracion" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExentoDeIVA" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EnvioCorreo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NoEnvioCorreo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OcupaHash" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Oxford" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Velsimex" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TASA0" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NoActualizaReceptor" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Log" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="GuardaCancelacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Complemento" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaVelsimex" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaFundacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaAgricola" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaQuimix" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaAgromaquilas" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaATC" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaIndustriasQuimicas" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaChemimport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaHamaca" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaProa" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaQuimicaEshidal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaDalmick" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaEstructurasCalidad" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaCorporeo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaMedirep" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaMaxicajas" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaMotion" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaStarRecords" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaQuiahui" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VistaMaxiPet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LimpiarMensajePDF" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PAC2" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SoniSatelite" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Forsa" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WSClienteNum" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IEPSCero" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FechaAnterior" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RegeneraDatosAdic" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RevisaNumTicket" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AseguraReceptor" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ComercialMexicana" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AcuseCancelacionWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Magna" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Castilla" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FormaPagoLibre" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NoRevisaFechaTimbrado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LogTimbreInicio" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NoTieneGeneracionFacturas" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Fecha31" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AutoregistroSerieWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SegundoRegistroNumEmpleadoWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FechaNomina" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AseguroFolio" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ComillaSimple" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LogDesarrollo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NoTelefonoCorreo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LogoWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MensajeMailWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ValidacionRFCPropio" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FolioClienteFecha" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SectorPrimario" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ObtenerXMLContabilidad" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AgregaDatosTicket" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Tasa16" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Cantidad0DXML" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CastrolPOD" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CambiastatusWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="timbradotbn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="GrupoDAY" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RSC" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FolioEvya" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="grupoaei" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MetodoNA" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MetodoOtro" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MetodoEfectivo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FolioClienteError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MetodoTransferencia" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TimbradoTralix" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="BP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DepositoDental" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TimbradoLong" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CONANP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Fecha31Base" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ConceptoNominaFijo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EntidadSNCFWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CancelacionSFWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Promec" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IAVE33" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WS2DecimalesImpuestos33" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WSRedondeaTotalImpuestos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WSImporte6Decimales" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WSTruncaImpuestos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ComplementoDetallistaWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Cantidad3Decimales" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ValorUnitario5Decimales" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Cenagas" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ImporteTraslado2Decimales" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Base2Decimales" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TipoCambioCenagas" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DireccionComercioWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ValorUnitario4Decimales" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TipoCambio4DecimalesWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="BP33" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ComplementoPagosHorario" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NoServicioWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AIRBP33" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MomentiveReceptor" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FranjaFronterizaOp" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TicketCrepes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IBerdolaRFC" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TimbradoEdiFact" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FolioClienteOmitir" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Cantidad0Decimales" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TipoCambioBP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HamiltonBeach" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Decimales6TipoCambioWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Decimales6DoctoRelacionado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ValorUnitarioString" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OfficeMax" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FolioClienteCancelado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Penon" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SerieRest" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CancelacionIberdrola" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TipoCambio4DecimalesPagosWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ValidaRFCRazonSocial" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Tiendas3B" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TotalesPagos206D" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TotalesPagos204D" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SWSAPIEN" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RS_CP_Automatico" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WS40" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Ticket40" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RFC_Automatico_SOAP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RS_CP_Automatico_Nomina" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IberdrolaDecimalesPagos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Allianz33_40Traslados" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Traslados_40" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OrigenRecursoWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CastrolSAP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EliminaTicket40" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SiValeCorreos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ServiFacil" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ActualizaDomicilioWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="GrupoSumma" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Gandhi" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TipoCambioUSD4D" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EquivalenciaDR6" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Hyundai" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CastrolFinanzas" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PublicoGeneral" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MesSAP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Bellota" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MesFinanzas" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EquivalenciaDR10" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Lanceta" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MontoOrigenRecursoWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TSJ" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Opciones", propOrder = {
    "tickets",
    "plantillaExtendida",
    "autoComplete",
    "constancias",
    "hidrosina",
    "cfDv32",
    "rellenaAddendaWS",
    "postpagoDist",
    "folioCliente",
    "iave",
    "grupoSoni",
    "reinsertaAddendaWS",
    "emailPersonalizado",
    "extGeneracion",
    "exentoDeIVA",
    "envioCorreo",
    "noEnvioCorreo",
    "ocupaHash",
    "oxford",
    "velsimex",
    "tasa0",
    "noActualizaReceptor",
    "log",
    "guardaCancelacion",
    "complemento",
    "vistaVelsimex",
    "vistaFundacion",
    "vistaAgricola",
    "vistaQuimix",
    "vistaAgromaquilas",
    "vistaATC",
    "vistaIndustriasQuimicas",
    "vistaChemimport",
    "vistaHamaca",
    "vistaProa",
    "vistaQuimicaEshidal",
    "vistaDalmick",
    "vistaEstructurasCalidad",
    "vistaCorporeo",
    "vistaMedirep",
    "vistaMaxicajas",
    "vistaMotion",
    "vistaInmobiliaria",
    "vistaStarRecords",
    "vistaQuiahui",
    "vistaMaxiPet",
    "limpiarMensajePDF",
    "pac2",
    "soniSatelite",
    "forsa",
    "wsClienteNum",
    "iepsCero",
    "fechaAnterior",
    "regeneraDatosAdic",
    "revisaNumTicket",
    "aseguraReceptor",
    "comercialMexicana",
    "acuseCancelacionWS",
    "magna",
    "castilla",
    "formaPagoLibre",
    "noRevisaFechaTimbrado",
    "logTimbreInicio",
    "noTieneGeneracionFacturas",
    "fecha31",
    "autoregistroSerieWS",
    "segundoRegistroNumEmpleadoWS",
    "fechaNomina",
    "aseguroFolio",
    "comillaSimple",
    "logDesarrollo",
    "noTelefonoCorreo",
    "logoWS",
    "mensajeMailWS",
    "validacionRFCPropio",
    "folioClienteFecha",
    "sectorPrimario",
    "obtenerXMLContabilidad",
    "agregaDatosTicket",
    "tasa16",
    "cantidad0DXML",
    "castrolPOD",
    "cambiastatusWS",
    "timbradotbn",
    "grupoDAY",
    "rsc",
    "folioEvya",
    "grupoaei",
    "metodoNA",
    "metodoOtro",
    "metodoEfectivo",
    "folioClienteError",
    "metodoTransferencia",
    "timbradoTralix",
    "bp",
    "depositoDental",
    "timbradoLong",
    "conanp",
    "fecha31Base",
    "conceptoNominaFijo",
    "entidadSNCFWS",
    "cancelacionSFWS",
    "promec",
    "iave33",
    "ws2DecimalesImpuestos33",
    "wsRedondeaTotalImpuestos",
    "wsImporte6Decimales",
    "wsTruncaImpuestos",
    "complementoDetallistaWS",
    "cantidad3Decimales",
    "valorUnitario5Decimales",
    "cenagas",
    "importeTraslado2Decimales",
    "base2Decimales",
    "tipoCambioCenagas",
    "direccionComercioWS",
    "valorUnitario4Decimales",
    "tipoCambio4DecimalesWS",
    "bp33",
    "complementoPagosHorario",
    "noServicioWS",
    "airbp33",
    "momentiveReceptor",
    "franjaFronterizaOp",
    "ticketCrepes",
    "iBerdolaRFC",
    "timbradoEdiFact",
    "folioClienteOmitir",
    "cantidad0Decimales",
    "tipoCambioBP",
    "hamiltonBeach",
    "decimales6TipoCambioWS",
    "decimales6DoctoRelacionado",
    "valorUnitarioString",
    "officeMax",
    "folioClienteCancelado",
    "penon",
    "serieRest",
    "cancelacionIberdrola",
    "tipoCambio4DecimalesPagosWS",
    "validaRFCRazonSocial",
    "tiendas3B",
    "totalesPagos206D",
    "totalesPagos204D",
    "swsapien",
    "rscpAutomatico",
    "ws40",
    "ticket40",
    "rfcAutomaticoSOAP",
    "rscpAutomaticoNomina",
    "iberdrolaDecimalesPagos",
    "allianz3340Traslados",
    "traslados40",
    "origenRecursoWS",
    "castrolSAP",
    "eliminaTicket40",
    "siValeCorreos",
    "serviFacil",
    "actualizaDomicilioWS",
    "grupoSumma",
    "gandhi",
    "tipoCambioUSD4D",
    "equivalenciaDR6",
    "hyundai",
    "castrolFinanzas",
    "publicoGeneral",
    "mesSAP",
    "bellota",
    "mesFinanzas",
    "equivalenciaDR10",
    "lanceta",
    "montoOrigenRecursoWS",
    "tsj"
})
public class Opciones {

    @XmlElement(name = "Tickets")
    protected boolean tickets;
    @XmlElement(name = "PlantillaExtendida")
    protected boolean plantillaExtendida;
    @XmlElement(name = "AutoComplete")
    protected boolean autoComplete;
    @XmlElement(name = "Constancias")
    protected boolean constancias;
    @XmlElement(name = "Hidrosina")
    protected boolean hidrosina;
    @XmlElement(name = "CFDv32")
    protected boolean cfDv32;
    @XmlElement(name = "RellenaAddendaWS")
    protected boolean rellenaAddendaWS;
    @XmlElement(name = "PostpagoDist")
    protected boolean postpagoDist;
    @XmlElement(name = "FolioCliente")
    protected boolean folioCliente;
    @XmlElement(name = "IAVE")
    protected boolean iave;
    @XmlElement(name = "GrupoSoni")
    protected boolean grupoSoni;
    @XmlElement(name = "ReinsertaAddendaWS")
    protected boolean reinsertaAddendaWS;
    @XmlElement(name = "EmailPersonalizado")
    protected boolean emailPersonalizado;
    @XmlElement(name = "ExtGeneracion")
    protected boolean extGeneracion;
    @XmlElement(name = "ExentoDeIVA")
    protected boolean exentoDeIVA;
    @XmlElement(name = "EnvioCorreo")
    protected boolean envioCorreo;
    @XmlElement(name = "NoEnvioCorreo")
    protected boolean noEnvioCorreo;
    @XmlElement(name = "OcupaHash")
    protected boolean ocupaHash;
    @XmlElement(name = "Oxford")
    protected boolean oxford;
    @XmlElement(name = "Velsimex")
    protected boolean velsimex;
    @XmlElement(name = "TASA0")
    protected boolean tasa0;
    @XmlElement(name = "NoActualizaReceptor")
    protected boolean noActualizaReceptor;
    @XmlElement(name = "Log")
    protected boolean log;
    @XmlElement(name = "GuardaCancelacion")
    protected boolean guardaCancelacion;
    @XmlElement(name = "Complemento")
    protected boolean complemento;
    @XmlElement(name = "VistaVelsimex")
    protected boolean vistaVelsimex;
    @XmlElement(name = "VistaFundacion")
    protected boolean vistaFundacion;
    @XmlElement(name = "VistaAgricola")
    protected boolean vistaAgricola;
    @XmlElement(name = "VistaQuimix")
    protected boolean vistaQuimix;
    @XmlElement(name = "VistaAgromaquilas")
    protected boolean vistaAgromaquilas;
    @XmlElement(name = "VistaATC")
    protected boolean vistaATC;
    @XmlElement(name = "VistaIndustriasQuimicas")
    protected boolean vistaIndustriasQuimicas;
    @XmlElement(name = "VistaChemimport")
    protected boolean vistaChemimport;
    @XmlElement(name = "VistaHamaca")
    protected boolean vistaHamaca;
    @XmlElement(name = "VistaProa")
    protected boolean vistaProa;
    @XmlElement(name = "VistaQuimicaEshidal")
    protected boolean vistaQuimicaEshidal;
    @XmlElement(name = "VistaDalmick")
    protected boolean vistaDalmick;
    @XmlElement(name = "VistaEstructurasCalidad")
    protected boolean vistaEstructurasCalidad;
    @XmlElement(name = "VistaCorporeo")
    protected boolean vistaCorporeo;
    @XmlElement(name = "VistaMedirep")
    protected boolean vistaMedirep;
    @XmlElement(name = "VistaMaxicajas")
    protected boolean vistaMaxicajas;
    @XmlElement(name = "VistaMotion")
    protected boolean vistaMotion;
    @XmlElement(name = "VistaInmobiliaria")
    protected boolean vistaInmobiliaria;
    @XmlElement(name = "VistaStarRecords")
    protected boolean vistaStarRecords;
    @XmlElement(name = "VistaQuiahui")
    protected boolean vistaQuiahui;
    @XmlElement(name = "VistaMaxiPet")
    protected boolean vistaMaxiPet;
    @XmlElement(name = "LimpiarMensajePDF")
    protected boolean limpiarMensajePDF;
    @XmlElement(name = "PAC2")
    protected boolean pac2;
    @XmlElement(name = "SoniSatelite")
    protected boolean soniSatelite;
    @XmlElement(name = "Forsa")
    protected boolean forsa;
    @XmlElement(name = "WSClienteNum")
    protected boolean wsClienteNum;
    @XmlElement(name = "IEPSCero")
    protected boolean iepsCero;
    @XmlElement(name = "FechaAnterior")
    protected boolean fechaAnterior;
    @XmlElement(name = "RegeneraDatosAdic")
    protected boolean regeneraDatosAdic;
    @XmlElement(name = "RevisaNumTicket")
    protected boolean revisaNumTicket;
    @XmlElement(name = "AseguraReceptor")
    protected boolean aseguraReceptor;
    @XmlElement(name = "ComercialMexicana")
    protected boolean comercialMexicana;
    @XmlElement(name = "AcuseCancelacionWS")
    protected boolean acuseCancelacionWS;
    @XmlElement(name = "Magna")
    protected boolean magna;
    @XmlElement(name = "Castilla")
    protected boolean castilla;
    @XmlElement(name = "FormaPagoLibre")
    protected boolean formaPagoLibre;
    @XmlElement(name = "NoRevisaFechaTimbrado")
    protected boolean noRevisaFechaTimbrado;
    @XmlElement(name = "LogTimbreInicio")
    protected boolean logTimbreInicio;
    @XmlElement(name = "NoTieneGeneracionFacturas")
    protected boolean noTieneGeneracionFacturas;
    @XmlElement(name = "Fecha31")
    protected boolean fecha31;
    @XmlElement(name = "AutoregistroSerieWS")
    protected boolean autoregistroSerieWS;
    @XmlElement(name = "SegundoRegistroNumEmpleadoWS")
    protected boolean segundoRegistroNumEmpleadoWS;
    @XmlElement(name = "FechaNomina")
    protected boolean fechaNomina;
    @XmlElement(name = "AseguroFolio")
    protected boolean aseguroFolio;
    @XmlElement(name = "ComillaSimple")
    protected boolean comillaSimple;
    @XmlElement(name = "LogDesarrollo")
    protected boolean logDesarrollo;
    @XmlElement(name = "NoTelefonoCorreo")
    protected boolean noTelefonoCorreo;
    @XmlElement(name = "LogoWS")
    protected boolean logoWS;
    @XmlElement(name = "MensajeMailWS")
    protected boolean mensajeMailWS;
    @XmlElement(name = "ValidacionRFCPropio")
    protected boolean validacionRFCPropio;
    @XmlElement(name = "FolioClienteFecha")
    protected boolean folioClienteFecha;
    @XmlElement(name = "SectorPrimario")
    protected boolean sectorPrimario;
    @XmlElement(name = "ObtenerXMLContabilidad")
    protected boolean obtenerXMLContabilidad;
    @XmlElement(name = "AgregaDatosTicket")
    protected boolean agregaDatosTicket;
    @XmlElement(name = "Tasa16")
    protected boolean tasa16;
    @XmlElement(name = "Cantidad0DXML")
    protected boolean cantidad0DXML;
    @XmlElement(name = "CastrolPOD")
    protected boolean castrolPOD;
    @XmlElement(name = "CambiastatusWS")
    protected boolean cambiastatusWS;
    protected boolean timbradotbn;
    @XmlElement(name = "GrupoDAY")
    protected boolean grupoDAY;
    @XmlElement(name = "RSC")
    protected boolean rsc;
    @XmlElement(name = "FolioEvya")
    protected boolean folioEvya;
    protected boolean grupoaei;
    @XmlElement(name = "MetodoNA")
    protected boolean metodoNA;
    @XmlElement(name = "MetodoOtro")
    protected boolean metodoOtro;
    @XmlElement(name = "MetodoEfectivo")
    protected boolean metodoEfectivo;
    @XmlElement(name = "FolioClienteError")
    protected boolean folioClienteError;
    @XmlElement(name = "MetodoTransferencia")
    protected boolean metodoTransferencia;
    @XmlElement(name = "TimbradoTralix")
    protected boolean timbradoTralix;
    @XmlElement(name = "BP")
    protected boolean bp;
    @XmlElement(name = "DepositoDental")
    protected boolean depositoDental;
    @XmlElement(name = "TimbradoLong")
    protected boolean timbradoLong;
    @XmlElement(name = "CONANP")
    protected boolean conanp;
    @XmlElement(name = "Fecha31Base")
    protected boolean fecha31Base;
    @XmlElement(name = "ConceptoNominaFijo")
    protected boolean conceptoNominaFijo;
    @XmlElement(name = "EntidadSNCFWS")
    protected boolean entidadSNCFWS;
    @XmlElement(name = "CancelacionSFWS")
    protected boolean cancelacionSFWS;
    @XmlElement(name = "Promec")
    protected boolean promec;
    @XmlElement(name = "IAVE33")
    protected boolean iave33;
    @XmlElement(name = "WS2DecimalesImpuestos33")
    protected boolean ws2DecimalesImpuestos33;
    @XmlElement(name = "WSRedondeaTotalImpuestos")
    protected boolean wsRedondeaTotalImpuestos;
    @XmlElement(name = "WSImporte6Decimales")
    protected boolean wsImporte6Decimales;
    @XmlElement(name = "WSTruncaImpuestos")
    protected boolean wsTruncaImpuestos;
    @XmlElement(name = "ComplementoDetallistaWS")
    protected boolean complementoDetallistaWS;
    @XmlElement(name = "Cantidad3Decimales")
    protected boolean cantidad3Decimales;
    @XmlElement(name = "ValorUnitario5Decimales")
    protected boolean valorUnitario5Decimales;
    @XmlElement(name = "Cenagas")
    protected boolean cenagas;
    @XmlElement(name = "ImporteTraslado2Decimales")
    protected boolean importeTraslado2Decimales;
    @XmlElement(name = "Base2Decimales")
    protected boolean base2Decimales;
    @XmlElement(name = "TipoCambioCenagas")
    protected boolean tipoCambioCenagas;
    @XmlElement(name = "DireccionComercioWS")
    protected boolean direccionComercioWS;
    @XmlElement(name = "ValorUnitario4Decimales")
    protected boolean valorUnitario4Decimales;
    @XmlElement(name = "TipoCambio4DecimalesWS")
    protected boolean tipoCambio4DecimalesWS;
    @XmlElement(name = "BP33")
    protected boolean bp33;
    @XmlElement(name = "ComplementoPagosHorario")
    protected boolean complementoPagosHorario;
    @XmlElement(name = "NoServicioWS")
    protected boolean noServicioWS;
    @XmlElement(name = "AIRBP33")
    protected boolean airbp33;
    @XmlElement(name = "MomentiveReceptor")
    protected boolean momentiveReceptor;
    @XmlElement(name = "FranjaFronterizaOp")
    protected boolean franjaFronterizaOp;
    @XmlElement(name = "TicketCrepes")
    protected boolean ticketCrepes;
    @XmlElement(name = "IBerdolaRFC")
    protected boolean iBerdolaRFC;
    @XmlElement(name = "TimbradoEdiFact")
    protected boolean timbradoEdiFact;
    @XmlElement(name = "FolioClienteOmitir")
    protected boolean folioClienteOmitir;
    @XmlElement(name = "Cantidad0Decimales")
    protected boolean cantidad0Decimales;
    @XmlElement(name = "TipoCambioBP")
    protected boolean tipoCambioBP;
    @XmlElement(name = "HamiltonBeach")
    protected boolean hamiltonBeach;
    @XmlElement(name = "Decimales6TipoCambioWS")
    protected boolean decimales6TipoCambioWS;
    @XmlElement(name = "Decimales6DoctoRelacionado")
    protected boolean decimales6DoctoRelacionado;
    @XmlElement(name = "ValorUnitarioString")
    protected boolean valorUnitarioString;
    @XmlElement(name = "OfficeMax")
    protected boolean officeMax;
    @XmlElement(name = "FolioClienteCancelado")
    protected boolean folioClienteCancelado;
    @XmlElement(name = "Penon")
    protected boolean penon;
    @XmlElement(name = "SerieRest")
    protected boolean serieRest;
    @XmlElement(name = "CancelacionIberdrola")
    protected boolean cancelacionIberdrola;
    @XmlElement(name = "TipoCambio4DecimalesPagosWS")
    protected boolean tipoCambio4DecimalesPagosWS;
    @XmlElement(name = "ValidaRFCRazonSocial")
    protected boolean validaRFCRazonSocial;
    @XmlElement(name = "Tiendas3B")
    protected boolean tiendas3B;
    @XmlElement(name = "TotalesPagos206D")
    protected boolean totalesPagos206D;
    @XmlElement(name = "TotalesPagos204D")
    protected boolean totalesPagos204D;
    @XmlElement(name = "SWSAPIEN")
    protected boolean swsapien;
    @XmlElement(name = "RS_CP_Automatico")
    protected boolean rscpAutomatico;
    @XmlElement(name = "WS40")
    protected boolean ws40;
    @XmlElement(name = "Ticket40")
    protected boolean ticket40;
    @XmlElement(name = "RFC_Automatico_SOAP")
    protected boolean rfcAutomaticoSOAP;
    @XmlElement(name = "RS_CP_Automatico_Nomina")
    protected boolean rscpAutomaticoNomina;
    @XmlElement(name = "IberdrolaDecimalesPagos")
    protected boolean iberdrolaDecimalesPagos;
    @XmlElement(name = "Allianz33_40Traslados")
    protected boolean allianz3340Traslados;
    @XmlElement(name = "Traslados_40")
    protected boolean traslados40;
    @XmlElement(name = "OrigenRecursoWS")
    protected boolean origenRecursoWS;
    @XmlElement(name = "CastrolSAP")
    protected boolean castrolSAP;
    @XmlElement(name = "EliminaTicket40")
    protected boolean eliminaTicket40;
    @XmlElement(name = "SiValeCorreos")
    protected boolean siValeCorreos;
    @XmlElement(name = "ServiFacil")
    protected boolean serviFacil;
    @XmlElement(name = "ActualizaDomicilioWS")
    protected boolean actualizaDomicilioWS;
    @XmlElement(name = "GrupoSumma")
    protected boolean grupoSumma;
    @XmlElement(name = "Gandhi")
    protected boolean gandhi;
    @XmlElement(name = "TipoCambioUSD4D")
    protected boolean tipoCambioUSD4D;
    @XmlElement(name = "EquivalenciaDR6")
    protected boolean equivalenciaDR6;
    @XmlElement(name = "Hyundai")
    protected boolean hyundai;
    @XmlElement(name = "CastrolFinanzas")
    protected boolean castrolFinanzas;
    @XmlElement(name = "PublicoGeneral")
    protected boolean publicoGeneral;
    @XmlElement(name = "MesSAP")
    protected boolean mesSAP;
    @XmlElement(name = "Bellota")
    protected boolean bellota;
    @XmlElement(name = "MesFinanzas")
    protected boolean mesFinanzas;
    @XmlElement(name = "EquivalenciaDR10")
    protected boolean equivalenciaDR10;
    @XmlElement(name = "Lanceta")
    protected boolean lanceta;
    @XmlElement(name = "MontoOrigenRecursoWS")
    protected boolean montoOrigenRecursoWS;
    @XmlElement(name = "TSJ")
    protected boolean tsj;

    /**
     * Obtiene el valor de la propiedad tickets.
     * 
     */
    public boolean isTickets() {
        return tickets;
    }

    /**
     * Define el valor de la propiedad tickets.
     * 
     */
    public void setTickets(boolean value) {
        this.tickets = value;
    }

    /**
     * Obtiene el valor de la propiedad plantillaExtendida.
     * 
     */
    public boolean isPlantillaExtendida() {
        return plantillaExtendida;
    }

    /**
     * Define el valor de la propiedad plantillaExtendida.
     * 
     */
    public void setPlantillaExtendida(boolean value) {
        this.plantillaExtendida = value;
    }

    /**
     * Obtiene el valor de la propiedad autoComplete.
     * 
     */
    public boolean isAutoComplete() {
        return autoComplete;
    }

    /**
     * Define el valor de la propiedad autoComplete.
     * 
     */
    public void setAutoComplete(boolean value) {
        this.autoComplete = value;
    }

    /**
     * Obtiene el valor de la propiedad constancias.
     * 
     */
    public boolean isConstancias() {
        return constancias;
    }

    /**
     * Define el valor de la propiedad constancias.
     * 
     */
    public void setConstancias(boolean value) {
        this.constancias = value;
    }

    /**
     * Obtiene el valor de la propiedad hidrosina.
     * 
     */
    public boolean isHidrosina() {
        return hidrosina;
    }

    /**
     * Define el valor de la propiedad hidrosina.
     * 
     */
    public void setHidrosina(boolean value) {
        this.hidrosina = value;
    }

    /**
     * Obtiene el valor de la propiedad cfDv32.
     * 
     */
    public boolean isCFDv32() {
        return cfDv32;
    }

    /**
     * Define el valor de la propiedad cfDv32.
     * 
     */
    public void setCFDv32(boolean value) {
        this.cfDv32 = value;
    }

    /**
     * Obtiene el valor de la propiedad rellenaAddendaWS.
     * 
     */
    public boolean isRellenaAddendaWS() {
        return rellenaAddendaWS;
    }

    /**
     * Define el valor de la propiedad rellenaAddendaWS.
     * 
     */
    public void setRellenaAddendaWS(boolean value) {
        this.rellenaAddendaWS = value;
    }

    /**
     * Obtiene el valor de la propiedad postpagoDist.
     * 
     */
    public boolean isPostpagoDist() {
        return postpagoDist;
    }

    /**
     * Define el valor de la propiedad postpagoDist.
     * 
     */
    public void setPostpagoDist(boolean value) {
        this.postpagoDist = value;
    }

    /**
     * Obtiene el valor de la propiedad folioCliente.
     * 
     */
    public boolean isFolioCliente() {
        return folioCliente;
    }

    /**
     * Define el valor de la propiedad folioCliente.
     * 
     */
    public void setFolioCliente(boolean value) {
        this.folioCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad iave.
     * 
     */
    public boolean isIAVE() {
        return iave;
    }

    /**
     * Define el valor de la propiedad iave.
     * 
     */
    public void setIAVE(boolean value) {
        this.iave = value;
    }

    /**
     * Obtiene el valor de la propiedad grupoSoni.
     * 
     */
    public boolean isGrupoSoni() {
        return grupoSoni;
    }

    /**
     * Define el valor de la propiedad grupoSoni.
     * 
     */
    public void setGrupoSoni(boolean value) {
        this.grupoSoni = value;
    }

    /**
     * Obtiene el valor de la propiedad reinsertaAddendaWS.
     * 
     */
    public boolean isReinsertaAddendaWS() {
        return reinsertaAddendaWS;
    }

    /**
     * Define el valor de la propiedad reinsertaAddendaWS.
     * 
     */
    public void setReinsertaAddendaWS(boolean value) {
        this.reinsertaAddendaWS = value;
    }

    /**
     * Obtiene el valor de la propiedad emailPersonalizado.
     * 
     */
    public boolean isEmailPersonalizado() {
        return emailPersonalizado;
    }

    /**
     * Define el valor de la propiedad emailPersonalizado.
     * 
     */
    public void setEmailPersonalizado(boolean value) {
        this.emailPersonalizado = value;
    }

    /**
     * Obtiene el valor de la propiedad extGeneracion.
     * 
     */
    public boolean isExtGeneracion() {
        return extGeneracion;
    }

    /**
     * Define el valor de la propiedad extGeneracion.
     * 
     */
    public void setExtGeneracion(boolean value) {
        this.extGeneracion = value;
    }

    /**
     * Obtiene el valor de la propiedad exentoDeIVA.
     * 
     */
    public boolean isExentoDeIVA() {
        return exentoDeIVA;
    }

    /**
     * Define el valor de la propiedad exentoDeIVA.
     * 
     */
    public void setExentoDeIVA(boolean value) {
        this.exentoDeIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad envioCorreo.
     * 
     */
    public boolean isEnvioCorreo() {
        return envioCorreo;
    }

    /**
     * Define el valor de la propiedad envioCorreo.
     * 
     */
    public void setEnvioCorreo(boolean value) {
        this.envioCorreo = value;
    }

    /**
     * Obtiene el valor de la propiedad noEnvioCorreo.
     * 
     */
    public boolean isNoEnvioCorreo() {
        return noEnvioCorreo;
    }

    /**
     * Define el valor de la propiedad noEnvioCorreo.
     * 
     */
    public void setNoEnvioCorreo(boolean value) {
        this.noEnvioCorreo = value;
    }

    /**
     * Obtiene el valor de la propiedad ocupaHash.
     * 
     */
    public boolean isOcupaHash() {
        return ocupaHash;
    }

    /**
     * Define el valor de la propiedad ocupaHash.
     * 
     */
    public void setOcupaHash(boolean value) {
        this.ocupaHash = value;
    }

    /**
     * Obtiene el valor de la propiedad oxford.
     * 
     */
    public boolean isOxford() {
        return oxford;
    }

    /**
     * Define el valor de la propiedad oxford.
     * 
     */
    public void setOxford(boolean value) {
        this.oxford = value;
    }

    /**
     * Obtiene el valor de la propiedad velsimex.
     * 
     */
    public boolean isVelsimex() {
        return velsimex;
    }

    /**
     * Define el valor de la propiedad velsimex.
     * 
     */
    public void setVelsimex(boolean value) {
        this.velsimex = value;
    }

    /**
     * Obtiene el valor de la propiedad tasa0.
     * 
     */
    public boolean isTASA0() {
        return tasa0;
    }

    /**
     * Define el valor de la propiedad tasa0.
     * 
     */
    public void setTASA0(boolean value) {
        this.tasa0 = value;
    }

    /**
     * Obtiene el valor de la propiedad noActualizaReceptor.
     * 
     */
    public boolean isNoActualizaReceptor() {
        return noActualizaReceptor;
    }

    /**
     * Define el valor de la propiedad noActualizaReceptor.
     * 
     */
    public void setNoActualizaReceptor(boolean value) {
        this.noActualizaReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad log.
     * 
     */
    public boolean isLog() {
        return log;
    }

    /**
     * Define el valor de la propiedad log.
     * 
     */
    public void setLog(boolean value) {
        this.log = value;
    }

    /**
     * Obtiene el valor de la propiedad guardaCancelacion.
     * 
     */
    public boolean isGuardaCancelacion() {
        return guardaCancelacion;
    }

    /**
     * Define el valor de la propiedad guardaCancelacion.
     * 
     */
    public void setGuardaCancelacion(boolean value) {
        this.guardaCancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad complemento.
     * 
     */
    public boolean isComplemento() {
        return complemento;
    }

    /**
     * Define el valor de la propiedad complemento.
     * 
     */
    public void setComplemento(boolean value) {
        this.complemento = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaVelsimex.
     * 
     */
    public boolean isVistaVelsimex() {
        return vistaVelsimex;
    }

    /**
     * Define el valor de la propiedad vistaVelsimex.
     * 
     */
    public void setVistaVelsimex(boolean value) {
        this.vistaVelsimex = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaFundacion.
     * 
     */
    public boolean isVistaFundacion() {
        return vistaFundacion;
    }

    /**
     * Define el valor de la propiedad vistaFundacion.
     * 
     */
    public void setVistaFundacion(boolean value) {
        this.vistaFundacion = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaAgricola.
     * 
     */
    public boolean isVistaAgricola() {
        return vistaAgricola;
    }

    /**
     * Define el valor de la propiedad vistaAgricola.
     * 
     */
    public void setVistaAgricola(boolean value) {
        this.vistaAgricola = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaQuimix.
     * 
     */
    public boolean isVistaQuimix() {
        return vistaQuimix;
    }

    /**
     * Define el valor de la propiedad vistaQuimix.
     * 
     */
    public void setVistaQuimix(boolean value) {
        this.vistaQuimix = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaAgromaquilas.
     * 
     */
    public boolean isVistaAgromaquilas() {
        return vistaAgromaquilas;
    }

    /**
     * Define el valor de la propiedad vistaAgromaquilas.
     * 
     */
    public void setVistaAgromaquilas(boolean value) {
        this.vistaAgromaquilas = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaATC.
     * 
     */
    public boolean isVistaATC() {
        return vistaATC;
    }

    /**
     * Define el valor de la propiedad vistaATC.
     * 
     */
    public void setVistaATC(boolean value) {
        this.vistaATC = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaIndustriasQuimicas.
     * 
     */
    public boolean isVistaIndustriasQuimicas() {
        return vistaIndustriasQuimicas;
    }

    /**
     * Define el valor de la propiedad vistaIndustriasQuimicas.
     * 
     */
    public void setVistaIndustriasQuimicas(boolean value) {
        this.vistaIndustriasQuimicas = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaChemimport.
     * 
     */
    public boolean isVistaChemimport() {
        return vistaChemimport;
    }

    /**
     * Define el valor de la propiedad vistaChemimport.
     * 
     */
    public void setVistaChemimport(boolean value) {
        this.vistaChemimport = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaHamaca.
     * 
     */
    public boolean isVistaHamaca() {
        return vistaHamaca;
    }

    /**
     * Define el valor de la propiedad vistaHamaca.
     * 
     */
    public void setVistaHamaca(boolean value) {
        this.vistaHamaca = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaProa.
     * 
     */
    public boolean isVistaProa() {
        return vistaProa;
    }

    /**
     * Define el valor de la propiedad vistaProa.
     * 
     */
    public void setVistaProa(boolean value) {
        this.vistaProa = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaQuimicaEshidal.
     * 
     */
    public boolean isVistaQuimicaEshidal() {
        return vistaQuimicaEshidal;
    }

    /**
     * Define el valor de la propiedad vistaQuimicaEshidal.
     * 
     */
    public void setVistaQuimicaEshidal(boolean value) {
        this.vistaQuimicaEshidal = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaDalmick.
     * 
     */
    public boolean isVistaDalmick() {
        return vistaDalmick;
    }

    /**
     * Define el valor de la propiedad vistaDalmick.
     * 
     */
    public void setVistaDalmick(boolean value) {
        this.vistaDalmick = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaEstructurasCalidad.
     * 
     */
    public boolean isVistaEstructurasCalidad() {
        return vistaEstructurasCalidad;
    }

    /**
     * Define el valor de la propiedad vistaEstructurasCalidad.
     * 
     */
    public void setVistaEstructurasCalidad(boolean value) {
        this.vistaEstructurasCalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaCorporeo.
     * 
     */
    public boolean isVistaCorporeo() {
        return vistaCorporeo;
    }

    /**
     * Define el valor de la propiedad vistaCorporeo.
     * 
     */
    public void setVistaCorporeo(boolean value) {
        this.vistaCorporeo = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaMedirep.
     * 
     */
    public boolean isVistaMedirep() {
        return vistaMedirep;
    }

    /**
     * Define el valor de la propiedad vistaMedirep.
     * 
     */
    public void setVistaMedirep(boolean value) {
        this.vistaMedirep = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaMaxicajas.
     * 
     */
    public boolean isVistaMaxicajas() {
        return vistaMaxicajas;
    }

    /**
     * Define el valor de la propiedad vistaMaxicajas.
     * 
     */
    public void setVistaMaxicajas(boolean value) {
        this.vistaMaxicajas = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaMotion.
     * 
     */
    public boolean isVistaMotion() {
        return vistaMotion;
    }

    /**
     * Define el valor de la propiedad vistaMotion.
     * 
     */
    public void setVistaMotion(boolean value) {
        this.vistaMotion = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaInmobiliaria.
     * 
     */
    public boolean isVistaInmobiliaria() {
        return vistaInmobiliaria;
    }

    /**
     * Define el valor de la propiedad vistaInmobiliaria.
     * 
     */
    public void setVistaInmobiliaria(boolean value) {
        this.vistaInmobiliaria = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaStarRecords.
     * 
     */
    public boolean isVistaStarRecords() {
        return vistaStarRecords;
    }

    /**
     * Define el valor de la propiedad vistaStarRecords.
     * 
     */
    public void setVistaStarRecords(boolean value) {
        this.vistaStarRecords = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaQuiahui.
     * 
     */
    public boolean isVistaQuiahui() {
        return vistaQuiahui;
    }

    /**
     * Define el valor de la propiedad vistaQuiahui.
     * 
     */
    public void setVistaQuiahui(boolean value) {
        this.vistaQuiahui = value;
    }

    /**
     * Obtiene el valor de la propiedad vistaMaxiPet.
     * 
     */
    public boolean isVistaMaxiPet() {
        return vistaMaxiPet;
    }

    /**
     * Define el valor de la propiedad vistaMaxiPet.
     * 
     */
    public void setVistaMaxiPet(boolean value) {
        this.vistaMaxiPet = value;
    }

    /**
     * Obtiene el valor de la propiedad limpiarMensajePDF.
     * 
     */
    public boolean isLimpiarMensajePDF() {
        return limpiarMensajePDF;
    }

    /**
     * Define el valor de la propiedad limpiarMensajePDF.
     * 
     */
    public void setLimpiarMensajePDF(boolean value) {
        this.limpiarMensajePDF = value;
    }

    /**
     * Obtiene el valor de la propiedad pac2.
     * 
     */
    public boolean isPAC2() {
        return pac2;
    }

    /**
     * Define el valor de la propiedad pac2.
     * 
     */
    public void setPAC2(boolean value) {
        this.pac2 = value;
    }

    /**
     * Obtiene el valor de la propiedad soniSatelite.
     * 
     */
    public boolean isSoniSatelite() {
        return soniSatelite;
    }

    /**
     * Define el valor de la propiedad soniSatelite.
     * 
     */
    public void setSoniSatelite(boolean value) {
        this.soniSatelite = value;
    }

    /**
     * Obtiene el valor de la propiedad forsa.
     * 
     */
    public boolean isForsa() {
        return forsa;
    }

    /**
     * Define el valor de la propiedad forsa.
     * 
     */
    public void setForsa(boolean value) {
        this.forsa = value;
    }

    /**
     * Obtiene el valor de la propiedad wsClienteNum.
     * 
     */
    public boolean isWSClienteNum() {
        return wsClienteNum;
    }

    /**
     * Define el valor de la propiedad wsClienteNum.
     * 
     */
    public void setWSClienteNum(boolean value) {
        this.wsClienteNum = value;
    }

    /**
     * Obtiene el valor de la propiedad iepsCero.
     * 
     */
    public boolean isIEPSCero() {
        return iepsCero;
    }

    /**
     * Define el valor de la propiedad iepsCero.
     * 
     */
    public void setIEPSCero(boolean value) {
        this.iepsCero = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAnterior.
     * 
     */
    public boolean isFechaAnterior() {
        return fechaAnterior;
    }

    /**
     * Define el valor de la propiedad fechaAnterior.
     * 
     */
    public void setFechaAnterior(boolean value) {
        this.fechaAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad regeneraDatosAdic.
     * 
     */
    public boolean isRegeneraDatosAdic() {
        return regeneraDatosAdic;
    }

    /**
     * Define el valor de la propiedad regeneraDatosAdic.
     * 
     */
    public void setRegeneraDatosAdic(boolean value) {
        this.regeneraDatosAdic = value;
    }

    /**
     * Obtiene el valor de la propiedad revisaNumTicket.
     * 
     */
    public boolean isRevisaNumTicket() {
        return revisaNumTicket;
    }

    /**
     * Define el valor de la propiedad revisaNumTicket.
     * 
     */
    public void setRevisaNumTicket(boolean value) {
        this.revisaNumTicket = value;
    }

    /**
     * Obtiene el valor de la propiedad aseguraReceptor.
     * 
     */
    public boolean isAseguraReceptor() {
        return aseguraReceptor;
    }

    /**
     * Define el valor de la propiedad aseguraReceptor.
     * 
     */
    public void setAseguraReceptor(boolean value) {
        this.aseguraReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad comercialMexicana.
     * 
     */
    public boolean isComercialMexicana() {
        return comercialMexicana;
    }

    /**
     * Define el valor de la propiedad comercialMexicana.
     * 
     */
    public void setComercialMexicana(boolean value) {
        this.comercialMexicana = value;
    }

    /**
     * Obtiene el valor de la propiedad acuseCancelacionWS.
     * 
     */
    public boolean isAcuseCancelacionWS() {
        return acuseCancelacionWS;
    }

    /**
     * Define el valor de la propiedad acuseCancelacionWS.
     * 
     */
    public void setAcuseCancelacionWS(boolean value) {
        this.acuseCancelacionWS = value;
    }

    /**
     * Obtiene el valor de la propiedad magna.
     * 
     */
    public boolean isMagna() {
        return magna;
    }

    /**
     * Define el valor de la propiedad magna.
     * 
     */
    public void setMagna(boolean value) {
        this.magna = value;
    }

    /**
     * Obtiene el valor de la propiedad castilla.
     * 
     */
    public boolean isCastilla() {
        return castilla;
    }

    /**
     * Define el valor de la propiedad castilla.
     * 
     */
    public void setCastilla(boolean value) {
        this.castilla = value;
    }

    /**
     * Obtiene el valor de la propiedad formaPagoLibre.
     * 
     */
    public boolean isFormaPagoLibre() {
        return formaPagoLibre;
    }

    /**
     * Define el valor de la propiedad formaPagoLibre.
     * 
     */
    public void setFormaPagoLibre(boolean value) {
        this.formaPagoLibre = value;
    }

    /**
     * Obtiene el valor de la propiedad noRevisaFechaTimbrado.
     * 
     */
    public boolean isNoRevisaFechaTimbrado() {
        return noRevisaFechaTimbrado;
    }

    /**
     * Define el valor de la propiedad noRevisaFechaTimbrado.
     * 
     */
    public void setNoRevisaFechaTimbrado(boolean value) {
        this.noRevisaFechaTimbrado = value;
    }

    /**
     * Obtiene el valor de la propiedad logTimbreInicio.
     * 
     */
    public boolean isLogTimbreInicio() {
        return logTimbreInicio;
    }

    /**
     * Define el valor de la propiedad logTimbreInicio.
     * 
     */
    public void setLogTimbreInicio(boolean value) {
        this.logTimbreInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad noTieneGeneracionFacturas.
     * 
     */
    public boolean isNoTieneGeneracionFacturas() {
        return noTieneGeneracionFacturas;
    }

    /**
     * Define el valor de la propiedad noTieneGeneracionFacturas.
     * 
     */
    public void setNoTieneGeneracionFacturas(boolean value) {
        this.noTieneGeneracionFacturas = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha31.
     * 
     */
    public boolean isFecha31() {
        return fecha31;
    }

    /**
     * Define el valor de la propiedad fecha31.
     * 
     */
    public void setFecha31(boolean value) {
        this.fecha31 = value;
    }

    /**
     * Obtiene el valor de la propiedad autoregistroSerieWS.
     * 
     */
    public boolean isAutoregistroSerieWS() {
        return autoregistroSerieWS;
    }

    /**
     * Define el valor de la propiedad autoregistroSerieWS.
     * 
     */
    public void setAutoregistroSerieWS(boolean value) {
        this.autoregistroSerieWS = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoRegistroNumEmpleadoWS.
     * 
     */
    public boolean isSegundoRegistroNumEmpleadoWS() {
        return segundoRegistroNumEmpleadoWS;
    }

    /**
     * Define el valor de la propiedad segundoRegistroNumEmpleadoWS.
     * 
     */
    public void setSegundoRegistroNumEmpleadoWS(boolean value) {
        this.segundoRegistroNumEmpleadoWS = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNomina.
     * 
     */
    public boolean isFechaNomina() {
        return fechaNomina;
    }

    /**
     * Define el valor de la propiedad fechaNomina.
     * 
     */
    public void setFechaNomina(boolean value) {
        this.fechaNomina = value;
    }

    /**
     * Obtiene el valor de la propiedad aseguroFolio.
     * 
     */
    public boolean isAseguroFolio() {
        return aseguroFolio;
    }

    /**
     * Define el valor de la propiedad aseguroFolio.
     * 
     */
    public void setAseguroFolio(boolean value) {
        this.aseguroFolio = value;
    }

    /**
     * Obtiene el valor de la propiedad comillaSimple.
     * 
     */
    public boolean isComillaSimple() {
        return comillaSimple;
    }

    /**
     * Define el valor de la propiedad comillaSimple.
     * 
     */
    public void setComillaSimple(boolean value) {
        this.comillaSimple = value;
    }

    /**
     * Obtiene el valor de la propiedad logDesarrollo.
     * 
     */
    public boolean isLogDesarrollo() {
        return logDesarrollo;
    }

    /**
     * Define el valor de la propiedad logDesarrollo.
     * 
     */
    public void setLogDesarrollo(boolean value) {
        this.logDesarrollo = value;
    }

    /**
     * Obtiene el valor de la propiedad noTelefonoCorreo.
     * 
     */
    public boolean isNoTelefonoCorreo() {
        return noTelefonoCorreo;
    }

    /**
     * Define el valor de la propiedad noTelefonoCorreo.
     * 
     */
    public void setNoTelefonoCorreo(boolean value) {
        this.noTelefonoCorreo = value;
    }

    /**
     * Obtiene el valor de la propiedad logoWS.
     * 
     */
    public boolean isLogoWS() {
        return logoWS;
    }

    /**
     * Define el valor de la propiedad logoWS.
     * 
     */
    public void setLogoWS(boolean value) {
        this.logoWS = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeMailWS.
     * 
     */
    public boolean isMensajeMailWS() {
        return mensajeMailWS;
    }

    /**
     * Define el valor de la propiedad mensajeMailWS.
     * 
     */
    public void setMensajeMailWS(boolean value) {
        this.mensajeMailWS = value;
    }

    /**
     * Obtiene el valor de la propiedad validacionRFCPropio.
     * 
     */
    public boolean isValidacionRFCPropio() {
        return validacionRFCPropio;
    }

    /**
     * Define el valor de la propiedad validacionRFCPropio.
     * 
     */
    public void setValidacionRFCPropio(boolean value) {
        this.validacionRFCPropio = value;
    }

    /**
     * Obtiene el valor de la propiedad folioClienteFecha.
     * 
     */
    public boolean isFolioClienteFecha() {
        return folioClienteFecha;
    }

    /**
     * Define el valor de la propiedad folioClienteFecha.
     * 
     */
    public void setFolioClienteFecha(boolean value) {
        this.folioClienteFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad sectorPrimario.
     * 
     */
    public boolean isSectorPrimario() {
        return sectorPrimario;
    }

    /**
     * Define el valor de la propiedad sectorPrimario.
     * 
     */
    public void setSectorPrimario(boolean value) {
        this.sectorPrimario = value;
    }

    /**
     * Obtiene el valor de la propiedad obtenerXMLContabilidad.
     * 
     */
    public boolean isObtenerXMLContabilidad() {
        return obtenerXMLContabilidad;
    }

    /**
     * Define el valor de la propiedad obtenerXMLContabilidad.
     * 
     */
    public void setObtenerXMLContabilidad(boolean value) {
        this.obtenerXMLContabilidad = value;
    }

    /**
     * Obtiene el valor de la propiedad agregaDatosTicket.
     * 
     */
    public boolean isAgregaDatosTicket() {
        return agregaDatosTicket;
    }

    /**
     * Define el valor de la propiedad agregaDatosTicket.
     * 
     */
    public void setAgregaDatosTicket(boolean value) {
        this.agregaDatosTicket = value;
    }

    /**
     * Obtiene el valor de la propiedad tasa16.
     * 
     */
    public boolean isTasa16() {
        return tasa16;
    }

    /**
     * Define el valor de la propiedad tasa16.
     * 
     */
    public void setTasa16(boolean value) {
        this.tasa16 = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad0DXML.
     * 
     */
    public boolean isCantidad0DXML() {
        return cantidad0DXML;
    }

    /**
     * Define el valor de la propiedad cantidad0DXML.
     * 
     */
    public void setCantidad0DXML(boolean value) {
        this.cantidad0DXML = value;
    }

    /**
     * Obtiene el valor de la propiedad castrolPOD.
     * 
     */
    public boolean isCastrolPOD() {
        return castrolPOD;
    }

    /**
     * Define el valor de la propiedad castrolPOD.
     * 
     */
    public void setCastrolPOD(boolean value) {
        this.castrolPOD = value;
    }

    /**
     * Obtiene el valor de la propiedad cambiastatusWS.
     * 
     */
    public boolean isCambiastatusWS() {
        return cambiastatusWS;
    }

    /**
     * Define el valor de la propiedad cambiastatusWS.
     * 
     */
    public void setCambiastatusWS(boolean value) {
        this.cambiastatusWS = value;
    }

    /**
     * Obtiene el valor de la propiedad timbradotbn.
     * 
     */
    public boolean isTimbradotbn() {
        return timbradotbn;
    }

    /**
     * Define el valor de la propiedad timbradotbn.
     * 
     */
    public void setTimbradotbn(boolean value) {
        this.timbradotbn = value;
    }

    /**
     * Obtiene el valor de la propiedad grupoDAY.
     * 
     */
    public boolean isGrupoDAY() {
        return grupoDAY;
    }

    /**
     * Define el valor de la propiedad grupoDAY.
     * 
     */
    public void setGrupoDAY(boolean value) {
        this.grupoDAY = value;
    }

    /**
     * Obtiene el valor de la propiedad rsc.
     * 
     */
    public boolean isRSC() {
        return rsc;
    }

    /**
     * Define el valor de la propiedad rsc.
     * 
     */
    public void setRSC(boolean value) {
        this.rsc = value;
    }

    /**
     * Obtiene el valor de la propiedad folioEvya.
     * 
     */
    public boolean isFolioEvya() {
        return folioEvya;
    }

    /**
     * Define el valor de la propiedad folioEvya.
     * 
     */
    public void setFolioEvya(boolean value) {
        this.folioEvya = value;
    }

    /**
     * Obtiene el valor de la propiedad grupoaei.
     * 
     */
    public boolean isGrupoaei() {
        return grupoaei;
    }

    /**
     * Define el valor de la propiedad grupoaei.
     * 
     */
    public void setGrupoaei(boolean value) {
        this.grupoaei = value;
    }

    /**
     * Obtiene el valor de la propiedad metodoNA.
     * 
     */
    public boolean isMetodoNA() {
        return metodoNA;
    }

    /**
     * Define el valor de la propiedad metodoNA.
     * 
     */
    public void setMetodoNA(boolean value) {
        this.metodoNA = value;
    }

    /**
     * Obtiene el valor de la propiedad metodoOtro.
     * 
     */
    public boolean isMetodoOtro() {
        return metodoOtro;
    }

    /**
     * Define el valor de la propiedad metodoOtro.
     * 
     */
    public void setMetodoOtro(boolean value) {
        this.metodoOtro = value;
    }

    /**
     * Obtiene el valor de la propiedad metodoEfectivo.
     * 
     */
    public boolean isMetodoEfectivo() {
        return metodoEfectivo;
    }

    /**
     * Define el valor de la propiedad metodoEfectivo.
     * 
     */
    public void setMetodoEfectivo(boolean value) {
        this.metodoEfectivo = value;
    }

    /**
     * Obtiene el valor de la propiedad folioClienteError.
     * 
     */
    public boolean isFolioClienteError() {
        return folioClienteError;
    }

    /**
     * Define el valor de la propiedad folioClienteError.
     * 
     */
    public void setFolioClienteError(boolean value) {
        this.folioClienteError = value;
    }

    /**
     * Obtiene el valor de la propiedad metodoTransferencia.
     * 
     */
    public boolean isMetodoTransferencia() {
        return metodoTransferencia;
    }

    /**
     * Define el valor de la propiedad metodoTransferencia.
     * 
     */
    public void setMetodoTransferencia(boolean value) {
        this.metodoTransferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad timbradoTralix.
     * 
     */
    public boolean isTimbradoTralix() {
        return timbradoTralix;
    }

    /**
     * Define el valor de la propiedad timbradoTralix.
     * 
     */
    public void setTimbradoTralix(boolean value) {
        this.timbradoTralix = value;
    }

    /**
     * Obtiene el valor de la propiedad bp.
     * 
     */
    public boolean isBP() {
        return bp;
    }

    /**
     * Define el valor de la propiedad bp.
     * 
     */
    public void setBP(boolean value) {
        this.bp = value;
    }

    /**
     * Obtiene el valor de la propiedad depositoDental.
     * 
     */
    public boolean isDepositoDental() {
        return depositoDental;
    }

    /**
     * Define el valor de la propiedad depositoDental.
     * 
     */
    public void setDepositoDental(boolean value) {
        this.depositoDental = value;
    }

    /**
     * Obtiene el valor de la propiedad timbradoLong.
     * 
     */
    public boolean isTimbradoLong() {
        return timbradoLong;
    }

    /**
     * Define el valor de la propiedad timbradoLong.
     * 
     */
    public void setTimbradoLong(boolean value) {
        this.timbradoLong = value;
    }

    /**
     * Obtiene el valor de la propiedad conanp.
     * 
     */
    public boolean isCONANP() {
        return conanp;
    }

    /**
     * Define el valor de la propiedad conanp.
     * 
     */
    public void setCONANP(boolean value) {
        this.conanp = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha31Base.
     * 
     */
    public boolean isFecha31Base() {
        return fecha31Base;
    }

    /**
     * Define el valor de la propiedad fecha31Base.
     * 
     */
    public void setFecha31Base(boolean value) {
        this.fecha31Base = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptoNominaFijo.
     * 
     */
    public boolean isConceptoNominaFijo() {
        return conceptoNominaFijo;
    }

    /**
     * Define el valor de la propiedad conceptoNominaFijo.
     * 
     */
    public void setConceptoNominaFijo(boolean value) {
        this.conceptoNominaFijo = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadSNCFWS.
     * 
     */
    public boolean isEntidadSNCFWS() {
        return entidadSNCFWS;
    }

    /**
     * Define el valor de la propiedad entidadSNCFWS.
     * 
     */
    public void setEntidadSNCFWS(boolean value) {
        this.entidadSNCFWS = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelacionSFWS.
     * 
     */
    public boolean isCancelacionSFWS() {
        return cancelacionSFWS;
    }

    /**
     * Define el valor de la propiedad cancelacionSFWS.
     * 
     */
    public void setCancelacionSFWS(boolean value) {
        this.cancelacionSFWS = value;
    }

    /**
     * Obtiene el valor de la propiedad promec.
     * 
     */
    public boolean isPromec() {
        return promec;
    }

    /**
     * Define el valor de la propiedad promec.
     * 
     */
    public void setPromec(boolean value) {
        this.promec = value;
    }

    /**
     * Obtiene el valor de la propiedad iave33.
     * 
     */
    public boolean isIAVE33() {
        return iave33;
    }

    /**
     * Define el valor de la propiedad iave33.
     * 
     */
    public void setIAVE33(boolean value) {
        this.iave33 = value;
    }

    /**
     * Obtiene el valor de la propiedad ws2DecimalesImpuestos33.
     * 
     */
    public boolean isWS2DecimalesImpuestos33() {
        return ws2DecimalesImpuestos33;
    }

    /**
     * Define el valor de la propiedad ws2DecimalesImpuestos33.
     * 
     */
    public void setWS2DecimalesImpuestos33(boolean value) {
        this.ws2DecimalesImpuestos33 = value;
    }

    /**
     * Obtiene el valor de la propiedad wsRedondeaTotalImpuestos.
     * 
     */
    public boolean isWSRedondeaTotalImpuestos() {
        return wsRedondeaTotalImpuestos;
    }

    /**
     * Define el valor de la propiedad wsRedondeaTotalImpuestos.
     * 
     */
    public void setWSRedondeaTotalImpuestos(boolean value) {
        this.wsRedondeaTotalImpuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad wsImporte6Decimales.
     * 
     */
    public boolean isWSImporte6Decimales() {
        return wsImporte6Decimales;
    }

    /**
     * Define el valor de la propiedad wsImporte6Decimales.
     * 
     */
    public void setWSImporte6Decimales(boolean value) {
        this.wsImporte6Decimales = value;
    }

    /**
     * Obtiene el valor de la propiedad wsTruncaImpuestos.
     * 
     */
    public boolean isWSTruncaImpuestos() {
        return wsTruncaImpuestos;
    }

    /**
     * Define el valor de la propiedad wsTruncaImpuestos.
     * 
     */
    public void setWSTruncaImpuestos(boolean value) {
        this.wsTruncaImpuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad complementoDetallistaWS.
     * 
     */
    public boolean isComplementoDetallistaWS() {
        return complementoDetallistaWS;
    }

    /**
     * Define el valor de la propiedad complementoDetallistaWS.
     * 
     */
    public void setComplementoDetallistaWS(boolean value) {
        this.complementoDetallistaWS = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad3Decimales.
     * 
     */
    public boolean isCantidad3Decimales() {
        return cantidad3Decimales;
    }

    /**
     * Define el valor de la propiedad cantidad3Decimales.
     * 
     */
    public void setCantidad3Decimales(boolean value) {
        this.cantidad3Decimales = value;
    }

    /**
     * Obtiene el valor de la propiedad valorUnitario5Decimales.
     * 
     */
    public boolean isValorUnitario5Decimales() {
        return valorUnitario5Decimales;
    }

    /**
     * Define el valor de la propiedad valorUnitario5Decimales.
     * 
     */
    public void setValorUnitario5Decimales(boolean value) {
        this.valorUnitario5Decimales = value;
    }

    /**
     * Obtiene el valor de la propiedad cenagas.
     * 
     */
    public boolean isCenagas() {
        return cenagas;
    }

    /**
     * Define el valor de la propiedad cenagas.
     * 
     */
    public void setCenagas(boolean value) {
        this.cenagas = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTraslado2Decimales.
     * 
     */
    public boolean isImporteTraslado2Decimales() {
        return importeTraslado2Decimales;
    }

    /**
     * Define el valor de la propiedad importeTraslado2Decimales.
     * 
     */
    public void setImporteTraslado2Decimales(boolean value) {
        this.importeTraslado2Decimales = value;
    }

    /**
     * Obtiene el valor de la propiedad base2Decimales.
     * 
     */
    public boolean isBase2Decimales() {
        return base2Decimales;
    }

    /**
     * Define el valor de la propiedad base2Decimales.
     * 
     */
    public void setBase2Decimales(boolean value) {
        this.base2Decimales = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambioCenagas.
     * 
     */
    public boolean isTipoCambioCenagas() {
        return tipoCambioCenagas;
    }

    /**
     * Define el valor de la propiedad tipoCambioCenagas.
     * 
     */
    public void setTipoCambioCenagas(boolean value) {
        this.tipoCambioCenagas = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionComercioWS.
     * 
     */
    public boolean isDireccionComercioWS() {
        return direccionComercioWS;
    }

    /**
     * Define el valor de la propiedad direccionComercioWS.
     * 
     */
    public void setDireccionComercioWS(boolean value) {
        this.direccionComercioWS = value;
    }

    /**
     * Obtiene el valor de la propiedad valorUnitario4Decimales.
     * 
     */
    public boolean isValorUnitario4Decimales() {
        return valorUnitario4Decimales;
    }

    /**
     * Define el valor de la propiedad valorUnitario4Decimales.
     * 
     */
    public void setValorUnitario4Decimales(boolean value) {
        this.valorUnitario4Decimales = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambio4DecimalesWS.
     * 
     */
    public boolean isTipoCambio4DecimalesWS() {
        return tipoCambio4DecimalesWS;
    }

    /**
     * Define el valor de la propiedad tipoCambio4DecimalesWS.
     * 
     */
    public void setTipoCambio4DecimalesWS(boolean value) {
        this.tipoCambio4DecimalesWS = value;
    }

    /**
     * Obtiene el valor de la propiedad bp33.
     * 
     */
    public boolean isBP33() {
        return bp33;
    }

    /**
     * Define el valor de la propiedad bp33.
     * 
     */
    public void setBP33(boolean value) {
        this.bp33 = value;
    }

    /**
     * Obtiene el valor de la propiedad complementoPagosHorario.
     * 
     */
    public boolean isComplementoPagosHorario() {
        return complementoPagosHorario;
    }

    /**
     * Define el valor de la propiedad complementoPagosHorario.
     * 
     */
    public void setComplementoPagosHorario(boolean value) {
        this.complementoPagosHorario = value;
    }

    /**
     * Obtiene el valor de la propiedad noServicioWS.
     * 
     */
    public boolean isNoServicioWS() {
        return noServicioWS;
    }

    /**
     * Define el valor de la propiedad noServicioWS.
     * 
     */
    public void setNoServicioWS(boolean value) {
        this.noServicioWS = value;
    }

    /**
     * Obtiene el valor de la propiedad airbp33.
     * 
     */
    public boolean isAIRBP33() {
        return airbp33;
    }

    /**
     * Define el valor de la propiedad airbp33.
     * 
     */
    public void setAIRBP33(boolean value) {
        this.airbp33 = value;
    }

    /**
     * Obtiene el valor de la propiedad momentiveReceptor.
     * 
     */
    public boolean isMomentiveReceptor() {
        return momentiveReceptor;
    }

    /**
     * Define el valor de la propiedad momentiveReceptor.
     * 
     */
    public void setMomentiveReceptor(boolean value) {
        this.momentiveReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad franjaFronterizaOp.
     * 
     */
    public boolean isFranjaFronterizaOp() {
        return franjaFronterizaOp;
    }

    /**
     * Define el valor de la propiedad franjaFronterizaOp.
     * 
     */
    public void setFranjaFronterizaOp(boolean value) {
        this.franjaFronterizaOp = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketCrepes.
     * 
     */
    public boolean isTicketCrepes() {
        return ticketCrepes;
    }

    /**
     * Define el valor de la propiedad ticketCrepes.
     * 
     */
    public void setTicketCrepes(boolean value) {
        this.ticketCrepes = value;
    }

    /**
     * Obtiene el valor de la propiedad iBerdolaRFC.
     * 
     */
    public boolean isIBerdolaRFC() {
        return iBerdolaRFC;
    }

    /**
     * Define el valor de la propiedad iBerdolaRFC.
     * 
     */
    public void setIBerdolaRFC(boolean value) {
        this.iBerdolaRFC = value;
    }

    /**
     * Obtiene el valor de la propiedad timbradoEdiFact.
     * 
     */
    public boolean isTimbradoEdiFact() {
        return timbradoEdiFact;
    }

    /**
     * Define el valor de la propiedad timbradoEdiFact.
     * 
     */
    public void setTimbradoEdiFact(boolean value) {
        this.timbradoEdiFact = value;
    }

    /**
     * Obtiene el valor de la propiedad folioClienteOmitir.
     * 
     */
    public boolean isFolioClienteOmitir() {
        return folioClienteOmitir;
    }

    /**
     * Define el valor de la propiedad folioClienteOmitir.
     * 
     */
    public void setFolioClienteOmitir(boolean value) {
        this.folioClienteOmitir = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad0Decimales.
     * 
     */
    public boolean isCantidad0Decimales() {
        return cantidad0Decimales;
    }

    /**
     * Define el valor de la propiedad cantidad0Decimales.
     * 
     */
    public void setCantidad0Decimales(boolean value) {
        this.cantidad0Decimales = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambioBP.
     * 
     */
    public boolean isTipoCambioBP() {
        return tipoCambioBP;
    }

    /**
     * Define el valor de la propiedad tipoCambioBP.
     * 
     */
    public void setTipoCambioBP(boolean value) {
        this.tipoCambioBP = value;
    }

    /**
     * Obtiene el valor de la propiedad hamiltonBeach.
     * 
     */
    public boolean isHamiltonBeach() {
        return hamiltonBeach;
    }

    /**
     * Define el valor de la propiedad hamiltonBeach.
     * 
     */
    public void setHamiltonBeach(boolean value) {
        this.hamiltonBeach = value;
    }

    /**
     * Obtiene el valor de la propiedad decimales6TipoCambioWS.
     * 
     */
    public boolean isDecimales6TipoCambioWS() {
        return decimales6TipoCambioWS;
    }

    /**
     * Define el valor de la propiedad decimales6TipoCambioWS.
     * 
     */
    public void setDecimales6TipoCambioWS(boolean value) {
        this.decimales6TipoCambioWS = value;
    }

    /**
     * Obtiene el valor de la propiedad decimales6DoctoRelacionado.
     * 
     */
    public boolean isDecimales6DoctoRelacionado() {
        return decimales6DoctoRelacionado;
    }

    /**
     * Define el valor de la propiedad decimales6DoctoRelacionado.
     * 
     */
    public void setDecimales6DoctoRelacionado(boolean value) {
        this.decimales6DoctoRelacionado = value;
    }

    /**
     * Obtiene el valor de la propiedad valorUnitarioString.
     * 
     */
    public boolean isValorUnitarioString() {
        return valorUnitarioString;
    }

    /**
     * Define el valor de la propiedad valorUnitarioString.
     * 
     */
    public void setValorUnitarioString(boolean value) {
        this.valorUnitarioString = value;
    }

    /**
     * Obtiene el valor de la propiedad officeMax.
     * 
     */
    public boolean isOfficeMax() {
        return officeMax;
    }

    /**
     * Define el valor de la propiedad officeMax.
     * 
     */
    public void setOfficeMax(boolean value) {
        this.officeMax = value;
    }

    /**
     * Obtiene el valor de la propiedad folioClienteCancelado.
     * 
     */
    public boolean isFolioClienteCancelado() {
        return folioClienteCancelado;
    }

    /**
     * Define el valor de la propiedad folioClienteCancelado.
     * 
     */
    public void setFolioClienteCancelado(boolean value) {
        this.folioClienteCancelado = value;
    }

    /**
     * Obtiene el valor de la propiedad penon.
     * 
     */
    public boolean isPenon() {
        return penon;
    }

    /**
     * Define el valor de la propiedad penon.
     * 
     */
    public void setPenon(boolean value) {
        this.penon = value;
    }

    /**
     * Obtiene el valor de la propiedad serieRest.
     * 
     */
    public boolean isSerieRest() {
        return serieRest;
    }

    /**
     * Define el valor de la propiedad serieRest.
     * 
     */
    public void setSerieRest(boolean value) {
        this.serieRest = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelacionIberdrola.
     * 
     */
    public boolean isCancelacionIberdrola() {
        return cancelacionIberdrola;
    }

    /**
     * Define el valor de la propiedad cancelacionIberdrola.
     * 
     */
    public void setCancelacionIberdrola(boolean value) {
        this.cancelacionIberdrola = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambio4DecimalesPagosWS.
     * 
     */
    public boolean isTipoCambio4DecimalesPagosWS() {
        return tipoCambio4DecimalesPagosWS;
    }

    /**
     * Define el valor de la propiedad tipoCambio4DecimalesPagosWS.
     * 
     */
    public void setTipoCambio4DecimalesPagosWS(boolean value) {
        this.tipoCambio4DecimalesPagosWS = value;
    }

    /**
     * Obtiene el valor de la propiedad validaRFCRazonSocial.
     * 
     */
    public boolean isValidaRFCRazonSocial() {
        return validaRFCRazonSocial;
    }

    /**
     * Define el valor de la propiedad validaRFCRazonSocial.
     * 
     */
    public void setValidaRFCRazonSocial(boolean value) {
        this.validaRFCRazonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad tiendas3B.
     * 
     */
    public boolean isTiendas3B() {
        return tiendas3B;
    }

    /**
     * Define el valor de la propiedad tiendas3B.
     * 
     */
    public void setTiendas3B(boolean value) {
        this.tiendas3B = value;
    }

    /**
     * Obtiene el valor de la propiedad totalesPagos206D.
     * 
     */
    public boolean isTotalesPagos206D() {
        return totalesPagos206D;
    }

    /**
     * Define el valor de la propiedad totalesPagos206D.
     * 
     */
    public void setTotalesPagos206D(boolean value) {
        this.totalesPagos206D = value;
    }

    /**
     * Obtiene el valor de la propiedad totalesPagos204D.
     * 
     */
    public boolean isTotalesPagos204D() {
        return totalesPagos204D;
    }

    /**
     * Define el valor de la propiedad totalesPagos204D.
     * 
     */
    public void setTotalesPagos204D(boolean value) {
        this.totalesPagos204D = value;
    }

    /**
     * Obtiene el valor de la propiedad swsapien.
     * 
     */
    public boolean isSWSAPIEN() {
        return swsapien;
    }

    /**
     * Define el valor de la propiedad swsapien.
     * 
     */
    public void setSWSAPIEN(boolean value) {
        this.swsapien = value;
    }

    /**
     * Obtiene el valor de la propiedad rscpAutomatico.
     * 
     */
    public boolean isRSCPAutomatico() {
        return rscpAutomatico;
    }

    /**
     * Define el valor de la propiedad rscpAutomatico.
     * 
     */
    public void setRSCPAutomatico(boolean value) {
        this.rscpAutomatico = value;
    }

    /**
     * Obtiene el valor de la propiedad ws40.
     * 
     */
    public boolean isWS40() {
        return ws40;
    }

    /**
     * Define el valor de la propiedad ws40.
     * 
     */
    public void setWS40(boolean value) {
        this.ws40 = value;
    }

    /**
     * Obtiene el valor de la propiedad ticket40.
     * 
     */
    public boolean isTicket40() {
        return ticket40;
    }

    /**
     * Define el valor de la propiedad ticket40.
     * 
     */
    public void setTicket40(boolean value) {
        this.ticket40 = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcAutomaticoSOAP.
     * 
     */
    public boolean isRFCAutomaticoSOAP() {
        return rfcAutomaticoSOAP;
    }

    /**
     * Define el valor de la propiedad rfcAutomaticoSOAP.
     * 
     */
    public void setRFCAutomaticoSOAP(boolean value) {
        this.rfcAutomaticoSOAP = value;
    }

    /**
     * Obtiene el valor de la propiedad rscpAutomaticoNomina.
     * 
     */
    public boolean isRSCPAutomaticoNomina() {
        return rscpAutomaticoNomina;
    }

    /**
     * Define el valor de la propiedad rscpAutomaticoNomina.
     * 
     */
    public void setRSCPAutomaticoNomina(boolean value) {
        this.rscpAutomaticoNomina = value;
    }

    /**
     * Obtiene el valor de la propiedad iberdrolaDecimalesPagos.
     * 
     */
    public boolean isIberdrolaDecimalesPagos() {
        return iberdrolaDecimalesPagos;
    }

    /**
     * Define el valor de la propiedad iberdrolaDecimalesPagos.
     * 
     */
    public void setIberdrolaDecimalesPagos(boolean value) {
        this.iberdrolaDecimalesPagos = value;
    }

    /**
     * Obtiene el valor de la propiedad allianz3340Traslados.
     * 
     */
    public boolean isAllianz3340Traslados() {
        return allianz3340Traslados;
    }

    /**
     * Define el valor de la propiedad allianz3340Traslados.
     * 
     */
    public void setAllianz3340Traslados(boolean value) {
        this.allianz3340Traslados = value;
    }

    /**
     * Obtiene el valor de la propiedad traslados40.
     * 
     */
    public boolean isTraslados40() {
        return traslados40;
    }

    /**
     * Define el valor de la propiedad traslados40.
     * 
     */
    public void setTraslados40(boolean value) {
        this.traslados40 = value;
    }

    /**
     * Obtiene el valor de la propiedad origenRecursoWS.
     * 
     */
    public boolean isOrigenRecursoWS() {
        return origenRecursoWS;
    }

    /**
     * Define el valor de la propiedad origenRecursoWS.
     * 
     */
    public void setOrigenRecursoWS(boolean value) {
        this.origenRecursoWS = value;
    }

    /**
     * Obtiene el valor de la propiedad castrolSAP.
     * 
     */
    public boolean isCastrolSAP() {
        return castrolSAP;
    }

    /**
     * Define el valor de la propiedad castrolSAP.
     * 
     */
    public void setCastrolSAP(boolean value) {
        this.castrolSAP = value;
    }

    /**
     * Obtiene el valor de la propiedad eliminaTicket40.
     * 
     */
    public boolean isEliminaTicket40() {
        return eliminaTicket40;
    }

    /**
     * Define el valor de la propiedad eliminaTicket40.
     * 
     */
    public void setEliminaTicket40(boolean value) {
        this.eliminaTicket40 = value;
    }

    /**
     * Obtiene el valor de la propiedad siValeCorreos.
     * 
     */
    public boolean isSiValeCorreos() {
        return siValeCorreos;
    }

    /**
     * Define el valor de la propiedad siValeCorreos.
     * 
     */
    public void setSiValeCorreos(boolean value) {
        this.siValeCorreos = value;
    }

    /**
     * Obtiene el valor de la propiedad serviFacil.
     * 
     */
    public boolean isServiFacil() {
        return serviFacil;
    }

    /**
     * Define el valor de la propiedad serviFacil.
     * 
     */
    public void setServiFacil(boolean value) {
        this.serviFacil = value;
    }

    /**
     * Obtiene el valor de la propiedad actualizaDomicilioWS.
     * 
     */
    public boolean isActualizaDomicilioWS() {
        return actualizaDomicilioWS;
    }

    /**
     * Define el valor de la propiedad actualizaDomicilioWS.
     * 
     */
    public void setActualizaDomicilioWS(boolean value) {
        this.actualizaDomicilioWS = value;
    }

    /**
     * Obtiene el valor de la propiedad grupoSumma.
     * 
     */
    public boolean isGrupoSumma() {
        return grupoSumma;
    }

    /**
     * Define el valor de la propiedad grupoSumma.
     * 
     */
    public void setGrupoSumma(boolean value) {
        this.grupoSumma = value;
    }

    /**
     * Obtiene el valor de la propiedad gandhi.
     * 
     */
    public boolean isGandhi() {
        return gandhi;
    }

    /**
     * Define el valor de la propiedad gandhi.
     * 
     */
    public void setGandhi(boolean value) {
        this.gandhi = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambioUSD4D.
     * 
     */
    public boolean isTipoCambioUSD4D() {
        return tipoCambioUSD4D;
    }

    /**
     * Define el valor de la propiedad tipoCambioUSD4D.
     * 
     */
    public void setTipoCambioUSD4D(boolean value) {
        this.tipoCambioUSD4D = value;
    }

    /**
     * Obtiene el valor de la propiedad equivalenciaDR6.
     * 
     */
    public boolean isEquivalenciaDR6() {
        return equivalenciaDR6;
    }

    /**
     * Define el valor de la propiedad equivalenciaDR6.
     * 
     */
    public void setEquivalenciaDR6(boolean value) {
        this.equivalenciaDR6 = value;
    }

    /**
     * Obtiene el valor de la propiedad hyundai.
     * 
     */
    public boolean isHyundai() {
        return hyundai;
    }

    /**
     * Define el valor de la propiedad hyundai.
     * 
     */
    public void setHyundai(boolean value) {
        this.hyundai = value;
    }

    /**
     * Obtiene el valor de la propiedad castrolFinanzas.
     * 
     */
    public boolean isCastrolFinanzas() {
        return castrolFinanzas;
    }

    /**
     * Define el valor de la propiedad castrolFinanzas.
     * 
     */
    public void setCastrolFinanzas(boolean value) {
        this.castrolFinanzas = value;
    }

    /**
     * Obtiene el valor de la propiedad publicoGeneral.
     * 
     */
    public boolean isPublicoGeneral() {
        return publicoGeneral;
    }

    /**
     * Define el valor de la propiedad publicoGeneral.
     * 
     */
    public void setPublicoGeneral(boolean value) {
        this.publicoGeneral = value;
    }

    /**
     * Obtiene el valor de la propiedad mesSAP.
     * 
     */
    public boolean isMesSAP() {
        return mesSAP;
    }

    /**
     * Define el valor de la propiedad mesSAP.
     * 
     */
    public void setMesSAP(boolean value) {
        this.mesSAP = value;
    }

    /**
     * Obtiene el valor de la propiedad bellota.
     * 
     */
    public boolean isBellota() {
        return bellota;
    }

    /**
     * Define el valor de la propiedad bellota.
     * 
     */
    public void setBellota(boolean value) {
        this.bellota = value;
    }

    /**
     * Obtiene el valor de la propiedad mesFinanzas.
     * 
     */
    public boolean isMesFinanzas() {
        return mesFinanzas;
    }

    /**
     * Define el valor de la propiedad mesFinanzas.
     * 
     */
    public void setMesFinanzas(boolean value) {
        this.mesFinanzas = value;
    }

    /**
     * Obtiene el valor de la propiedad equivalenciaDR10.
     * 
     */
    public boolean isEquivalenciaDR10() {
        return equivalenciaDR10;
    }

    /**
     * Define el valor de la propiedad equivalenciaDR10.
     * 
     */
    public void setEquivalenciaDR10(boolean value) {
        this.equivalenciaDR10 = value;
    }

    /**
     * Obtiene el valor de la propiedad lanceta.
     * 
     */
    public boolean isLanceta() {
        return lanceta;
    }

    /**
     * Define el valor de la propiedad lanceta.
     * 
     */
    public void setLanceta(boolean value) {
        this.lanceta = value;
    }

    /**
     * Obtiene el valor de la propiedad montoOrigenRecursoWS.
     * 
     */
    public boolean isMontoOrigenRecursoWS() {
        return montoOrigenRecursoWS;
    }

    /**
     * Define el valor de la propiedad montoOrigenRecursoWS.
     * 
     */
    public void setMontoOrigenRecursoWS(boolean value) {
        this.montoOrigenRecursoWS = value;
    }

    /**
     * Obtiene el valor de la propiedad tsj.
     * 
     */
    public boolean isTSJ() {
        return tsj;
    }

    /**
     * Define el valor de la propiedad tsj.
     * 
     */
    public void setTSJ(boolean value) {
        this.tsj = value;
    }

}
