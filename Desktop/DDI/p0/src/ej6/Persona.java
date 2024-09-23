package ej6;

public abstract class Persona {
	private String DNI;
	private String nombre;
	private String apellidos;
	private int salario;
	public Persona(String dNI, String nombre, String apellidos, int salario) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
	}
	
}
