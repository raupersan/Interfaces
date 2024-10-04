package ej2;

import java.io.Serializable;

public class Libros implements Serializable {
	private String titulo;
	private String autor;
	private int precio;
	public Libros(String titulo, String autor, int precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	
}
