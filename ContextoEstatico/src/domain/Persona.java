package domain;

public class Persona {
	
	private int idPersona;
	private String nombre;
	private static int contadorPersonas;
	
	
	//constructor
	
	public Persona(String nombre) {
		this.nombre = nombre;
		//incrementar el contador por cada objeto nuevo
		//podria utilizar this.contadorPersonas pero lo mas recomendable por convencion es utilizar el nombre de la clase
		Persona.contadorPersonas++;
		//asignar nuevo valor a idPersona
		this.idPersona = Persona.contadorPersonas;
		
	}
	
	public int getIdPersona() {
		return idPersona;
	}
	
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static int getContadorPersonas() {
		return contadorPersonas;
	}
	public static void setContadorPersonas(int contadorPersonas) {
		contadorPersonas = contadorPersonas;
	}
	@Override //se conoce como anotacion y agrega informacion extra al metodo que estamos definiendo
	public String toString() {
		return "Persona{" + "idPersona= " + idPersona + ", nombre= " + nombre + "}";
	}
	

}
