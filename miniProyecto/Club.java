package semana5;

public class Club {
	
//Atritutos//
	private String nombre;
	private String direccion;
	private int telefono;
	private String paginaWeb;
	
	//Contrucctores//
	public Club() {
		this.nombre="";
		this.direccion="";
		this.telefono=0;
		this.paginaWeb="";
	}
		public Club(String nombre, String direccion, int telefono, String paginaWeb) {
			this.nombre= nombre;
			this.direccion= direccion;
			this.telefono= telefono;
			this.paginaWeb= paginaWeb;
		}
		//Gett and Sett
		//Nombre
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		//Direccion
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		//Telefono
		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		//Pagina Web
		public String getPaginaWeb() {
			return paginaWeb;
		}
		public void setPaginaWeb(String paginaWeb) {
			this.paginaWeb = paginaWeb;
		}
		
}
