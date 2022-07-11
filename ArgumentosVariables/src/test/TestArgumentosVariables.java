package test;


public class TestArgumentosVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimirNumeros(3, 4, 5);
		imprimirNumeros(1, 3);
		variosParametros("Darwin", 8, 9, 10);
		

	}
	private static void variosParametros(String nombre, int...numeros ) {
		System.out.println("nombre = " + nombre);
		imprimirNumeros(numeros);
	}
	
	//metodo
	private static void imprimirNumeros(int... numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("elementos: " + numeros[i]);
		}
	}

}
