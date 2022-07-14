package test;

import domain.Empleado;
import domain.Gerente;

public class TestPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado =  new Empleado("Darwin ", 50000);
		//System.out.println("empleado = " + empleado.obtenerDetalles());
		imprimir(empleado);
		
		Gerente gerente = new Gerente("Monica ", 10000, " Contabilidad");
		//System.out.println("gerente = " + gerente.obtenerDetalles());
		
		imprimir(gerente);

	}
	
	public static void imprimir(Empleado empleado) {
		System.out.println("empleado " + empleado.obtenerDetalles());
	}

}
