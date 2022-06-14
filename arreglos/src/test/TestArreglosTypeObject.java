package test;

import domain.Persona;

public class TestArreglosTypeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona personas [] = new Persona[2];
		
		personas[0] = new Persona("Juan");
		personas[1] = new Persona("Carlos");
		
		System.out.println("persona posicion 0 =" + personas[0]);
		System.out.println("persona posicion 1 = " + personas[1]);
		
		for(int contador = 0; contador < personas.length; contador++) {
			System.out.println("Personas = " + personas[contador]);
			
		}

	}

}
