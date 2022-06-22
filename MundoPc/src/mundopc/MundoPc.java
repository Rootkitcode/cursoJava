package mundopc;

import com.gm.mundopc.*;

class MundoPc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor monitorHP = new Monitor("HP,", 10);
		Teclado tecladoHP = new Teclado("Bluetooth", "HP");
		Raton ratonHP = new Raton("Bluetooth", "HP");
		Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
		
		Monitor monitorGamer = new Monitor("Gamer", 22);
		Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
		Raton ratonGame = new Raton("Bluetooth", "Gamer");
		Computadora computadoraGamer = new Computadora("Gamer Legion lenovo", monitorGamer, tecladoGamer, ratonGame);
		
		Orden orden1 = new Orden();
		orden1.agregarComputadora(computadoraHP);
		orden1.agregarComputadora(computadoraGamer);
		
		orden1.mostrarOrden();

	}

}
