package test;

import domain.Persona;

public class TestForeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edades[] = {5, 6, 7, 8};
		for(int edad: edades) {
			System.out.println("edades: " + edad);
		}
		
		Persona personas[] = {new Persona("Felipe"), new Persona("Andrew"), new Persona("Paulo")};
		for(Persona persona: personas) {
			System.out.println("persona: " + persona);
		}

	}

}
