package test;

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

	}

}
