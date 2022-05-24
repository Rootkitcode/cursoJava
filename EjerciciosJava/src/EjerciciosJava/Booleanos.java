package EjerciciosJava;



public class Booleanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean varTipoBoolean = false;
		System.out.println("varBoolean " + varTipoBoolean);
		
		if (varTipoBoolean == true) {
			System.out.println("La bandera es verdadera");
			
			}
		else {
			System.out.println("la bandera es falsa");
			
		}
		
		var edad  = 14;
		var esAdulto = edad >= 18;
		if(esAdulto) {
			System.out.println("eres mayor de edad");
		}
		else {
			System.out.println("eres menor de edad");
		}
		

	}
}


