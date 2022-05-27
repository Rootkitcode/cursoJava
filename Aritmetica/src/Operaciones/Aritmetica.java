package Operaciones;

public class Aritmetica {
	//atributo de la clase
	int a;
	int b;
	
	//constructor vacio
	public Aritmetica() {
		System.out.println("Ejecutando constructor");
	}
	
	public Aritmetica(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Ejecutando constructor con argumentos");
		
	}
	
	//metodo
	public void sumar() {
		int resultado = this.a + this.b;
		System.out.println("resultado de la suma = " + resultado);
	}
	
	public int sumarConRetorno() {
		int resultado = a + b;
		return resultado;
		
	}
	
	//metodo con argumentos 
	public int sumarConArgumentos(int arg1, int arg2) {
		this.a = arg1; //this es opcional pero nos deja identificar o referenciar el objeto actual
		this.b = arg2;
		return a + b;
		
	}

}
