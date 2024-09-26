package ej6;

import java.util.Date;

public class Alumno extends Modulo {
	private static String DNI;
	private static String nombreAlumno;
	private static String apellidos;
	private static Date fechaNac;
	private static boolean hombre;
	private static boolean repetidor;

	public Alumno(String Dni, String nombreAlumno, String apellidos, Date fechaNac, boolean hombre, boolean repetidor, String nombreModulo) {
		super(nombreModulo);
		this.nombreModulo = nombreModulo;
	}

}
