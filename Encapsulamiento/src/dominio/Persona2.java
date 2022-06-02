package dominio;

public class Persona2 {
	private String nombre;
	private String apellido;
	private int edad;
	private boolean estudia;
	
	public Persona2(String nombre, String apellido, int edad, boolean estudia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.estudia = estudia;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean isEstudia() {
		return this.estudia;
	}
	
	public void setEstudia(boolean estudia) {
		this.estudia = estudia;
	}

}

