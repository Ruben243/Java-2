/*

EJERCICIO 5

Escriba una aplicación que lea un entero, y que determine e imprima si es par o
impar. NOTA: El modulo de 2.

*/

import javax.swing.JOptionPane;

public class Ejercicio5 {


    public static void main (String args[]) {

		String cadenaEntero;
		String resultado;

		int entero;


		cadenaEntero = JOptionPane.showInputDialog ("Introduce el entero: ");

		entero = Integer.parseInt (cadenaEntero);

		resultado = "Es un número impar";

		if (entero % 2 == 0) {

			resultado = "Es un número par";

		}

		JOptionPane.showMessageDialog (null, resultado);

		System.exit (0);

    }

}