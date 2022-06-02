package test;

import dominio.Persona;

public class PersonaPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona("Darwin", 5000.00, false);
		System.out.println("nombre sin cambio: " + persona1.getNombre());
		persona1.setNombre("Darwin Tusarma Taba");
		System.out.println("nombre con cambio: " + persona1.getNombre());
		System.out.println("sueldo: " + persona1.getSueldo() );
		System.out.println("eliminado: " + persona1.isEliminado());

	}

}
