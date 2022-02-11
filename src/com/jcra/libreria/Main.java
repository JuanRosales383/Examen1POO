package com.jcra.libreria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario libreria1 = new Usuario("Biblioteca", "Ibero", "Santa Fe");
		libreria1.biblioteca("user1", "Edgar", 21,"16/03/2001", 7, 2802);
		libreria1.Profesor("user2", "Carlos", 18, "17/03/2000", "catolico", "artes", 5, "Ibero");
		libreria1.Profesor("user3", "Alfonso", 19, "14/05/2002", "catolico", "administracion", 6, "Ibero");
		libreria1.Estudiante("user4", "Erik", 20, "16/07/2001", "catolico", "programacion", 4, "Ibero");
		
		System.out.println("La bilbioteca es " + libreria1.Usuario);
		System.out.println("Usuario 1 " + libreria1.biblioteca);
		System.out.println("Usuario 2" + libreria1.Profesor);
		System.out.println("Usuario 3 " + libreria1.Profesor);
		System.out.println("Usuario 4 " + libreria1.Estudiante);
	}

}
