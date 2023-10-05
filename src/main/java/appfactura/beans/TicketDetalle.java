package appfactura.beans;

public class TicketDetalle {
	private String  iclave;
	private Integer atmacant;
	private Double  atmventa;
	private String  ivClave;
	private String  ieClave;
	
	private String 	idesc;
	private String 	iunidad;
	private String 	CClaveUnidad;
	private String 	CClaveProdServ;
	private String 	IVfactor;
	private String 	IEfactor;
	private Double  Iva;
	private Double  Ieps;
	
	private Double  valUnit;
	private Double  subtotal;
	private Double  iepsPrc;
	private Double  iepsMont;
	private Double  ivaPrc;
	private Double  ivaMont;
	
	public Double getValUnit() {
		return valUnit;
	}
	public void setValUnit(Double valUnit) {
		this.valUnit = valUnit;
	}
	public TicketDetalle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketDetalle(String iclave, Integer atmacant, Double atmventa, String ivClave, String ieClave, String idesc,
			String iunidad, String cClaveUnidad, String cClaveProdServ, String iVfactor, String iEfactor, Double iva,
			Double ieps) {
		super();
		this.iclave = iclave;
		this.atmacant = atmacant;
		this.atmventa = atmventa;
		this.ivClave = ivClave;
		this.ieClave = ieClave;
		this.idesc = idesc;
		this.iunidad = iunidad;
		CClaveUnidad = cClaveUnidad;
		CClaveProdServ = cClaveProdServ;
		IVfactor = iVfactor;
		IEfactor = iEfactor;
		Iva = iva;
		Ieps = ieps;
	}
	public String getIclave() {
		return iclave;
	}
	public Integer getAtmacant() {
		return atmacant;
	}
	public Double getAtmventa() {
		return atmventa;
	}
	public String getIvClave() {
		return ivClave;
	}
	public String getIeClave() {
		return ieClave;
	}
	public String getIdesc() {
		return idesc;
	}
	public String getIunidad() {
		return iunidad;
	}
	public String getCClaveUnidad() {
		return CClaveUnidad;
	}
	public String getCClaveProdServ() {
		return CClaveProdServ;
	}
	public String getIVfactor() {
		return IVfactor;
	}
	public String getIEfactor() {
		return IEfactor;
	}
	public Double getIva() {
		return Iva;
	}
	public Double getIeps() {
		return Ieps;
	}
	public void setIclave(String iclave) {
		this.iclave = iclave;
	}
	public void setAtmacant(Integer atmacant) {
		this.atmacant = atmacant;
	}
	public void setAtmventa(Double atmventa) {
		this.atmventa = atmventa;
	}
	public void setIvClave(String ivClave) {
		this.ivClave = ivClave;
	}
	public void setIeClave(String ieClave) {
		this.ieClave = ieClave;
	}
	public void setIdesc(String idesc) {
		this.idesc = idesc;
	}
	public void setIunidad(String iunidad) {
		this.iunidad = iunidad;
	}
	public void setCClaveUnidad(String cClaveUnidad) {
		CClaveUnidad = cClaveUnidad;
	}
	public void setCClaveProdServ(String cClaveProdServ) {
		CClaveProdServ = cClaveProdServ;
	}
	public void setIVfactor(String iVfactor) {
		IVfactor = iVfactor;
	}
	public void setIEfactor(String iEfactor) {
		IEfactor = iEfactor;
	}
	public void setIva(Double iva) {
		Iva = iva;
	}
	public void setIeps(Double ieps) {
		Ieps = ieps;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public Double getIepsPrc() {
		return iepsPrc;
	}
	public Double getIepsMont() {
		return iepsMont;
	}
	public Double getIvaPrc() {
		return ivaPrc;
	}
	public Double getIvaMont() {
		return ivaMont;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public void setIepsPrc(Double iepsPrc) {
		this.iepsPrc = iepsPrc;
	}
	public void setIepsMont(Double iepsMont) {
		this.iepsMont = iepsMont;
	}
	public void setIvaPrc(Double ivaPrc) {
		this.ivaPrc = ivaPrc;
	}
	public void setIvaMont(Double ivaMont) {
		this.ivaMont = ivaMont;
		
	}
}
