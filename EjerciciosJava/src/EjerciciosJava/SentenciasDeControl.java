package EjerciciosJava;

import java.lang.invoke.VarHandle;

public class SentenciasDeControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//estructura if else 
		var condicion = false;
		if(condicion == true) {
			System.out.println("condicion verdadera " );
		}
		else {
			System.out.println("condicion falsa");
		}
		
		var numero = 2;
		var numeroTexto = "numero desconocido";
		if(numero == 1) {
			numeroTexto = "Numero uno";
			
		}
		else if(numero == 2) {
			numeroTexto = "numero dos";
			
		}
		else if (numero == 3) {
			numeroTexto = "numero tres";
		}
		
		else if(numero == 4) {
			numeroTexto = "numero cuatro";
		}
		else {
			numeroTexto = "numero no encontrado";
		}
		System.out.println("numeroTexto = " + numeroTexto);

	}

}
