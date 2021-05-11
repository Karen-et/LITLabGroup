package semana02.tarea;

public class EmpMensual extends Empleado{

	public double salarioMensual;
	public String tipoRegimen;
	
	public EmpMensual(String nombre, String apellido, int nroBps, int nroFuncionario, String direccion, String telefono, double salarioMensual, String tipoRegimen) {
		super(nombre, apellido, nroBps, nroFuncionario, direccion, telefono);
		this.salarioMensual = salarioMensual;
		this.tipoRegimen = tipoRegimen;
		
	}
	
	//van getter y setters de clase padre?
	
	public double getSalarioMensual(){
		return this.salarioMensual;
	}
	
	public void setSalarioMensual (double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
	
	public String getTipoRegimen(){
		return this.tipoRegimen;
	}
	
	public void setTipoRegimen (String tipoRegimen) {
		this.tipoRegimen = tipoRegimen;
	}

}
