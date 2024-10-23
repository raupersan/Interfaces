package modeloExamen;

public class Usuario {
	private String nombre;
	private String contraseña;
	private boolean rol;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public boolean isRol() {
		return rol;
	}
	public void setRol(boolean rol) {
		this.rol = rol;
	}
	public Usuario(String nombre, String contraseña, boolean rol) {
		super();
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.rol = rol;
	}
	
	
}
