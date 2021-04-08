package Desafio;

public class Estudiante {
	
	// Atributos
	public int idEstudiante;
	public String nombre;
	private int notas[] = new int[3];
	
	// Get y Set
	public int[] getNotas() {
		return notas;
	}
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	
	//Contructores
	
	public Estudiante(int idEstudiante, String nombre, int[] notas) {
		this.idEstudiante = idEstudiante;
		this.nombre = nombre;
		this.notas = notas;
	}
	
	public Estudiante() {
		this.idEstudiante= 0;
		this.nombre = "";
		this.notas = new int[3];
	}
	
	
	//Metodo para el promedio
	public double promedio(int calificaciones[]) {
		
		int suma = 0;
		double promedio = 0;
	
		
		for(int i=0; i<calificaciones.length; i++) {
			suma+= calificaciones[i];
		}
		
		promedio = suma / calificaciones.length;
		
		return promedio;
	}
	
	
}
