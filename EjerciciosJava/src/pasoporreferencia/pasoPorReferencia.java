package pasoporreferencia;

import java.security.PublicKey;

import clases.Persona;
import clases.Persona;

public class pasoPorReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona();persona1.nombre = "ppe";
		System.out.println("nombre = " + persona1.nombre);
		persona1 = cambiaValor(persona1);
		System.out.println("persona1 cambio valor = " + persona1.nombre);
	}
	


		public static Persona  cambiaValor(Persona persona) {
			if(persona == null) {
				System.out.println("valor de persona invalido : null");
				return persona;
			}
			persona.nombre ="juana";
			
			return persona;
			
		}

}
