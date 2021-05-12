
public class Avion extends Vehiculo{
	private double logitud;
	private int cantPasajeros;
	
	public Avion(int idVehiculo, String nombreVehiculo, String color, double logitud, int cantPasajeros) {
		super(idVehiculo, nombreVehiculo, color);
		this.logitud=logitud;
		this.cantPasajeros=cantPasajeros;
	}
	
	public double getLogitud() {
		return logitud;
	}
	public void setLogitud(double logitud) {
		this.logitud = logitud;
	}
	public int getCantPasajeros() {
		return cantPasajeros;
	}
	public void setCantPasajeros(int cantPasajeros) {
		this.cantPasajeros = cantPasajeros;
	}
	
}
