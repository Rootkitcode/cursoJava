package test;

public class TestAutoboxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// clase envolvente (wrapper) primitivos
		/*int - Integer
		 * long - Long
		 * float - Float
		 * double - Double
		 * boolean - Boolean
		 * byte - Byte
		 * char - Character
		 * short - Short*/
		
		Integer entero = 10;
		System.out.println("Entero: " + entero);
		// esto es un unboxing
		int entero2 = entero;
		System.out.println("Entero 2: " + entero2);
		
		//ejemplo 2 
		Long tarjetaLong = 4986546465L;
		System.out.println("Tarjeta: " + tarjetaLong);
		
		//unboxing de long
		long tarjeta2 = tarjetaLong;
		System.out.println("tarjeta 2: " + tarjeta2);
		
		Float saldoFloat = 500.22F;
		System.out.println("Saldo: " + saldoFloat);
		
		//unboxing a float
		float saldo2 = saldoFloat;
		System.out.println("saldo 2: " + saldo2);
		
		Boolean vivo = true;
		System.out.println("vivo: " + vivo);
		
		//unboxing boolean
		boolean vivo2 = vivo;
		System.out.println("vivo 2: " + vivo2);
		
		Byte tamanioByte = 16;
		System.out.println("tamanio: " + tamanioByte);
		
		//unboxing byte
		byte tamanio2 = tamanioByte;
		System.out.println("tamanio 2 = " + tamanio2);
		

	}

}
