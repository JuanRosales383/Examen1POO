package com.jcra.libreria;

public class Estudiante extends Usuario{
	
	//Declaracion de variables
	private double altura;
	private String carrera;
	private String semestre;
	private double creditos;
	
	//constructor de Estudiante
		public Estudiante(String usuario, String nombre, double edad, String cumpleaños, double altura, String carrera, String semestre, double creditos) {
			super(usuario, nombre, edad, cumpleaños);
			this.altura = altura;
			this.carrera = carrera;
			this.semestre = semestre;
			this.creditos = creditos;
		}
	
	
}
