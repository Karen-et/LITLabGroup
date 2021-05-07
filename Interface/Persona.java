package Interface;

import java.time.LocalDate;

public class Persona {
	
	public int idPersona;
	public String nombre;
	public String apellido;
	public String dptoResidencia;
	private byte cantHijos;
	private LocalDate fechaNacimiento;
	
	//Cantidad de hijos
	public byte getCantHijos() {
		return cantHijos;
	}
	public void setCantHijos(byte cantHijos) {
		this.cantHijos = cantHijos;
	}
	
	//Fecha de nacimiento
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	//Constructor
	public Persona(int idPersona, String nombre, String apellido, String dptoResidencia, byte cantHijos,
			LocalDate fechaNacimiento) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dptoResidencia = dptoResidencia;
		this.cantHijos = cantHijos;
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", dptoResidencia="
				+ dptoResidencia + ", cantHijos=" + cantHijos + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	
}
