package test;

import dominio.Animales;

public class testAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animales animales = new Animales("pipo", "pincher miniatura", 3, 250.000, true);
		System.out.println("nombre sin modificar: " + animales.getNombreAnimal());
		animales.setNombreAnimal("pipo2");
		System.out.println("nombre modificado con set: " + animales.getNombreAnimal());
		System.out.println("raza: " + animales.getRaza());
		System.out.println("edad: " + animales.getEdad() + " anios");
		System.out.println("precio antes: " + animales.getPrecio() + " pesos");
		animales.setPrecio(180.000);
		System.out.println("precio ahora: " + animales.getPrecio() + " pesos");
		System.out.println("mamifero terrestre? " + animales.isTerrestre());
		

	}

}
