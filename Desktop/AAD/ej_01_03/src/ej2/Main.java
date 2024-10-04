package ej2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void escribirObjetos(String ruta) {

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(ruta)));
			oos.writeObject(new Libros("a","b",1));
			oos.writeObject(new Libros("c","d",2));
			oos.writeObject(new Libros("c","d",3));
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void lecturaObjetos(String  ruta) {

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(ruta)));
			char a =(char) ois.read();
			System.out.println(a);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		String libreria= "C:\\Users\\CFGS.LAB-35-PC04\\Desktop\\AAD\\libreria.txt";
		escribirObjetos(libreria);
		lecturaObjetos(libreria);
	}

}
