package test;



import enumeracion.Dias;

public class TestEnumeraciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dia de la semana 1: " + Dias.LUNES);
		indicarDiaDeLaSemana(Dias.MARTES);

	}
	private static void indicarDiaDeLaSemana(Dias dias) {
		switch (dias) {
		case LUNES: 
			System.out.println("Primer dia de la semana");
			break;
		case MARTES:
			System.out.println("Segundo dia de la semana");
			break;
		case MIERCOLES:
			System.out.println("Tercer dia de la semana");
			break;
		case JUEVES:
			System.out.println("Cuarto dia de la semana");
			break;
		case VIERNES:
			System.out.println("Quinto dia de la semana");
			break;
		case SABADO:
			System.out.println("Sexto dia de la semana");
			break;
		case DOMINGO:
			System.out.println("Septimo dia de la semana");
			throw new IllegalArgumentException("Unexpected value: " + dias);
		}
	}

}
