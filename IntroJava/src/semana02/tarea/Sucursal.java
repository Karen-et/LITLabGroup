package Ejercicio2Semana2;

import java.util.LinkedList;

public class Sucursal {   
	//Atributos
	public String nombre;
	public Integer id;
	public String direccion;
	public String rut;
	public String telefono; 
	public LinkedList <String> empleados= new LinkedList<String>();
	//Getters y Setters
public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	//Constructores
	public Sucursal(String nombre, Integer id, String direccion, String rut, String telefono){
		this.nombre= nombre;
		this.id= id;
		this.direccion= direccion;
		this.rut= rut;
		this.telefono= telefono;
		
	}
		
		public Sucursal() {
			this.nombre="";
			this.id=0;
			this.direccion= "";
			this.rut= "";
			this.telefono= "";
			
		}
	
@Override
		public String toString() {
			return "Sucursal [nombre=" + nombre + ", id=" + id + ", direccion=" + direccion + ", rut=" + rut
					+ ", telefono=" + telefono + ", empleados=" + empleados + "]";
		}







}
