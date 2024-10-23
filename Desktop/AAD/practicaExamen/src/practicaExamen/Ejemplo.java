package practicaExamen;

import java.io.*;

public class Ejemplo {

	private static void lectura(String ruta) {
		try {
			FileInputStream fis = new FileInputStream(ruta);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Alumno a = (Alumno) ois.readObject();
			System.out.println(a);
		} catch (IOException | ClassNotFoundException e) {
			// TODO: handle exception
		}
	}

	private static void escritura(String ruta) {
		try {
			FileOutputStream fos = new FileOutputStream(ruta);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Alumno a = new Alumno(1, 10);
			oos.writeObject(a);
			System.out.println(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		lectura("C:\\Users\\CFGS.LAB-35-PC04\\Desktop\\objeto.txt");
	}

}
