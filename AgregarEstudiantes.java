package DesafioSemanal;
import java.util.*;
public class AgregarEstudiantes {

	public static void main(String[] args) {
		Estudiante e11= new Estudiante();
		Estudiante e12= new Estudiante();
		//Solicito primer id
		Scanner teclado= new Scanner(System.in);
		System.out.print("Ingrese id del primer estudiante:");
		e11.idEstudiante=teclado.nextInt();
		
		System.out.print("Ingrese el nombre del primer estudiante:");
		e11.nombre= teclado.next();
		
		int[]notasE11=new int [3];
		System.out.println("Ingrese las notas del primer estudiante:");
		notasE11[0]=Integer.parseInt(teclado.next());
		notasE11[1]=Integer.parseInt(teclado.next());
		notasE11[2]=Integer.parseInt(teclado.next());
        
		System.out.println();
	}

}
