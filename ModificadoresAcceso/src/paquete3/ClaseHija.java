package paquete3;

import paquete2.Clase2;

public class ClaseHija extends Clase2 {
	public ClaseHija() {
		super();
		this.nameProtected = "pepe protected";
		System.out.println("name protected: " + nameProtected);
		this.metodoProtected();
	}
	

}
