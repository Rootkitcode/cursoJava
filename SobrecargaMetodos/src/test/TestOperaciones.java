package test;


import operaciones.Operaciones;

public class TestOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var resultado = Operaciones.sumar(7.5, 5);
		System.out.println("resultado: " + resultado);
		
		var resultado2 = Operaciones.sumar(5, 3);
		System.out.println("resultado2 int: " + resultado2);
		
		var resultado3 = Operaciones.sumar(3, 5L);
		System.out.println("resultado3: " + resultado3);

	}

}
