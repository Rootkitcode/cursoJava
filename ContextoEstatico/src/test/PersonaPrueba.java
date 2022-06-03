package test;

import domain.Persona;

public class PersonaPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona("pepe");
		System.out.println("persona1: " + persona1.toString());
		
		Persona persona2 = new Persona("carlos");
		System.out.println("persona 2: " + persona2.toString());
		
		imprimir(persona2);
		

	}
	
	public static void imprimir(Persona persona) {
		System.out.println("persona imprimir: " + persona);
		
	}

}
