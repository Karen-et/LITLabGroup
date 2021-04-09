package LITLabGroup.miniProyecto;

import java.util.Date;

//Socio hereda los atributos de Usuario.

public class Socio {
    
	//Atributos
	private boolean esRepresenate;
	private int añosDeAntiguedad;
	private boolean esFuncionario;
	public Date venFichaMedica;
	
	//esRepresentante
	public boolean isEsRepresenate() {
		return esRepresenate;
	}
	public void setEsRepresenate(boolean esRepresenate) {
		this.esRepresenate = esRepresenate;
	}
	
	//añosDeAntiguedad
	public int getAñosDeAntiguedad() {
		return añosDeAntiguedad;
	}
	public void setAñosDeAntiguedad(int añosDeAntiguedad) {
		this.añosDeAntiguedad = añosDeAntiguedad;
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
	
	public Socio(boolean esRepresenate, int añosDeAntiguedad, boolean esFuncionario, Date venFichaMedica) {
		this.esRepresenate = esRepresenate;
		this.añosDeAntiguedad = añosDeAntiguedad;
		this.esFuncionario = esFuncionario;
		this.venFichaMedica = venFichaMedica;
	}
	
	
	public Socio() {
		this.añosDeAntiguedad = 0;
		this.venFichaMedica = new Date();
	}
	
	//Metodos
	@Override
	public String toString() {
		return "Socio [esRepresenate=" + esRepresenate + ", añosDeAntiguedad=" + añosDeAntiguedad + ", esFuncionario="
				+ esFuncionario + ", venFichaMedica=" + venFichaMedica + "]";
	}
	
	public boolean fichaMedicaVigente(Date hoy) {
		
		//Determina si la fecha de vencimiento es anterior a hoy
		//de ser así retorna false.
		
		return 4<4; //Esto es para que no marque error el archivo.
	}
	
	public void descuento(boolean esRepresentante,int antiguedad, boolean esFuncionario) {
		//Determina si el socio tiene descuentos según los parámetros ingresados
		//y modifica el valor de la cuota.
	}
	
	
	
	
}
