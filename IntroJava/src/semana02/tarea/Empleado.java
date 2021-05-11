package semana02.tarea;

public class Empleado {
	
	public String nombre;
	public String apellido;
	public int nroBps;
	public int nroFuncionario;
	public String direccion;
	public String telefono;
	

	public Empleado(String nombre, String apellido, int nroBps, int nroFuncionario, String direccion, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroBps = nroBps;
		this.nroFuncionario = nroFuncionario;
		this.direccion = direccion;
		this.telefono = telefono;
		
	}
	
	//metodo toString?
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getApellido(){
		return this.apellido;
	}
	
	public void setApellido (String apellido) {
		this.apellido = apellido;
	}
	
	
	public int getNroBps(){
		return this.nroBps;
	}
	
	public void setNroBps (int nroBps) {
		this.nroBps = nroBps;
	}
	
	
	public int getNroFuncionario(){
		return this.nroFuncionario;
	}
	
	public void setNroFuncionario (int nroFuncionario) {
		this.nroFuncionario = nroFuncionario;
	}
	
	
	public String getDireccion(){
		return this.direccion;
	}
	
	public void setDireccion (String direccion) {
		this.direccion = direccion;
	}
	
	
	
	public String getTelefono(){
		return this.telefono;
	}
	
	public void setTelefono (String telefono) {
		this.telefono = telefono;
	}
	
	

}
