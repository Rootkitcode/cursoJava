package test;

public class TestArreglos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edades [] = new int [3];
		System.out.println("edades = " + edades);
		
		edades [0] = 12;
		System.out.println("edades indice 0: " + edades[0]);
		
		for ( int contador = 0; contador < edades.length; contador++) {
			System.out.println("edades elemento = " + contador + ": " + edades[contador]);
		}
		String animales[] = {"perro", "gato", "aves", "peces"};
		for (int i = 0; i < animales.length; i++) {
			System.out.println("animales lista de objetos = " + animales[i]);
			
		}
		
	
	}
}