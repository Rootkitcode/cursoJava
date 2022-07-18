package test;

import domain.Empleado;

public class TestClaseObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado  empleado1 = new Empleado("martin", 5000);
		Empleado empleado2 = new Empleado("martin", 5000);
		
		if (empleado1 == empleado2) {
			System.out.println("Tienen la misma referencia en memoria");
		}else {
			System.out.println("tienen distinta referencia en memoria");
		}
		
		

	}

}
