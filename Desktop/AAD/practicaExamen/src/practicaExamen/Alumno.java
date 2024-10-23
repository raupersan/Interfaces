package practicaExamen;

import java.io.*;

public class Alumno implements Serializable{
	private int nota;
	private int id;
	
	public Alumno(int nota, int id) {
		super();
		this.nota = nota;
		this.id = id;
	}

	@Override
	public String toString() {
		return "nota=" + nota + ", id=" + id;
	}
}
