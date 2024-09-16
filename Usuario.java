
public class Usuario {
	private String idUsuario;
	private String nombre;
	private String telefono;
	private String email;
	
	public Usuario(String idUsuario, String nombre, String telefono, String email);
	
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario() {
		this.idUsuario=idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre() {
		this.nombre=nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono() {
		this.telefono=telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail() {
		this.email=email;
	}
	public void registrar() {
		
	}
	public void actualizarInfo() {
		
	}
	public void consultarPrestamos() {
		
	}
		
	@Override
	public String toString() {
		return "Información del libro:\r\n"
				+ "ISBN: 978-3-16-148410-0, Título: Cien años de soledad, Autor: Gabriel García Márquez, Año de Publicación: 1967, Disponible: true";
	}
}
