package LITLabGroup.miniProyecto;
import java.util.Date;

public class Usuario {

	//Atributos
		
		private string nombre;
		private string apellido;
		private int ci;
		private date fechaNacimiento;
		private string direccion;
		private char sexo; // f or m 
		private int telefono;
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String nombre) {
			this.apellido = apellido;
		}
		
		
		public int getCi() {
			return ci;
		}
		public void setCi(int ci) {
			this.ci = ci;
		}
		
		
		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setNombre(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		
		
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		
		
		public char getSexo() {
			return sexo;
		}
		public void setNombre(char sexo) {
			this.sexo = sexo;
		}
		
		
		public int getTelefono() {
			return telefono;
		}
		public void setNombre(int telefono) {
			this.telefono = telefono;
		}
		
		
		
	//Constructores
		
		public Usuario (String nombre, String apellido, int ci, Date fechaNacimiento, String direccion, char sexo, int telefono) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.ci = ci;
			this.fechaNacimiento = fechaNacimiento;
			this.direccion = direccion;
			this.sexo = sexo;
			this.telefono = telefono;
			
		}
		
		
		public Usuario () {
			this.nombre = "nombreU";
			this.apellido = "apellidoU";
			this.ci = 123456789;
			this.fechaNacimiento = new Date();
			this.direccion = "direccionU";
			this.sexo = 'f';
			this.telefono = 099999999;
			
		}
		

	}


