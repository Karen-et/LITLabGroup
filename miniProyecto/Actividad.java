package LITLabGroup.miniProyecto;
import java.util.Date;

public class Actividad {
	private String nombre;
	private char alcance; // departamental(D) o nacional(N);
	private String lugar;
	private Date fecha;
	private String horario;
	
	//nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//alcance
	public char getAlcance() {
		return alcance;
	}
	public void setAlcance(char alcance) {
		this.alcance = alcance;
	}
	
	//lugar
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	//fecha
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	//horario
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
	
}
