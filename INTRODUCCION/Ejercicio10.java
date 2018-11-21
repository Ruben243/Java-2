/*

EJERCICIO 10

Escriba una aplicación que lea dos números enteros y determine si el primero es
múltiplo del segundo y que imprima el resultado.

*/

import javax.swing.JOptionPane;

public class Ejercicio10 {

    public static void main (String args[]) {

		String cadenaNumero1;
		String cadenaNumero2;
		String resultado;

		int numero1;
		int numero2;

		cadenaNumero1 = JOptionPane.showInputDialog ("Introduce primer número: ");

		cadenaNumero2 = JOptionPane.showInputDialog ("Introduce segundo número: ");

		numero1 = Integer.parseInt (cadenaNumero1);

		numero2 = Integer.parseInt (cadenaNumero2);

		resultado = "No es multiplo.";

		if (numero1 % numero2 == 0) {

			resultado = "Es multiplo.";

		}

		JOptionPane.showMessageDialog (null, resultado);

		System.exit (0);

    }

}

