/*

EJERCICIO 7

Escriba una aplicación que calcule los cuadrados y cubos de los números del 0 al
10, y que imprima los valores resultantes en formato de tabla, como se muestra
a continuación.

número	cuadrado		cubo
0			0				0
1			1				1
2			4				8
.			.				.
.			.				.

*/


public class Ejercicio7 {


    public static void main (String args[]) {


		String resultado;

		resultado = "número\t\tcuadrado\t\tcubo\n";

		resultado += 0 + "\t\t" + (0*0) + "\t\t\t" + (0*0*0) + "\n";

		resultado += 1 + "\t\t" + (1*1) + "\t\t\t" + (1*1*1) + "\n";

		resultado += 2 + "\t\t" + (2*2) + "\t\t\t" + (2*2*2) + "\n";

		resultado += 3 + "\t\t" + (3*3) + "\t\t\t" + (3*3*3) + "\n";

		resultado += 4 + "\t\t" + (4*4) + "\t\t\t" + (4*4*4) + "\n";

		resultado += 5 + "\t\t" + (5*5) + "\t\t\t" + (5*5*5) + "\n";

		resultado += 6 + "\t\t" + (6*6) + "\t\t\t" + (6*6*6) + "\n";

		resultado += 7 + "\t\t" + (7*7) + "\t\t\t" + (7*7*7) + "\n";

		resultado += 8 + "\t\t" + (8*8) + "\t\t\t" + (8*8*8) + "\n";

		resultado += 9 + "\t\t" + (9*9) + "\t\t\t" + (9*9*9) + "\n";

		resultado += 10 + "\t\t" + (10*10) + "\t\t\t" + (10*10*10) + "\n";

		System.out.println (resultado);

    }

}