package ej4;


import java.util.Scanner;
public class ej4 {

	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		double tamaño;
		System.out.println("Indica la dimensión de tu matriz cuadrada");
         tamaño=sc.nextDouble(); 
         
		double sumar =0;
		
		for(int i=0; i<tamaño; i++) {
			
			for (int j=0; j<i;j++){
				int a =(int) Math.random();
				sumar=sumar+a;
			}
			
		}
		System.out.println(sumar);
	}

}
