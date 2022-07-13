package test;

import paquete1.Clase1;
import paquete2.Clase2;
import paquete3.ClaseHija;
import paquete5.Clase5;

public class TestModificadoresAcceso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clase1 clase1 = new Clase1();
		System.out.println("Clase1 = " + clase1.atributoPublico);
		clase1.metodoPublico();
		
		Clase2 clase2 = new Clase2("publico clase 2");
		
		ClaseHija claseHija = new ClaseHija();
		System.out.println("Clase hija: " + claseHija);
		
		
		Clase5 clase5 = new Clase5("Publico");
		clase5.setAtributoPrivadoString("atributo privado modificado con set");
		System.out.println("clase5: " + clase5.getAtributoPrivadoString());
		

	}
	
	

}
