package EjerciciosJava;

public class TiposPrimitivosConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Convertir un String a un int
		
		var edad = Integer.parseInt("20");
		System.out.println("edad " + (edad + 1));
		var valorPI = Double.parseDouble("3.1416");
		System.out.println("valorPI: " + valorPI);
		
		//pedir un valor
		
		java.util.Scanner consola =  new java.util.Scanner(System.in);
		System.out.println("ingresa tu edad: ");
		edad = Integer.parseInt( consola.nextLine());
		if(edad >= 18) {
			System.out.println("Bienvenido eres mayor de edad");
		}
		else {
			System.out.println("Lo sentimos eres menor de edad");
					
	
		}
		
		var edadTexto = String.valueOf(10);
		System.out.println("valorTexto " + edadTexto);
		
		
		var caracter = "Darwin".charAt(1);
		System.out.println("El caracter obtenido es: " + caracter);

	}

}
