package EjerciciosJava;

public class variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int miVariableEntera = 45;
		System.out.println("el numero es: " + miVariableEntera);
		
		//modificamos el valor de la variable
		miVariableEntera = 8;
		System.out.println("El valor modificado  es: " + miVariableEntera);
		
		String palabra = "AMISTAD";
		System.out.println("la palabra lcave es: " + palabra);
		
		palabra = "CAMBIO";
		System.out.println("La palabra clave fue cambiada por: " + palabra);
		
		
		//var va ser inferencias de tipos en java
		
		var miVariableEntera2 = 10;
		System.out.println("haciendo uso de la palabra reservada var: " + miVariableEntera2);
		
		//ejercicio de tipo string haciendo uso de var
		
		var miVariableCadena = "EJEMPLO STRING";
		System.out.println("esta es la salida de un string inferido con var: " + miVariableCadena);
		
		//declaracion de variables aceptadas
		/**No permite el usuo de numeros o caracteres especiales a la hora
		 * de declarar variables en java
		 * a ecepcion de que si es permitido utilizar _ $ o iniciar con minuscula por convencion como en los ejemplos
		 * a continuacion*/
		
		var $miVariable = 9;
		var _miVariable = 5;
		var miVariable = 8;
		
		
		

	}

}
