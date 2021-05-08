
import java.time.LocalDate;

public class Persona {
	
	public Persona(int idPersona, String nombre, String apellido, String dptoResidencia, byte cantHijos) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dptoResidencia = dptoResidencia;
		this.cantHijos = cantHijos;
		
	}
	public int idPersona;
	public String nombre;
	public String apellido;
	public String dptoResidencia;
	private byte cantHijos;
	
	
	//Cantidad de hijos
	public byte getCantHijos() {
		return cantHijos;
	}
	public void setCantHijos(byte cantHijos) {
		this.cantHijos = cantHijos;
	}
	
	
	//Constructor
	public Persona() {
		this.idPersona = 0;
		this.nombre = " ";
		this.apellido = "";
		this.dptoResidencia = "";
		this.cantHijos = 0;
		
	}
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", dptoResidencia="
				+ dptoResidencia + ", cantHijos=" + cantHijos + "]";
	}
	
	

	
}