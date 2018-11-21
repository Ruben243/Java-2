/*

Ejercicio 2

Escribir una aplicación que calcule el producto de los enteros impares del 1 al
15, y que muestre los resultados en un cuadro de diálogo de mensaje.



Resultado:

1 * 3 * 5 * 7 * 9 * 11 * 13 * 15 = 2027025

*/

public class Ejercicio2 {

    public static void main (String args[]) {


		String cadenaResultado;

		int resultado;


		cadenaResultado = "";

		resultado = 1;

		for (int i=1; i<=15; i++) {

			if ( i < 15 ) {

			if ( i % 2 != 0 ) cadenaResultado += i + " * ";

			}
			else {

			cadenaResultado += i + " = ";

			}

			if ( i % 2 !=0 ) resultado *= i;

		}

		System.out.println (cadenaResultado + resultado);

    }

}