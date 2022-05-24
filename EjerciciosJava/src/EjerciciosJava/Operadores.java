package EjerciciosJava;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // aritmeticos
		
		int a = 3, b = 2;
		var resultado = a + b;
		System.out.println("suma resultado: " + resultado);
		
		resultado = a - b;
		System.out.println("resta resultado: " + resultado);
		
		
		resultado = a * b;
		System.out.println("multiplicacion resultado: " + resultado);
		
		resultado = a / b;
		System.out.println("division resultado: " + resultado);
		
		resultado = a % b;
		System.out.println("residuo resultado: " + resultado);
		
		// Operadores de asignacion
		
		int c = 3, d = 2;
		int e = a + 5 -b;
		System.out.println("c = " + e);
		
		c += 1;
		System.out.println(" c = " + c);
		
		c -= 2;
		System.out.println(" c = " + c);
		
		c *= 4;
		System.out.println(" c = " + c);
		
		c /= 1;
		System.out.println(" c = " + c);
		
		c %= 1;
		System.out.println(" c = " + c);
		
		
		
		// operadores unarios
		
		var s = 3;
		var j = s;
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		
		var k = true;
		var r = !k;
		System.out.println(" k = " + k );
		System.out.println(" r = " + r);
		
		//incremento
		
		var p = 4;
		var h = ++p;
		System.out.println(" p = " + p);
		System.out.println(" h = " + h);
		
		//postincremento
		
		var g = 5;
		var t = g++;
		System.out.println(" g = " + g);
		System.out.println(" t = " + t);
		
		//decremento
		
		var i = 2;
		var m = --i;
		System.out.println(" i = " + i);
		System.out.println(" m = " + m);
		
		
		//postdecremento
		
		var l = 4;
		var v = l--;
		System.out.println(" l = " + l);
		System.out.println(" v = " + v);
		
		
		//operadores de asignacion y relacionales
		
		 var w = 6;
		 var q = 4;
		 var x = (w == q);
		 System.out.println(" x = " + x);
		 
		 var z = w != q;
		 System.out.println("z = " + z);
		 
		 var cadena = "Hola";
		 var cadena2 = "Adios";
		 var y = cadena == cadena2;
		 System.out.println("y = " + y);
		 
		 var wq = cadena.equals(cadena2);
		 System.out.println(" wq = " + wq);
		

	}

	
}
