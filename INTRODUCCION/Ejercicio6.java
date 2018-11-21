/*
EJERCICIO 6

Escriba una aplicación que reciba del usuario un número compuesto por cinco
dígitos, que separe ese número en sus dígitos individuales y los imprima, cada
uno por separado por 3 espacios en blanco.
*/

import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main (String args[]) {

		String cadenaNumero;
		String resultado;

		int numero;


		cadenaNumero = JOptionPane.showInputDialog ("Introduce el número: ");

		numero = Integer.parseInt(cadenaNumero);


		resultado = "" + numero/10000;

		resultado += "   " + (numero % 10000)/1000;

		resultado += "   " + ((numero % 10000) % 1000)/100;

		resultado += "   " + (((numero % 10000) % 1000) % 100)/10;

		resultado += "   " + ((((numero % 10000) % 1000) % 100) % 10);

		JOptionPane.showMessageDialog(null, resultado);

		System.exit (0);

    }

}