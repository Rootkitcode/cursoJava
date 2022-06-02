package test;

import dominio.Persona2;

public class testPersona2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona2 persona2 = new Persona2("Elena", "Mendez quintero", 33, true);
		System.out.println("nombre sin modificar: " + persona2.getNombre());
		persona2.setNombre("Luz Elena");
		System.out.println("nombre modificado: " + persona2.getNombre());
		System.out.println("apellidos sin modificar: " + persona2.getApellido());
		persona2.setApellido("Ramirez Quiroga");
		System.out.println("apellidos modificados: " + persona2.getApellido());
		System.out.println("edad: " + persona2.getEdad());
		System.out.println("Estudia: " + persona2.isEstudia());

	}

}
