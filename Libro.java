
public class Libro {
	private String isbn;
	private String titulo;
	private String autor; 
	private int anioPublicacion;
	private boolena disponible;
	
	public  Libro(String isbn, String titulo, String autor, int anioPublicacion, boolean disponible);
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn() {
		this.isbn=isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo() {
		this.titulo=titulo;
	}public String getAutor() {
		return autor;
	}
	public void setAutor() {
		this.autor=autor;
	}public int getAnioPubluicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion() {
		this.anioPublicacion=anioPublicacion;
	}public boolean getDisponible() {
		return disponible;
	}
	public void setDispobible() {
		this.disponible=disponible;
	}
	
	public String prestamo() {
		
	}
	public boolean devolucion() {
		
	}
	public void informacion() {
		
	}
	@Override
	public String toString() {
		return "Información del libro:\r\n"
				+ "ISBN: 978-3-16-148410-0, Título: Cien años de soledad, Autor: Gabriel García Márquez, Año de Publicación: 1967, Disponible: true";
	}
}
