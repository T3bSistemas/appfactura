package appfactura.modelos;


import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.tempuri.ArrayOfConceptoCFDI40;
import org.tempuri.ArrayOfImpuestoTrasladado40;
import org.tempuri.ArrayOfParte40;
import org.tempuri.CFDIRequest40;
import org.tempuri.CFDIResponse40;
import org.tempuri.ConceptoCFDI40;
import org.tempuri.ConceptosCFDI40;
import org.tempuri.DatosCFDI40;
import org.tempuri.DigiFact;
import org.tempuri.DigiFactSoap;
import org.tempuri.GeneraCFDIV40;
import org.tempuri.ImpuestoTrasladado40;
import org.tempuri.PDFCFDIRquest;
import org.tempuri.Parte40;
import org.tempuri.ReceptorCFDI40;
import org.tempuri.PDFCFDIResponse;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import appfactura.beans.Fclientes;
import appfactura.beans.Ticket;
import appfactura.beans.TicketDetalle;
import appfactura.interfaces.Ifacturacion;


@Service
public class Mfacturacion implements Ifacturacion{
	@Autowired
	Environment env;
	
	@Override
	public Map<Integer, CFDIRequest40> getRequests(Fclientes fclientes, List<Ticket> tickets) {
		Map<Integer, CFDIRequest40> requests = new HashMap<Integer, CFDIRequest40>();
		try {			 
			Map<Integer, Double> 		totales  = new HashMap<Integer, Double>();
			
			for (Ticket ticket : tickets) {
				boolean 		existe 			= requests.containsKey(ticket.getTienda());
				CFDIRequest40 	request 		= (existe)?requests.get(ticket.getTienda()):new CFDIRequest40();
				ReceptorCFDI40 	receptorCFDI 	= (existe)?request.getReceptorCFDI40():new ReceptorCFDI40();
				ConceptosCFDI40 conceptosCFDI	= (existe)?request.getConceptosCFDI40():new ConceptosCFDI40();
				DatosCFDI40 	datosCFDI 		= (existe)?request.getDatosCFDI40():new DatosCFDI40();
				Double			total			= (totales.containsKey(ticket.getTienda()))?totales.get(ticket.getTienda()):ticket.getTotal();
				if(!existe) {
					receptorCFDI.setRFC(fclientes.getRfc().toUpperCase());
			        receptorCFDI.setRazonSocial(fclientes.getRazonSocial().toUpperCase());        
			        receptorCFDI.setNumRegIdTrib("");
			        receptorCFDI.setUsoCfdi(fclientes.getUsoCFDI());
			        receptorCFDI.setNoCliente("");      
			        receptorCFDI.setDomicilioFiscalReceptor(fclientes.getDomicilio().getCp());
			        receptorCFDI.setRegimenFiscalReceptor(fclientes.getRegimenFiscal());
			        if(fclientes.getCorreo2() !=null && !fclientes.getCorreo2().equals("")) {
			        	receptorCFDI.setEmail2(fclientes.getCorreo2());
			        }			        
			        receptorCFDI.setEmail(fclientes.getCorreo());   
			        
			        datosCFDI.setSerie(ticket.getTncrvendflag());
			        datosCFDI.setFolio(0);
			        datosCFDI.setFecha(parserDateXMLGregorianCalendar(dateToStringYMD(new Date())));        
			        datosCFDI.setFormadePago(ticket.getClaveSAT());
			        datosCFDI.setDescuento(0);
			        datosCFDI.setMoneda(env.getProperty("digifact.moneda"));
			        datosCFDI.setTipoCambio(0);
			        datosCFDI.setTipodeComprobante(env.getProperty("digifact.tipodecomprobante"));
			        datosCFDI.setMetodoPago(env.getProperty("digifact.metododepago"));
			        if(ticket.getTdir().length() == 4) {
			        	datosCFDI.setLugarDeExpedicion("0"+ticket.getTdir());
			        } else {
			        	datosCFDI.setLugarDeExpedicion(ticket.getTdir());
			        }
			        datosCFDI.setCondicionesDePago(env.getProperty("digifact.condicionesdepago"));        
			        datosCFDI.setExportacion(env.getProperty("digifact.exportacion"));
			        
					conceptosCFDI.setConceptos(new ArrayOfConceptoCFDI40());
				}else{		
					if(ticket.getTotal() > total) {
						total = ticket.getTotal();
						datosCFDI.setFormadePago(ticket.getClaveSAT());
					}					
				}
				
								
				for (TicketDetalle ticketDet : ticket.getDetalles()) {
					ConceptoCFDI40 			conceptoCFDI 		= new ConceptoCFDI40();
					ImpuestoTrasladado40	impuestoTrasladado	= new ImpuestoTrasladado40();
					ImpuestoTrasladado40	impuestoTrasladado2	= new ImpuestoTrasladado40();
					Parte40					parte 				= new Parte40();
					
					conceptoCFDI.setNoIdentificacion("00"+(conceptosCFDI.getConceptos().getConceptoCFDI40().size()+1));
		            conceptoCFDI.setClaveProdServ(ticketDet.getCClaveProdServ());
		            conceptoCFDI.setClaveUnidad(ticketDet.getCClaveUnidad());
		            conceptoCFDI.setUnidad(ticketDet.getIunidad());
		            conceptoCFDI.setDescripcion(ticketDet.getIdesc());
		            conceptoCFDI.setObjetoImp(env.getProperty("digifact.objimp"));
		            
		            Double monto 	= ticketDet.getAtmventa();
		            Double cantidad = Double.parseDouble(ticketDet.getAtmacant().toString().trim());
		            Double miSub 	= 0d;  
		            Double iefactor = Double.parseDouble(ticketDet.getIEfactor());
		            Double ivfactor = Double.parseDouble(ticketDet.getIVfactor());
		            Double subIva   = (ivfactor > 0d || iefactor > 0d)?redondear(monto / (ivfactor + Double.parseDouble("1")),3):0d;
		            Double iepVenta = 0d;
		            
		            if(iefactor > 0d) {
	            		miSub  		= redondear(subIva / (iefactor + Double.parseDouble("1")),3);
	            		iepVenta 	= (miSub * iefactor);			        	
		            }else {
		            	miSub		= (ivfactor > 0d)? subIva:  redondear(monto,3);		        		
		            }
		            
					conceptoCFDI.setValorUnitario(redondear((miSub / cantidad), 3));
					conceptoCFDI.setCantidad(cantidad);
					conceptoCFDI.setImporte(miSub);
					
					impuestoTrasladado.setBase(redondear((conceptoCFDI.getImporte()+iepVenta),3));
		            impuestoTrasladado.setImpuesto(env.getProperty("digifact.impuesto"));
		            impuestoTrasladado.setTipoFactor(env.getProperty("digifact.tipofactor"));
		            impuestoTrasladado.setTasaOCuota(ivfactor);
		            impuestoTrasladado.setImporte(redondear((impuestoTrasladado.getBase() * impuestoTrasladado.getTasaOCuota()),3));
		            
		            if(iefactor > 0d) {
			        	impuestoTrasladado2.setBase(redondear(conceptoCFDI.getImporte(),3));
			            impuestoTrasladado2.setImpuesto(env.getProperty("digifact.impuesto2"));
			            impuestoTrasladado2.setTipoFactor(env.getProperty("digifact.tipofactor"));
			            impuestoTrasladado2.setTasaOCuota(iefactor);
			            impuestoTrasladado2.setImporte(redondear((impuestoTrasladado2.getBase() * impuestoTrasladado2.getTasaOCuota()),3));
			        }
		            
		            parte.setClaveProdServ(conceptoCFDI.getClaveProdServ());
		            parte.setNoIdentificacion(conceptoCFDI.getNoIdentificacion());
		            parte.setCantidad(conceptoCFDI.getCantidad());
		            parte.setUnidad(conceptoCFDI.getUnidad());
		            parte.setDescripcion(conceptoCFDI.getDescripcion());
		            parte.setValorUnitario(conceptoCFDI.getValorUnitario());
		            parte.setImporte(conceptoCFDI.getImporte());
		            
					conceptoCFDI.setTraslados(new ArrayOfImpuestoTrasladado40());
		            conceptoCFDI.setParte(new ArrayOfParte40());
		            
		            conceptoCFDI.getTraslados().getImpuestoTrasladado40().add(impuestoTrasladado);
		            if(impuestoTrasladado2.getImporte() > 0d) {
		                    conceptoCFDI.getTraslados().getImpuestoTrasladado40().add(impuestoTrasladado2);
		            }		            
		            conceptoCFDI.getParte().getParte40().add(parte);
		           
		            
		            Double totalIvaV33= (impuestoTrasladado2.getImporte() > 0)?
		            		impuestoTrasladado.getImporte()+impuestoTrasladado2.getImporte():
		            			impuestoTrasladado.getImporte();
		            if((conceptosCFDI.getConceptos().getConceptoCFDI40().size()+1) == 1) {
		            	datosCFDI.setSubtotal(conceptoCFDI.getImporte());		            	
		            	datosCFDI.setTotal(redondear((conceptoCFDI.getImporte() + totalIvaV33),3));
		            }else{
		            	datosCFDI.setSubtotal(redondear(datosCFDI.getSubtotal()+conceptoCFDI.getImporte(),3));
		            	datosCFDI.setTotal(redondear( (datosCFDI.getTotal())+(conceptoCFDI.getImporte() + totalIvaV33),3));
		            }        
		            conceptosCFDI.getConceptos().getConceptoCFDI40().add(conceptoCFDI);  
		            
		            ticketDet.setValUnit(conceptoCFDI.getValorUnitario());
		            ticketDet.setSubtotal(conceptoCFDI.getImporte());
		            ticketDet.setIvaMont(impuestoTrasladado.getImporte());
		            ticketDet.setIepsMont(impuestoTrasladado2.getImporte());
		            ticketDet.setIvaPrc(impuestoTrasladado.getTasaOCuota());
		            ticketDet.setIepsPrc(impuestoTrasladado2.getTasaOCuota());
				}
				
				request.setDatosCFDI40(datosCFDI);
		        request.setReceptorCFDI40(receptorCFDI);
		        request.setConceptosCFDI40(conceptosCFDI);
		        
				requests.put(ticket.getTienda(), request);		
				totales.put(ticket.getTienda(),  total);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return requests;
	}

	@Override
	public List<Ticket> crearFactura(Map<Integer, CFDIRequest40> requests, List<Ticket> tickets)  {
		try {
			if(requests.size() > 0) {
				for (Integer tienda: requests.keySet()) {
					CFDIRequest40 	request		= requests.get(tienda);
									request.setUsuario(env.getProperty("digifact.usuario"));
									request.setContrasena(env.getProperty("digifact.contrasena"));	
					DigiFact 		df			= new DigiFact();
					DigiFactSoap	port		= df.getDigiFactSoap();			
					GeneraCFDIV40 	g 			= new GeneraCFDIV40();
									g.setCFDIRequest40(request);								
		        	PDFCFDIRquest 	pdfRequest 	= new PDFCFDIRquest();
		        	CFDIResponse40 	xml			= port.generaCFDIV40(request);  
			        if(xml.isCFDICorrecto()) {
			        	PDFCFDIResponse 		responsepdf = new PDFCFDIResponse();
			        	byte[] 					pdf			= null;
		        		String 					xmlCFDI 	= xml.getXMLCFDI();
		        		String 					uuid		= "";
			        	DocumentBuilderFactory 	domFactory 	= DocumentBuilderFactory.newInstance();    
				        DocumentBuilder 		builder 	= domFactory.newDocumentBuilder();
                        Document 				doc 		= builder.parse(new InputSource(new StringReader(xmlCFDI)));
                        { 
                        	NodeList nList = doc.getElementsByTagName("cfdi:Complemento");
                        	for (int i = 0; i < nList.getLength(); i++) {
            	                Node nNode = nList.item(i);
            	                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
            	                	Element eElement 	= (Element) nNode;
            	                			uuid 		=((Element)eElement.getElementsByTagName("tfd:TimbreFiscalDigital").item(i)).getAttribute("UUID");
            	                    pdfRequest.setUUID(uuid);
            	                }
            	            }
            	        }             	
				        
			            pdfRequest.setCFDI(true);
			            pdfRequest.setTimbrado(false);
			            pdfRequest.setUsuario(request.getUsuario());
			            pdfRequest.setContrasena(request.getContrasena());
			            pdfRequest.setVersion(env.getProperty("digifact.version"));			            
			            responsepdf = generaPDFCFDIV40(pdfRequest);
			            if (responsepdf.getErrorPDF().equals("")) {
			                pdf = responsepdf.getPDF();
			                if(pdf != null) {
				            	String pdfBase64 = Base64.getEncoder().encodeToString(pdf);				            	
				            	for (Ticket ticket : tickets) {
									if((ticket.getTienda()+"").equals(tienda+"")) {
										ticket.setFolio(xml.getFolio());
										ticket.setUuid(uuid);
										ticket.setPdf(pdfBase64);
										ticket.setXml(xmlCFDI);
										ticket.setTotal(request.getDatosCFDI40().getTotal());
										ticket.setSubtotal(request.getDatosCFDI40().getSubtotal());
										List<ConceptoCFDI40> conseptos = request.getConceptosCFDI40().getConceptos().getConceptoCFDI40();										
										for (ConceptoCFDI40 consepto : conseptos) {
											List<ImpuestoTrasladado40> impuestoTrasladado40 =consepto.getTraslados().getImpuestoTrasladado40();
											for (ImpuestoTrasladado40 impuesto : impuestoTrasladado40) {
												double impTick = redondear(impuesto.getBase()*impuesto.getTasaOCuota(),3);
												if(impuesto.getImpuesto().equals(env.getProperty("digifact.impuesto"))) {													
													impTick=(ticket.getIva()== null)?impTick:ticket.getIva()+impTick;
													ticket.setIva(redondear(impTick,3));
												}else if(impuesto.getImpuesto().equals(env.getProperty("digifact.impuesto2"))) {
													impTick=(ticket.getIeps() == null)?impTick:ticket.getIeps()+impTick;
													ticket.setIeps(redondear(impTick,3));
												}
											}
										}
									}										
								}				            	
				            }
			            } 		            			        							        	
			        } else {
			        	for (Ticket ticket : tickets) {			        		
							if((ticket.getTienda()+"").equals(tienda+"")) {
								ticket.setXml(xml.getErrorCFDI()); 
								ticket.setCodigoError(xml.getCodigoError());
							}								
						}			        	        
			        }
				}
			}
		} catch (Exception e) {
			e.printStackTrace();;
		}
		return tickets;
	}	
	
	
	
	public double redondear( double numero, int decimales ) {
        return Math.round(numero*Math.pow(10,decimales))/Math.pow(10,decimales);
    }
	
 	public XMLGregorianCalendar parserDateXMLGregorianCalendar(String fecha){
        LocalDate in;
        XMLGregorianCalendar out = null;	        
        try {
            in = LocalDate.parse(fecha);
            out = DatatypeFactory.newInstance().newXMLGregorianCalendar(in.toString());
            out.setTime(10, 10, 00);
        } catch (DatatypeConfigurationException ex) {
            ex.getStackTrace();
        } 
        return out;
    }
	 
    public String dateToStringYMD(Date fecha){
	  if(fecha==null)return "";
	  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	  String stringDate = dateFormat.format(fecha);
	  return stringDate;
	}
    
    public static PDFCFDIResponse generaPDFCFDIV40(org.tempuri.PDFCFDIRquest pdfrequest) {
        org.tempuri.DigiFact service = new DigiFact();
        org.tempuri.DigiFactSoap port = service.getDigiFactSoap();
        return port.generaPDFCFDIV33(pdfrequest);
    }
    

}