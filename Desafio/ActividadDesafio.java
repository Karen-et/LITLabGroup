package Week3.Desafio;
import Week3.Desafio.Estudiante;
import java.util.*;

public class ActividadDesafio {

	public static void main(String[] args) {
			
		//Estudiante uno
		Estudiante e1 = new Estudiante();
		e1.idEstudiante= 1;
		e1.nombre= "Javier";
		int [] notasEstudiante1 = {11, 8, 4};
		e1.setNotas(notasEstudiante1);
		
		//Estudiante dos
		Estudiante e2 = new Estudiante();
		e2.idEstudiante= 2;
		e2.nombre= "Jonathan";
		int [] notasEstudiante2 = {10, 8, 7};
		e2.setNotas(notasEstudiante2);
		
		//Estudiante tres
		Estudiante e3 = new Estudiante();
		e3.idEstudiante= 3;
		e3.nombre= "Andrea";
		int [] notasEstudiante3 = {9, 9, 9};
		e3.setNotas(notasEstudiante3);
		
		Estudiante [] arrayEstudiantes = {e1, e2, e3};
		
		datosEstudianteInverso(arrayEstudiantes);
			
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	public static Estudiante [] datosEstudianteInverso (Estudiante [] alumnos) {
		
		double promedio;
		int [] notas;
	
		//promedio = estudiantesPorParametro[0].promedio();
		
		for (int i=0; i<alumnos.length; i++) {	
			notas=alumnos[i].getNotas();
			
			promedio = alumnos[i].promedio(notas);
					
			if(promedio>=6.0) {
				
				System.out.println(alumnos[i]+" Promedio: "+promedio);
			}
		}
		return alumnos;
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
}
