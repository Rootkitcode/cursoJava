package EjerciciosJava;



public class Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese su nombre: ");
		java.util.Scanner consola =  new java.util.Scanner(System.in);
		
		var user = consola.nextLine();
		System.out.println("usuario " + user);
		
		System.out.println("Ingresa el titulo: ");
		java.util.Scanner consol = new java.util.Scanner(System.in);
		var titulo = consol.nextLine();
		System.out.println("El titulo es: " + titulo + " " + user);
		

	}

}
