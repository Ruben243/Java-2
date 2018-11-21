/*

EJERCICIO 9

Escriba un programa que reciba cinco números, y que determine e imprima la
cantidad de números negativos, positivos y la cantidad de ceros recibidos.

*/

import javax.swing.JOptionPane;

public class Ejercicio9 {

    public static void main (String args[]) {

		String cadenaNumero1;
		String cadenaNumero2;
		String cadenaNumero3;
		String cadenaNumero4;
		String cadenaNumero5;
		String resultado;


		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;


		int positivos;
		int negativos;
		int ceros;

		positivos = 0;
		negativos = 0;
		ceros = 0;



		cadenaNumero1 = JOptionPane.showInputDialog ("Introduce el primer número: ");
		cadenaNumero2 = JOptionPane.showInputDialog ("Introduce el segundo número: ");
		cadenaNumero3 = JOptionPane.showInputDialog ("Introduce el tercer número: ");
		cadenaNumero4 = JOptionPane.showInputDialog ("Introduce el cuarto número: ");
		cadenaNumero5 = JOptionPane.showInputDialog ("Introduce el quinto número: ");

		numero1 = Integer.parseInt (cadenaNumero1);
		numero2 = Integer.parseInt (cadenaNumero2);
		numero3 = Integer.parseInt (cadenaNumero3);
		numero4 = Integer.parseInt (cadenaNumero4);
		numero5 = Integer.parseInt (cadenaNumero5);


		if (numero1 == 0) {

			ceros += 1;

		}

		if (numero1 < 0) {

			negativos += 1;

		}

		if (numero1 > 0) {

			positivos += 1;

		}


		if (numero2 == 0) {

			ceros += 1;

		}

		if (numero2 < 0) {

			negativos += 1;

		}

		if (numero2 > 0) {

			positivos += 1;

		}


		if (numero3 == 0) {

			ceros += 1;

		}

		if (numero3 < 0) {

			negativos += 1;

		}

		if (numero3 > 0) {

			positivos += 1;

		}


		if (numero4 == 0) {

			ceros += 1;

		}

		if (numero4 < 0) {

			negativos += 1;

		}

		if (numero4 > 0) {

			positivos += 1;

		}


		if (numero5 == 0) {

			ceros += 1;

		}

		if (numero5 < 0) {

			negativos += 1;

		}

		if (numero5 > 0) {

			positivos += 1;

		}


		resultado = "El número de números igual a 0: " + ceros;

		resultado += "\nEl número de números positivos es: " + positivos;

		resultado += "\nEl número de números negativos es: " + negativos;

		JOptionPane.showMessageDialog (null, resultado);

		System.exit (0);

    }

}