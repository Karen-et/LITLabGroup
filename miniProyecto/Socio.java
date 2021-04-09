package LITLabGroup.miniProyecto;

import java.util.Date;

public class Socio {
    
	//Atributos
	private boolean esRepresenate;
	private int a�osDeAntiguedad;
	private boolean esFuncionario;
	public Date venFichaMedica;
	
	//esRepresentante
	public boolean isEsRepresenate() {
		return esRepresenate;
	}
	public void setEsRepresenate(boolean esRepresenate) {
		this.esRepresenate = esRepresenate;
	}
	
	//a�osDeAntiguedad
	public int getA�osDeAntiguedad() {
		return a�osDeAntiguedad;
	}
	public void setA�osDeAntiguedad(int a�osDeAntiguedad) {
		this.a�osDeAntiguedad = a�osDeAntiguedad;
	}
	
	//esFuncionario
	public boolean isEsFuncionario() {
		return esFuncionario;
	}
	public void setEsFuncionario(boolean esFuncionario) {
		this.esFuncionario = esFuncionario;
	}
	
	//venFichaMedica
	public Date getVenFichaMedica() {
		return venFichaMedica;
	}
	public void setVenFichaMedica(Date venFichaMedica) {
		this.venFichaMedica = venFichaMedica;
	}
	
	
	//Constructores
	
	public Socio(boolean esRepresenate, int a�osDeAntiguedad, boolean esFuncionario, Date venFichaMedica) {
		this.esRepresenate = esRepresenate;
		this.a�osDeAntiguedad = a�osDeAntiguedad;
		this.esFuncionario = esFuncionario;
		this.venFichaMedica = venFichaMedica;
	}
	
	
	public Socio() {
		this.a�osDeAntiguedad = 0;
		this.venFichaMedica = new Date();
	}
	
	//Metodos
	@Override
	public String toString() {
		return "Socio [esRepresenate=" + esRepresenate + ", a�osDeAntiguedad=" + a�osDeAntiguedad + ", esFuncionario="
				+ esFuncionario + ", venFichaMedica=" + venFichaMedica + "]";
	}
	
	public boolean fichaMedicaVigente(Date hoy) {
		
		//Determina si la fecha de vencimiento es anterior a hoy
		//de ser as� retorna false.
		
		return 4<4; //Esto es para que no marque error el archivo.
	}
	
	public void descuento(boolean esRepresentante,int antiguedad, boolean esFuncionario) {
		//Determina si el socio tiene descuentos seg�n los par�metros ingresados
		//y modifica el valor de la cuota.
	}
	
	
	
	
}
