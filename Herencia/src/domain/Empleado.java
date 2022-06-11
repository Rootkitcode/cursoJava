package domain;

public class Empleado extends Persona {
	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;

	public Empleado(){
		super();
		this.idEmpleado = ++Empleado.contadorEmpleado;
	}
	
	public Empleado(String nombre, double sueldo) {
		//super(nombre);
		this();
		this.nombre = nombre;

		this.idEmpleado = ++Empleado.contadorEmpleado;
		this.sueldo = sueldo;
		
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado= ");
		builder.append(this.idEmpleado);
		builder.append(", sueldo= ");
		builder.append(this.sueldo);
		builder.append(", nombre= ");
		builder.append(this.nombre);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	

}
