package Tarea_Excepciones;

public class Mascota {
	
	public int idMascota;
	public String nombre;
	public int cantPatas;
	
	
	public Mascota() {
		this.idMascota = 0;
		this.nombre = "";
		this.cantPatas = 0;
	}


	@Override
	public String toString() {
		return "Mascota [idMascota=" + idMascota + ", nombre=" + nombre + ", cantPatas=" + cantPatas + "]";
	}

}
