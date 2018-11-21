/*

Ejercicio 4

El proceso de encontrar el valor más grande se utiliza frecuentemente en
aplicaciones de ordenador. Escribir un programa que reciba como entrada una
serie de 10 números de un solo dígito como caracteres, y que determine e imprima
el mayor de los números.

*/

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main (String args[]) {

		String cadenaNumero;

		int numero;
		int contador;
		int mayor;


		mayor  = Integer.MIN_VALUE;

		contador = 1;

		while (contador <= 10) {

			cadenaNumero = JOptionPane.showInputDialog ("Introduce el número" + " ("+ contador + "): ");

			numero = Integer.parseInt(cadenaNumero);

			if (numero > -10) {


			if (numero < 10) {

				if (numero > mayor) {
				
				mayor = numero;

				}

				contador++;

			}

			else {

				JOptionPane.showMessageDialog (null, "El número debe de ser de una sola cifra");

			}


			}

			else {

			JOptionPane.showMessageDialog (null, "El número debe de ser de una sola cifra");

			}
	  
		}

		JOptionPane.showMessageDialog (null, "El número mayor de todos es " + mayor);

		System.exit (0);

    }

}