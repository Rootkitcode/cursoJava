package domain;

public class Persona {
	
	protected String nombre;
	protected String genero;
	protected int edad;
	protected String direccion;
	
	public Persona() {
		
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	//constructor
	public Persona(String nombre, String genero, int edad, String direccion) {
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.direccion = direccion;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
		
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Persona{ " + "nombre= " + nombre + ", genero= " + genero + ", edad= "
	+ edad + ", direccion= " + direccion + "}";
		
	}
		
	}
	


