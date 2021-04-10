package Desafio;

import LITLabGroup.Desafio.Estudiante;

public class Desafio {

	public static void main(String[] args) {

		//Parte 3: Crear un arreglo de estudiantes.
		Estudiante[] estudiantes = new Estudiante[10];

		//Parte 1: Crear 10 estudiantes pasandole parámetros al constructor.
		int[] notasE1 = {8,7,10};
		estudiantes[0] = new Estudiante(1, "Paula", notasE1);

		int[] notasE2 = {4,1,2};
		estudiantes[1] = new Estudiante(2, "Anthony", notasE2);

		int[] notasE3 = {3,4,5};
		estudiantes[2] = new Estudiante(3, "Mauro", notasE3);

		int[] notasE4 = {10,10,9};
		estudiantes[3] = new Estudiante(4, "Karen", notasE4);

		int[] notasE5 = {8,8,8};
		estudiantes[4] = new Estudiante(5, "Michael", notasE5);

		int[] notasE6 = {8,7,10};
		estudiantes[5] = new Estudiante(6, "José", notasE6);

		int[] notasE7 = {6,6,6};
		estudiantes[6] = new Estudiante(7, "Eliana", notasE7);

		int[] notasE8 = {10,7,10};
		estudiantes[7] = new Estudiante(8, "Evelyn", notasE8);

		int[] notasE9 = {8,7,9};
		estudiantes[8] = new Estudiante(9, "Alejandra", notasE9);

		int[] notasE10 = {4,7,10};
		estudiantes[9] = new Estudiante(10, "Pepito", notasE10);
		
		//Parte 2: Ingresar 2 estudiantes por consola.
		
		promedioTotalEstudiantes(estudiantes);


	}

	//Parte 4: Mostrar los estudiantes con nombre y promedio.
	public static void mostrarEstudiante (Estudiante [] alumnos) {
		int [] notas;
		for (int i=0; i<alumnos.length; i++) {
			notas=alumnos[i].getNotas();	
			System.out.println("Nombre: "+alumnos[i].nombre+", Promedio "+(alumnos[i].promedio(notas)));
		}
	}

	//Parte 5: Estudiantes con todas sus notas>=6.
	public static int aprobados(Estudiante[] alumnos) {

		int cont = 0;
		boolean aprobado;

		for(int i=0; i<10; i++) {

			aprobado = true;
			int[] notas = alumnos[i].getNotas();

			for(int j=0; j<notas.length; j++) {

				if(notas[j]<6) {
					aprobado = false;
				}
			}

			if(aprobado) {
				cont++;
			}
		}

		return cont;
	}

	//Parte 6: mostrar los estudiantes en orden inverso.
	public static void estudiantesInverso (Estudiante [] alumnos) {

		double promedio;
		int [] notas;

		for (int i=alumnos.length-1; i>=0; i--) {	

			notas= alumnos[i].getNotas();
			promedio = alumnos[i].promedio(notas);

			if(promedio> 6.0) {
				System.out.println(alumnos[i]+" Promedio: "+promedio);
			}

		}

	}

	//Parte 7: Mostrar el est. con mayor promedio, el de menor y el promedio de notas del grupo.
	public static void promedioTotalEstudiantes(Estudiante[] alumno) {
		
		int suma = 0;
		int[] notas;
		double promedio;
		double mayor = alumno[0].promedio(alumno[0].getNotas());
		double menor = alumno[0].promedio(alumno[0].getNotas());
		Estudiante estudianteMayor = alumno[0];
		Estudiante estudianteMenor= alumno[0];
	
		
		for(int i=0; i<alumno.length; i++) {
			
			
			notas=alumno[i].getNotas();	
			promedio=alumno[i].promedio(notas);
			
			//Guardo el estudiante con mayor promedio.
			if(promedio>mayor) {
				estudianteMayor = alumno[i];
				mayor = promedio;
			}
			
			// Guardo el estudiante con menor promedio.
			if(promedio<menor) {
				estudianteMenor = alumno[i];
				menor = promedio;
			}
			
			suma+=promedio;
			
		}
		
		promedio = suma/alumno.length;
		
		System.out.println(estudianteMayor.nombre+" tiene el mayor promedio.");
		System.out.println(estudianteMenor.nombre+" tiene el menor promedio");
		System.out.println("El promedio de la clase es: "+promedio);
		
	}

	//Parte 8: Propuesta del equipo, ordenar los estudiantes por mejor promedio.
	public static Estudiante[] ordenarPorPromedio(Estudiante[] alumno) {
		Estudiante aux;
		double promedioA, promedioB;

		for(int i=0;i<alumno.length-1;i++) {
			for(int j=i+1;j<alumno.length;j++) {
				promedioA = alumno[i].promedio(alumno[i].getNotas());
				promedioB = alumno[j].promedio(alumno[j].getNotas());

				if (promedioA>promedioB) {
					aux=alumno[i];
					alumno[i]=alumno[j];
					alumno[j]=aux;
				}
			}
		}
		return alumno;
	}

}

