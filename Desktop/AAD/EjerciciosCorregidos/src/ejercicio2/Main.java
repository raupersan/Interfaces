package ejercicio2;

import java.io.*;

public class Main {
	private static void escribirFichero(String nombreFichero, ArrayList<Libreria> libreria) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(nombreFichero)))) {
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Libreria leerFichero(String nombreFichero){
		Libreria l = null;
		try(ObjectInputStream ois =new ObjectInputStream(new FileInputStream(new File(nombreFichero)))) {
			l=(Libreria)ois.readObject();
		} catch (ClassNotFoundException e) {
			System.out.println("No hemos podido recuperar el objeto");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("No se ha podido leer el objeto");
			e.printStackTrace();
		}
		
		
		return ;
	}
	
	public static void main(String[] args) {
		String nombreFichero;
		Libreria libreria = new Libreria();
		libreria.insertarLibro("Harry Potter", "J.K. Rowling", 12.00);
		libreria.insertarLibro("El Quijote", "Miguel de Cervantes", 25.00);
		
		escribirFichero(nombreFichero, libreria);
		aux = leerFichero(nombreFichero);
		aux.ordenarLibrosPorPrecio();
		aux.listarLibros();
		List<Libro> p = aux.filtrarLibrosPorPrecio(17.00, 17.00);
	}

}
