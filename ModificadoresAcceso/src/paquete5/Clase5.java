package paquete5;

public class Clase5 {
	private String atributoPrivadoString = "Atributo privado con private";
	
	private Clase5() {
		System.out.println("Cosntructor privado");
	}
	
	public Clase5(String arg) {
		this();
		System.out.println("Constructor publico");
	}
	
	private void metodoPrivado() {
		System.out.println("Metodo privado");
	}

	public String getAtributoPrivadoString() {
		return atributoPrivadoString;
	}

	public void setAtributoPrivadoString(String atributoPrivadoString) {
		this.atributoPrivadoString = atributoPrivadoString;
	}
	

}
