package Exception;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {

		int [] numeros= new int[5];
		Scanner entrada= new Scanner(System.in);
		int contador=0;
		int suma=0;
		
		for (int i=0;i<numeros.length;i++) {
			System.out.println("Ingrese un numero por favor: ");
			try { 
				numeros[i]=entrada.nextInt();
				contador++;
				suma+=numeros[i];

			}catch (InputMismatchException e) {
				System.out.println("El "+(i+1)+" dato ingresado no es valido, debe ingresar un numero.Por defecto se asignara un 0. ");
				numeros[i]=0;
				entrada.nextLine();
				
			}

		}for (int n=0; n<numeros.length;n++) {
			System.out.println("El arrays contiene en la posicion " + (n+1) + " los siguientes numeros: " + numeros[n]);
		}
System.out.println("La suma es "+suma);
System.out.println("Los datos validos ingresados fueron "+contador);


	}

}
