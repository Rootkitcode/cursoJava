package clases;

public class pruebaApartamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apartamento apartamento1;
		apartamento1 = new Apartamento();
		apartamento1.zona = "centro";
		apartamento1.precio = 200000000;
		apartamento1.ciudad = "Bogota";
		apartamento1.cantHabitaciones = 4;
		apartamento1.verInformacionApartamento();
	}

}
