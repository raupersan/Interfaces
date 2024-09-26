package ej6;

public class Modulo{
	protected static String nombreModulo;
	private static int nHoras;
	private static String nombreProfesor;
	private static boolean convalida;
	public Modulo(String nombreModulo,int nHoras, String nombreProfesor, boolean convalida) {

	}
	public Modulo(String nombreModulo) {
		
	}
	public static String getNombreModulo() {
		return nombreModulo;
	}
	public static void setNombreModulo(String nombreModulo) {
		Modulo.nombreModulo = nombreModulo;
	}
	public static int getnHoras() {
		return nHoras;
	}
	public static void setnHoras(int nHoras) {
		Modulo.nHoras = nHoras;
	}
	public static String getNombreProfesor() {
		return nombreProfesor;
	}
	public static void setNombreProfesor(String nombreProfesor) {
		Modulo.nombreProfesor = nombreProfesor;
	}
	public static boolean isConvalida() {
		return convalida;
	}
	public static void setConvalida(boolean convalida) {
		Modulo.convalida = convalida;
	}
	@Override
	public String toString() {
		return "Modulo [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
