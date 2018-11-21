/*

Ejercicio 5

Una aplicación interesante es dibujar histogramas, escribir un programa que lea
5 números entre el 1 y el 30. Por cada número leído, su programa debe dibujar
ese número de asteriscos adyacentes.

Ej: 5, 3, 6, 1

*****
***
******
*

*/


import javax.swing.JTextArea;
import javax.swing.JOptionPane;


public class Ejercicio5 {

    public static void main (String args[]) {


		boolean numeroCorrecto;

		String cadenaNumero;

		int numero;

		JTextArea areaSalida = new JTextArea();

		areaSalida.append ("Histograma:\n");
		areaSalida.append ("-------------------------------------\n\n");

		numero = 0;

		for (int i=1; i<=5; i++) {

			numeroCorrecto = false;

			while (!numeroCorrecto) {

			cadenaNumero = JOptionPane.showInputDialog ("Introduce el número (" + i + ") : ");

			numero = Integer.parseInt (cadenaNumero);

			if ( numero >= 0 ) {

				numeroCorrecto = true;

			}

			}


			for (int j=1; j<=numero; j++) {

			areaSalida.append ("*");
			}

			areaSalida.append ("\n");

		}


		JOptionPane.showMessageDialog (null, areaSalida);

		System.exit (0);


    }

}