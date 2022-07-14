package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado = new Empleado("mauricio ", 35000);
		determinarTipo(empleado);
		Gerente gerente1 = new Gerente("Darwin ", 50000, " Sistemas");
		
		
	}
	public static void determinarTipo(Empleado empleado) {
		if(empleado instanceof Gerente) {
			System.out.println("Es de tipo gerente");
			((Gerente) empleado).getDepartamento();
		}else if(empleado instanceof Empleado) {
			System.out.println("Es de tipo Empleado");
		}else {
			System.out.println("Es de tipo Object");
		}
	}

}
