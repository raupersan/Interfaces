
public class Prestamo {
	private String idPrestamo;
	private Date fechaPrestamo;
	private Date fechaDevolucion;
	
	public Prestamo(String idPrestamo, Date fechaPrestamo, Date fechaDevolucion);
	
	public String getIdPrestamo() {
		return idPrestamo
	}
	public void setIdPrestamo() {
		this.idPrestamo=idPrestamo;
	}
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	
	}
	public void setFechaPrestamo() {
		this.fechaPrestamo=fechaPrestamo;
	}
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	
	}
	public void setFechaDevolucion() {
		this.fechaDevolucion=fechaDevolucion;
	}
	
	public void realizarPrestamo() {
		
	}
	public void finalizarPrestamo() {
	
	}
}
