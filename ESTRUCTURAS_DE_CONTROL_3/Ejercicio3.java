/*

Ejercicio 3

Escribe una aplicación que evalúe los factoriales de los enteros del 1 al 5.
Muestre los resultados en formato tabular, en un objeto JTextArea que aparezca
en un cuadro de diálogo de mensaje. 

*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Ejercicio3 {

    public static void main (String args[]) {

		int factorial;
		int numero;

		JTextArea areaSalida = new JTextArea ();

		areaSalida.append ("Número\t\tFactorial\n\n");

		for (int i=1; i <=5; i++) {

			factorial = 1;

			numero = i;

			while (numero>0) {

			factorial *= numero;

			numero--;

			}

			areaSalida.append (i + "\t\t" + factorial + "\n");

		}

		JOptionPane.showMessageDialog (null, areaSalida);

		System.exit (0);

    }

}