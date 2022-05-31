package palabrathis;

public class palabraThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona("Darwin", "Tusarma");
		System.out.println("persona: " + persona);
		System.out.println("nombre: " + persona.nombre);
		System.out.println("apellido: " + persona.apellido);

	}

}
class Persona{
	String nombre;
	String apellido;
	
	public Persona(String nombre, String apellido) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.apellido = apellido;
		System.out.println("objeto persona usando this: " + this);
		
		new Imprimir().imprimir(this);
	}
}

class Imprimir{
	
	public Imprimir() {
		super();
	}
	
	public void imprimir(Persona persona) {
		System.out.println("persona desde persona: " + persona);
		System.out.println("impresion desde objeto actual (this): " + this);
		
	}
}

