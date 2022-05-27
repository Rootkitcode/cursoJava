package Operaciones;

public class PruebaAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables locales
		
		var a = 10;
		var b = 2;
		miMetodo();
		
		//objeto
		Aritmetica aritmetica1 = new Aritmetica();
		System.out.println("aritmetica 1 a: " + aritmetica1.a);
		System.out.println("aritmetica 1 b: " + aritmetica1.b);
		
		Aritmetica aritmetica2 = new Aritmetica(5 , 8);
		System.out.println("aritmetica 2 a: " + aritmetica2.a);
		System.out.println("aritmetica 2 b: " + aritmetica2.b);
		
		//aritmetica1.a = 3;
		//aritmetica1.b = 2;
		//aritmetica1.sumar();
		
		
		//int resultado = aritmetica1.sumarConRetorno();
		//System.out.println("resultado = " + resultado);
		
		//resultado = aritmetica1.sumarConArgumentos(5, 8);
		//System.out.println("resultado usando argumentos: " + resultado);

	}
	
	public static void miMetodo() {
		System.out.println("otro metodo");
	}

}
