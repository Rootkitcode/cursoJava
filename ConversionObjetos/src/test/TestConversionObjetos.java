package test;

import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;

public class TestConversionObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado;
		
		empleado = new Escritor("Juan", 4500, TipoEscritura.CLASICO);
		System.out.println("empleado = " + empleado);
		
		//respuesta por polimorfismo tambien seria: 
		System.out.println(empleado.obtenerDetalles());

	}

}
