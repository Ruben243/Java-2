/*

EJERCICIO 3

Escriba una aplicación que reciba tres enteros del usuario y muestre la suma,
promedio, producto, menor y mayor de los números en un cuadro de diálogo de
mensaje de información.

*/

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main (String args[]) {

		String cadenaNumero1;
		String cadenaNumero2;
		String cadenaNumero3;
		String resultado;

		int numero1;
		int numero2;
		int numero3;



		cadenaNumero1 = JOptionPane.showInputDialog ("Introduce el primer número: ");

		cadenaNumero2 = JOptionPane.showInputDialog ("Introduce el segundo número: ");

		cadenaNumero3 = JOptionPane.showInputDialog ("Introduce el tercer número: ");

		numero1 = Integer.parseInt (cadenaNumero1);

		numero2 = Integer.parseInt (cadenaNumero2);

		numero3 = Integer.parseInt (cadenaNumero3);

		resultado = "La suma es: " + (numero1 + numero2 + numero3);

		resultado += "\nEl promedio es: " + (numero1 + numero2 + numero3)/3;

		resultado += "\nEl producto es: " + (numero1 * numero2 * numero3);



		if (numero1 <= numero2) {

			if (numero1 <= numero3) {

			resultado += "\nEl número " + numero1 + " es el menor";

			}
		}


		if (numero2 <= numero1) {

			if (numero2 <= numero3) {

			resultado += "\nEl número " + numero2 + " es el menor";

			}
		}
		

		if (numero3 <= numero1) {

			if (numero3 <= numero1) {

			resultado += "\nEl número " + numero3 + " es el menor";

			}
		}


		if (numero1 >= numero2) {

			if (numero1 >= numero3) {

			resultado += "\nEl número " + numero1 + " es el mayor";

			}
		}


		if (numero2 >= numero1) {

			if (numero2 >= numero3) {

			resultado += "\nEl número " + numero2 + " es el mayor";

			}
		}


		if (numero3 >= numero1) {

			if (numero3 >= numero2) {

			resultado += "\nEl número " + numero2 + " es el mayor";

			}
		}

		JOptionPane.showMessageDialog (null, resultado);

		System.exit (0);

    }
}