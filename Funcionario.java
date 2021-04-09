package semana5;

public class Funcionario {
	
    //Atributos
	//Hereda atributos de la clase Usuario
	private String cargo;
	private String horario;
	
	//Contructores
	public Funcionario() {
		this.cargo="";
		this.horario="";
	}
	public Funcionario(String cargo, String horario) {
		this.cargo= cargo;
		this.horario= horario;
			
	}
	//Gett and Sett
	//Cargo
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	//Horarios
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}

	}
	

