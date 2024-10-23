package modeloExamen;

import java.io.*;
public class Main_01 {
	
	public static void crearFichero(File file) throws IOException  {
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("Fichero creado");
		}
	}
	public static void leerFichero(File file) throws FileNotFoundException {
		BufferedReader bf = new BufferedReader(new FileReader(file));
	}
	public static void main(String[] args) {
		String ruta ="Fichero.txt";
		
		File file = new File (ruta);
		try {
			crearFichero(file);
			leerFichero(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
