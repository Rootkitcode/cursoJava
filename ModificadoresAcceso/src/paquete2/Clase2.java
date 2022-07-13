package paquete2;

//utilizamos protected en el atributo, no aplica para clases
public class Clase2 {
	protected String nameProtected = "Ejemplo de nombre pepeProtected";
	
	protected Clase2() {
		System.out.println("Cosntructor clase 2 protected");
	}
	
	public Clase2(String arg) {
		System.out.println("Cosntructor publico");
	}
	
	protected void metodoProtected() {
		System.out.println("Metodo protected");
	}
	

}
