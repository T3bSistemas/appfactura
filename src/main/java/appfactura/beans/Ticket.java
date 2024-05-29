package appfactura.beans;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private String 				fechaCompra;
	private Integer 			tienda;
	private String 				ticket;
	private String 				caja;
	private Double  			total;
	
	private String 				region;
	
	private String 				tipoPago;
	private int 				Idturno;
	
	private String 				tdir;
	private String 				tncrvendflag;
	private String 				temail;
	
	private String 				claveSAT;
	
	private List<TicketDetalle>	detalles = new ArrayList<TicketDetalle>();
	
	
	private String 				folio;
	private String 				uuid;	
	private String 				pdf;
	private String 				xml;
	private Double				subtotal;
	private Double				iva;
	private Double				ieps;
	private String 				CodigoError;
	
	
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(String fechaCompra, Integer tienda, String ticket, String caja, Double total, String region,
			String tipoPago, int idturno, String tdir, String tncrvendflag, String temail, String claveSAT,
			List<TicketDetalle> detalles) {
		super();
		this.fechaCompra = fechaCompra;
		this.tienda = tienda;
		this.ticket = ticket;
		this.caja = caja;
		this.total = total;
		this.region = region;
		this.tipoPago = tipoPago;
		Idturno = idturno;
		this.tdir = tdir;
		this.tncrvendflag = tncrvendflag;
		this.temail = temail;
		this.claveSAT = claveSAT;
		this.detalles = detalles;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public Integer getTienda() {
		return tienda;
	}

	public String getTicket() {
		return ticket;
	}

	public String getCaja() {
		return caja;
	}

	public Double getTotal() {
		return total;
	}

	public String getRegion() {
		return region;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public int getIdturno() {
		return Idturno;
	}

	public String getTdir() {
		return tdir;
	}

	public String getTncrvendflag() {
		return tncrvendflag;
	}

	public String getTemail() {
		return temail;
	}

	public String getClaveSAT() {
		return claveSAT;
	}

	public List<TicketDetalle> getDetalles() {
		return detalles;
	}

	public String getFolio() {
		return folio;
	}

	public String getUuid() {
		return uuid;
	}

	public String getPdf() {
		return pdf;
	}

	public String getXml() {
		return xml;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public void setTienda(Integer tienda) {
		this.tienda = tienda;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public void setCaja(String caja) {
		this.caja = caja;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public void setIdturno(int idturno) {
		Idturno = idturno;
	}

	public void setTdir(String tdir) {
		this.tdir = tdir;
	}

	public void setTncrvendflag(String tncrvendflag) {
		this.tncrvendflag = tncrvendflag;
	}

	public void setTemail(String temail) {
		this.temail = temail;
	}

	public void setClaveSAT(String claveSAT) {
		this.claveSAT = claveSAT;
	}

	public void setDetalles(List<TicketDetalle> detalles) {
		this.detalles = detalles;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public void setPdf(String pdf) {
		this.pdf = pdf;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public Double getIva() {
		return iva;
	}

	public Double getIeps() {
		return ieps;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public void setIeps(Double ieps) {
		this.ieps = ieps;
	}

	public String getCodigoError() {
		return CodigoError;
	}

	public void setCodigoError(String codigoError) {
		CodigoError = codigoError;
	}
		
	
}
