package pasoporreferencia;

import java.security.PublicKey;

import clases.Persona;
import clases.Persona;

public class pasoPorReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona();persona1.nombre = "ppe";
		System.out.println("nombre = " + persona1.nombre);
		cambiaValor(persona1);
		System.out.println("persona1 cambio valor = " + persona1.nombre);
	}
	


		public static void  cambiaValor(Persona persona) {
			persona.nombre ="juana";
			
		}

}
