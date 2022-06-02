package dominio;

public class Animales {

	private String nombreAnimal;
	private String raza;
	private int edad;
	private double precio;
	private boolean terrestre;
	
	public Animales(String nombreAnimal, String raza, int edad, double precio, boolean terrestre) {
		this.nombreAnimal = nombreAnimal;
		this.raza = raza;
		this.precio = precio;
		this.terrestre = terrestre;
	}
	
	public String getNombreAnimal() {
		return this.nombreAnimal;
	}
	
	public void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal = nombreAnimal;
	}
	public String getRaza() {
		return this.raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean isTerrestre() {
		return this.terrestre;
	}
	
	public void setTerrestre(boolean terrestre) {
		this.terrestre = terrestre;
	}

}
