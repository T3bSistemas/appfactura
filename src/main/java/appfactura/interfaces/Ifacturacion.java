package appfactura.interfaces;

import java.util.List;
import java.util.Map;

import org.tempuri.CFDIRequest40;

import appfactura.beans.Fclientes;
import appfactura.beans.Ticket;


public interface Ifacturacion {
	public Map<Integer, CFDIRequest40> getRequests(Fclientes fclientes, List<Ticket> tickets) ;
	public List<Ticket> crearFactura(Map<Integer, CFDIRequest40> requests, List<Ticket> tickets);

}
