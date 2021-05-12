
public class Vehiculo {
	
	private int idVehiculo;
	private String nombreVehiculo;
	private String color;
		
	public Vehiculo(int idVehiculo, String nombreVehiculo, String color) {
		super();
		this.idVehiculo = idVehiculo;
		this.nombreVehiculo = nombreVehiculo;
		this.color = color;
	}
	
	public Vehiculo(){
		this.idVehiculo = 0;
		this.nombreVehiculo = "";
		this.color = "";
	}
	
	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getNombreVehiculo() {
		return nombreVehiculo;
	}

	public void setNombreVehiculo(String nombreVehiculo) {
		this.nombreVehiculo = nombreVehiculo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", nombre=" + nombreVehiculo + ", color=" + color + "]";
	}
	
	
	
	
}
