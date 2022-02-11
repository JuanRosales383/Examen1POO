package com.jcra.libreria;

import com.jcra.libreria.Profesor;
import com.jcra.libreria.Estudiante;

public class Usuario{
	
	//Declaracion de variables
		private String usuario;
		private String nombre;
		private double edad;
		private String cumpleaños;
		String name;
		String apellido;
		String colonia;
		private double devolucion;
		private double mantenimiento;
		
		
		
	//constructor usuario
		public Usuario(String name, String apellido, String colonia) {
			this.name = name;
			this.apellido = apellido;
			this.colonia = colonia;
		}
		
		//funcion para agregar empleado
		 public void biblioteca(String usuario, String nombre, double edad, String cumpleaños, double devolucion, double mantenimiento) {
			this.usuario = usuario;
			this.nombre = nombre;
			this.edad = edad;
			this.cumpleaños = cumpleaños;
			this.devolucion = devolucion;
			this.mantenimiento = mantenimiento;
			
			Usuario usuario1 = new Usuario(usuario, nombre, edad, cumpleaños);
			usuario1.setDevolucion(devolucion);
			usuario1.setMantenimiento(mantenimiento);
			
		 }
		 
		 public void setDevolucion(double devolucion) {
			 this.devolucion = devolucion;
		 }
		 
		 public void setMantenimiento(double mantenimiento) {
			 this.mantenimiento = mantenimiento;
		 }
}
