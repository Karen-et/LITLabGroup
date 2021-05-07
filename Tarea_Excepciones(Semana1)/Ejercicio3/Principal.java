package Tarea_Excepciones;
import java.util.Scanner;

public class Principal {


	public static void main(String[] args) throws costumeException {
		Mascota[] misMascotas = new Mascota[3];

		//Ingresar Mascotas
		for(int i=0; i<misMascotas.length; i++) {
			ingresarMascota(misMascotas, i);
			System.out.println(misMascotas[i]);
		}

	}

	public static void ingresarMascota(Mascota Mascota[], int i ) throws costumeException {
		Scanner teclado = new Scanner(System.in);

		Mascota nuevaMascota = new Mascota();

		//ID
		System.out.println("Ingrese la ID de la mascota "+(i+1));
		nuevaMascota.idMascota = teclado.nextInt();

		//Nombre
		System.out.println("Ingrese el nombre de la mascota "+(i+1));
		nuevaMascota.nombre = teclado.next();

		//Cantidad de patas
		int patas;
		System.out.println("Ingrese la cantidad de patas de la mascota "+(i+1));
		patas = teclado.nextInt();

		while(patas != 4 && patas != 2) {
			try {
				throw new costumeException("La cantidad de patas debe ser 2 o 4, por favor ingrese el dato de nuevo.");
			}catch(costumeException ex) {
				teclado.nextLine();
				System.out.println(ex.getMessage());
				patas = teclado.nextInt();
			}

		}

		nuevaMascota.cantPatas = patas;

		System.out.println("----------------------------");

		Mascota[i] = nuevaMascota;
	}

}
