package clases;

public class Musica {
	
	String generoString;
	String albumString;
	String grupoString;
	
	public void mostrarInformacion() {
		System.out.println("genero = " + generoString);
		System.out.println("album = " + albumString);
		System.out.println("grupo = " + grupoString);
	}
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Musica musica = new Musica();
		musica.generoString = "Metal";
		musica.albumString = "And justice for all";
		musica.grupoString = "Metallica";
		musica.mostrarInformacion();
		
		Musica musica2 = new Musica();
		musica2.generoString = "Pop";
		musica2.albumString = "algo";
		musica2.grupoString = "Maroon5";
		musica2.mostrarInformacion();
		

	}

}
