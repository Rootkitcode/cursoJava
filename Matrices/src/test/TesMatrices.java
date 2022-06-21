package test;


import java.util.Iterator;

import domain.Persona;

public class TesMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edades[][] = new int[3][2];
		System.out.println("edades = " + edades);
		
		edades[0][0] = 5;
		edades[0][1] = 7;
		edades[1][0] = 8;
		edades[1][1] = 4;
		
		System.out.println("edades en: 0 - 0 = " + edades[0][0]);
		System.out.println("edades en: 0 - 1 = " + edades[0][1]);
		System.out.println("edades en: 1 - 0 = " + edades[1][0]);
		System.out.println("edades en: 1 - 1 = " + edades[1][1]);
		
		for(int reng = 0; reng < edades.length; reng ++){
			for(int col = 0; col < edades[reng].length; col ++) {
				System.out.println("edades: " + reng + " - " + col + ": " +edades[reng][col]);
				
			}
			
		}
		System.out.println("******************************************************");
		String frutas[][] = {{"Naranjas", "limones"}, {"Fresas", "Zarzamoras"}};
		imprimir(frutas);
		
		Persona personas[][] = new Persona[2][3];
		personas[0][0]= new Persona("Juan");
		personas[0][1] = new Persona("Karla");
		personas[0][2] = new Persona("Felipe");
		personas[1][0] = new Persona("Helen");
		personas[1][1] = new Persona("Walter");
		personas[1][2] = new Persona("Sebas");
		
		imprimir(personas);
		

	}

	public static void imprimir(Object matriz[][]) {
		for(int ren = 0; ren < matriz.length; ren ++) {
			for(int col = 0; col < matriz[ren].length; col ++) {
				System.out.println("frutas: " + ren + " - " + col + ": " + matriz[ren][col]);
		}
	}
		
	}

}
