
public class Barco extends Vehiculo {

	private double eslora;
	private double manga;
	
	public Barco(int idVehiculo, String nombreVehiculo, String color, double eslora, double manga) {
		super(idVehiculo, nombreVehiculo, color);
		this.eslora=eslora;
		this.manga=manga;
	}
		
	public double getEslora() {
		return eslora;
	}
	public void setEslora(double eslora) {
		this.eslora = eslora;
	}
	public double getManga() {
		return manga;
	}
	public void setManga(double manga) {
		this.manga = manga;
	}
	
	
}
