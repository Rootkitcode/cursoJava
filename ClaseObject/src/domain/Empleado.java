package domain;

import java.util.Objects;

public class Empleado {
	protected String nombre;
	protected double sueldo;
	
	public Empleado(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		
	}
	
	public String obtenerDetalles() {
		return "nombre: " + this.nombre + "sueldo = " + this.sueldo;
 	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 79 * hash + Objects.hashCode(this.nombre);
		hash = 79 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
		return Objects.hash(nombre, sueldo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(sueldo) == Double.doubleToLongBits(other.sueldo);
	}
	
	
	
	
	

}
