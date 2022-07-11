package domain;

public class Persona {
	private final int idPersona;
	private static int contadorPersonas;
	
	static {
		System.out.println("Ejecucion de bloque estatico. ");
		++ Persona.contadorPersonas;
		// idPersona = 10;  error no puedo agregarlo por ser un private final
	}
	
	{
		// este es un bloque inicializacion no estatico
		System.out.println("Ejecucion de bloque inicializacion no estatico ");
		this.idPersona = Persona.contadorPersonas++;
	}
	
	public Persona() {
		System.out.println("Ejecucion del constructor" );
	}

	public int getIdPersona() {
		return idPersona;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [idPersona=");
		builder.append(idPersona);
		builder.append("]");
		return builder.toString();
	}
	
	

}
