package ejercicio2;

import java.util.*;


public class Libreria {
	public Libreria(String libros) {
		ArrayList<Libro> libros= new ArrayList<>();
	}
	public void insertarLibro(String titulo, String autor, double precio) {
		Libro nuevoLibro = new Libro(titulo, autor, precio);
		libros.add(nuevoLibro);
	}
	public void listarLibros() {
		if(libros.isEmpty()) {
			System.out.println("No hay libros que mostrar");
		}
		else {
			for(Libro l:libros) {
				System.out.println(l);
			}
		}
	}
	public void ordenarLibrosPorPrecio() {
		Collections.sort(libros, Comparator.comparingDouble(Libro));
	}
	public List<Libro> filtrarLibrosPorPrecio(double minimo, double maximo){
		List<Libro> librosFiltrados=new ArrayList<>();
		for(Libro l:libros) {
			if((l.getPrecio()>=minimo)&&(l.getPrecio()<=maximo)) {
				librosFiltrados.add(l);
			}
		}
	}
}
