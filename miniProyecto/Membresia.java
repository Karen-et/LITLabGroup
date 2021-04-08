package Week3;

public class Membresia {
	
	//Atributos
	private int cuota;
	private int frecuencia;
	private boolean activa;
	
	//Constructores
	public Membresia(int cuota, int frecuencia, boolean activa) {
		super();
		this.cuota = cuota;
		this.frecuencia = frecuencia;
		this.activa = activa;
	}
	
	public Membresia() {
		this.cuota = 0;
		this.frecuencia = 0;
		this.activa = false;
	}
	
	//Geters y Setters
	public void setCuota(int cuota) {
		this.cuota = cuota;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	public int getCuota() {
		return cuota;
	}
	
	//Metodos
	public static void cuotasAtrasadas() {
		
	}
	
	public static void registrarPago() {
		System.out.println("Pago realizado correctamente");
	}
}
