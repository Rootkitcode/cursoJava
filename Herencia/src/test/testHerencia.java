package test;



import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class testHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado empleado1 = new Empleado("Juan", 7000.00);
		System.out.println("empleado = " + empleado1);
		
		//Cliente cliente1 = new Cliente(new Date(), true, "Darwin ", "M", 36, " Colombia");
		//System.out.println("Cliente: " + cliente1);

	}

}
