package java_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejemplo_1 {
	
	public static void crearDirectorio(Path dir) throws IOException {
		if(!Files.exists(dir)) {
			Files.createDirectories(dir);
			System.out.println("Directorio creado en: " + dir.toAbsolutePath() + " y mi directorio padre es: " + dir.getParent()); 
		}
	}
	private static void leerArchivo() {
		
	}
	private static void escribirArchivo(Path fichero, String texto) throws IOException {
		Files.writeString(fichero, texto);
		System.out.println("Crea el archivo y escribe");
	}
	public static void main(String [] args) {
		Path directorio = Paths.get("Carpeta");
		Path fichero = directorio.resolve("ficheriJavaNIO.txt");
		try {
			crearDirectorio(directorio);
			escribirArchivo(fichero, "hola qué tal");
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
