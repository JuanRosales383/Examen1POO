package com.jcra.libreria;

public class Profesor extends Usuario{
	
	//Declaracion de variables 
	private String religion;
	private String materia;
	private double años;
	private String escuela;
	String profesor;
	String adeudo;
		
	//constructor de profesor
	public Profesor(String usuario, String nombre, double edad, String cumpleaños, String religion, String materia, double años, String escuela) {
		super(usuario, nombre, edad, cumpleaños);
		this.religion = religion;
		this.materia = materia;
		this.años = años;
		this.escuela = escuela;
	}
	
	public String prestamo(String profesor){
		return profesor;
	}
	
	public String adeudo(String adeudo){
		return adeudo;
	}
	
}
