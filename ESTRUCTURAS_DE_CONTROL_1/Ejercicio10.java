/*

Ejercicio 10

El factorial de un entero n no negativo se escribe como n! y se define de la
siguiente manera:

n!= n (n-1) (n-2) ... 1

y

n! = 1 (para n = 0)

Escribe un programa que calcule el factorial del número que se le pasa, si es
negativo mensaje de error.

*/

import javax.swing.JOptionPane;

public class Ejercicio10 {

    public static void main (String args[]) {

		int numero;
		int factorial;

		String cadenaNumero;
		String resultado;



		cadenaNumero = JOptionPane.showInputDialog ("Introduce el número, para calcular su factorial: ");

		numero = Integer.parseInt (cadenaNumero);

		if (numero < 0) {

			resultado = "Es un numero negativo, solo factorial de números positivos";

		}

		else {

			resultado = "El factorial de " + numero + " es: ";

			factorial = 1;

			while (numero>0) {

			factorial *= numero;

			numero--;

			}

			resultado += factorial; 

		}

		JOptionPane.showMessageDialog (null, resultado);

		System.exit (0);

    }

}

