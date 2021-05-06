package LITLabGroup.Desafio;

import java.util.Arrays;

public class Actividad {

	public static void main(String[] args) {

		Estudiante[] estudiante = new Estudiante[10];

		//Parte 1
		int[] notasE1 = {8,7,10};
		estudiante[0] = new Estudiante(1, "Paula", notasE1);

		int[] notasE2 = {4,1,2};
		estudiante[1] = new Estudiante(2, "Anthony", notasE2);

		int[] notasE3 = {3,4,5};
		estudiante[2] = new Estudiante(3, "Mauro", notasE3);

		int[] notasE4 = {10,10,9};
		estudiante[3] = new Estudiante(4, "Karen", notasE4);

		int[] notasE5 = {8,8,8};
		estudiante[4] = new Estudiante(5, "Michael", notasE5);

		int[] notasE6 = {8,7,10};
		estudiante[5] = new Estudiante(6, "José", notasE6);

		int[] notasE7 = {6,6,6};
		estudiante[6] = new Estudiante(7, "Eliana", notasE7);

		int[] notasE8 = {10,7,10};
		estudiante[7] = new Estudiante(8, "Evelyn", notasE8);

		int[] notasE9 = {8,7,9};
		estudiante[8] = new Estudiante(9, "Alejandra", notasE9);

		int[] notasE10 = {4,7,10};
		estudiante[9] = new Estudiante(10, "Pepito", notasE10);

		int CantMayores6 = aprobados(estudiante);
		System.out.println(CantMayores6);

		//System.out.println(aprobados(estudiante));

		mostrarEstudiante(estudiante);

	}

	//Parte 4: Mostrar los estudiantes con nombre y promedio.
	public static void mostrarEstudiante (Estudiante [] alumnos) {
		int [] notas;
		for (int i=0; i<alumnos.length; i++) {
			notas=alumnos[i].getNotas();	
			System.out.println("Nombre: "+alumnos[i].nombre+", Preomedio "+(alumnos[i].promedio(notas)));
		}
	}

	//Estudiantes con todas sus notas>=6.
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


	<<<<<<< HEAD
	public static void datosEstudianteInverso (Estudiante [] alumnos) {

		double promedio;
		int [] notas;

		//promedio = estudiantesPorParametro[0].promedio();

		for (int i=0; i<alumnos.length; i++) {	

			notas= alumnos[i].getNotas();
			promedio = alumnos[i].promedio(notas);

			if(promedio> 6.0) {
				System.out.println("Promedio: "+promedio+" "+Arrays.toString(notas)+" "+alumnos[i].nombre);
			}

		}

	}

}
