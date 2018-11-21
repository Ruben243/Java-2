/*

Ejercicio 6

Un palíndromo es una secuencia de caracteres que se lee igual al derecho y al
revés. Por ejemplo: 12321,55555, 45554 y 11611. Escriba una aplicación que lea
un entero de cinco dígitos y determine si es un palindromo. Si el número no es
de cinco dígitos que muestre un mensaje de error y cuando desaparezca el mensaje
que vuelva a pedir otro número.

*/

import javax.swing.JOptionPane;


public class Ejercicio6 {


    public static void main (String args[]) {

		String cadenaNumero;
		String resultado;


		int numero;
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		boolean nosalir;

		nosalir = true;

		resultado = "";

		while (nosalir) {

			cadenaNumero = JOptionPane.showInputDialog ("Introduce número 5 cifras positivos: ");

			numero = Integer.parseInt (cadenaNumero);

			if (numero >= 10000) {

			if (numero <= 99999) {

				numero1 = (numero / 10000);
				numero2 = (numero % 10000) / 1000;
				numero3 = ((numero % 10000) % 1000) / 100;
				numero4 = (((numero % 10000) % 1000) % 100) / 10;
				numero5 = (((numero % 10000) % 1000) % 100) % 10;

				if (numero1 == numero5) {

				if (numero2 == numero4) {

					resultado = "Es palindromo"; 

				}

				else  {
				
					resultado = "No es palindromo";
				
				}

				}

				else {

				resultado = "No es palindromo";
				}

				nosalir = false;
			}

			else {

				resultado = "Solo números de cinco cifras positivos.";
			}
			}

			else {

			resultado = "Solo números de cinco cifras positivos";

			}

			JOptionPane.showMessageDialog (null, resultado);
		}

		System.exit (0);

    }

}	
