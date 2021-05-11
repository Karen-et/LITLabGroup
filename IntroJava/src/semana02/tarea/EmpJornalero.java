package semana02.tarea;

public class EmpJornalero extends Empleado {
	
	public double valorHora;
	public double horasRealizadas;

	public EmpJornalero(String nombre, String apellido, int nroBps, int nroFuncionario, String direccion, String telefono, double valorHora, double horasRealizadas) {
		super(nombre, apellido, nroBps, nroFuncionario, direccion, telefono);
		this.valorHora = valorHora;
		this.horasRealizadas = horasRealizadas;
	}

	
	public double getValorHora(){
		return this.valorHora;
	}
	
	public void setValorHora (double valorHora) {
		this.valorHora = valorHora;
	}
	
	
}
