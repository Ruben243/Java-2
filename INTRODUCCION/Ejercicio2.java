/*
EJERCICIO 2

Escriba una aplicación que pida al usuario que escriba dos números enteros, que
obtenga los números del usuario y muestre el número más grande, seguido de las
palabras "es más grande" en un cuadro de diálogo de mensaje de información. Si
los números son iguales, imprima el mensaje "Éstos números son iguales."

*/


import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main (String args[]) {

		String cadenaNumero1;
		String cadenaNumero2;
		String resultado;

		int numero1;
		int numero2;

		cadenaNumero1 = JOptionPane.showInputDialog ("Introduce el primer número: ");

		cadenaNumero2 = JOptionPane.showInputDialog ("Introduce el segundo número: ");

		numero1 = Integer.parseInt(cadenaNumero1);

		numero2 = Integer.parseInt(cadenaNumero2);

		resultado = "";

		if (numero1 > numero2) {

			resultado = "El número " + numero1 + " es más grande que " + numero2;

		}


		if (numero2 > numero1) {

			resultado = "El número " + numero2 + " es más grande que " + numero1;

		}

		if (numero1 == numero2) {

			resultado = "Los números son iguales ";

		}

		JOptionPane.showMessageDialog (null, resultado);

		System.exit (0);

    }

}