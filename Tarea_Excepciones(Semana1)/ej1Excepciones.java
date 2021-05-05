package semana1;

import java.io.InputStream;
import java.util.Scanner;

public class ej1Excepciones {
	
	public static void main(String[] args) {
		try {
			Scanner entrada = new Scanner(System.in); 
			System.out.println("Ingrese la posicion del array que quiere ver: ");
			int valorScanner=entrada.nextInt();
			leerEntrada(valorScanner);
		} catch (ExceptionsValidator excepcion1) {
			System.out.println(excepcion1);
		}
		
	}
	
	public static int leerEntrada(int valorEntrada) throws ExceptionsValidator{
		String [] arrayPersonas = {"Karen", "Paola", "Anthony", "Mauro", "Juan"};
		for (int i = 0; i < arrayPersonas.length; i++) {
			if(valorEntrada==i) {
				System.out.println("El valor contenido en la posicion "+valorEntrada+" es "+arrayPersonas[i]);
			}
			else if ((valorEntrada>arrayPersonas.length)||(valorEntrada<0)) {
				throw new ExceptionsValidator ("El valor ingresado esta fuera de rango");
			}
		}
		return valorEntrada;
	}
	
}
