/*

Ejercicio 1

Escriba una aplicación que encuentre el menor de varios enteros. Suponga que el
primer valor leído especifica el número de valores que el usuario va a introducir.

*/

import javax.swing.JOptionPane;


public class Ejercicio1 {


    public static void main (String args[]) {

		String cadenaNumeros;
		String cadenaNumero;

		int numeros;
		int numero;
		int menor;

		menor = Integer.MAX_VALUE;

		do {

			cadenaNumeros = JOptionPane.showInputDialog ("Introduce los números que se van a leer (> 0): ");
			numeros = Integer.parseInt (cadenaNumeros);

			if (numeros <= 0) {

			JOptionPane.showMessageDialog (null, "El número de números a leer debe ser mayor que 0");

			}

		}
		while (numeros <= 0);


		for (int i=1; i <= numeros; i++) {

			cadenaNumero = JOptionPane.showInputDialog ("Introduce el número: ");

			numero = Integer.parseInt (cadenaNumero);

			if (numero < menor) {

			menor = numero;

			}
		}

		JOptionPane.showMessageDialog (null, "El menor de todos los números es: " + menor);

		System.exit (0);

    }

}