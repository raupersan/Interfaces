package lectura1;

import java.util.regex.Matcher; 
import java.io.*;

public class main1 {

	public static void main(String[] args) {
		String ruta = "C:\\Users\\CFGS.LAB-35-PC04\\Desktop\\AAD\\padalustro.txt";
		File fichero1 = new File(ruta);

		try {
			FileReader salida = new FileReader(fichero1);
			BufferedReader buffer = new BufferedReader(salida);
			String texto=buffer.readLine();
			if(texto!=" "){ 
				System.out.println(texto);
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
